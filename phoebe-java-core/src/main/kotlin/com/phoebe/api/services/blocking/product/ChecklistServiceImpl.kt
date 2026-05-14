// File generated from our OpenAPI spec by Stainless.

package com.phoebe.api.services.blocking.product

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
import com.phoebe.api.models.product.checklist.ChecklistViewParams
import com.phoebe.api.models.product.checklist.ChecklistViewResponse
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/**
 * The product end-points make it easy to get the information shown in various pages on the eBird
 * web site: 1. The Top 100 contributors on a given date. 2. The checklists submitted on a given
 * date. 3. The most recent checklists submitted. 4. A summary of the checklists submitted on a
 * given date. 5. The details and all the observations of a checklist.
 */
class ChecklistServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    ChecklistService {

    private val withRawResponse: ChecklistService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ChecklistService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ChecklistService =
        ChecklistServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun view(
        params: ChecklistViewParams,
        requestOptions: RequestOptions,
    ): ChecklistViewResponse =
        // get /product/checklist/view/{subId}
        withRawResponse().view(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ChecklistService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ChecklistService.WithRawResponse =
            ChecklistServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val viewHandler: Handler<ChecklistViewResponse> =
            jsonHandler<ChecklistViewResponse>(clientOptions.jsonMapper)

        override fun view(
            params: ChecklistViewParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ChecklistViewResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("subId", params.subId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("product", "checklist", "view", params._pathParam(0))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
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
