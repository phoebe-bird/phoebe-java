// File generated from our OpenAPI spec by Stainless.

package com.phoebe.api.services.blocking.ref.taxonomy

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
import com.phoebe.api.models.ref.taxonomy.speciesgroups.SpeciesGroupListParams
import com.phoebe.api.models.ref.taxonomy.speciesgroups.SpeciesGroupListResponse
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class SpeciesGroupServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    SpeciesGroupService {

    private val withRawResponse: SpeciesGroupService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): SpeciesGroupService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): SpeciesGroupService =
        SpeciesGroupServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun list(
        params: SpeciesGroupListParams,
        requestOptions: RequestOptions,
    ): List<SpeciesGroupListResponse> =
        // get /ref/sppgroup/{speciesGrouping}
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        SpeciesGroupService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SpeciesGroupService.WithRawResponse =
            SpeciesGroupServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val listHandler: Handler<List<SpeciesGroupListResponse>> =
            jsonHandler<List<SpeciesGroupListResponse>>(clientOptions.jsonMapper)

        override fun list(
            params: SpeciesGroupListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<SpeciesGroupListResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("speciesGrouping", params.speciesGrouping().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("ref", "sppgroup", params._pathParam(0))
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
