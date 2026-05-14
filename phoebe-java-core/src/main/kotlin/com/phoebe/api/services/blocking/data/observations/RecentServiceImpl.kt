// File generated from our OpenAPI spec by Stainless.

package com.phoebe.api.services.blocking.data.observations

import com.phoebe.api.core.ClientOptions
import com.phoebe.api.core.RequestOptions
import com.phoebe.api.core.checkRequired
import com.phoebe.api.core.handlers.errorBodyHandler
import com.phoebe.api.core.handlers.errorHandler
import com.phoebe.api.core.handlers.jsonHandler
import com.phoebe.api.core.http.HttpMethod
import com.phoebe.api.core.http.HttpRequest
import com.phoebe.api.core.http.HttpResponse
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
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/**
 * The data/obs end-points are used to fetch observations submitted to eBird in checklists. There
 * are two categories of end-point: 1. Fetch observations for a specific country, region or
 * location. 2. Fetch observations for nearby locations - up to a distance of 50km. Each end-point
 * supports optional query parameters which allow you to filter the list of observations returned.
 */
class RecentServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    RecentService {

    private val withRawResponse: RecentService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val notable: NotableService by lazy { NotableServiceImpl(clientOptions) }

    private val species: SpecieService by lazy { SpecieServiceImpl(clientOptions) }

    private val historic: HistoricService by lazy { HistoricServiceImpl(clientOptions) }

    override fun withRawResponse(): RecentService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): RecentService =
        RecentServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    /**
     * The data/obs end-points are used to fetch observations submitted to eBird in checklists.
     * There are two categories of end-point: 1. Fetch observations for a specific country, region
     * or location. 2. Fetch observations for nearby locations - up to a distance of 50km. Each
     * end-point supports optional query parameters which allow you to filter the list of
     * observations returned.
     */
    override fun notable(): NotableService = notable

    /**
     * The data/obs end-points are used to fetch observations submitted to eBird in checklists.
     * There are two categories of end-point: 1. Fetch observations for a specific country, region
     * or location. 2. Fetch observations for nearby locations - up to a distance of 50km. Each
     * end-point supports optional query parameters which allow you to filter the list of
     * observations returned.
     */
    override fun species(): SpecieService = species

    /**
     * The data/obs end-points are used to fetch observations submitted to eBird in checklists.
     * There are two categories of end-point: 1. Fetch observations for a specific country, region
     * or location. 2. Fetch observations for nearby locations - up to a distance of 50km. Each
     * end-point supports optional query parameters which allow you to filter the list of
     * observations returned.
     */
    override fun historic(): HistoricService = historic

    override fun list(params: RecentListParams, requestOptions: RequestOptions): List<Observation> =
        // get /data/obs/{regionCode}/recent
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        RecentService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val notable: NotableService.WithRawResponse by lazy {
            NotableServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val species: SpecieService.WithRawResponse by lazy {
            SpecieServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val historic: HistoricService.WithRawResponse by lazy {
            HistoricServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): RecentService.WithRawResponse =
            RecentServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        /**
         * The data/obs end-points are used to fetch observations submitted to eBird in checklists.
         * There are two categories of end-point: 1. Fetch observations for a specific country,
         * region or location. 2. Fetch observations for nearby locations - up to a distance of
         * 50km. Each end-point supports optional query parameters which allow you to filter the
         * list of observations returned.
         */
        override fun notable(): NotableService.WithRawResponse = notable

        /**
         * The data/obs end-points are used to fetch observations submitted to eBird in checklists.
         * There are two categories of end-point: 1. Fetch observations for a specific country,
         * region or location. 2. Fetch observations for nearby locations - up to a distance of
         * 50km. Each end-point supports optional query parameters which allow you to filter the
         * list of observations returned.
         */
        override fun species(): SpecieService.WithRawResponse = species

        /**
         * The data/obs end-points are used to fetch observations submitted to eBird in checklists.
         * There are two categories of end-point: 1. Fetch observations for a specific country,
         * region or location. 2. Fetch observations for nearby locations - up to a distance of
         * 50km. Each end-point supports optional query parameters which allow you to filter the
         * list of observations returned.
         */
        override fun historic(): HistoricService.WithRawResponse = historic

        private val listHandler: Handler<List<Observation>> =
            jsonHandler<List<Observation>>(clientOptions.jsonMapper)

        override fun list(
            params: RecentListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<Observation>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("regionCode", params.regionCode().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("data", "obs", params._pathParam(0), "recent")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
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
