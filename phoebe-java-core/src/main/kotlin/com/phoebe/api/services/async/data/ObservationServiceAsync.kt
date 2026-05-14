// File generated from our OpenAPI spec by Stainless.

package com.phoebe.api.services.async.data

import com.phoebe.api.core.ClientOptions
import com.phoebe.api.services.async.data.observations.GeoServiceAsync
import com.phoebe.api.services.async.data.observations.NearestServiceAsync
import com.phoebe.api.services.async.data.observations.RecentServiceAsync
import java.util.function.Consumer

interface ObservationServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ObservationServiceAsync

    /**
     * The data/obs end-points are used to fetch observations submitted to eBird in checklists.
     * There are two categories of end-point: 1. Fetch observations for a specific country, region
     * or location. 2. Fetch observations for nearby locations - up to a distance of 50km. Each
     * end-point supports optional query parameters which allow you to filter the list of
     * observations returned.
     */
    fun recent(): RecentServiceAsync

    fun geo(): GeoServiceAsync

    fun nearest(): NearestServiceAsync

    /**
     * A view of [ObservationServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ObservationServiceAsync.WithRawResponse

        /**
         * The data/obs end-points are used to fetch observations submitted to eBird in checklists.
         * There are two categories of end-point: 1. Fetch observations for a specific country,
         * region or location. 2. Fetch observations for nearby locations - up to a distance of
         * 50km. Each end-point supports optional query parameters which allow you to filter the
         * list of observations returned.
         */
        fun recent(): RecentServiceAsync.WithRawResponse

        fun geo(): GeoServiceAsync.WithRawResponse

        fun nearest(): NearestServiceAsync.WithRawResponse
    }
}
