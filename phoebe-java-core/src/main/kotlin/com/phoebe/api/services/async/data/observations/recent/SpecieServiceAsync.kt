// File generated from our OpenAPI spec by Stainless.

package com.phoebe.api.services.async.data.observations.recent

import com.google.errorprone.annotations.MustBeClosed
import com.phoebe.api.core.RequestOptions
import com.phoebe.api.core.http.HttpResponseFor
import com.phoebe.api.models.data.observations.Observation
import com.phoebe.api.models.data.observations.recent.species.SpecieRetrieveParams
import java.util.concurrent.CompletableFuture

interface SpecieServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

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
     * When using the _r_ query parameter set the _regionCode_ URL parameter to an empty string.
     */
    fun retrieve(params: SpecieRetrieveParams): CompletableFuture<List<Observation>> =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: SpecieRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<Observation>>

    /**
     * A view of [SpecieServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /data/obs/{regionCode}/recent/{speciesCode}`, but is
         * otherwise the same as [SpecieServiceAsync.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            params: SpecieRetrieveParams
        ): CompletableFuture<HttpResponseFor<List<Observation>>> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: SpecieRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<Observation>>>
    }
}
