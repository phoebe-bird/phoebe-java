// File generated from our OpenAPI spec by Stainless.

package com.phoebe.api.services.blocking.data.observations

import com.phoebe.api.core.ClientOptions
import com.phoebe.api.services.blocking.data.observations.geo.RecentService
import com.phoebe.api.services.blocking.data.observations.geo.RecentServiceImpl
import java.util.function.Consumer

class GeoServiceImpl internal constructor(private val clientOptions: ClientOptions) : GeoService {

    private val withRawResponse: GeoService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val recent: RecentService by lazy { RecentServiceImpl(clientOptions) }

    override fun withRawResponse(): GeoService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): GeoService =
        GeoServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    /**
     * The data/obs end-points are used to fetch observations submitted to eBird in checklists.
     * There are two categories of end-point: 1. Fetch observations for a specific country, region
     * or location. 2. Fetch observations for nearby locations - up to a distance of 50km. Each
     * end-point supports optional query parameters which allow you to filter the list of
     * observations returned.
     */
    override fun recent(): RecentService = recent

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        GeoService.WithRawResponse {

        private val recent: RecentService.WithRawResponse by lazy {
            RecentServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): GeoService.WithRawResponse =
            GeoServiceImpl.WithRawResponseImpl(
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
    }
}
