// File generated from our OpenAPI spec by Stainless.

package com.phoebe.api.services.async.ref.hotspot

import com.phoebe.api.core.ClientOptions
import com.phoebe.api.core.RequestOptions
import com.phoebe.api.core.http.HttpResponseFor
import com.phoebe.api.models.ref.hotspot.geo.GeoRetrieveParams
import com.phoebe.api.models.ref.hotspot.geo.GeoRetrieveResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface GeoServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): GeoServiceAsync

    /**
     * Get the list of hotspots, within a radius of up to 50 kilometers, from a given set of
     * coordinates.
     */
    fun retrieve(params: GeoRetrieveParams): CompletableFuture<List<GeoRetrieveResponse>> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: GeoRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<GeoRetrieveResponse>>

    /** A view of [GeoServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): GeoServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /ref/hotspot/geo`, but is otherwise the same as
         * [GeoServiceAsync.retrieve].
         */
        fun retrieve(
            params: GeoRetrieveParams
        ): CompletableFuture<HttpResponseFor<List<GeoRetrieveResponse>>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: GeoRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<GeoRetrieveResponse>>>
    }
}
