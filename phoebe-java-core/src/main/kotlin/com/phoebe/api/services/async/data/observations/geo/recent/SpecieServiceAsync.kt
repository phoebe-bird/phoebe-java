// File generated from our OpenAPI spec by Stainless.

package com.phoebe.api.services.async.data.observations.geo.recent

import com.phoebe.api.core.ClientOptions
import com.phoebe.api.core.RequestOptions
import com.phoebe.api.core.http.HttpResponseFor
import com.phoebe.api.models.data.observations.Observation
import com.phoebe.api.models.data.observations.geo.recent.species.SpecieListParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface SpecieServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SpecieServiceAsync

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
     * The species code is typically a 6-letter code, e.g. horlar for Horned Lark. You can get
     * complete set of species code from the GET eBird Taxonomy end-point.
     */
    fun list(speciesCode: String, params: SpecieListParams): CompletableFuture<List<Observation>> =
        list(speciesCode, params, RequestOptions.none())

    /** @see list */
    fun list(
        speciesCode: String,
        params: SpecieListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<Observation>> =
        list(params.toBuilder().speciesCode(speciesCode).build(), requestOptions)

    /** @see list */
    fun list(params: SpecieListParams): CompletableFuture<List<Observation>> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        params: SpecieListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<Observation>>

    /**
     * A view of [SpecieServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SpecieServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /data/obs/geo/recent/{speciesCode}`, but is
         * otherwise the same as [SpecieServiceAsync.list].
         */
        fun list(
            speciesCode: String,
            params: SpecieListParams,
        ): CompletableFuture<HttpResponseFor<List<Observation>>> =
            list(speciesCode, params, RequestOptions.none())

        /** @see list */
        fun list(
            speciesCode: String,
            params: SpecieListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<Observation>>> =
            list(params.toBuilder().speciesCode(speciesCode).build(), requestOptions)

        /** @see list */
        fun list(params: SpecieListParams): CompletableFuture<HttpResponseFor<List<Observation>>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            params: SpecieListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<Observation>>>
    }
}
