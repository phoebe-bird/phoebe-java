// File generated from our OpenAPI spec by Stainless.

package com.phoebe.api.services.blocking.data.observations.geo.recent

import com.google.errorprone.annotations.MustBeClosed
import com.phoebe.api.core.RequestOptions
import com.phoebe.api.core.http.HttpResponseFor
import com.phoebe.api.models.data.observations.Observation
import com.phoebe.api.models.data.observations.geo.recent.species.SpecieListParams

interface SpecieService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Get all observations of a species, seen up to 30 days ago, at any location within a radius of
     * up to 50 kilometers, from a given set of coordinates. Results include only the most recent
     * observation from each location in the region specified.
     *
     * #### URL parameters
     * | Name        | Description             |
     * |-------------|-------------------------|
     * | speciesCode | The eBird species code. |
     *
     * #### Notes
     *
     * The species code is typically a 6-letter code, e.g. horlar for Horned Lark. You can get
     * complete set of species code from the GET eBird Taxonomy end-point.
     */
    fun list(speciesCode: String, params: SpecieListParams): List<Observation> =
        list(speciesCode, params, RequestOptions.none())

    /** @see [list] */
    fun list(
        speciesCode: String,
        params: SpecieListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<Observation> = list(params.toBuilder().speciesCode(speciesCode).build(), requestOptions)

    /** @see [list] */
    fun list(params: SpecieListParams): List<Observation> = list(params, RequestOptions.none())

    /** @see [list] */
    fun list(
        params: SpecieListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<Observation>

    /** A view of [SpecieService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /data/obs/geo/recent/{speciesCode}`, but is
         * otherwise the same as [SpecieService.list].
         */
        @MustBeClosed
        fun list(
            speciesCode: String,
            params: SpecieListParams,
        ): HttpResponseFor<List<Observation>> = list(speciesCode, params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            speciesCode: String,
            params: SpecieListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<Observation>> =
            list(params.toBuilder().speciesCode(speciesCode).build(), requestOptions)

        /** @see [list] */
        @MustBeClosed
        fun list(params: SpecieListParams): HttpResponseFor<List<Observation>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: SpecieListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<Observation>>
    }
}
