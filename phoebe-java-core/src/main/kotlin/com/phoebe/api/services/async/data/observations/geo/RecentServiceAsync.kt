// File generated from our OpenAPI spec by Stainless.

package com.phoebe.api.services.async.data.observations.geo

import com.phoebe.api.core.RequestOptions
import com.phoebe.api.core.http.HttpResponseFor
import com.phoebe.api.models.data.observations.Observation
import com.phoebe.api.models.data.observations.geo.recent.RecentListParams
import com.phoebe.api.services.async.data.observations.geo.recent.NotableServiceAsync
import com.phoebe.api.services.async.data.observations.geo.recent.SpecieServiceAsync
import java.util.concurrent.CompletableFuture

interface RecentServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    fun species(): SpecieServiceAsync

    fun notable(): NotableServiceAsync

    /**
     * Get the list of recent observations (up to 30 days ago) of birds seen at locations within a
     * radius of up to 50 kilometers, from a given set of coordinates. Results include only the most
     * recent observation for each species in the region specified.
     */
    fun list(params: RecentListParams): CompletableFuture<List<Observation>> =
        list(params, RequestOptions.none())

    /** @see [list] */
    fun list(
        params: RecentListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<Observation>>

    /**
     * A view of [RecentServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        fun species(): SpecieServiceAsync.WithRawResponse

        fun notable(): NotableServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /data/obs/geo/recent`, but is otherwise the same as
         * [RecentServiceAsync.list].
         */
        fun list(params: RecentListParams): CompletableFuture<HttpResponseFor<List<Observation>>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        fun list(
            params: RecentListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<Observation>>>
    }
}
