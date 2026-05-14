// File generated from our OpenAPI spec by Stainless.

package com.phoebe.api.services.blocking.ref

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
import com.phoebe.api.models.ref.hotspot.HotspotListParams
import com.phoebe.api.models.ref.hotspot.HotspotListResponse
import com.phoebe.api.services.blocking.ref.hotspot.GeoService
import com.phoebe.api.services.blocking.ref.hotspot.GeoServiceImpl
import com.phoebe.api.services.blocking.ref.hotspot.InfoService
import com.phoebe.api.services.blocking.ref.hotspot.InfoServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/**
 * With the ref/hotspot end-points you can find the hotspots for a given country or region or nearby
 * hotspots
 */
class HotspotServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    HotspotService {

    private val withRawResponse: HotspotService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val geo: GeoService by lazy { GeoServiceImpl(clientOptions) }

    private val info: InfoService by lazy { InfoServiceImpl(clientOptions) }

    override fun withRawResponse(): HotspotService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): HotspotService =
        HotspotServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    /**
     * With the ref/hotspot end-points you can find the hotspots for a given country or region or
     * nearby hotspots
     */
    override fun geo(): GeoService = geo

    /**
     * With the ref/hotspot end-points you can find the hotspots for a given country or region or
     * nearby hotspots
     */
    override fun info(): InfoService = info

    override fun list(
        params: HotspotListParams,
        requestOptions: RequestOptions,
    ): List<HotspotListResponse> =
        // get /ref/hotspot/{regionCode}
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        HotspotService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val geo: GeoService.WithRawResponse by lazy {
            GeoServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val info: InfoService.WithRawResponse by lazy {
            InfoServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): HotspotService.WithRawResponse =
            HotspotServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        /**
         * With the ref/hotspot end-points you can find the hotspots for a given country or region
         * or nearby hotspots
         */
        override fun geo(): GeoService.WithRawResponse = geo

        /**
         * With the ref/hotspot end-points you can find the hotspots for a given country or region
         * or nearby hotspots
         */
        override fun info(): InfoService.WithRawResponse = info

        private val listHandler: Handler<List<HotspotListResponse>> =
            jsonHandler<List<HotspotListResponse>>(clientOptions.jsonMapper)

        override fun list(
            params: HotspotListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<HotspotListResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("regionCode", params.regionCode().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("ref", "hotspot", params._pathParam(0))
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
