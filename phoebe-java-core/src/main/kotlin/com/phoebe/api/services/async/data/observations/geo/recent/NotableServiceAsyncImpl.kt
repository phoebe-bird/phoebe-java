// File generated from our OpenAPI spec by Stainless.

package com.phoebe.api.services.async.data.observations.geo.recent

import com.phoebe.api.core.ClientOptions
import com.phoebe.api.core.RequestOptions
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
import com.phoebe.api.models.data.observations.Observation
import com.phoebe.api.models.data.observations.geo.recent.notable.NotableListParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

class NotableServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    NotableServiceAsync {

    private val withRawResponse: NotableServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): NotableServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): NotableServiceAsync =
        NotableServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun list(
        params: NotableListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<List<Observation>> =
        // get /data/obs/geo/recent/notable
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        NotableServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): NotableServiceAsync.WithRawResponse =
            NotableServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val listHandler: Handler<List<Observation>> =
            jsonHandler<List<Observation>>(clientOptions.jsonMapper)

        override fun list(
            params: NotableListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<List<Observation>>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("data", "obs", "geo", "recent", "notable")
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
