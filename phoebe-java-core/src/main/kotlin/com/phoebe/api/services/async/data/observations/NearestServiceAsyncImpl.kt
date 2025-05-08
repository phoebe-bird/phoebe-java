// File generated from our OpenAPI spec by Stainless.

package com.phoebe.api.services.async.data.observations

import com.phoebe.api.core.ClientOptions
import com.phoebe.api.services.async.data.observations.nearest.GeoSpecieServiceAsync
import com.phoebe.api.services.async.data.observations.nearest.GeoSpecieServiceAsyncImpl

class NearestServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    NearestServiceAsync {

    private val withRawResponse: NearestServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val geoSpecies: GeoSpecieServiceAsync by lazy {
        GeoSpecieServiceAsyncImpl(clientOptions)
    }

    override fun withRawResponse(): NearestServiceAsync.WithRawResponse = withRawResponse

    override fun geoSpecies(): GeoSpecieServiceAsync = geoSpecies

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        NearestServiceAsync.WithRawResponse {

        private val geoSpecies: GeoSpecieServiceAsync.WithRawResponse by lazy {
            GeoSpecieServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun geoSpecies(): GeoSpecieServiceAsync.WithRawResponse = geoSpecies
    }
}
