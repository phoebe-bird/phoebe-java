// File generated from our OpenAPI spec by Stainless.

package com.phoebe.api.services.async.data

import com.phoebe.api.services.async.data.observations.GeoServiceAsync
import com.phoebe.api.services.async.data.observations.NearestServiceAsync
import com.phoebe.api.services.async.data.observations.RecentServiceAsync

interface ObservationServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    fun recent(): RecentServiceAsync

    fun geo(): GeoServiceAsync

    fun nearest(): NearestServiceAsync

    /**
     * A view of [ObservationServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        fun recent(): RecentServiceAsync.WithRawResponse

        fun geo(): GeoServiceAsync.WithRawResponse

        fun nearest(): NearestServiceAsync.WithRawResponse
    }
}
