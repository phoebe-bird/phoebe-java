// File generated from our OpenAPI spec by Stainless.

package com.phoebe.api.services.async.data.observations

import com.phoebe.api.core.ClientOptions
import com.phoebe.api.services.async.data.observations.geo.RecentServiceAsync
import com.phoebe.api.services.async.data.observations.geo.RecentServiceAsyncImpl
import java.util.function.Consumer

class GeoServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    GeoServiceAsync {

    private val withRawResponse: GeoServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val recent: RecentServiceAsync by lazy { RecentServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): GeoServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): GeoServiceAsync =
        GeoServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    /**
     * The data/obs end-points are used to fetch observations submitted to eBird in checklists.
     * There are two categories of end-point: 1. Fetch observations for a specific country, region
     * or location. 2. Fetch observations for nearby locations - up to a distance of 50km. Each
     * end-point supports optional query parameters which allow you to filter the list of
     * observations returned.
     */
    override fun recent(): RecentServiceAsync = recent

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        GeoServiceAsync.WithRawResponse {

        private val recent: RecentServiceAsync.WithRawResponse by lazy {
            RecentServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): GeoServiceAsync.WithRawResponse =
            GeoServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        /**
         * The data/obs end-points are used to fetch observations submitted to eBird in checklists.
         * There are two categories of end-point: 1. Fetch observations for a specific country,
         * region or location. 2. Fetch observations for nearby locations - up to a distance of
         * 50km. Each end-point supports optional query parameters which allow you to filter the
         * list of observations returned.
         */
        override fun recent(): RecentServiceAsync.WithRawResponse = recent
    }
}
