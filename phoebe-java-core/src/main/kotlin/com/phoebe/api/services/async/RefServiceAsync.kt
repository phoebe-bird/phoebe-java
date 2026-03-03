// File generated from our OpenAPI spec by Stainless.

package com.phoebe.api.services.async

import com.phoebe.api.core.ClientOptions
import com.phoebe.api.services.async.ref.HotspotServiceAsync
import com.phoebe.api.services.async.ref.RegionServiceAsync
import com.phoebe.api.services.async.ref.TaxonomyServiceAsync
import java.util.function.Consumer

interface RefServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): RefServiceAsync

    fun region(): RegionServiceAsync

    /**
     * With the ref/hotspot end-points you can find the hotspots for a given country or region or
     * nearby hotspots
     */
    fun hotspot(): HotspotServiceAsync

    fun taxonomy(): TaxonomyServiceAsync

    /** A view of [RefServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): RefServiceAsync.WithRawResponse

        fun region(): RegionServiceAsync.WithRawResponse

        /**
         * With the ref/hotspot end-points you can find the hotspots for a given country or region
         * or nearby hotspots
         */
        fun hotspot(): HotspotServiceAsync.WithRawResponse

        fun taxonomy(): TaxonomyServiceAsync.WithRawResponse
    }
}
