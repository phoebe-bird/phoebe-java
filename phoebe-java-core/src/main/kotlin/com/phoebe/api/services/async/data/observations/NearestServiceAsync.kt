// File generated from our OpenAPI spec by Stainless.

package com.phoebe.api.services.async.data.observations

import com.phoebe.api.services.async.data.observations.nearest.GeoSpecieServiceAsync

interface NearestServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    fun geoSpecies(): GeoSpecieServiceAsync

    /**
     * A view of [NearestServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        fun geoSpecies(): GeoSpecieServiceAsync.WithRawResponse
    }
}
