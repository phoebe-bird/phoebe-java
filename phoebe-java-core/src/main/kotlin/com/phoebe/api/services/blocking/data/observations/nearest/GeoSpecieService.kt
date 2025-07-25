// File generated from our OpenAPI spec by Stainless.

package com.phoebe.api.services.blocking.data.observations.nearest

import com.google.errorprone.annotations.MustBeClosed
import com.phoebe.api.core.ClientOptions
import com.phoebe.api.core.RequestOptions
import com.phoebe.api.core.http.HttpResponseFor
import com.phoebe.api.models.data.observations.Observation
import com.phoebe.api.models.data.observations.nearest.geospecies.GeoSpecieListParams
import java.util.function.Consumer

interface GeoSpecieService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): GeoSpecieService

    /**
     * Find the nearest locations where a species has been seen recently. #### Notes The species
     * code is typically a 6-letter code, e.g. barswa for Barn Swallow. You can get complete set of
     * species code from the GET eBird Taxonomy end-point.
     */
    fun list(speciesCode: String, params: GeoSpecieListParams): List<Observation> =
        list(speciesCode, params, RequestOptions.none())

    /** @see list */
    fun list(
        speciesCode: String,
        params: GeoSpecieListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<Observation> = list(params.toBuilder().speciesCode(speciesCode).build(), requestOptions)

    /** @see list */
    fun list(params: GeoSpecieListParams): List<Observation> = list(params, RequestOptions.none())

    /** @see list */
    fun list(
        params: GeoSpecieListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<Observation>

    /** A view of [GeoSpecieService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): GeoSpecieService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /data/nearest/geo/recent/{speciesCode}`, but is
         * otherwise the same as [GeoSpecieService.list].
         */
        @MustBeClosed
        fun list(
            speciesCode: String,
            params: GeoSpecieListParams,
        ): HttpResponseFor<List<Observation>> = list(speciesCode, params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            speciesCode: String,
            params: GeoSpecieListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<Observation>> =
            list(params.toBuilder().speciesCode(speciesCode).build(), requestOptions)

        /** @see list */
        @MustBeClosed
        fun list(params: GeoSpecieListParams): HttpResponseFor<List<Observation>> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: GeoSpecieListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<Observation>>
    }
}
