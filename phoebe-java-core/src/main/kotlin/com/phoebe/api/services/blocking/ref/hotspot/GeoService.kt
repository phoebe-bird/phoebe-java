// File generated from our OpenAPI spec by Stainless.

package com.phoebe.api.services.blocking.ref.hotspot

import com.google.errorprone.annotations.MustBeClosed
import com.phoebe.api.core.ClientOptions
import com.phoebe.api.core.RequestOptions
import com.phoebe.api.core.http.HttpResponseFor
import com.phoebe.api.models.ref.hotspot.geo.GeoRetrieveParams
import com.phoebe.api.models.ref.hotspot.geo.GeoRetrieveResponse
import java.util.function.Consumer

/**
 * With the ref/hotspot end-points you can find the hotspots for a given country or region or nearby
 * hotspots
 */
interface GeoService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): GeoService

    /**
     * Get the list of hotspots, within a radius of up to 50 kilometers, from a given set of
     * coordinates.
     */
    fun retrieve(params: GeoRetrieveParams): List<GeoRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: GeoRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<GeoRetrieveResponse>

    /** A view of [GeoService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): GeoService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /ref/hotspot/geo`, but is otherwise the same as
         * [GeoService.retrieve].
         */
        @MustBeClosed
        fun retrieve(params: GeoRetrieveParams): HttpResponseFor<List<GeoRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: GeoRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<GeoRetrieveResponse>>
    }
}
