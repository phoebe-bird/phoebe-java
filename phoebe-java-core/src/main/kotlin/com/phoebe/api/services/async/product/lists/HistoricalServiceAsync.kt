// File generated from our OpenAPI spec by Stainless.

package com.phoebe.api.services.async.product.lists

import com.phoebe.api.core.ClientOptions
import com.phoebe.api.core.RequestOptions
import com.phoebe.api.core.http.HttpResponseFor
import com.phoebe.api.models.product.lists.historical.HistoricalRetrieveParams
import com.phoebe.api.models.product.lists.historical.HistoricalRetrieveResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface HistoricalServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): HistoricalServiceAsync

    /** Get information on the checklists submitted on a given date for a country or region. */
    fun retrieve(
        d: Long,
        params: HistoricalRetrieveParams,
    ): CompletableFuture<List<HistoricalRetrieveResponse>> =
        retrieve(d, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        d: Long,
        params: HistoricalRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<HistoricalRetrieveResponse>> =
        retrieve(params.toBuilder().d(d).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        params: HistoricalRetrieveParams
    ): CompletableFuture<List<HistoricalRetrieveResponse>> = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: HistoricalRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<HistoricalRetrieveResponse>>

    /**
     * A view of [HistoricalServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): HistoricalServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /product/lists/{regionCode}/{y}/{m}/{d}`, but is
         * otherwise the same as [HistoricalServiceAsync.retrieve].
         */
        fun retrieve(
            d: Long,
            params: HistoricalRetrieveParams,
        ): CompletableFuture<HttpResponseFor<List<HistoricalRetrieveResponse>>> =
            retrieve(d, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            d: Long,
            params: HistoricalRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<HistoricalRetrieveResponse>>> =
            retrieve(params.toBuilder().d(d).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            params: HistoricalRetrieveParams
        ): CompletableFuture<HttpResponseFor<List<HistoricalRetrieveResponse>>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: HistoricalRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<HistoricalRetrieveResponse>>>
    }
}
