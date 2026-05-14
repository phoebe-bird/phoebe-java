// File generated from our OpenAPI spec by Stainless.

package com.phoebe.api.services.async.data

import com.phoebe.api.core.ClientOptions
import com.phoebe.api.services.async.data.observations.GeoServiceAsync
import com.phoebe.api.services.async.data.observations.GeoServiceAsyncImpl
import com.phoebe.api.services.async.data.observations.NearestServiceAsync
import com.phoebe.api.services.async.data.observations.NearestServiceAsyncImpl
import com.phoebe.api.services.async.data.observations.RecentServiceAsync
import com.phoebe.api.services.async.data.observations.RecentServiceAsyncImpl
import java.util.function.Consumer

class ObservationServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    ObservationServiceAsync {

    private val withRawResponse: ObservationServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val recent: RecentServiceAsync by lazy { RecentServiceAsyncImpl(clientOptions) }

    private val geo: GeoServiceAsync by lazy { GeoServiceAsyncImpl(clientOptions) }

    private val nearest: NearestServiceAsync by lazy { NearestServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): ObservationServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ObservationServiceAsync =
        ObservationServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    /**
     * The data/obs end-points are used to fetch observations submitted to eBird in checklists.
     * There are two categories of end-point: 1. Fetch observations for a specific country, region
     * or location. 2. Fetch observations for nearby locations - up to a distance of 50km. Each
     * end-point supports optional query parameters which allow you to filter the list of
     * observations returned.
     */
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

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ObservationServiceAsync.WithRawResponse =
            ObservationServiceAsyncImpl.WithRawResponseImpl(
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

        override fun geo(): GeoServiceAsync.WithRawResponse = geo

        override fun nearest(): NearestServiceAsync.WithRawResponse = nearest
    }
}
