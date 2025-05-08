// File generated from our OpenAPI spec by Stainless.

package com.phoebe.api.services.async.product

import com.google.errorprone.annotations.MustBeClosed
import com.phoebe.api.core.RequestOptions
import com.phoebe.api.core.http.HttpResponseFor
import com.phoebe.api.models.product.lists.ListRetrieveParams
import com.phoebe.api.models.product.lists.ListRetrieveResponse
import com.phoebe.api.services.async.product.lists.HistoricalServiceAsync
import java.util.concurrent.CompletableFuture

interface ListServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    fun historical(): HistoricalServiceAsync

    /** Get information on the most recently submitted checklists for a region. */
    fun retrieve(params: ListRetrieveParams): CompletableFuture<List<ListRetrieveResponse>> =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: ListRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<ListRetrieveResponse>>

    /** A view of [ListServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        fun historical(): HistoricalServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /product/lists/{regionCode}`, but is otherwise the
         * same as [ListServiceAsync.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            params: ListRetrieveParams
        ): CompletableFuture<HttpResponseFor<List<ListRetrieveResponse>>> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: ListRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<ListRetrieveResponse>>>
    }
}
