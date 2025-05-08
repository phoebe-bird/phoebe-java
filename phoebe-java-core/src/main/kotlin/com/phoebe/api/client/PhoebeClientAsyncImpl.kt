// File generated from our OpenAPI spec by Stainless.

package com.phoebe.api.client

import com.phoebe.api.core.ClientOptions
import com.phoebe.api.core.getPackageVersion
import com.phoebe.api.services.async.DataServiceAsync
import com.phoebe.api.services.async.DataServiceAsyncImpl
import com.phoebe.api.services.async.ProductServiceAsync
import com.phoebe.api.services.async.ProductServiceAsyncImpl
import com.phoebe.api.services.async.RefServiceAsync
import com.phoebe.api.services.async.RefServiceAsyncImpl

class PhoebeClientAsyncImpl(private val clientOptions: ClientOptions) : PhoebeClientAsync {

    private val clientOptionsWithUserAgent =
        if (clientOptions.headers.names().contains("User-Agent")) clientOptions
        else
            clientOptions
                .toBuilder()
                .putHeader("User-Agent", "${javaClass.simpleName}/Java ${getPackageVersion()}")
                .build()

    // Pass the original clientOptions so that this client sets its own User-Agent.
    private val sync: PhoebeClient by lazy { PhoebeClientImpl(clientOptions) }

    private val withRawResponse: PhoebeClientAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val data: DataServiceAsync by lazy { DataServiceAsyncImpl(clientOptionsWithUserAgent) }

    private val product: ProductServiceAsync by lazy {
        ProductServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val ref: RefServiceAsync by lazy { RefServiceAsyncImpl(clientOptionsWithUserAgent) }

    override fun sync(): PhoebeClient = sync

    override fun withRawResponse(): PhoebeClientAsync.WithRawResponse = withRawResponse

    override fun data(): DataServiceAsync = data

    override fun product(): ProductServiceAsync = product

    override fun ref(): RefServiceAsync = ref

    override fun close() = clientOptions.httpClient.close()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        PhoebeClientAsync.WithRawResponse {

        private val data: DataServiceAsync.WithRawResponse by lazy {
            DataServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val product: ProductServiceAsync.WithRawResponse by lazy {
            ProductServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val ref: RefServiceAsync.WithRawResponse by lazy {
            RefServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun data(): DataServiceAsync.WithRawResponse = data

        override fun product(): ProductServiceAsync.WithRawResponse = product

        override fun ref(): RefServiceAsync.WithRawResponse = ref
    }
}
