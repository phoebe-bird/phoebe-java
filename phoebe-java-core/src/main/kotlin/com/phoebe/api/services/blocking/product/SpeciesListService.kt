// File generated from our OpenAPI spec by Stainless.

package com.phoebe.api.services.blocking.product

import com.google.errorprone.annotations.MustBeClosed
import com.phoebe.api.core.ClientOptions
import com.phoebe.api.core.RequestOptions
import com.phoebe.api.core.http.HttpResponseFor
import com.phoebe.api.models.product.specieslist.SpeciesListListParams
import java.util.function.Consumer

interface SpeciesListService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SpeciesListService

    /**
     * Get a list of species codes ever seen in a region, in taxonomic order (species taxa only)
     *
     * #### Notes The results are usually updated every 10 seconds for locations, every day for
     * larger regions.
     */
    fun list(regionCode: String): List<String> = list(regionCode, SpeciesListListParams.none())

    /** @see [list] */
    fun list(
        regionCode: String,
        params: SpeciesListListParams = SpeciesListListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<String> = list(params.toBuilder().regionCode(regionCode).build(), requestOptions)

    /** @see [list] */
    fun list(
        regionCode: String,
        params: SpeciesListListParams = SpeciesListListParams.none(),
    ): List<String> = list(regionCode, params, RequestOptions.none())

    /** @see [list] */
    fun list(
        params: SpeciesListListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<String>

    /** @see [list] */
    fun list(params: SpeciesListListParams): List<String> = list(params, RequestOptions.none())

    /** @see [list] */
    fun list(regionCode: String, requestOptions: RequestOptions): List<String> =
        list(regionCode, SpeciesListListParams.none(), requestOptions)

    /**
     * A view of [SpeciesListService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SpeciesListService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /product/spplist/{regionCode}`, but is otherwise the
         * same as [SpeciesListService.list].
         */
        @MustBeClosed
        fun list(regionCode: String): HttpResponseFor<List<String>> =
            list(regionCode, SpeciesListListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            regionCode: String,
            params: SpeciesListListParams = SpeciesListListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<String>> =
            list(params.toBuilder().regionCode(regionCode).build(), requestOptions)

        /** @see [list] */
        @MustBeClosed
        fun list(
            regionCode: String,
            params: SpeciesListListParams = SpeciesListListParams.none(),
        ): HttpResponseFor<List<String>> = list(regionCode, params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: SpeciesListListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<String>>

        /** @see [list] */
        @MustBeClosed
        fun list(params: SpeciesListListParams): HttpResponseFor<List<String>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            regionCode: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<String>> =
            list(regionCode, SpeciesListListParams.none(), requestOptions)
    }
}
