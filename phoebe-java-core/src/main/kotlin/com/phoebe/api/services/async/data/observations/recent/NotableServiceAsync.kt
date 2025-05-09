// File generated from our OpenAPI spec by Stainless.

package com.phoebe.api.services.async.data.observations.recent

import com.google.errorprone.annotations.MustBeClosed
import com.phoebe.api.core.RequestOptions
import com.phoebe.api.core.http.HttpResponseFor
import com.phoebe.api.models.data.observations.Observation
import com.phoebe.api.models.data.observations.recent.notable.NotableListParams
import java.util.concurrent.CompletableFuture

interface NotableServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Get the list of recent, notable observations (up to 30 days ago) of birds seen in a country,
     * region or location. Notable observations can be for locally or nationally rare species or are
     * otherwise unusual, e.g. over-wintering birds in a species which is normally only a summer
     * visitor.
     */
    fun list(regionCode: String): CompletableFuture<List<Observation>> =
        list(regionCode, NotableListParams.none())

    /** @see [list] */
    fun list(
        regionCode: String,
        params: NotableListParams = NotableListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<Observation>> =
        list(params.toBuilder().regionCode(regionCode).build(), requestOptions)

    /** @see [list] */
    fun list(
        regionCode: String,
        params: NotableListParams = NotableListParams.none(),
    ): CompletableFuture<List<Observation>> = list(regionCode, params, RequestOptions.none())

    /** @see [list] */
    fun list(
        params: NotableListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<Observation>>

    /** @see [list] */
    fun list(params: NotableListParams): CompletableFuture<List<Observation>> =
        list(params, RequestOptions.none())

    /** @see [list] */
    fun list(
        regionCode: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<List<Observation>> =
        list(regionCode, NotableListParams.none(), requestOptions)

    /**
     * A view of [NotableServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /data/obs/{regionCode}/recent/notable`, but is
         * otherwise the same as [NotableServiceAsync.list].
         */
        @MustBeClosed
        fun list(regionCode: String): CompletableFuture<HttpResponseFor<List<Observation>>> =
            list(regionCode, NotableListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            regionCode: String,
            params: NotableListParams = NotableListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<Observation>>> =
            list(params.toBuilder().regionCode(regionCode).build(), requestOptions)

        /** @see [list] */
        @MustBeClosed
        fun list(
            regionCode: String,
            params: NotableListParams = NotableListParams.none(),
        ): CompletableFuture<HttpResponseFor<List<Observation>>> =
            list(regionCode, params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: NotableListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<Observation>>>

        /** @see [list] */
        @MustBeClosed
        fun list(params: NotableListParams): CompletableFuture<HttpResponseFor<List<Observation>>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            regionCode: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<List<Observation>>> =
            list(regionCode, NotableListParams.none(), requestOptions)
    }
}
