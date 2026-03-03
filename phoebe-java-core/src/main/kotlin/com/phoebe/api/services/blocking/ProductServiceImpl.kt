// File generated from our OpenAPI spec by Stainless.

package com.phoebe.api.services.blocking

import com.phoebe.api.core.ClientOptions
import com.phoebe.api.services.blocking.product.ChecklistService
import com.phoebe.api.services.blocking.product.ChecklistServiceImpl
import com.phoebe.api.services.blocking.product.ListService
import com.phoebe.api.services.blocking.product.ListServiceImpl
import com.phoebe.api.services.blocking.product.SpeciesListService
import com.phoebe.api.services.blocking.product.SpeciesListServiceImpl
import com.phoebe.api.services.blocking.product.StatService
import com.phoebe.api.services.blocking.product.StatServiceImpl
import com.phoebe.api.services.blocking.product.Top100Service
import com.phoebe.api.services.blocking.product.Top100ServiceImpl
import java.util.function.Consumer

class ProductServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    ProductService {

    private val withRawResponse: ProductService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val lists: ListService by lazy { ListServiceImpl(clientOptions) }

    private val top100: Top100Service by lazy { Top100ServiceImpl(clientOptions) }

    private val stats: StatService by lazy { StatServiceImpl(clientOptions) }

    private val speciesList: SpeciesListService by lazy { SpeciesListServiceImpl(clientOptions) }

    private val checklist: ChecklistService by lazy { ChecklistServiceImpl(clientOptions) }

    override fun withRawResponse(): ProductService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ProductService =
        ProductServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    /**
     * The data/obs end-points are used to fetch observations submitted to eBird in checklists.
     * There are two categories of end-point: 1. Fetch observations for a specific country, region
     * or location. 2. Fetch observations for nearby locations - up to a distance of 50km. Each
     * end-point supports optional query parameters which allow you to filter the list of
     * observations returned.
     */
    override fun lists(): ListService = lists

    /**
     * The product end-points make it easy to get the information shown in various pages on the
     * eBird web site: 1. The Top 100 contributors on a given date. 2. The checklists submitted on a
     * given date. 3. The most recent checklists submitted. 4. A summary of the checklists submitted
     * on a given date. 5. The details and all the observations of a checklist.
     */
    override fun top100(): Top100Service = top100

    /**
     * The product end-points make it easy to get the information shown in various pages on the
     * eBird web site: 1. The Top 100 contributors on a given date. 2. The checklists submitted on a
     * given date. 3. The most recent checklists submitted. 4. A summary of the checklists submitted
     * on a given date. 5. The details and all the observations of a checklist.
     */
    override fun stats(): StatService = stats

    /**
     * The product end-points make it easy to get the information shown in various pages on the
     * eBird web site: 1. The Top 100 contributors on a given date. 2. The checklists submitted on a
     * given date. 3. The most recent checklists submitted. 4. A summary of the checklists submitted
     * on a given date. 5. The details and all the observations of a checklist.
     */
    override fun speciesList(): SpeciesListService = speciesList

    /**
     * The product end-points make it easy to get the information shown in various pages on the
     * eBird web site: 1. The Top 100 contributors on a given date. 2. The checklists submitted on a
     * given date. 3. The most recent checklists submitted. 4. A summary of the checklists submitted
     * on a given date. 5. The details and all the observations of a checklist.
     */
    override fun checklist(): ChecklistService = checklist

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ProductService.WithRawResponse {

        private val lists: ListService.WithRawResponse by lazy {
            ListServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val top100: Top100Service.WithRawResponse by lazy {
            Top100ServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val stats: StatService.WithRawResponse by lazy {
            StatServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val speciesList: SpeciesListService.WithRawResponse by lazy {
            SpeciesListServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val checklist: ChecklistService.WithRawResponse by lazy {
            ChecklistServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ProductService.WithRawResponse =
            ProductServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        /**
         * The data/obs end-points are used to fetch observations submitted to eBird in checklists.
         * There are two categories of end-point: 1. Fetch observations for a specific country,
         * region or location. 2. Fetch observations for nearby locations - up to a distance of
         * 50km. Each end-point supports optional query parameters which allow you to filter the
         * list of observations returned.
         */
        override fun lists(): ListService.WithRawResponse = lists

        /**
         * The product end-points make it easy to get the information shown in various pages on the
         * eBird web site: 1. The Top 100 contributors on a given date. 2. The checklists submitted
         * on a given date. 3. The most recent checklists submitted. 4. A summary of the checklists
         * submitted on a given date. 5. The details and all the observations of a checklist.
         */
        override fun top100(): Top100Service.WithRawResponse = top100

        /**
         * The product end-points make it easy to get the information shown in various pages on the
         * eBird web site: 1. The Top 100 contributors on a given date. 2. The checklists submitted
         * on a given date. 3. The most recent checklists submitted. 4. A summary of the checklists
         * submitted on a given date. 5. The details and all the observations of a checklist.
         */
        override fun stats(): StatService.WithRawResponse = stats

        /**
         * The product end-points make it easy to get the information shown in various pages on the
         * eBird web site: 1. The Top 100 contributors on a given date. 2. The checklists submitted
         * on a given date. 3. The most recent checklists submitted. 4. A summary of the checklists
         * submitted on a given date. 5. The details and all the observations of a checklist.
         */
        override fun speciesList(): SpeciesListService.WithRawResponse = speciesList

        /**
         * The product end-points make it easy to get the information shown in various pages on the
         * eBird web site: 1. The Top 100 contributors on a given date. 2. The checklists submitted
         * on a given date. 3. The most recent checklists submitted. 4. A summary of the checklists
         * submitted on a given date. 5. The details and all the observations of a checklist.
         */
        override fun checklist(): ChecklistService.WithRawResponse = checklist
    }
}
