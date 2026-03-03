// File generated from our OpenAPI spec by Stainless.

package com.phoebe.api.services.async

import com.phoebe.api.core.ClientOptions
import com.phoebe.api.services.async.product.ChecklistServiceAsync
import com.phoebe.api.services.async.product.ListServiceAsync
import com.phoebe.api.services.async.product.SpeciesListServiceAsync
import com.phoebe.api.services.async.product.StatServiceAsync
import com.phoebe.api.services.async.product.Top100ServiceAsync
import java.util.function.Consumer

interface ProductServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ProductServiceAsync

    /**
     * The data/obs end-points are used to fetch observations submitted to eBird in checklists.
     * There are two categories of end-point: 1. Fetch observations for a specific country, region
     * or location. 2. Fetch observations for nearby locations - up to a distance of 50km. Each
     * end-point supports optional query parameters which allow you to filter the list of
     * observations returned.
     */
    fun lists(): ListServiceAsync

    /**
     * The product end-points make it easy to get the information shown in various pages on the
     * eBird web site: 1. The Top 100 contributors on a given date. 2. The checklists submitted on a
     * given date. 3. The most recent checklists submitted. 4. A summary of the checklists submitted
     * on a given date. 5. The details and all the observations of a checklist.
     */
    fun top100(): Top100ServiceAsync

    /**
     * The product end-points make it easy to get the information shown in various pages on the
     * eBird web site: 1. The Top 100 contributors on a given date. 2. The checklists submitted on a
     * given date. 3. The most recent checklists submitted. 4. A summary of the checklists submitted
     * on a given date. 5. The details and all the observations of a checklist.
     */
    fun stats(): StatServiceAsync

    /**
     * The product end-points make it easy to get the information shown in various pages on the
     * eBird web site: 1. The Top 100 contributors on a given date. 2. The checklists submitted on a
     * given date. 3. The most recent checklists submitted. 4. A summary of the checklists submitted
     * on a given date. 5. The details and all the observations of a checklist.
     */
    fun speciesList(): SpeciesListServiceAsync

    /**
     * The product end-points make it easy to get the information shown in various pages on the
     * eBird web site: 1. The Top 100 contributors on a given date. 2. The checklists submitted on a
     * given date. 3. The most recent checklists submitted. 4. A summary of the checklists submitted
     * on a given date. 5. The details and all the observations of a checklist.
     */
    fun checklist(): ChecklistServiceAsync

    /**
     * A view of [ProductServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ProductServiceAsync.WithRawResponse

        /**
         * The data/obs end-points are used to fetch observations submitted to eBird in checklists.
         * There are two categories of end-point: 1. Fetch observations for a specific country,
         * region or location. 2. Fetch observations for nearby locations - up to a distance of
         * 50km. Each end-point supports optional query parameters which allow you to filter the
         * list of observations returned.
         */
        fun lists(): ListServiceAsync.WithRawResponse

        /**
         * The product end-points make it easy to get the information shown in various pages on the
         * eBird web site: 1. The Top 100 contributors on a given date. 2. The checklists submitted
         * on a given date. 3. The most recent checklists submitted. 4. A summary of the checklists
         * submitted on a given date. 5. The details and all the observations of a checklist.
         */
        fun top100(): Top100ServiceAsync.WithRawResponse

        /**
         * The product end-points make it easy to get the information shown in various pages on the
         * eBird web site: 1. The Top 100 contributors on a given date. 2. The checklists submitted
         * on a given date. 3. The most recent checklists submitted. 4. A summary of the checklists
         * submitted on a given date. 5. The details and all the observations of a checklist.
         */
        fun stats(): StatServiceAsync.WithRawResponse

        /**
         * The product end-points make it easy to get the information shown in various pages on the
         * eBird web site: 1. The Top 100 contributors on a given date. 2. The checklists submitted
         * on a given date. 3. The most recent checklists submitted. 4. A summary of the checklists
         * submitted on a given date. 5. The details and all the observations of a checklist.
         */
        fun speciesList(): SpeciesListServiceAsync.WithRawResponse

        /**
         * The product end-points make it easy to get the information shown in various pages on the
         * eBird web site: 1. The Top 100 contributors on a given date. 2. The checklists submitted
         * on a given date. 3. The most recent checklists submitted. 4. A summary of the checklists
         * submitted on a given date. 5. The details and all the observations of a checklist.
         */
        fun checklist(): ChecklistServiceAsync.WithRawResponse
    }
}
