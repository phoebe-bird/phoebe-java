// File generated from our OpenAPI spec by Stainless.

package com.phoebe.api.services.async.data.observations

import com.phoebe.api.core.RequestOptions
import com.phoebe.api.core.http.HttpResponseFor
import com.phoebe.api.models.data.observations.Observation
import com.phoebe.api.models.data.observations.recent.RecentListParams
import com.phoebe.api.services.async.data.observations.recent.HistoricServiceAsync
import com.phoebe.api.services.async.data.observations.recent.NotableServiceAsync
import com.phoebe.api.services.async.data.observations.recent.SpecieServiceAsync
import java.util.concurrent.CompletableFuture

interface RecentServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    fun notable(): NotableServiceAsync

    fun species(): SpecieServiceAsync

    fun historic(): HistoricServiceAsync

    /**
     * Get the list of recent observations (up to 30 days ago) of birds seen in a country, state,
     * county, or location. Results include only the most recent observation for each species in the
     * region specified.
     */
    fun list(regionCode: String): CompletableFuture<List<Observation>> =
        list(regionCode, RecentListParams.none())

    /** @see [list] */
    fun list(
        regionCode: String,
        params: RecentListParams = RecentListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<Observation>> =
        list(params.toBuilder().regionCode(regionCode).build(), requestOptions)

    /** @see [list] */
    fun list(
        regionCode: String,
        params: RecentListParams = RecentListParams.none(),
    ): CompletableFuture<List<Observation>> = list(regionCode, params, RequestOptions.none())

    /** @see [list] */
    fun list(
        params: RecentListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<Observation>>

    /** @see [list] */
    fun list(params: RecentListParams): CompletableFuture<List<Observation>> =
        list(params, RequestOptions.none())

    /** @see [list] */
    fun list(
        regionCode: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<List<Observation>> =
        list(regionCode, RecentListParams.none(), requestOptions)

    /**
     * A view of [RecentServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        fun notable(): NotableServiceAsync.WithRawResponse

        fun species(): SpecieServiceAsync.WithRawResponse

        fun historic(): HistoricServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /data/obs/{regionCode}/recent`, but is otherwise the
         * same as [RecentServiceAsync.list].
         */
        fun list(regionCode: String): CompletableFuture<HttpResponseFor<List<Observation>>> =
            list(regionCode, RecentListParams.none())

        /** @see [list] */
        fun list(
            regionCode: String,
            params: RecentListParams = RecentListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<Observation>>> =
            list(params.toBuilder().regionCode(regionCode).build(), requestOptions)

        /** @see [list] */
        fun list(
            regionCode: String,
            params: RecentListParams = RecentListParams.none(),
        ): CompletableFuture<HttpResponseFor<List<Observation>>> =
            list(regionCode, params, RequestOptions.none())

        /** @see [list] */
        fun list(
            params: RecentListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<Observation>>>

        /** @see [list] */
        fun list(params: RecentListParams): CompletableFuture<HttpResponseFor<List<Observation>>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        fun list(
            regionCode: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<List<Observation>>> =
            list(regionCode, RecentListParams.none(), requestOptions)
    }
}
