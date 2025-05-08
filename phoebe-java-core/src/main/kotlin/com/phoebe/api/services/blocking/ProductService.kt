// File generated from our OpenAPI spec by Stainless.

package com.phoebe.api.services.blocking

import com.phoebe.api.services.blocking.product.ChecklistService
import com.phoebe.api.services.blocking.product.ListService
import com.phoebe.api.services.blocking.product.SpeciesListService
import com.phoebe.api.services.blocking.product.StatService
import com.phoebe.api.services.blocking.product.Top100Service

interface ProductService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    fun lists(): ListService

    fun top100(): Top100Service

    fun stats(): StatService

    fun speciesList(): SpeciesListService

    fun checklist(): ChecklistService

    /** A view of [ProductService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        fun lists(): ListService.WithRawResponse

        fun top100(): Top100Service.WithRawResponse

        fun stats(): StatService.WithRawResponse

        fun speciesList(): SpeciesListService.WithRawResponse

        fun checklist(): ChecklistService.WithRawResponse
    }
}
