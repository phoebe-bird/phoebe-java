// File generated from our OpenAPI spec by Stainless.

package com.phoebe.api.services.blocking

import com.phoebe.api.core.ClientOptions
import com.phoebe.api.services.blocking.data.ObservationService
import java.util.function.Consumer

interface DataService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): DataService

    fun observations(): ObservationService

    /** A view of [DataService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): DataService.WithRawResponse

        fun observations(): ObservationService.WithRawResponse
    }
}
