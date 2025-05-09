// File generated from our OpenAPI spec by Stainless.

package com.phoebe.api.services.async.data.observations.nearest

import com.google.errorprone.annotations.MustBeClosed
import com.phoebe.api.core.RequestOptions
import com.phoebe.api.core.http.HttpResponseFor
import com.phoebe.api.models.data.observations.Observation
import com.phoebe.api.models.data.observations.nearest.geospecies.GeoSpecieListParams
import java.util.concurrent.CompletableFuture

interface GeoSpecieServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Find the nearest locations where a species has been seen recently. #### Notes The species
     * code is typically a 6-letter code, e.g. barswa for Barn Swallow. You can get complete set of
     * species code from the GET eBird Taxonomy end-point.
     */
    fun list(
        speciesCode: String,
        params: GeoSpecieListParams,
    ): CompletableFuture<List<Observation>> = list(speciesCode, params, RequestOptions.none())

    /** @see [list] */
    fun list(
        speciesCode: String,
        params: GeoSpecieListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<Observation>> =
        list(params.toBuilder().speciesCode(speciesCode).build(), requestOptions)

    /** @see [list] */
    fun list(params: GeoSpecieListParams): CompletableFuture<List<Observation>> =
        list(params, RequestOptions.none())

    /** @see [list] */
    fun list(
        params: GeoSpecieListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<Observation>>

    /**
     * A view of [GeoSpecieServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /data/nearest/geo/recent/{speciesCode}`, but is
         * otherwise the same as [GeoSpecieServiceAsync.list].
         */
        @MustBeClosed
        fun list(
            speciesCode: String,
            params: GeoSpecieListParams,
        ): CompletableFuture<HttpResponseFor<List<Observation>>> =
            list(speciesCode, params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            speciesCode: String,
            params: GeoSpecieListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<Observation>>> =
            list(params.toBuilder().speciesCode(speciesCode).build(), requestOptions)

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: GeoSpecieListParams
        ): CompletableFuture<HttpResponseFor<List<Observation>>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: GeoSpecieListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<Observation>>>
    }
}
