// File generated from our OpenAPI spec by Stainless.

package com.phoebe.api.services.async.data.observations.recent

import com.phoebe.api.core.ClientOptions
import com.phoebe.api.core.RequestOptions
import com.phoebe.api.core.http.HttpResponseFor
import com.phoebe.api.models.data.observations.Observation
import com.phoebe.api.models.data.observations.recent.species.SpecieRetrieveParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/**
 * The data/obs end-points are used to fetch observations submitted to eBird in checklists. There
 * are two categories of end-point: 1. Fetch observations for a specific country, region or
 * location. 2. Fetch observations for nearby locations - up to a distance of 50km. Each end-point
 * supports optional query parameters which allow you to filter the list of observations returned.
 */
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
     * Get the recent observations, up to 30 days ago, of a particular species in a country, region
     * or location. Results include only the most recent observation from each location in the
     * region specified.
     *
     * #### Notes
     *
     * The species code is typically a 6-letter code, e.g. cangoo for Canada Goose. You can get
     * complete set of species code from the GET eBird Taxonomy end-point.
     *
     * When using the *r* query parameter set the *regionCode* URL parameter to an empty string.
     */
    fun retrieve(
        speciesCode: String,
        params: SpecieRetrieveParams,
    ): CompletableFuture<List<Observation>> = retrieve(speciesCode, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        speciesCode: String,
        params: SpecieRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<Observation>> =
        retrieve(params.toBuilder().speciesCode(speciesCode).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(params: SpecieRetrieveParams): CompletableFuture<List<Observation>> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: SpecieRetrieveParams,
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
         * Returns a raw HTTP response for `get /data/obs/{regionCode}/recent/{speciesCode}`, but is
         * otherwise the same as [SpecieServiceAsync.retrieve].
         */
        fun retrieve(
            speciesCode: String,
            params: SpecieRetrieveParams,
        ): CompletableFuture<HttpResponseFor<List<Observation>>> =
            retrieve(speciesCode, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            speciesCode: String,
            params: SpecieRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<Observation>>> =
            retrieve(params.toBuilder().speciesCode(speciesCode).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            params: SpecieRetrieveParams
        ): CompletableFuture<HttpResponseFor<List<Observation>>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: SpecieRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<Observation>>>
    }
}
