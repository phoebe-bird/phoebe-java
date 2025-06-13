// File generated from our OpenAPI spec by Stainless.

package com.phoebe.api.services.blocking.ref

import com.google.errorprone.annotations.MustBeClosed
import com.phoebe.api.core.ClientOptions
import com.phoebe.api.core.RequestOptions
import com.phoebe.api.core.http.HttpResponseFor
import com.phoebe.api.models.ref.hotspot.HotspotListParams
import com.phoebe.api.models.ref.hotspot.HotspotListResponse
import com.phoebe.api.services.blocking.ref.hotspot.GeoService
import com.phoebe.api.services.blocking.ref.hotspot.InfoService
import java.util.function.Consumer

interface HotspotService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): HotspotService

    fun geo(): GeoService

    fun info(): InfoService

    /** Hotspots in a region */
    fun list(regionCode: String): List<HotspotListResponse> =
        list(regionCode, HotspotListParams.none())

    /** @see [list] */
    fun list(
        regionCode: String,
        params: HotspotListParams = HotspotListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<HotspotListResponse> =
        list(params.toBuilder().regionCode(regionCode).build(), requestOptions)

    /** @see [list] */
    fun list(
        regionCode: String,
        params: HotspotListParams = HotspotListParams.none(),
    ): List<HotspotListResponse> = list(regionCode, params, RequestOptions.none())

    /** @see [list] */
    fun list(
        params: HotspotListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<HotspotListResponse>

    /** @see [list] */
    fun list(params: HotspotListParams): List<HotspotListResponse> =
        list(params, RequestOptions.none())

    /** @see [list] */
    fun list(regionCode: String, requestOptions: RequestOptions): List<HotspotListResponse> =
        list(regionCode, HotspotListParams.none(), requestOptions)

    /** A view of [HotspotService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): HotspotService.WithRawResponse

        fun geo(): GeoService.WithRawResponse

        fun info(): InfoService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /ref/hotspot/{regionCode}`, but is otherwise the
         * same as [HotspotService.list].
         */
        @MustBeClosed
        fun list(regionCode: String): HttpResponseFor<List<HotspotListResponse>> =
            list(regionCode, HotspotListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            regionCode: String,
            params: HotspotListParams = HotspotListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<HotspotListResponse>> =
            list(params.toBuilder().regionCode(regionCode).build(), requestOptions)

        /** @see [list] */
        @MustBeClosed
        fun list(
            regionCode: String,
            params: HotspotListParams = HotspotListParams.none(),
        ): HttpResponseFor<List<HotspotListResponse>> =
            list(regionCode, params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: HotspotListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<HotspotListResponse>>

        /** @see [list] */
        @MustBeClosed
        fun list(params: HotspotListParams): HttpResponseFor<List<HotspotListResponse>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            regionCode: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<HotspotListResponse>> =
            list(regionCode, HotspotListParams.none(), requestOptions)
    }
}
