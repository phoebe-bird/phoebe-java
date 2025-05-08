// File generated from our OpenAPI spec by Stainless.

package com.phoebe.api.services.async.data

import com.phoebe.api.core.ClientOptions
import com.phoebe.api.services.async.data.observations.GeoServiceAsync
import com.phoebe.api.services.async.data.observations.GeoServiceAsyncImpl
import com.phoebe.api.services.async.data.observations.NearestServiceAsync
import com.phoebe.api.services.async.data.observations.NearestServiceAsyncImpl
import com.phoebe.api.services.async.data.observations.RecentServiceAsync
import com.phoebe.api.services.async.data.observations.RecentServiceAsyncImpl

class ObservationServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    ObservationServiceAsync {

    private val withRawResponse: ObservationServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val recent: RecentServiceAsync by lazy { RecentServiceAsyncImpl(clientOptions) }

    private val geo: GeoServiceAsync by lazy { GeoServiceAsyncImpl(clientOptions) }

    private val nearest: NearestServiceAsync by lazy { NearestServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): ObservationServiceAsync.WithRawResponse = withRawResponse

    override fun recent(): RecentServiceAsync = recent

    override fun geo(): GeoServiceAsync = geo

    override fun nearest(): NearestServiceAsync = nearest

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ObservationServiceAsync.WithRawResponse {

        private val recent: RecentServiceAsync.WithRawResponse by lazy {
            RecentServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val geo: GeoServiceAsync.WithRawResponse by lazy {
            GeoServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val nearest: NearestServiceAsync.WithRawResponse by lazy {
            NearestServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun recent(): RecentServiceAsync.WithRawResponse = recent

        override fun geo(): GeoServiceAsync.WithRawResponse = geo

        override fun nearest(): NearestServiceAsync.WithRawResponse = nearest
    }
}
