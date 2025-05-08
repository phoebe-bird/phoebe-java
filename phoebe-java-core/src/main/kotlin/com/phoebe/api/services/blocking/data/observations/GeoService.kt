// File generated from our OpenAPI spec by Stainless.

package com.phoebe.api.services.blocking.data.observations

import com.phoebe.api.services.blocking.data.observations.geo.RecentService

interface GeoService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    fun recent(): RecentService

    /** A view of [GeoService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        fun recent(): RecentService.WithRawResponse
    }
}
