// File generated from our OpenAPI spec by Stainless.

package com.phoebe.api.services.blocking.ref

import com.phoebe.api.services.blocking.ref.region.AdjacentService
import com.phoebe.api.services.blocking.ref.region.InfoService
import com.phoebe.api.services.blocking.ref.region.ListService

interface RegionService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    fun adjacent(): AdjacentService

    fun info(): InfoService

    fun list(): ListService

    /** A view of [RegionService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        fun adjacent(): AdjacentService.WithRawResponse

        fun info(): InfoService.WithRawResponse

        fun list(): ListService.WithRawResponse
    }
}
