// File generated from our OpenAPI spec by Stainless.

package com.phoebe.api.services.blocking.data

import com.phoebe.api.core.ClientOptions
import com.phoebe.api.services.blocking.data.observations.GeoService
import com.phoebe.api.services.blocking.data.observations.NearestService
import com.phoebe.api.services.blocking.data.observations.RecentService
import java.util.function.Consumer

interface ObservationService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ObservationService

    /**
     * The data/obs end-points are used to fetch observations submitted to eBird in checklists.
     * There are two categories of end-point: 1. Fetch observations for a specific country, region
     * or location. 2. Fetch observations for nearby locations - up to a distance of 50km. Each
     * end-point supports optional query parameters which allow you to filter the list of
     * observations returned.
     */
    fun recent(): RecentService

    fun geo(): GeoService

    fun nearest(): NearestService

    /**
     * A view of [ObservationService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ObservationService.WithRawResponse

        /**
         * The data/obs end-points are used to fetch observations submitted to eBird in checklists.
         * There are two categories of end-point: 1. Fetch observations for a specific country,
         * region or location. 2. Fetch observations for nearby locations - up to a distance of
         * 50km. Each end-point supports optional query parameters which allow you to filter the
         * list of observations returned.
         */
        fun recent(): RecentService.WithRawResponse

        fun geo(): GeoService.WithRawResponse

        fun nearest(): NearestService.WithRawResponse
    }
}
