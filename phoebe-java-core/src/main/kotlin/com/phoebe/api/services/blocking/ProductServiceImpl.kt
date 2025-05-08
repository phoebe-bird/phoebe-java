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

    override fun lists(): ListService = lists

    override fun top100(): Top100Service = top100

    override fun stats(): StatService = stats

    override fun speciesList(): SpeciesListService = speciesList

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

        override fun lists(): ListService.WithRawResponse = lists

        override fun top100(): Top100Service.WithRawResponse = top100

        override fun stats(): StatService.WithRawResponse = stats

        override fun speciesList(): SpeciesListService.WithRawResponse = speciesList

        override fun checklist(): ChecklistService.WithRawResponse = checklist
    }
}
