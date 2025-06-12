// File generated from our OpenAPI spec by Stainless.

package com.phoebe.api.services.async.ref.taxonomy

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
import com.phoebe.api.models.ref.taxonomy.forms.FormListParams
import java.util.concurrent.CompletableFuture
import kotlin.jvm.optionals.getOrNull

class FormServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    FormServiceAsync {

    private val withRawResponse: FormServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): FormServiceAsync.WithRawResponse = withRawResponse

    override fun list(
        params: FormListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<List<String>> =
        // get /ref/taxon/forms/{speciesCode}
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        FormServiceAsync.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val listHandler: Handler<List<String>> =
            jsonHandler<List<String>>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun list(
            params: FormListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<List<String>>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("speciesCode", params.speciesCode().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("ref", "taxon", "forms", params._pathParam(0))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable { response.use { listHandler.handle(it) } }
                }
        }
    }
}
