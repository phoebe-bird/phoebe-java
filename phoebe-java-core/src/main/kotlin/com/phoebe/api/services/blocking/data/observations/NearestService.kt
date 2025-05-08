// File generated from our OpenAPI spec by Stainless.

package com.phoebe.api.services.blocking.data.observations

import com.phoebe.api.services.blocking.data.observations.nearest.GeoSpecieService

interface NearestService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    fun geoSpecies(): GeoSpecieService

    /** A view of [NearestService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        fun geoSpecies(): GeoSpecieService.WithRawResponse
    }
}
