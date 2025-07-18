// File generated from our OpenAPI spec by Stainless.

package com.phoebe.api.services.async.ref

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
import com.phoebe.api.core.prepareAsync
import com.phoebe.api.models.ref.hotspot.HotspotListParams
import com.phoebe.api.models.ref.hotspot.HotspotListResponse
import com.phoebe.api.services.async.ref.hotspot.GeoServiceAsync
import com.phoebe.api.services.async.ref.hotspot.GeoServiceAsyncImpl
import com.phoebe.api.services.async.ref.hotspot.InfoServiceAsync
import com.phoebe.api.services.async.ref.hotspot.InfoServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class HotspotServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    HotspotServiceAsync {

    private val withRawResponse: HotspotServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val geo: GeoServiceAsync by lazy { GeoServiceAsyncImpl(clientOptions) }

    private val info: InfoServiceAsync by lazy { InfoServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): HotspotServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): HotspotServiceAsync =
        HotspotServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun geo(): GeoServiceAsync = geo

    override fun info(): InfoServiceAsync = info

    override fun list(
        params: HotspotListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<List<HotspotListResponse>> =
        // get /ref/hotspot/{regionCode}
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        HotspotServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val geo: GeoServiceAsync.WithRawResponse by lazy {
            GeoServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val info: InfoServiceAsync.WithRawResponse by lazy {
            InfoServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): HotspotServiceAsync.WithRawResponse =
            HotspotServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun geo(): GeoServiceAsync.WithRawResponse = geo

        override fun info(): InfoServiceAsync.WithRawResponse = info

        private val listHandler: Handler<List<HotspotListResponse>> =
            jsonHandler<List<HotspotListResponse>>(clientOptions.jsonMapper)

        override fun list(
            params: HotspotListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<List<HotspotListResponse>>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("regionCode", params.regionCode().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("ref", "hotspot", params._pathParam(0))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
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
}
