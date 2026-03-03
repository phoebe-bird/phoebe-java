// File generated from our OpenAPI spec by Stainless.

package com.phoebe.api.services.blocking.data.observations

import com.phoebe.api.core.ClientOptions
import com.phoebe.api.services.blocking.data.observations.nearest.GeoSpecieService
import com.phoebe.api.services.blocking.data.observations.nearest.GeoSpecieServiceImpl
import java.util.function.Consumer

class NearestServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    NearestService {

    private val withRawResponse: NearestService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val geoSpecies: GeoSpecieService by lazy { GeoSpecieServiceImpl(clientOptions) }

    override fun withRawResponse(): NearestService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): NearestService =
        NearestServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    /**
     * The data/obs end-points are used to fetch observations submitted to eBird in checklists.
     * There are two categories of end-point: 1. Fetch observations for a specific country, region
     * or location. 2. Fetch observations for nearby locations - up to a distance of 50km. Each
     * end-point supports optional query parameters which allow you to filter the list of
     * observations returned.
     */
    override fun geoSpecies(): GeoSpecieService = geoSpecies

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        NearestService.WithRawResponse {

        private val geoSpecies: GeoSpecieService.WithRawResponse by lazy {
            GeoSpecieServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): NearestService.WithRawResponse =
            NearestServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        /**
         * The data/obs end-points are used to fetch observations submitted to eBird in checklists.
         * There are two categories of end-point: 1. Fetch observations for a specific country,
         * region or location. 2. Fetch observations for nearby locations - up to a distance of
         * 50km. Each end-point supports optional query parameters which allow you to filter the
         * list of observations returned.
         */
        override fun geoSpecies(): GeoSpecieService.WithRawResponse = geoSpecies
    }
}
