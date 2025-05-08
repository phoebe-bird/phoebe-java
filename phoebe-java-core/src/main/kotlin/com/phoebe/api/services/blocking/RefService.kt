// File generated from our OpenAPI spec by Stainless.

package com.phoebe.api.services.blocking

import com.phoebe.api.services.blocking.ref.HotspotService
import com.phoebe.api.services.blocking.ref.RegionService
import com.phoebe.api.services.blocking.ref.TaxonomyService

interface RefService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    fun region(): RegionService

    fun hotspot(): HotspotService

    fun taxonomy(): TaxonomyService

    /** A view of [RefService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        fun region(): RegionService.WithRawResponse

        fun hotspot(): HotspotService.WithRawResponse

        fun taxonomy(): TaxonomyService.WithRawResponse
    }
}
