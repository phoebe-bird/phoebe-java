// File generated from our OpenAPI spec by Stainless.

package com.phoebe.api.services.blocking.product

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
import com.phoebe.api.models.product.lists.ListRetrieveParams
import com.phoebe.api.models.product.lists.ListRetrieveResponse
import com.phoebe.api.services.blocking.product.lists.HistoricalService
import com.phoebe.api.services.blocking.product.lists.HistoricalServiceImpl

class ListServiceImpl internal constructor(private val clientOptions: ClientOptions) : ListService {

    private val withRawResponse: ListService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val historical: HistoricalService by lazy { HistoricalServiceImpl(clientOptions) }

    override fun withRawResponse(): ListService.WithRawResponse = withRawResponse

    override fun historical(): HistoricalService = historical

    override fun retrieve(
        params: ListRetrieveParams,
        requestOptions: RequestOptions,
    ): List<ListRetrieveResponse> =
        // get /product/lists/{regionCode}
        withRawResponse().retrieve(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ListService.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val historical: HistoricalService.WithRawResponse by lazy {
            HistoricalServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun historical(): HistoricalService.WithRawResponse = historical

        private val retrieveHandler: Handler<List<ListRetrieveResponse>> =
            jsonHandler<List<ListRetrieveResponse>>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun retrieve(
            params: ListRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<ListRetrieveResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("product", "lists", params._pathParam(0))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
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
