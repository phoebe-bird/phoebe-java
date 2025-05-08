// File generated from our OpenAPI spec by Stainless.

package com.phoebe.api.services.blocking.product

import com.google.errorprone.annotations.MustBeClosed
import com.phoebe.api.core.RequestOptions
import com.phoebe.api.core.http.HttpResponseFor
import com.phoebe.api.models.product.top100.Top100RetrieveParams
import com.phoebe.api.models.product.top100.Top100RetrieveResponse

interface Top100Service {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Get the top 100 contributors on a given date for a country or region.
     *
     * #### Notes
     *
     * The results are updated every 15 minutes.
     *
     * When ordering by the number of completed checklists, the number of species seen will always
     * be zero. Similarly when ordering by the number of species seen the number of completed
     * checklists will always be zero. <b>Selected Response Field Notes</b>
     *
     * profileHandle - if a user has enabled their profile, this is the handle to reach it via
     * ebird.org/ebird/profile/{profileHandle}
     *
     * numSpecies - always zero when checklistSort parameter is true. Invalid observations ARE
     * included in this total numCompleteChecklists - always zero when checklistSort parameter is
     * false
     */
    fun retrieve(params: Top100RetrieveParams): List<Top100RetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: Top100RetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<Top100RetrieveResponse>

    /** A view of [Top100Service] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /product/top100/{regionCode}/{y}/{m}/{d}`, but is
         * otherwise the same as [Top100Service.retrieve].
         */
        @MustBeClosed
        fun retrieve(params: Top100RetrieveParams): HttpResponseFor<List<Top100RetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: Top100RetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<Top100RetrieveResponse>>
    }
}
