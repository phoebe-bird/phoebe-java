// File generated from our OpenAPI spec by Stainless.

package com.phoebe.api.services.blocking

import com.phoebe.api.core.ClientOptions
import com.phoebe.api.services.blocking.ref.HotspotService
import com.phoebe.api.services.blocking.ref.RegionService
import com.phoebe.api.services.blocking.ref.TaxonomyService
import java.util.function.Consumer

interface RefService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): RefService

    fun region(): RegionService

    /**
     * With the ref/hotspot end-points you can find the hotspots for a given country or region or
     * nearby hotspots
     */
    fun hotspot(): HotspotService

    fun taxonomy(): TaxonomyService

    /** A view of [RefService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): RefService.WithRawResponse

        fun region(): RegionService.WithRawResponse

        /**
         * With the ref/hotspot end-points you can find the hotspots for a given country or region
         * or nearby hotspots
         */
        fun hotspot(): HotspotService.WithRawResponse

        fun taxonomy(): TaxonomyService.WithRawResponse
    }
}
