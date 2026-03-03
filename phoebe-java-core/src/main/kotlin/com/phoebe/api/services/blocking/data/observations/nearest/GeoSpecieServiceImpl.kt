// File generated from our OpenAPI spec by Stainless.

package com.phoebe.api.services.blocking.data.observations.nearest

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
import com.phoebe.api.models.data.observations.nearest.geospecies.GeoSpecieListParams
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/**
 * The data/obs end-points are used to fetch observations submitted to eBird in checklists. There
 * are two categories of end-point: 1. Fetch observations for a specific country, region or
 * location. 2. Fetch observations for nearby locations - up to a distance of 50km. Each end-point
 * supports optional query parameters which allow you to filter the list of observations returned.
 */
class GeoSpecieServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    GeoSpecieService {

    private val withRawResponse: GeoSpecieService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): GeoSpecieService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): GeoSpecieService =
        GeoSpecieServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun list(
        params: GeoSpecieListParams,
        requestOptions: RequestOptions,
    ): List<Observation> =
        // get /data/nearest/geo/recent/{speciesCode}
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        GeoSpecieService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): GeoSpecieService.WithRawResponse =
            GeoSpecieServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val listHandler: Handler<List<Observation>> =
            jsonHandler<List<Observation>>(clientOptions.jsonMapper)

        override fun list(
            params: GeoSpecieListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<Observation>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("speciesCode", params.speciesCode().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("data", "nearest", "geo", "recent", params._pathParam(0))
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
