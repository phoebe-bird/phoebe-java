// File generated from our OpenAPI spec by Stainless.

package com.phoebe.api.services.blocking.ref.taxonomy

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
import com.phoebe.api.core.prepare
import com.phoebe.api.models.ref.taxonomy.locales.LocaleListParams
import com.phoebe.api.models.ref.taxonomy.locales.LocaleListResponse
import java.util.function.Consumer

class LocaleServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    LocaleService {

    private val withRawResponse: LocaleService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): LocaleService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): LocaleService =
        LocaleServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun list(
        params: LocaleListParams,
        requestOptions: RequestOptions,
    ): List<LocaleListResponse> =
        // get /ref/taxa-locales/ebird
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        LocaleService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): LocaleService.WithRawResponse =
            LocaleServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val listHandler: Handler<List<LocaleListResponse>> =
            jsonHandler<List<LocaleListResponse>>(clientOptions.jsonMapper)

        override fun list(
            params: LocaleListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<LocaleListResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("ref", "taxa-locales", "ebird")
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
