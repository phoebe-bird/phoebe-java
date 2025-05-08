// File generated from our OpenAPI spec by Stainless.

package com.phoebe.api.services.blocking.ref.region

import com.google.errorprone.annotations.MustBeClosed
import com.phoebe.api.core.RequestOptions
import com.phoebe.api.core.http.HttpResponseFor
import com.phoebe.api.models.ref.region.adjacent.AdjacentListParams
import com.phoebe.api.models.ref.region.adjacent.AdjacentListResponse

interface AdjacentService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Get the list of countries or regions that share a border with this one. #### Notes Only
     * subnational2 codes in the United States, New Zealand, or Mexico are currently supported
     */
    fun list(params: AdjacentListParams): List<AdjacentListResponse> =
        list(params, RequestOptions.none())

    /** @see [list] */
    fun list(
        params: AdjacentListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<AdjacentListResponse>

    /** A view of [AdjacentService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /ref/adjacent/{regionCode}`, but is otherwise the
         * same as [AdjacentService.list].
         */
        @MustBeClosed
        fun list(params: AdjacentListParams): HttpResponseFor<List<AdjacentListResponse>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: AdjacentListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<AdjacentListResponse>>
    }
}
