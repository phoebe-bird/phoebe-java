// File generated from our OpenAPI spec by Stainless.

package com.phoebe.api.services.async

import com.phoebe.api.services.async.ref.HotspotServiceAsync
import com.phoebe.api.services.async.ref.RegionServiceAsync
import com.phoebe.api.services.async.ref.TaxonomyServiceAsync

interface RefServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    fun region(): RegionServiceAsync

    fun hotspot(): HotspotServiceAsync

    fun taxonomy(): TaxonomyServiceAsync

    /** A view of [RefServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        fun region(): RegionServiceAsync.WithRawResponse

        fun hotspot(): HotspotServiceAsync.WithRawResponse

        fun taxonomy(): TaxonomyServiceAsync.WithRawResponse
    }
}
