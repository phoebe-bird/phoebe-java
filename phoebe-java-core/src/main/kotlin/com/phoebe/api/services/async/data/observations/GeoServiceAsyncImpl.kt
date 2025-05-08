// File generated from our OpenAPI spec by Stainless.

package com.phoebe.api.services.async.data.observations

import com.phoebe.api.core.ClientOptions
import com.phoebe.api.services.async.data.observations.geo.RecentServiceAsync
import com.phoebe.api.services.async.data.observations.geo.RecentServiceAsyncImpl

class GeoServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    GeoServiceAsync {

    private val withRawResponse: GeoServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val recent: RecentServiceAsync by lazy { RecentServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): GeoServiceAsync.WithRawResponse = withRawResponse

    override fun recent(): RecentServiceAsync = recent

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        GeoServiceAsync.WithRawResponse {

        private val recent: RecentServiceAsync.WithRawResponse by lazy {
            RecentServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun recent(): RecentServiceAsync.WithRawResponse = recent
    }
}
