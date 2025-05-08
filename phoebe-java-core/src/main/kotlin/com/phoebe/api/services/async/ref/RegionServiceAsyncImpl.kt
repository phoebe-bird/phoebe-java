// File generated from our OpenAPI spec by Stainless.

package com.phoebe.api.services.async.ref

import com.phoebe.api.core.ClientOptions
import com.phoebe.api.services.async.ref.region.AdjacentServiceAsync
import com.phoebe.api.services.async.ref.region.AdjacentServiceAsyncImpl
import com.phoebe.api.services.async.ref.region.InfoServiceAsync
import com.phoebe.api.services.async.ref.region.InfoServiceAsyncImpl
import com.phoebe.api.services.async.ref.region.ListServiceAsync
import com.phoebe.api.services.async.ref.region.ListServiceAsyncImpl

class RegionServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    RegionServiceAsync {

    private val withRawResponse: RegionServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val adjacent: AdjacentServiceAsync by lazy { AdjacentServiceAsyncImpl(clientOptions) }

    private val info: InfoServiceAsync by lazy { InfoServiceAsyncImpl(clientOptions) }

    private val list: ListServiceAsync by lazy { ListServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): RegionServiceAsync.WithRawResponse = withRawResponse

    override fun adjacent(): AdjacentServiceAsync = adjacent

    override fun info(): InfoServiceAsync = info

    override fun list(): ListServiceAsync = list

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        RegionServiceAsync.WithRawResponse {

        private val adjacent: AdjacentServiceAsync.WithRawResponse by lazy {
            AdjacentServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val info: InfoServiceAsync.WithRawResponse by lazy {
            InfoServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val list: ListServiceAsync.WithRawResponse by lazy {
            ListServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun adjacent(): AdjacentServiceAsync.WithRawResponse = adjacent

        override fun info(): InfoServiceAsync.WithRawResponse = info

        override fun list(): ListServiceAsync.WithRawResponse = list
    }
}
