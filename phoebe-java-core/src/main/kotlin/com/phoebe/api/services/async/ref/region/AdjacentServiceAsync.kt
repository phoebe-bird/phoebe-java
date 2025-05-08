// File generated from our OpenAPI spec by Stainless.

package com.phoebe.api.services.async.ref.region

import com.google.errorprone.annotations.MustBeClosed
import com.phoebe.api.core.RequestOptions
import com.phoebe.api.core.http.HttpResponseFor
import com.phoebe.api.models.ref.region.adjacent.AdjacentListParams
import com.phoebe.api.models.ref.region.adjacent.AdjacentListResponse
import java.util.concurrent.CompletableFuture

interface AdjacentServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Get the list of countries or regions that share a border with this one. #### Notes Only
     * subnational2 codes in the United States, New Zealand, or Mexico are currently supported
     */
    fun list(params: AdjacentListParams): CompletableFuture<List<AdjacentListResponse>> =
        list(params, RequestOptions.none())

    /** @see [list] */
    fun list(
        params: AdjacentListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<AdjacentListResponse>>

    /**
     * A view of [AdjacentServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /ref/adjacent/{regionCode}`, but is otherwise the
         * same as [AdjacentServiceAsync.list].
         */
        @MustBeClosed
        fun list(
            params: AdjacentListParams
        ): CompletableFuture<HttpResponseFor<List<AdjacentListResponse>>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: AdjacentListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<AdjacentListResponse>>>
    }
}
