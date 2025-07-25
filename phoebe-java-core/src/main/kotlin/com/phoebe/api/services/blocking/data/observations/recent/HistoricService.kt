// File generated from our OpenAPI spec by Stainless.

package com.phoebe.api.services.blocking.data.observations.recent

import com.google.errorprone.annotations.MustBeClosed
import com.phoebe.api.core.ClientOptions
import com.phoebe.api.core.RequestOptions
import com.phoebe.api.core.http.HttpResponseFor
import com.phoebe.api.models.data.observations.Observation
import com.phoebe.api.models.data.observations.recent.historic.HistoricListParams
import java.util.function.Consumer

interface HistoricService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): HistoricService

    /**
     * Get a list of all taxa seen in a country, region or location on a specific date, with the
     * specific observations determined by the "rank" parameter (defaults to latest observation on
     * the date).
     *
     * #### Notes Responses may be cached for 30 minutes
     */
    fun list(d: Long, params: HistoricListParams): List<Observation> =
        list(d, params, RequestOptions.none())

    /** @see list */
    fun list(
        d: Long,
        params: HistoricListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<Observation> = list(params.toBuilder().d(d).build(), requestOptions)

    /** @see list */
    fun list(params: HistoricListParams): List<Observation> = list(params, RequestOptions.none())

    /** @see list */
    fun list(
        params: HistoricListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<Observation>

    /** A view of [HistoricService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): HistoricService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /data/obs/{regionCode}/historic/{y}/{m}/{d}`, but is
         * otherwise the same as [HistoricService.list].
         */
        @MustBeClosed
        fun list(d: Long, params: HistoricListParams): HttpResponseFor<List<Observation>> =
            list(d, params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            d: Long,
            params: HistoricListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<Observation>> =
            list(params.toBuilder().d(d).build(), requestOptions)

        /** @see list */
        @MustBeClosed
        fun list(params: HistoricListParams): HttpResponseFor<List<Observation>> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: HistoricListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<Observation>>
    }
}
