// File generated from our OpenAPI spec by Stainless.

package com.phoebe.api.services.blocking.data.observations

import com.google.errorprone.annotations.MustBeClosed
import com.phoebe.api.core.RequestOptions
import com.phoebe.api.core.http.HttpResponseFor
import com.phoebe.api.models.data.observations.Observation
import com.phoebe.api.models.data.observations.recent.RecentListParams
import com.phoebe.api.services.blocking.data.observations.recent.HistoricService
import com.phoebe.api.services.blocking.data.observations.recent.NotableService
import com.phoebe.api.services.blocking.data.observations.recent.SpecieService

interface RecentService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    fun notable(): NotableService

    fun species(): SpecieService

    fun historic(): HistoricService

    /**
     * Get the list of recent observations (up to 30 days ago) of birds seen in a country, state,
     * county, or location. Results include only the most recent observation for each species in the
     * region specified.
     */
    fun list(params: RecentListParams): List<Observation> = list(params, RequestOptions.none())

    /** @see [list] */
    fun list(
        params: RecentListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<Observation>

    /** A view of [RecentService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        fun notable(): NotableService.WithRawResponse

        fun species(): SpecieService.WithRawResponse

        fun historic(): HistoricService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /data/obs/{regionCode}/recent`, but is otherwise the
         * same as [RecentService.list].
         */
        @MustBeClosed
        fun list(params: RecentListParams): HttpResponseFor<List<Observation>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: RecentListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<Observation>>
    }
}
