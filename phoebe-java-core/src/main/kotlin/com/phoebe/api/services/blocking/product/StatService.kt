// File generated from our OpenAPI spec by Stainless.

package com.phoebe.api.services.blocking.product

import com.google.errorprone.annotations.MustBeClosed
import com.phoebe.api.core.ClientOptions
import com.phoebe.api.core.RequestOptions
import com.phoebe.api.core.http.HttpResponseFor
import com.phoebe.api.models.product.stats.StatRetrieveParams
import com.phoebe.api.models.product.stats.StatRetrieveResponse
import java.util.function.Consumer

interface StatService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): StatService

    /**
     * Get a summary of the number of checklist submitted, species seen and contributors on a given
     * date for a country or region.
     *
     * #### Notes The results are updated every 15 minutes.
     */
    fun retrieve(d: Long, params: StatRetrieveParams): StatRetrieveResponse =
        retrieve(d, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        d: Long,
        params: StatRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): StatRetrieveResponse = retrieve(params.toBuilder().d(d).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(params: StatRetrieveParams): StatRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: StatRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): StatRetrieveResponse

    /** A view of [StatService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): StatService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /product/stats/{regionCode}/{y}/{m}/{d}`, but is
         * otherwise the same as [StatService.retrieve].
         */
        @MustBeClosed
        fun retrieve(d: Long, params: StatRetrieveParams): HttpResponseFor<StatRetrieveResponse> =
            retrieve(d, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            d: Long,
            params: StatRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<StatRetrieveResponse> =
            retrieve(params.toBuilder().d(d).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: StatRetrieveParams): HttpResponseFor<StatRetrieveResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: StatRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<StatRetrieveResponse>
    }
}
