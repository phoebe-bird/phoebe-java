// File generated from our OpenAPI spec by Stainless.

package com.phoebe.api.services.blocking.data.observations.recent

import com.google.errorprone.annotations.MustBeClosed
import com.phoebe.api.core.ClientOptions
import com.phoebe.api.core.RequestOptions
import com.phoebe.api.core.http.HttpResponseFor
import com.phoebe.api.models.data.observations.Observation
import com.phoebe.api.models.data.observations.recent.notable.NotableListParams
import java.util.function.Consumer

/**
 * The data/obs end-points are used to fetch observations submitted to eBird in checklists. There
 * are two categories of end-point: 1. Fetch observations for a specific country, region or
 * location. 2. Fetch observations for nearby locations - up to a distance of 50km. Each end-point
 * supports optional query parameters which allow you to filter the list of observations returned.
 */
interface NotableService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): NotableService

    /**
     * Get the list of recent, notable observations (up to 30 days ago) of birds seen in a country,
     * region or location. Notable observations can be for locally or nationally rare species or are
     * otherwise unusual, e.g. over-wintering birds in a species which is normally only a summer
     * visitor.
     */
    fun list(regionCode: String): List<Observation> = list(regionCode, NotableListParams.none())

    /** @see list */
    fun list(
        regionCode: String,
        params: NotableListParams = NotableListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<Observation> = list(params.toBuilder().regionCode(regionCode).build(), requestOptions)

    /** @see list */
    fun list(
        regionCode: String,
        params: NotableListParams = NotableListParams.none(),
    ): List<Observation> = list(regionCode, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: NotableListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<Observation>

    /** @see list */
    fun list(params: NotableListParams): List<Observation> = list(params, RequestOptions.none())

    /** @see list */
    fun list(regionCode: String, requestOptions: RequestOptions): List<Observation> =
        list(regionCode, NotableListParams.none(), requestOptions)

    /** A view of [NotableService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): NotableService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /data/obs/{regionCode}/recent/notable`, but is
         * otherwise the same as [NotableService.list].
         */
        @MustBeClosed
        fun list(regionCode: String): HttpResponseFor<List<Observation>> =
            list(regionCode, NotableListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            regionCode: String,
            params: NotableListParams = NotableListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<Observation>> =
            list(params.toBuilder().regionCode(regionCode).build(), requestOptions)

        /** @see list */
        @MustBeClosed
        fun list(
            regionCode: String,
            params: NotableListParams = NotableListParams.none(),
        ): HttpResponseFor<List<Observation>> = list(regionCode, params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: NotableListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<Observation>>

        /** @see list */
        @MustBeClosed
        fun list(params: NotableListParams): HttpResponseFor<List<Observation>> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            regionCode: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<Observation>> =
            list(regionCode, NotableListParams.none(), requestOptions)
    }
}
