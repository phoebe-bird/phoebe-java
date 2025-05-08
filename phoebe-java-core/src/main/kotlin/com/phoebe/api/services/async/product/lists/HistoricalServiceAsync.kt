// File generated from our OpenAPI spec by Stainless.

package com.phoebe.api.services.async.product.lists

import com.google.errorprone.annotations.MustBeClosed
import com.phoebe.api.core.RequestOptions
import com.phoebe.api.core.http.HttpResponseFor
import com.phoebe.api.models.product.lists.historical.HistoricalRetrieveParams
import com.phoebe.api.models.product.lists.historical.HistoricalRetrieveResponse
import java.util.concurrent.CompletableFuture

interface HistoricalServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Get information on the checklists submitted on a given date for a country or region. */
    fun retrieve(
        params: HistoricalRetrieveParams
    ): CompletableFuture<List<HistoricalRetrieveResponse>> = retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
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
         * Returns a raw HTTP response for `get /product/lists/{regionCode}/{y}/{m}/{d}`, but is
         * otherwise the same as [HistoricalServiceAsync.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            params: HistoricalRetrieveParams
        ): CompletableFuture<HttpResponseFor<List<HistoricalRetrieveResponse>>> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: HistoricalRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<HistoricalRetrieveResponse>>>
    }
}
