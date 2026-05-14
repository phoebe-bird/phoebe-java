// File generated from our OpenAPI spec by Stainless.

package com.phoebe.api.services.async.data.observations.geo

import com.phoebe.api.core.ClientOptions
import com.phoebe.api.core.RequestOptions
import com.phoebe.api.core.http.HttpResponseFor
import com.phoebe.api.models.data.observations.Observation
import com.phoebe.api.models.data.observations.geo.recent.RecentListParams
import com.phoebe.api.services.async.data.observations.geo.recent.NotableServiceAsync
import com.phoebe.api.services.async.data.observations.geo.recent.SpecieServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/**
 * The data/obs end-points are used to fetch observations submitted to eBird in checklists. There
 * are two categories of end-point: 1. Fetch observations for a specific country, region or
 * location. 2. Fetch observations for nearby locations - up to a distance of 50km. Each end-point
 * supports optional query parameters which allow you to filter the list of observations returned.
 */
interface RecentServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): RecentServiceAsync

    /**
     * The data/obs end-points are used to fetch observations submitted to eBird in checklists.
     * There are two categories of end-point: 1. Fetch observations for a specific country, region
     * or location. 2. Fetch observations for nearby locations - up to a distance of 50km. Each
     * end-point supports optional query parameters which allow you to filter the list of
     * observations returned.
     */
    fun species(): SpecieServiceAsync

    /**
     * The data/obs end-points are used to fetch observations submitted to eBird in checklists.
     * There are two categories of end-point: 1. Fetch observations for a specific country, region
     * or location. 2. Fetch observations for nearby locations - up to a distance of 50km. Each
     * end-point supports optional query parameters which allow you to filter the list of
     * observations returned.
     */
    fun notable(): NotableServiceAsync

    /**
     * Get the list of recent observations (up to 30 days ago) of birds seen at locations within a
     * radius of up to 50 kilometers, from a given set of coordinates. Results include only the most
     * recent observation for each species in the region specified.
     */
    fun list(params: RecentListParams): CompletableFuture<List<Observation>> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        params: RecentListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<Observation>>

    /**
     * A view of [RecentServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): RecentServiceAsync.WithRawResponse

        /**
         * The data/obs end-points are used to fetch observations submitted to eBird in checklists.
         * There are two categories of end-point: 1. Fetch observations for a specific country,
         * region or location. 2. Fetch observations for nearby locations - up to a distance of
         * 50km. Each end-point supports optional query parameters which allow you to filter the
         * list of observations returned.
         */
        fun species(): SpecieServiceAsync.WithRawResponse

        /**
         * The data/obs end-points are used to fetch observations submitted to eBird in checklists.
         * There are two categories of end-point: 1. Fetch observations for a specific country,
         * region or location. 2. Fetch observations for nearby locations - up to a distance of
         * 50km. Each end-point supports optional query parameters which allow you to filter the
         * list of observations returned.
         */
        fun notable(): NotableServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /data/obs/geo/recent`, but is otherwise the same as
         * [RecentServiceAsync.list].
         */
        fun list(params: RecentListParams): CompletableFuture<HttpResponseFor<List<Observation>>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            params: RecentListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<Observation>>>
    }
}
