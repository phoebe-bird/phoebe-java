// File generated from our OpenAPI spec by Stainless.

package com.phoebe.api.services.async.data.observations

import com.phoebe.api.services.async.data.observations.geo.RecentServiceAsync

interface GeoServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    fun recent(): RecentServiceAsync

    /** A view of [GeoServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        fun recent(): RecentServiceAsync.WithRawResponse
    }
}
