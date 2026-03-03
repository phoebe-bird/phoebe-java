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
import com.phoebe.api.models.product.lists.ListRetrieveParams
import com.phoebe.api.models.product.lists.ListRetrieveResponse
import com.phoebe.api.services.blocking.product.lists.HistoricalService
import com.phoebe.api.services.blocking.product.lists.HistoricalServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/**
 * The data/obs end-points are used to fetch observations submitted to eBird in checklists. There
 * are two categories of end-point: 1. Fetch observations for a specific country, region or
 * location. 2. Fetch observations for nearby locations - up to a distance of 50km. Each end-point
 * supports optional query parameters which allow you to filter the list of observations returned.
 */
class ListServiceImpl internal constructor(private val clientOptions: ClientOptions) : ListService {

    private val withRawResponse: ListService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val historical: HistoricalService by lazy { HistoricalServiceImpl(clientOptions) }

    override fun withRawResponse(): ListService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ListService =
        ListServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    /**
     * The product end-points make it easy to get the information shown in various pages on the
     * eBird web site: 1. The Top 100 contributors on a given date. 2. The checklists submitted on a
     * given date. 3. The most recent checklists submitted. 4. A summary of the checklists submitted
     * on a given date. 5. The details and all the observations of a checklist.
     */
    override fun historical(): HistoricalService = historical

    override fun retrieve(
        params: ListRetrieveParams,
        requestOptions: RequestOptions,
    ): List<ListRetrieveResponse> =
        // get /product/lists/{regionCode}
        withRawResponse().retrieve(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ListService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val historical: HistoricalService.WithRawResponse by lazy {
            HistoricalServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ListService.WithRawResponse =
            ListServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        /**
         * The product end-points make it easy to get the information shown in various pages on the
         * eBird web site: 1. The Top 100 contributors on a given date. 2. The checklists submitted
         * on a given date. 3. The most recent checklists submitted. 4. A summary of the checklists
         * submitted on a given date. 5. The details and all the observations of a checklist.
         */
        override fun historical(): HistoricalService.WithRawResponse = historical

        private val retrieveHandler: Handler<List<ListRetrieveResponse>> =
            jsonHandler<List<ListRetrieveResponse>>(clientOptions.jsonMapper)

        override fun retrieve(
            params: ListRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<ListRetrieveResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("regionCode", params.regionCode().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("product", "lists", params._pathParam(0))
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
