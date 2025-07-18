// File generated from our OpenAPI spec by Stainless.

package com.phoebe.api.services.blocking.ref.region

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
import com.phoebe.api.models.ref.region.adjacent.AdjacentListParams
import com.phoebe.api.models.ref.region.adjacent.AdjacentListResponse
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class AdjacentServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    AdjacentService {

    private val withRawResponse: AdjacentService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): AdjacentService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): AdjacentService =
        AdjacentServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun list(
        params: AdjacentListParams,
        requestOptions: RequestOptions,
    ): List<AdjacentListResponse> =
        // get /ref/adjacent/{regionCode}
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AdjacentService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AdjacentService.WithRawResponse =
            AdjacentServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val listHandler: Handler<List<AdjacentListResponse>> =
            jsonHandler<List<AdjacentListResponse>>(clientOptions.jsonMapper)

        override fun list(
            params: AdjacentListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<AdjacentListResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("regionCode", params.regionCode().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("ref", "adjacent", params._pathParam(0))
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
