// File generated from our OpenAPI spec by Stainless.

package com.phoebe.api.services.blocking.data

import com.phoebe.api.core.ClientOptions
import com.phoebe.api.services.blocking.data.observations.GeoService
import com.phoebe.api.services.blocking.data.observations.GeoServiceImpl
import com.phoebe.api.services.blocking.data.observations.NearestService
import com.phoebe.api.services.blocking.data.observations.NearestServiceImpl
import com.phoebe.api.services.blocking.data.observations.RecentService
import com.phoebe.api.services.blocking.data.observations.RecentServiceImpl
import java.util.function.Consumer

class ObservationServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    ObservationService {

    private val withRawResponse: ObservationService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val recent: RecentService by lazy { RecentServiceImpl(clientOptions) }

    private val geo: GeoService by lazy { GeoServiceImpl(clientOptions) }

    private val nearest: NearestService by lazy { NearestServiceImpl(clientOptions) }

    override fun withRawResponse(): ObservationService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ObservationService =
        ObservationServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    /**
     * The data/obs end-points are used to fetch observations submitted to eBird in checklists.
     * There are two categories of end-point: 1. Fetch observations for a specific country, region
     * or location. 2. Fetch observations for nearby locations - up to a distance of 50km. Each
     * end-point supports optional query parameters which allow you to filter the list of
     * observations returned.
     */
    override fun recent(): RecentService = recent

    override fun geo(): GeoService = geo

    override fun nearest(): NearestService = nearest

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ObservationService.WithRawResponse {

        private val recent: RecentService.WithRawResponse by lazy {
            RecentServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val geo: GeoService.WithRawResponse by lazy {
            GeoServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val nearest: NearestService.WithRawResponse by lazy {
            NearestServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ObservationService.WithRawResponse =
            ObservationServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        /**
         * The data/obs end-points are used to fetch observations submitted to eBird in checklists.
         * There are two categories of end-point: 1. Fetch observations for a specific country,
         * region or location. 2. Fetch observations for nearby locations - up to a distance of
         * 50km. Each end-point supports optional query parameters which allow you to filter the
         * list of observations returned.
         */
        override fun recent(): RecentService.WithRawResponse = recent

        override fun geo(): GeoService.WithRawResponse = geo

        override fun nearest(): NearestService.WithRawResponse = nearest
    }
}
