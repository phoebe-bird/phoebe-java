// File generated from our OpenAPI spec by Stainless.

package com.phoebe.api.services.blocking.ref

import com.google.errorprone.annotations.MustBeClosed
import com.phoebe.api.core.RequestOptions
import com.phoebe.api.core.http.HttpResponseFor
import com.phoebe.api.models.ref.hotspot.HotspotListParams
import com.phoebe.api.models.ref.hotspot.HotspotListResponse
import com.phoebe.api.services.blocking.ref.hotspot.GeoService
import com.phoebe.api.services.blocking.ref.hotspot.InfoService

interface HotspotService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    fun geo(): GeoService

    fun info(): InfoService

    /** Hotspots in a region */
    fun list(params: HotspotListParams): List<HotspotListResponse> =
        list(params, RequestOptions.none())

    /** @see [list] */
    fun list(
        params: HotspotListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<HotspotListResponse>

    /** A view of [HotspotService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        fun geo(): GeoService.WithRawResponse

        fun info(): InfoService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /ref/hotspot/{regionCode}`, but is otherwise the
         * same as [HotspotService.list].
         */
        @MustBeClosed
        fun list(params: HotspotListParams): HttpResponseFor<List<HotspotListResponse>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: HotspotListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<HotspotListResponse>>
    }
}
