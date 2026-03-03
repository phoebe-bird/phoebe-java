// File generated from our OpenAPI spec by Stainless.

package com.phoebe.api.services.blocking.ref

import com.phoebe.api.core.ClientOptions
import com.phoebe.api.services.blocking.ref.region.AdjacentService
import com.phoebe.api.services.blocking.ref.region.InfoService
import com.phoebe.api.services.blocking.ref.region.ListService
import java.util.function.Consumer

interface RegionService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): RegionService

    /** With the ref/geo end-point you can find a country's or region's neighbours. */
    fun adjacent(): AdjacentService

    /** The ref/region end-points return information on regions. */
    fun info(): InfoService

    /** The ref/region end-points return information on regions. */
    fun list(): ListService

    /** A view of [RegionService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): RegionService.WithRawResponse

        /** With the ref/geo end-point you can find a country's or region's neighbours. */
        fun adjacent(): AdjacentService.WithRawResponse

        /** The ref/region end-points return information on regions. */
        fun info(): InfoService.WithRawResponse

        /** The ref/region end-points return information on regions. */
        fun list(): ListService.WithRawResponse
    }
}
