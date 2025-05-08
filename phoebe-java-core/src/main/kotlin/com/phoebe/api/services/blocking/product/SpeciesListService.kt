// File generated from our OpenAPI spec by Stainless.

package com.phoebe.api.services.blocking.product

import com.google.errorprone.annotations.MustBeClosed
import com.phoebe.api.core.RequestOptions
import com.phoebe.api.core.http.HttpResponseFor
import com.phoebe.api.models.product.specieslist.SpeciesListListParams

interface SpeciesListService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Get a list of species codes ever seen in a region, in taxonomic order (species taxa only)
     *
     * #### Notes The results are usually updated every 10 seconds for locations, every day for
     * larger regions.
     */
    fun list(params: SpeciesListListParams): List<String> = list(params, RequestOptions.none())

    /** @see [list] */
    fun list(
        params: SpeciesListListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<String>

    /**
     * A view of [SpeciesListService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /product/spplist/{regionCode}`, but is otherwise the
         * same as [SpeciesListService.list].
         */
        @MustBeClosed
        fun list(params: SpeciesListListParams): HttpResponseFor<List<String>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: SpeciesListListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<String>>
    }
}
