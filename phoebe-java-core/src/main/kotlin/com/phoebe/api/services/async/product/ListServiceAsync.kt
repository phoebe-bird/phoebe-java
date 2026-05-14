// File generated from our OpenAPI spec by Stainless.

package com.phoebe.api.services.async.product

import com.phoebe.api.core.ClientOptions
import com.phoebe.api.core.RequestOptions
import com.phoebe.api.core.http.HttpResponseFor
import com.phoebe.api.models.product.lists.ListRetrieveParams
import com.phoebe.api.models.product.lists.ListRetrieveResponse
import com.phoebe.api.services.async.product.lists.HistoricalServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/**
 * The data/obs end-points are used to fetch observations submitted to eBird in checklists. There
 * are two categories of end-point: 1. Fetch observations for a specific country, region or
 * location. 2. Fetch observations for nearby locations - up to a distance of 50km. Each end-point
 * supports optional query parameters which allow you to filter the list of observations returned.
 */
interface ListServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ListServiceAsync

    /**
     * The product end-points make it easy to get the information shown in various pages on the
     * eBird web site: 1. The Top 100 contributors on a given date. 2. The checklists submitted on a
     * given date. 3. The most recent checklists submitted. 4. A summary of the checklists submitted
     * on a given date. 5. The details and all the observations of a checklist.
     */
    fun historical(): HistoricalServiceAsync

    /** Get information on the most recently submitted checklists for a region. */
    fun retrieve(regionCode: String): CompletableFuture<List<ListRetrieveResponse>> =
        retrieve(regionCode, ListRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        regionCode: String,
        params: ListRetrieveParams = ListRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<ListRetrieveResponse>> =
        retrieve(params.toBuilder().regionCode(regionCode).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        regionCode: String,
        params: ListRetrieveParams = ListRetrieveParams.none(),
    ): CompletableFuture<List<ListRetrieveResponse>> =
        retrieve(regionCode, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: ListRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<ListRetrieveResponse>>

    /** @see retrieve */
    fun retrieve(params: ListRetrieveParams): CompletableFuture<List<ListRetrieveResponse>> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        regionCode: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<List<ListRetrieveResponse>> =
        retrieve(regionCode, ListRetrieveParams.none(), requestOptions)

    /** A view of [ListServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): ListServiceAsync.WithRawResponse

        /**
         * The product end-points make it easy to get the information shown in various pages on the
         * eBird web site: 1. The Top 100 contributors on a given date. 2. The checklists submitted
         * on a given date. 3. The most recent checklists submitted. 4. A summary of the checklists
         * submitted on a given date. 5. The details and all the observations of a checklist.
         */
        fun historical(): HistoricalServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /product/lists/{regionCode}`, but is otherwise the
         * same as [ListServiceAsync.retrieve].
         */
        fun retrieve(
            regionCode: String
        ): CompletableFuture<HttpResponseFor<List<ListRetrieveResponse>>> =
            retrieve(regionCode, ListRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            regionCode: String,
            params: ListRetrieveParams = ListRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<ListRetrieveResponse>>> =
            retrieve(params.toBuilder().regionCode(regionCode).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            regionCode: String,
            params: ListRetrieveParams = ListRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<List<ListRetrieveResponse>>> =
            retrieve(regionCode, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: ListRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<ListRetrieveResponse>>>

        /** @see retrieve */
        fun retrieve(
            params: ListRetrieveParams
        ): CompletableFuture<HttpResponseFor<List<ListRetrieveResponse>>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            regionCode: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<List<ListRetrieveResponse>>> =
            retrieve(regionCode, ListRetrieveParams.none(), requestOptions)
    }
}
