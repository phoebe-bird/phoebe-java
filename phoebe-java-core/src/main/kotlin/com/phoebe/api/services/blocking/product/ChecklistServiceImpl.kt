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
import com.phoebe.api.models.product.checklist.ChecklistViewParams
import com.phoebe.api.models.product.checklist.ChecklistViewResponse

class ChecklistServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    ChecklistService {

    private val withRawResponse: ChecklistService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ChecklistService.WithRawResponse = withRawResponse

    override fun view(
        params: ChecklistViewParams,
        requestOptions: RequestOptions,
    ): ChecklistViewResponse =
        // get /product/checklist/view/{subId}
        withRawResponse().view(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ChecklistService.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val viewHandler: Handler<ChecklistViewResponse> =
            jsonHandler<ChecklistViewResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun view(
            params: ChecklistViewParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ChecklistViewResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("product", "checklist", "view", params._pathParam(0))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { viewHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
