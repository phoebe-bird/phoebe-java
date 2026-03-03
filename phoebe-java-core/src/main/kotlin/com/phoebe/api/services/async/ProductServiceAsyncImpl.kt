// File generated from our OpenAPI spec by Stainless.

package com.phoebe.api.services.async

import com.phoebe.api.core.ClientOptions
import com.phoebe.api.services.async.product.ChecklistServiceAsync
import com.phoebe.api.services.async.product.ChecklistServiceAsyncImpl
import com.phoebe.api.services.async.product.ListServiceAsync
import com.phoebe.api.services.async.product.ListServiceAsyncImpl
import com.phoebe.api.services.async.product.SpeciesListServiceAsync
import com.phoebe.api.services.async.product.SpeciesListServiceAsyncImpl
import com.phoebe.api.services.async.product.StatServiceAsync
import com.phoebe.api.services.async.product.StatServiceAsyncImpl
import com.phoebe.api.services.async.product.Top100ServiceAsync
import com.phoebe.api.services.async.product.Top100ServiceAsyncImpl
import java.util.function.Consumer

class ProductServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    ProductServiceAsync {

    private val withRawResponse: ProductServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val lists: ListServiceAsync by lazy { ListServiceAsyncImpl(clientOptions) }

    private val top100: Top100ServiceAsync by lazy { Top100ServiceAsyncImpl(clientOptions) }

    private val stats: StatServiceAsync by lazy { StatServiceAsyncImpl(clientOptions) }

    private val speciesList: SpeciesListServiceAsync by lazy {
        SpeciesListServiceAsyncImpl(clientOptions)
    }

    private val checklist: ChecklistServiceAsync by lazy {
        ChecklistServiceAsyncImpl(clientOptions)
    }

    override fun withRawResponse(): ProductServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ProductServiceAsync =
        ProductServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    /**
     * The data/obs end-points are used to fetch observations submitted to eBird in checklists.
     * There are two categories of end-point: 1. Fetch observations for a specific country, region
     * or location. 2. Fetch observations for nearby locations - up to a distance of 50km. Each
     * end-point supports optional query parameters which allow you to filter the list of
     * observations returned.
     */
    override fun lists(): ListServiceAsync = lists

    /**
     * The product end-points make it easy to get the information shown in various pages on the
     * eBird web site: 1. The Top 100 contributors on a given date. 2. The checklists submitted on a
     * given date. 3. The most recent checklists submitted. 4. A summary of the checklists submitted
     * on a given date. 5. The details and all the observations of a checklist.
     */
    override fun top100(): Top100ServiceAsync = top100

    /**
     * The product end-points make it easy to get the information shown in various pages on the
     * eBird web site: 1. The Top 100 contributors on a given date. 2. The checklists submitted on a
     * given date. 3. The most recent checklists submitted. 4. A summary of the checklists submitted
     * on a given date. 5. The details and all the observations of a checklist.
     */
    override fun stats(): StatServiceAsync = stats

    /**
     * The product end-points make it easy to get the information shown in various pages on the
     * eBird web site: 1. The Top 100 contributors on a given date. 2. The checklists submitted on a
     * given date. 3. The most recent checklists submitted. 4. A summary of the checklists submitted
     * on a given date. 5. The details and all the observations of a checklist.
     */
    override fun speciesList(): SpeciesListServiceAsync = speciesList

    /**
     * The product end-points make it easy to get the information shown in various pages on the
     * eBird web site: 1. The Top 100 contributors on a given date. 2. The checklists submitted on a
     * given date. 3. The most recent checklists submitted. 4. A summary of the checklists submitted
     * on a given date. 5. The details and all the observations of a checklist.
     */
    override fun checklist(): ChecklistServiceAsync = checklist

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ProductServiceAsync.WithRawResponse {

        private val lists: ListServiceAsync.WithRawResponse by lazy {
            ListServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val top100: Top100ServiceAsync.WithRawResponse by lazy {
            Top100ServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val stats: StatServiceAsync.WithRawResponse by lazy {
            StatServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val speciesList: SpeciesListServiceAsync.WithRawResponse by lazy {
            SpeciesListServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val checklist: ChecklistServiceAsync.WithRawResponse by lazy {
            ChecklistServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ProductServiceAsync.WithRawResponse =
            ProductServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        /**
         * The data/obs end-points are used to fetch observations submitted to eBird in checklists.
         * There are two categories of end-point: 1. Fetch observations for a specific country,
         * region or location. 2. Fetch observations for nearby locations - up to a distance of
         * 50km. Each end-point supports optional query parameters which allow you to filter the
         * list of observations returned.
         */
        override fun lists(): ListServiceAsync.WithRawResponse = lists

        /**
         * The product end-points make it easy to get the information shown in various pages on the
         * eBird web site: 1. The Top 100 contributors on a given date. 2. The checklists submitted
         * on a given date. 3. The most recent checklists submitted. 4. A summary of the checklists
         * submitted on a given date. 5. The details and all the observations of a checklist.
         */
        override fun top100(): Top100ServiceAsync.WithRawResponse = top100

        /**
         * The product end-points make it easy to get the information shown in various pages on the
         * eBird web site: 1. The Top 100 contributors on a given date. 2. The checklists submitted
         * on a given date. 3. The most recent checklists submitted. 4. A summary of the checklists
         * submitted on a given date. 5. The details and all the observations of a checklist.
         */
        override fun stats(): StatServiceAsync.WithRawResponse = stats

        /**
         * The product end-points make it easy to get the information shown in various pages on the
         * eBird web site: 1. The Top 100 contributors on a given date. 2. The checklists submitted
         * on a given date. 3. The most recent checklists submitted. 4. A summary of the checklists
         * submitted on a given date. 5. The details and all the observations of a checklist.
         */
        override fun speciesList(): SpeciesListServiceAsync.WithRawResponse = speciesList

        /**
         * The product end-points make it easy to get the information shown in various pages on the
         * eBird web site: 1. The Top 100 contributors on a given date. 2. The checklists submitted
         * on a given date. 3. The most recent checklists submitted. 4. A summary of the checklists
         * submitted on a given date. 5. The details and all the observations of a checklist.
         */
        override fun checklist(): ChecklistServiceAsync.WithRawResponse = checklist
    }
}
