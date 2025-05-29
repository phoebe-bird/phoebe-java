// File generated from our OpenAPI spec by Stainless.

package com.phoebe.api.services.async.ref

import com.phoebe.api.core.RequestOptions
import com.phoebe.api.core.http.HttpResponseFor
import com.phoebe.api.models.ref.hotspot.HotspotListParams
import com.phoebe.api.models.ref.hotspot.HotspotListResponse
import com.phoebe.api.services.async.ref.hotspot.GeoServiceAsync
import com.phoebe.api.services.async.ref.hotspot.InfoServiceAsync
import java.util.concurrent.CompletableFuture

interface HotspotServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    fun geo(): GeoServiceAsync

    fun info(): InfoServiceAsync

    /** Hotspots in a region */
    fun list(regionCode: String): CompletableFuture<List<HotspotListResponse>> =
        list(regionCode, HotspotListParams.none())

    /** @see [list] */
    fun list(
        regionCode: String,
        params: HotspotListParams = HotspotListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<HotspotListResponse>> =
        list(params.toBuilder().regionCode(regionCode).build(), requestOptions)

    /** @see [list] */
    fun list(
        regionCode: String,
        params: HotspotListParams = HotspotListParams.none(),
    ): CompletableFuture<List<HotspotListResponse>> =
        list(regionCode, params, RequestOptions.none())

    /** @see [list] */
    fun list(
        params: HotspotListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<HotspotListResponse>>

    /** @see [list] */
    fun list(params: HotspotListParams): CompletableFuture<List<HotspotListResponse>> =
        list(params, RequestOptions.none())

    /** @see [list] */
    fun list(
        regionCode: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<List<HotspotListResponse>> =
        list(regionCode, HotspotListParams.none(), requestOptions)

    /**
     * A view of [HotspotServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        fun geo(): GeoServiceAsync.WithRawResponse

        fun info(): InfoServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /ref/hotspot/{regionCode}`, but is otherwise the
         * same as [HotspotServiceAsync.list].
         */
        fun list(
            regionCode: String
        ): CompletableFuture<HttpResponseFor<List<HotspotListResponse>>> =
            list(regionCode, HotspotListParams.none())

        /** @see [list] */
        fun list(
            regionCode: String,
            params: HotspotListParams = HotspotListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<HotspotListResponse>>> =
            list(params.toBuilder().regionCode(regionCode).build(), requestOptions)

        /** @see [list] */
        fun list(
            regionCode: String,
            params: HotspotListParams = HotspotListParams.none(),
        ): CompletableFuture<HttpResponseFor<List<HotspotListResponse>>> =
            list(regionCode, params, RequestOptions.none())

        /** @see [list] */
        fun list(
            params: HotspotListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<HotspotListResponse>>>

        /** @see [list] */
        fun list(
            params: HotspotListParams
        ): CompletableFuture<HttpResponseFor<List<HotspotListResponse>>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        fun list(
            regionCode: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<List<HotspotListResponse>>> =
            list(regionCode, HotspotListParams.none(), requestOptions)
    }
}
