// File generated from our OpenAPI spec by Stainless.

package com.phoebe.api.services.async.product

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
import com.phoebe.api.models.product.stats.StatRetrieveParams
import com.phoebe.api.models.product.stats.StatRetrieveResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/**
 * The product end-points make it easy to get the information shown in various pages on the eBird
 * web site: 1. The Top 100 contributors on a given date. 2. The checklists submitted on a given
 * date. 3. The most recent checklists submitted. 4. A summary of the checklists submitted on a
 * given date. 5. The details and all the observations of a checklist.
 */
class StatServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    StatServiceAsync {

    private val withRawResponse: StatServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): StatServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): StatServiceAsync =
        StatServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun retrieve(
        params: StatRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<StatRetrieveResponse> =
        // get /product/stats/{regionCode}/{y}/{m}/{d}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        StatServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): StatServiceAsync.WithRawResponse =
            StatServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val retrieveHandler: Handler<StatRetrieveResponse> =
            jsonHandler<StatRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: StatRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<StatRetrieveResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("d", params.d().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "product",
                        "stats",
                        params._pathParam(0),
                        params._pathParam(1),
                        params._pathParam(2),
                        params._pathParam(3),
                    )
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { retrieveHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }
    }
}
