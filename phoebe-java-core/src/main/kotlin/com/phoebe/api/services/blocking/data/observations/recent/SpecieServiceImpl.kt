// File generated from our OpenAPI spec by Stainless.

package com.phoebe.api.services.blocking.data.observations.recent

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
import com.phoebe.api.models.data.observations.recent.species.SpecieRetrieveParams
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class SpecieServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    SpecieService {

    private val withRawResponse: SpecieService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): SpecieService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): SpecieService =
        SpecieServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun retrieve(
        params: SpecieRetrieveParams,
        requestOptions: RequestOptions,
    ): List<Observation> =
        // get /data/obs/{regionCode}/recent/{speciesCode}
        withRawResponse().retrieve(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        SpecieService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SpecieService.WithRawResponse =
            SpecieServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val retrieveHandler: Handler<List<Observation>> =
            jsonHandler<List<Observation>>(clientOptions.jsonMapper)

        override fun retrieve(
            params: SpecieRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<Observation>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("speciesCode", params.speciesCode().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "data",
                        "obs",
                        params._pathParam(0),
                        "recent",
                        params._pathParam(1),
                    )
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { retrieveHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.forEach { it.validate() }
                        }
                    }
            }
        }
    }
}
