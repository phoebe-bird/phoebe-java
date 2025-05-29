// File generated from our OpenAPI spec by Stainless.

package com.phoebe.api.services.async.ref.taxonomy

import com.phoebe.api.core.RequestOptions
import com.phoebe.api.core.http.HttpResponseFor
import com.phoebe.api.models.ref.taxonomy.speciesgroups.SpeciesGroupListParams
import com.phoebe.api.models.ref.taxonomy.speciesgroups.SpeciesGroupListResponse
import java.util.concurrent.CompletableFuture

interface SpeciesGroupServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Get the list of species groups, e.g. terns, finches, etc. #### Notes Merlin puts like birds
     * together, with Falcons next to Hawks, whereas eBird follows taxonomic order.
     */
    fun list(
        speciesGrouping: SpeciesGroupListParams.SpeciesGrouping
    ): CompletableFuture<List<SpeciesGroupListResponse>> =
        list(speciesGrouping, SpeciesGroupListParams.none())

    /** @see [list] */
    fun list(
        speciesGrouping: SpeciesGroupListParams.SpeciesGrouping,
        params: SpeciesGroupListParams = SpeciesGroupListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<SpeciesGroupListResponse>> =
        list(params.toBuilder().speciesGrouping(speciesGrouping).build(), requestOptions)

    /** @see [list] */
    fun list(
        speciesGrouping: SpeciesGroupListParams.SpeciesGrouping,
        params: SpeciesGroupListParams = SpeciesGroupListParams.none(),
    ): CompletableFuture<List<SpeciesGroupListResponse>> =
        list(speciesGrouping, params, RequestOptions.none())

    /** @see [list] */
    fun list(
        params: SpeciesGroupListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<SpeciesGroupListResponse>>

    /** @see [list] */
    fun list(params: SpeciesGroupListParams): CompletableFuture<List<SpeciesGroupListResponse>> =
        list(params, RequestOptions.none())

    /** @see [list] */
    fun list(
        speciesGrouping: SpeciesGroupListParams.SpeciesGrouping,
        requestOptions: RequestOptions,
    ): CompletableFuture<List<SpeciesGroupListResponse>> =
        list(speciesGrouping, SpeciesGroupListParams.none(), requestOptions)

    /**
     * A view of [SpeciesGroupServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /ref/sppgroup/{speciesGrouping}`, but is otherwise
         * the same as [SpeciesGroupServiceAsync.list].
         */
        fun list(
            speciesGrouping: SpeciesGroupListParams.SpeciesGrouping
        ): CompletableFuture<HttpResponseFor<List<SpeciesGroupListResponse>>> =
            list(speciesGrouping, SpeciesGroupListParams.none())

        /** @see [list] */
        fun list(
            speciesGrouping: SpeciesGroupListParams.SpeciesGrouping,
            params: SpeciesGroupListParams = SpeciesGroupListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<SpeciesGroupListResponse>>> =
            list(params.toBuilder().speciesGrouping(speciesGrouping).build(), requestOptions)

        /** @see [list] */
        fun list(
            speciesGrouping: SpeciesGroupListParams.SpeciesGrouping,
            params: SpeciesGroupListParams = SpeciesGroupListParams.none(),
        ): CompletableFuture<HttpResponseFor<List<SpeciesGroupListResponse>>> =
            list(speciesGrouping, params, RequestOptions.none())

        /** @see [list] */
        fun list(
            params: SpeciesGroupListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<SpeciesGroupListResponse>>>

        /** @see [list] */
        fun list(
            params: SpeciesGroupListParams
        ): CompletableFuture<HttpResponseFor<List<SpeciesGroupListResponse>>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        fun list(
            speciesGrouping: SpeciesGroupListParams.SpeciesGrouping,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<List<SpeciesGroupListResponse>>> =
            list(speciesGrouping, SpeciesGroupListParams.none(), requestOptions)
    }
}
