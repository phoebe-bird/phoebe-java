// File generated from our OpenAPI spec by Stainless.

package com.phoebe.api.client

import com.phoebe.api.core.ClientOptions
import com.phoebe.api.core.getPackageVersion
import com.phoebe.api.services.blocking.DataService
import com.phoebe.api.services.blocking.DataServiceImpl
import com.phoebe.api.services.blocking.ProductService
import com.phoebe.api.services.blocking.ProductServiceImpl
import com.phoebe.api.services.blocking.RefService
import com.phoebe.api.services.blocking.RefServiceImpl
import java.util.function.Consumer

class PhoebeClientImpl(private val clientOptions: ClientOptions) : PhoebeClient {

    private val clientOptionsWithUserAgent =
        if (clientOptions.headers.names().contains("User-Agent")) clientOptions
        else
            clientOptions
                .toBuilder()
                .putHeader("User-Agent", "${javaClass.simpleName}/Java ${getPackageVersion()}")
                .build()

    // Pass the original clientOptions so that this client sets its own User-Agent.
    private val async: PhoebeClientAsync by lazy { PhoebeClientAsyncImpl(clientOptions) }

    private val withRawResponse: PhoebeClient.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val data: DataService by lazy { DataServiceImpl(clientOptionsWithUserAgent) }

    private val product: ProductService by lazy { ProductServiceImpl(clientOptionsWithUserAgent) }

    private val ref: RefService by lazy { RefServiceImpl(clientOptionsWithUserAgent) }

    override fun async(): PhoebeClientAsync = async

    override fun withRawResponse(): PhoebeClient.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): PhoebeClient =
        PhoebeClientImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun data(): DataService = data

    override fun product(): ProductService = product

    override fun ref(): RefService = ref

    override fun close() = clientOptions.httpClient.close()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        PhoebeClient.WithRawResponse {

        private val data: DataService.WithRawResponse by lazy {
            DataServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val product: ProductService.WithRawResponse by lazy {
            ProductServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val ref: RefService.WithRawResponse by lazy {
            RefServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): PhoebeClient.WithRawResponse =
            PhoebeClientImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun data(): DataService.WithRawResponse = data

        override fun product(): ProductService.WithRawResponse = product

        override fun ref(): RefService.WithRawResponse = ref
    }
}
