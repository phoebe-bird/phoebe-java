// File generated from our OpenAPI spec by Stainless.

package com.phoebe.api.services.async

import com.phoebe.api.core.ClientOptions
import com.phoebe.api.services.async.ref.HotspotServiceAsync
import com.phoebe.api.services.async.ref.HotspotServiceAsyncImpl
import com.phoebe.api.services.async.ref.RegionServiceAsync
import com.phoebe.api.services.async.ref.RegionServiceAsyncImpl
import com.phoebe.api.services.async.ref.TaxonomyServiceAsync
import com.phoebe.api.services.async.ref.TaxonomyServiceAsyncImpl

class RefServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    RefServiceAsync {

    private val withRawResponse: RefServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val region: RegionServiceAsync by lazy { RegionServiceAsyncImpl(clientOptions) }

    private val hotspot: HotspotServiceAsync by lazy { HotspotServiceAsyncImpl(clientOptions) }

    private val taxonomy: TaxonomyServiceAsync by lazy { TaxonomyServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): RefServiceAsync.WithRawResponse = withRawResponse

    override fun region(): RegionServiceAsync = region

    override fun hotspot(): HotspotServiceAsync = hotspot

    override fun taxonomy(): TaxonomyServiceAsync = taxonomy

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        RefServiceAsync.WithRawResponse {

        private val region: RegionServiceAsync.WithRawResponse by lazy {
            RegionServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val hotspot: HotspotServiceAsync.WithRawResponse by lazy {
            HotspotServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val taxonomy: TaxonomyServiceAsync.WithRawResponse by lazy {
            TaxonomyServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun region(): RegionServiceAsync.WithRawResponse = region

        override fun hotspot(): HotspotServiceAsync.WithRawResponse = hotspot

        override fun taxonomy(): TaxonomyServiceAsync.WithRawResponse = taxonomy
    }
}
