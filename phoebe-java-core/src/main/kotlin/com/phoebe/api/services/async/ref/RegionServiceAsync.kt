// File generated from our OpenAPI spec by Stainless.

package com.phoebe.api.services.async.ref

import com.phoebe.api.services.async.ref.region.AdjacentServiceAsync
import com.phoebe.api.services.async.ref.region.InfoServiceAsync
import com.phoebe.api.services.async.ref.region.ListServiceAsync

interface RegionServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    fun adjacent(): AdjacentServiceAsync

    fun info(): InfoServiceAsync

    fun list(): ListServiceAsync

    /**
     * A view of [RegionServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        fun adjacent(): AdjacentServiceAsync.WithRawResponse

        fun info(): InfoServiceAsync.WithRawResponse

        fun list(): ListServiceAsync.WithRawResponse
    }
}
