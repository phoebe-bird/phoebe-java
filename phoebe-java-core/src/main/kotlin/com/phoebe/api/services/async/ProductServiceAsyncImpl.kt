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

    override fun lists(): ListServiceAsync = lists

    override fun top100(): Top100ServiceAsync = top100

    override fun stats(): StatServiceAsync = stats

    override fun speciesList(): SpeciesListServiceAsync = speciesList

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

        override fun lists(): ListServiceAsync.WithRawResponse = lists

        override fun top100(): Top100ServiceAsync.WithRawResponse = top100

        override fun stats(): StatServiceAsync.WithRawResponse = stats

        override fun speciesList(): SpeciesListServiceAsync.WithRawResponse = speciesList

        override fun checklist(): ChecklistServiceAsync.WithRawResponse = checklist
    }
}
