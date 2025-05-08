// File generated from our OpenAPI spec by Stainless.

package com.phoebe.api.services.async

import com.phoebe.api.services.async.product.ChecklistServiceAsync
import com.phoebe.api.services.async.product.ListServiceAsync
import com.phoebe.api.services.async.product.SpeciesListServiceAsync
import com.phoebe.api.services.async.product.StatServiceAsync
import com.phoebe.api.services.async.product.Top100ServiceAsync

interface ProductServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    fun lists(): ListServiceAsync

    fun top100(): Top100ServiceAsync

    fun stats(): StatServiceAsync

    fun speciesList(): SpeciesListServiceAsync

    fun checklist(): ChecklistServiceAsync

    /**
     * A view of [ProductServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        fun lists(): ListServiceAsync.WithRawResponse

        fun top100(): Top100ServiceAsync.WithRawResponse

        fun stats(): StatServiceAsync.WithRawResponse

        fun speciesList(): SpeciesListServiceAsync.WithRawResponse

        fun checklist(): ChecklistServiceAsync.WithRawResponse
    }
}
