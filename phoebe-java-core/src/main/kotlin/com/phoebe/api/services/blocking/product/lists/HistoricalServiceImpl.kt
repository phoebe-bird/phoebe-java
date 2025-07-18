// File generated from our OpenAPI spec by Stainless.

package com.phoebe.api.services.blocking.product.lists

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
import com.phoebe.api.models.product.lists.historical.HistoricalRetrieveParams
import com.phoebe.api.models.product.lists.historical.HistoricalRetrieveResponse
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class HistoricalServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    HistoricalService {

    private val withRawResponse: HistoricalService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): HistoricalService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): HistoricalService =
        HistoricalServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun retrieve(
        params: HistoricalRetrieveParams,
        requestOptions: RequestOptions,
    ): List<HistoricalRetrieveResponse> =
        // get /product/lists/{regionCode}/{y}/{m}/{d}
        withRawResponse().retrieve(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        HistoricalService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): HistoricalService.WithRawResponse =
            HistoricalServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val retrieveHandler: Handler<List<HistoricalRetrieveResponse>> =
            jsonHandler<List<HistoricalRetrieveResponse>>(clientOptions.jsonMapper)

        override fun retrieve(
            params: HistoricalRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<HistoricalRetrieveResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("d", params.d().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "product",
                        "lists",
                        params._pathParam(0),
                        params._pathParam(1),
                        params._pathParam(2),
                        params._pathParam(3),
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
