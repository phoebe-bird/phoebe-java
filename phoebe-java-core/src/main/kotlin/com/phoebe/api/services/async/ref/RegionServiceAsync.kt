// File generated from our OpenAPI spec by Stainless.

package com.phoebe.api.services.async.ref

import com.phoebe.api.core.ClientOptions
import com.phoebe.api.services.async.ref.region.AdjacentServiceAsync
import com.phoebe.api.services.async.ref.region.InfoServiceAsync
import com.phoebe.api.services.async.ref.region.ListServiceAsync
import java.util.function.Consumer

interface RegionServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): RegionServiceAsync

    fun adjacent(): AdjacentServiceAsync

    fun info(): InfoServiceAsync

    fun list(): ListServiceAsync

    /**
     * A view of [RegionServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): RegionServiceAsync.WithRawResponse

        fun adjacent(): AdjacentServiceAsync.WithRawResponse

        fun info(): InfoServiceAsync.WithRawResponse

        fun list(): ListServiceAsync.WithRawResponse
    }
}
