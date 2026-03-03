// File generated from our OpenAPI spec by Stainless.

package com.phoebe.api.services.async.product

import com.phoebe.api.core.ClientOptions
import com.phoebe.api.core.RequestOptions
import com.phoebe.api.core.http.HttpResponseFor
import com.phoebe.api.models.product.specieslist.SpeciesListListParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/**
 * The product end-points make it easy to get the information shown in various pages on the eBird
 * web site: 1. The Top 100 contributors on a given date. 2. The checklists submitted on a given
 * date. 3. The most recent checklists submitted. 4. A summary of the checklists submitted on a
 * given date. 5. The details and all the observations of a checklist.
 */
interface SpeciesListServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SpeciesListServiceAsync

    /**
     * Get a list of species codes ever seen in a region, in taxonomic order (species taxa only)
     *
     * #### Notes The results are usually updated every 10 seconds for locations, every day for
     * larger regions.
     */
    fun list(regionCode: String): CompletableFuture<List<String>> =
        list(regionCode, SpeciesListListParams.none())

    /** @see list */
    fun list(
        regionCode: String,
        params: SpeciesListListParams = SpeciesListListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<String>> =
        list(params.toBuilder().regionCode(regionCode).build(), requestOptions)

    /** @see list */
    fun list(
        regionCode: String,
        params: SpeciesListListParams = SpeciesListListParams.none(),
    ): CompletableFuture<List<String>> = list(regionCode, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: SpeciesListListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<String>>

    /** @see list */
    fun list(params: SpeciesListListParams): CompletableFuture<List<String>> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(regionCode: String, requestOptions: RequestOptions): CompletableFuture<List<String>> =
        list(regionCode, SpeciesListListParams.none(), requestOptions)

    /**
     * A view of [SpeciesListServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SpeciesListServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /product/spplist/{regionCode}`, but is otherwise the
         * same as [SpeciesListServiceAsync.list].
         */
        fun list(regionCode: String): CompletableFuture<HttpResponseFor<List<String>>> =
            list(regionCode, SpeciesListListParams.none())

        /** @see list */
        fun list(
            regionCode: String,
            params: SpeciesListListParams = SpeciesListListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<String>>> =
            list(params.toBuilder().regionCode(regionCode).build(), requestOptions)

        /** @see list */
        fun list(
            regionCode: String,
            params: SpeciesListListParams = SpeciesListListParams.none(),
        ): CompletableFuture<HttpResponseFor<List<String>>> =
            list(regionCode, params, RequestOptions.none())

        /** @see list */
        fun list(
            params: SpeciesListListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<String>>>

        /** @see list */
        fun list(params: SpeciesListListParams): CompletableFuture<HttpResponseFor<List<String>>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            regionCode: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<List<String>>> =
            list(regionCode, SpeciesListListParams.none(), requestOptions)
    }
}
