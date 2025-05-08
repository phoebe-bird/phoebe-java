// File generated from our OpenAPI spec by Stainless.

package com.phoebe.api.services.async.data.observations.geo.recent

import com.google.errorprone.annotations.MustBeClosed
import com.phoebe.api.core.RequestOptions
import com.phoebe.api.core.http.HttpResponseFor
import com.phoebe.api.models.data.observations.Observation
import com.phoebe.api.models.data.observations.geo.recent.notable.NotableListParams
import java.util.concurrent.CompletableFuture

interface NotableServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Get the list of notable observations (up to 30 days ago) of birds seen at locations within a
     * radius of up to 50 kilometers, from a given set of coordinates. Notable observations can be
     * for locally or nationally rare species or are otherwise unusual, for example over-wintering
     * birds in a species which is normally only a summer visitor.
     */
    fun list(params: NotableListParams): CompletableFuture<List<Observation>> =
        list(params, RequestOptions.none())

    /** @see [list] */
    fun list(
        params: NotableListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<Observation>>

    /**
     * A view of [NotableServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /data/obs/geo/recent/notable`, but is otherwise the
         * same as [NotableServiceAsync.list].
         */
        @MustBeClosed
        fun list(params: NotableListParams): CompletableFuture<HttpResponseFor<List<Observation>>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: NotableListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<Observation>>>
    }
}
