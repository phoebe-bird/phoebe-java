// File generated from our OpenAPI spec by Stainless.

package com.phoebe.api.services.async.ref.region

import com.phoebe.api.core.ClientOptions
import com.phoebe.api.core.RequestOptions
import com.phoebe.api.core.http.HttpResponseFor
import com.phoebe.api.models.ref.region.list.ListListParams
import com.phoebe.api.models.ref.region.list.ListListResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

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
     * Get the list of sub-regions for a given country or region. #### Notes Not all combinations of
     * region type and region code are valid. You can fetch all the subnational1 or subnational2
     * regions for a country however you can only specify a region type of 'country' when using
     * 'world' as a region code.
     */
    fun list(
        parentRegionCode: String,
        params: ListListParams,
    ): CompletableFuture<List<ListListResponse>> =
        list(parentRegionCode, params, RequestOptions.none())

    /** @see list */
    fun list(
        parentRegionCode: String,
        params: ListListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<ListListResponse>> =
        list(params.toBuilder().parentRegionCode(parentRegionCode).build(), requestOptions)

    /** @see list */
    fun list(params: ListListParams): CompletableFuture<List<ListListResponse>> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        params: ListListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<ListListResponse>>

    /** A view of [ListServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): ListServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /ref/region/list/{regionType}/{parentRegionCode}`,
         * but is otherwise the same as [ListServiceAsync.list].
         */
        fun list(
            parentRegionCode: String,
            params: ListListParams,
        ): CompletableFuture<HttpResponseFor<List<ListListResponse>>> =
            list(parentRegionCode, params, RequestOptions.none())

        /** @see list */
        fun list(
            parentRegionCode: String,
            params: ListListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<ListListResponse>>> =
            list(params.toBuilder().parentRegionCode(parentRegionCode).build(), requestOptions)

        /** @see list */
        fun list(
            params: ListListParams
        ): CompletableFuture<HttpResponseFor<List<ListListResponse>>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            params: ListListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<ListListResponse>>>
    }
}
