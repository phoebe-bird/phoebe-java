// File generated from our OpenAPI spec by Stainless.

package com.phoebe.api.services.blocking.data

import com.phoebe.api.services.blocking.data.observations.GeoService
import com.phoebe.api.services.blocking.data.observations.NearestService
import com.phoebe.api.services.blocking.data.observations.RecentService

interface ObservationService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    fun recent(): RecentService

    fun geo(): GeoService

    fun nearest(): NearestService

    /**
     * A view of [ObservationService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        fun recent(): RecentService.WithRawResponse

        fun geo(): GeoService.WithRawResponse

        fun nearest(): NearestService.WithRawResponse
    }
}
