// File generated from our OpenAPI spec by Stainless.

package com.phoebe.api.services.blocking.data.observations

import com.phoebe.api.core.ClientOptions
import com.phoebe.api.core.JsonValue
import com.phoebe.api.core.RequestOptions
import com.phoebe.api.core.handlers.errorHandler
import com.phoebe.api.core.handlers.jsonHandler
import com.phoebe.api.core.handlers.withErrorHandler
import com.phoebe.api.core.http.HttpMethod
import com.phoebe.api.core.http.HttpRequest
import com.phoebe.api.core.http.HttpResponse.Handler
import com.phoebe.api.core.http.HttpResponseFor
import com.phoebe.api.core.http.parseable
import com.phoebe.api.core.prepare
import com.phoebe.api.models.data.observations.Observation
import com.phoebe.api.models.data.observations.recent.RecentListParams
import com.phoebe.api.services.blocking.data.observations.recent.HistoricService
import com.phoebe.api.services.blocking.data.observations.recent.HistoricServiceImpl
import com.phoebe.api.services.blocking.data.observations.recent.NotableService
import com.phoebe.api.services.blocking.data.observations.recent.NotableServiceImpl
import com.phoebe.api.services.blocking.data.observations.recent.SpecieService
import com.phoebe.api.services.blocking.data.observations.recent.SpecieServiceImpl

class RecentServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    RecentService {

    private val withRawResponse: RecentService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val notable: NotableService by lazy { NotableServiceImpl(clientOptions) }

    private val species: SpecieService by lazy { SpecieServiceImpl(clientOptions) }

    private val historic: HistoricService by lazy { HistoricServiceImpl(clientOptions) }

    override fun withRawResponse(): RecentService.WithRawResponse = withRawResponse

    override fun notable(): NotableService = notable

    override fun species(): SpecieService = species

    override fun historic(): HistoricService = historic

    override fun list(params: RecentListParams, requestOptions: RequestOptions): List<Observation> =
        // get /data/obs/{regionCode}/recent
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        RecentService.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val notable: NotableService.WithRawResponse by lazy {
            NotableServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val species: SpecieService.WithRawResponse by lazy {
            SpecieServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val historic: HistoricService.WithRawResponse by lazy {
            HistoricServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun notable(): NotableService.WithRawResponse = notable

        override fun species(): SpecieService.WithRawResponse = species

        override fun historic(): HistoricService.WithRawResponse = historic

        private val listHandler: Handler<List<Observation>> =
            jsonHandler<List<Observation>>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun list(
            params: RecentListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<Observation>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("data", "obs", params._pathParam(0), "recent")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.forEach { it.validate() }
                        }
                    }
            }
        }
    }
}
