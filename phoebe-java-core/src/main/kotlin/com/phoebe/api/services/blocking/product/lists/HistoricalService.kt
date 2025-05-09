// File generated from our OpenAPI spec by Stainless.

package com.phoebe.api.services.blocking.product.lists

import com.google.errorprone.annotations.MustBeClosed
import com.phoebe.api.core.RequestOptions
import com.phoebe.api.core.http.HttpResponseFor
import com.phoebe.api.models.product.lists.historical.HistoricalRetrieveParams
import com.phoebe.api.models.product.lists.historical.HistoricalRetrieveResponse

interface HistoricalService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Get information on the checklists submitted on a given date for a country or region. */
    fun retrieve(d: Long, params: HistoricalRetrieveParams): List<HistoricalRetrieveResponse> =
        retrieve(d, params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        d: Long,
        params: HistoricalRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<HistoricalRetrieveResponse> = retrieve(params.toBuilder().d(d).build(), requestOptions)

    /** @see [retrieve] */
    fun retrieve(params: HistoricalRetrieveParams): List<HistoricalRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: HistoricalRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<HistoricalRetrieveResponse>

    /** A view of [HistoricalService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /product/lists/{regionCode}/{y}/{m}/{d}`, but is
         * otherwise the same as [HistoricalService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            d: Long,
            params: HistoricalRetrieveParams,
        ): HttpResponseFor<List<HistoricalRetrieveResponse>> =
            retrieve(d, params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            d: Long,
            params: HistoricalRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<HistoricalRetrieveResponse>> =
            retrieve(params.toBuilder().d(d).build(), requestOptions)

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: HistoricalRetrieveParams
        ): HttpResponseFor<List<HistoricalRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: HistoricalRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<HistoricalRetrieveResponse>>
    }
}
