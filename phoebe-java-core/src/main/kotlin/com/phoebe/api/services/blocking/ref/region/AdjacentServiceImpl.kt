// File generated from our OpenAPI spec by Stainless.

package com.phoebe.api.services.blocking.ref.region

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
import com.phoebe.api.models.ref.region.adjacent.AdjacentListParams
import com.phoebe.api.models.ref.region.adjacent.AdjacentListResponse

class AdjacentServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    AdjacentService {

    private val withRawResponse: AdjacentService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): AdjacentService.WithRawResponse = withRawResponse

    override fun list(
        params: AdjacentListParams,
        requestOptions: RequestOptions,
    ): List<AdjacentListResponse> =
        // get /ref/adjacent/{regionCode}
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AdjacentService.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val listHandler: Handler<List<AdjacentListResponse>> =
            jsonHandler<List<AdjacentListResponse>>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun list(
            params: AdjacentListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<AdjacentListResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("ref", "adjacent", params._pathParam(0))
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
