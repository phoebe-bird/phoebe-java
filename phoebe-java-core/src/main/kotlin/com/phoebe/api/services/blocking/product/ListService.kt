// File generated from our OpenAPI spec by Stainless.

package com.phoebe.api.services.blocking.product

import com.google.errorprone.annotations.MustBeClosed
import com.phoebe.api.core.ClientOptions
import com.phoebe.api.core.RequestOptions
import com.phoebe.api.core.http.HttpResponseFor
import com.phoebe.api.models.product.lists.ListRetrieveParams
import com.phoebe.api.models.product.lists.ListRetrieveResponse
import com.phoebe.api.services.blocking.product.lists.HistoricalService
import java.util.function.Consumer

/**
 * The data/obs end-points are used to fetch observations submitted to eBird in checklists. There
 * are two categories of end-point: 1. Fetch observations for a specific country, region or
 * location. 2. Fetch observations for nearby locations - up to a distance of 50km. Each end-point
 * supports optional query parameters which allow you to filter the list of observations returned.
 */
interface ListService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ListService

    /**
     * The product end-points make it easy to get the information shown in various pages on the
     * eBird web site: 1. The Top 100 contributors on a given date. 2. The checklists submitted on a
     * given date. 3. The most recent checklists submitted. 4. A summary of the checklists submitted
     * on a given date. 5. The details and all the observations of a checklist.
     */
    fun historical(): HistoricalService

    /** Get information on the most recently submitted checklists for a region. */
    fun retrieve(regionCode: String): List<ListRetrieveResponse> =
        retrieve(regionCode, ListRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        regionCode: String,
        params: ListRetrieveParams = ListRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<ListRetrieveResponse> =
        retrieve(params.toBuilder().regionCode(regionCode).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        regionCode: String,
        params: ListRetrieveParams = ListRetrieveParams.none(),
    ): List<ListRetrieveResponse> = retrieve(regionCode, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: ListRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<ListRetrieveResponse>

    /** @see retrieve */
    fun retrieve(params: ListRetrieveParams): List<ListRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(regionCode: String, requestOptions: RequestOptions): List<ListRetrieveResponse> =
        retrieve(regionCode, ListRetrieveParams.none(), requestOptions)

    /** A view of [ListService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): ListService.WithRawResponse

        /**
         * The product end-points make it easy to get the information shown in various pages on the
         * eBird web site: 1. The Top 100 contributors on a given date. 2. The checklists submitted
         * on a given date. 3. The most recent checklists submitted. 4. A summary of the checklists
         * submitted on a given date. 5. The details and all the observations of a checklist.
         */
        fun historical(): HistoricalService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /product/lists/{regionCode}`, but is otherwise the
         * same as [ListService.retrieve].
         */
        @MustBeClosed
        fun retrieve(regionCode: String): HttpResponseFor<List<ListRetrieveResponse>> =
            retrieve(regionCode, ListRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            regionCode: String,
            params: ListRetrieveParams = ListRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<ListRetrieveResponse>> =
            retrieve(params.toBuilder().regionCode(regionCode).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            regionCode: String,
            params: ListRetrieveParams = ListRetrieveParams.none(),
        ): HttpResponseFor<List<ListRetrieveResponse>> =
            retrieve(regionCode, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: ListRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<ListRetrieveResponse>>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: ListRetrieveParams): HttpResponseFor<List<ListRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            regionCode: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<ListRetrieveResponse>> =
            retrieve(regionCode, ListRetrieveParams.none(), requestOptions)
    }
}
