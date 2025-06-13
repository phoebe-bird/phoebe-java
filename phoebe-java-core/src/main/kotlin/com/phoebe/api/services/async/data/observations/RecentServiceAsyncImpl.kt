// File generated from our OpenAPI spec by Stainless.

package com.phoebe.api.services.async.data.observations

import com.phoebe.api.core.ClientOptions
import com.phoebe.api.core.JsonValue
import com.phoebe.api.core.RequestOptions
import com.phoebe.api.core.checkRequired
import com.phoebe.api.core.handlers.errorHandler
import com.phoebe.api.core.handlers.jsonHandler
import com.phoebe.api.core.handlers.withErrorHandler
import com.phoebe.api.core.http.HttpMethod
import com.phoebe.api.core.http.HttpRequest
import com.phoebe.api.core.http.HttpResponse.Handler
import com.phoebe.api.core.http.HttpResponseFor
import com.phoebe.api.core.http.parseable
import com.phoebe.api.core.prepareAsync
import com.phoebe.api.models.data.observations.Observation
import com.phoebe.api.models.data.observations.recent.RecentListParams
import com.phoebe.api.services.async.data.observations.recent.HistoricServiceAsync
import com.phoebe.api.services.async.data.observations.recent.HistoricServiceAsyncImpl
import com.phoebe.api.services.async.data.observations.recent.NotableServiceAsync
import com.phoebe.api.services.async.data.observations.recent.NotableServiceAsyncImpl
import com.phoebe.api.services.async.data.observations.recent.SpecieServiceAsync
import com.phoebe.api.services.async.data.observations.recent.SpecieServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class RecentServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    RecentServiceAsync {

    private val withRawResponse: RecentServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val notable: NotableServiceAsync by lazy { NotableServiceAsyncImpl(clientOptions) }

    private val species: SpecieServiceAsync by lazy { SpecieServiceAsyncImpl(clientOptions) }

    private val historic: HistoricServiceAsync by lazy { HistoricServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): RecentServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): RecentServiceAsync =
        RecentServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun notable(): NotableServiceAsync = notable

    override fun species(): SpecieServiceAsync = species

    override fun historic(): HistoricServiceAsync = historic

    override fun list(
        params: RecentListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<List<Observation>> =
        // get /data/obs/{regionCode}/recent
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        RecentServiceAsync.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val notable: NotableServiceAsync.WithRawResponse by lazy {
            NotableServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val species: SpecieServiceAsync.WithRawResponse by lazy {
            SpecieServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val historic: HistoricServiceAsync.WithRawResponse by lazy {
            HistoricServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): RecentServiceAsync.WithRawResponse =
            RecentServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun notable(): NotableServiceAsync.WithRawResponse = notable

        override fun species(): SpecieServiceAsync.WithRawResponse = species

        override fun historic(): HistoricServiceAsync.WithRawResponse = historic

        private val listHandler: Handler<List<Observation>> =
            jsonHandler<List<Observation>>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun list(
            params: RecentListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<List<Observation>>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("regionCode", params.regionCode().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("data", "obs", params._pathParam(0), "recent")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
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
