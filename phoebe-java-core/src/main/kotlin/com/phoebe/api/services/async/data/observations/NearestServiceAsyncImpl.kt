// File generated from our OpenAPI spec by Stainless.

package com.phoebe.api.services.async.data.observations

import com.phoebe.api.core.ClientOptions
import com.phoebe.api.services.async.data.observations.nearest.GeoSpecieServiceAsync
import com.phoebe.api.services.async.data.observations.nearest.GeoSpecieServiceAsyncImpl
import java.util.function.Consumer

class NearestServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    NearestServiceAsync {

    private val withRawResponse: NearestServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val geoSpecies: GeoSpecieServiceAsync by lazy {
        GeoSpecieServiceAsyncImpl(clientOptions)
    }

    override fun withRawResponse(): NearestServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): NearestServiceAsync =
        NearestServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    /**
     * The data/obs end-points are used to fetch observations submitted to eBird in checklists.
     * There are two categories of end-point: 1. Fetch observations for a specific country, region
     * or location. 2. Fetch observations for nearby locations - up to a distance of 50km. Each
     * end-point supports optional query parameters which allow you to filter the list of
     * observations returned.
     */
    override fun geoSpecies(): GeoSpecieServiceAsync = geoSpecies

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        NearestServiceAsync.WithRawResponse {

        private val geoSpecies: GeoSpecieServiceAsync.WithRawResponse by lazy {
            GeoSpecieServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): NearestServiceAsync.WithRawResponse =
            NearestServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        /**
         * The data/obs end-points are used to fetch observations submitted to eBird in checklists.
         * There are two categories of end-point: 1. Fetch observations for a specific country,
         * region or location. 2. Fetch observations for nearby locations - up to a distance of
         * 50km. Each end-point supports optional query parameters which allow you to filter the
         * list of observations returned.
         */
        override fun geoSpecies(): GeoSpecieServiceAsync.WithRawResponse = geoSpecies
    }
}
