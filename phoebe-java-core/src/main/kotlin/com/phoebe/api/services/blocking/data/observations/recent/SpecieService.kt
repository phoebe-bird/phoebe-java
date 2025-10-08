// File generated from our OpenAPI spec by Stainless.

package com.phoebe.api.services.blocking.data.observations.recent

import com.google.errorprone.annotations.MustBeClosed
import com.phoebe.api.core.ClientOptions
import com.phoebe.api.core.RequestOptions
import com.phoebe.api.core.http.HttpResponseFor
import com.phoebe.api.models.data.observations.Observation
import com.phoebe.api.models.data.observations.recent.species.SpecieRetrieveParams
import java.util.function.Consumer

interface SpecieService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SpecieService

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
    fun retrieve(speciesCode: String, params: SpecieRetrieveParams): List<Observation> =
        retrieve(speciesCode, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        speciesCode: String,
        params: SpecieRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<Observation> =
        retrieve(params.toBuilder().speciesCode(speciesCode).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(params: SpecieRetrieveParams): List<Observation> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: SpecieRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<Observation>

    /** A view of [SpecieService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): SpecieService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /data/obs/{regionCode}/recent/{speciesCode}`, but is
         * otherwise the same as [SpecieService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            speciesCode: String,
            params: SpecieRetrieveParams,
        ): HttpResponseFor<List<Observation>> = retrieve(speciesCode, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            speciesCode: String,
            params: SpecieRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<Observation>> =
            retrieve(params.toBuilder().speciesCode(speciesCode).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: SpecieRetrieveParams): HttpResponseFor<List<Observation>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: SpecieRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<Observation>>
    }
}
