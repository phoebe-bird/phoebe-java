// File generated from our OpenAPI spec by Stainless.

package com.phoebe.api.services.blocking

import com.phoebe.api.services.blocking.data.ObservationService

interface DataService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    fun observations(): ObservationService

    /** A view of [DataService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        fun observations(): ObservationService.WithRawResponse
    }
}
