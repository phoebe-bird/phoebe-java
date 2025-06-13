// File generated from our OpenAPI spec by Stainless.

package com.phoebe.api.services.blocking.ref.hotspot

import com.google.errorprone.annotations.MustBeClosed
import com.phoebe.api.core.ClientOptions
import com.phoebe.api.core.RequestOptions
import com.phoebe.api.core.http.HttpResponseFor
import com.phoebe.api.models.ref.hotspot.info.InfoRetrieveParams
import com.phoebe.api.models.ref.hotspot.info.InfoRetrieveResponse
import java.util.function.Consumer

interface InfoService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): InfoService

    /**
     * Get information on the location of a hotspot. #### Notes This API call only works for
     * hotspots. If you pass the location code for a private location or an invalid location code
     * then an HTTP 410 (Gone) error is returned.
     */
    fun retrieve(locId: String): InfoRetrieveResponse = retrieve(locId, InfoRetrieveParams.none())

    /** @see [retrieve] */
    fun retrieve(
        locId: String,
        params: InfoRetrieveParams = InfoRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InfoRetrieveResponse = retrieve(params.toBuilder().locId(locId).build(), requestOptions)

    /** @see [retrieve] */
    fun retrieve(
        locId: String,
        params: InfoRetrieveParams = InfoRetrieveParams.none(),
    ): InfoRetrieveResponse = retrieve(locId, params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: InfoRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InfoRetrieveResponse

    /** @see [retrieve] */
    fun retrieve(params: InfoRetrieveParams): InfoRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(locId: String, requestOptions: RequestOptions): InfoRetrieveResponse =
        retrieve(locId, InfoRetrieveParams.none(), requestOptions)

    /** A view of [InfoService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): InfoService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /ref/hotspot/info/{locId}`, but is otherwise the
         * same as [InfoService.retrieve].
         */
        @MustBeClosed
        fun retrieve(locId: String): HttpResponseFor<InfoRetrieveResponse> =
            retrieve(locId, InfoRetrieveParams.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            locId: String,
            params: InfoRetrieveParams = InfoRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InfoRetrieveResponse> =
            retrieve(params.toBuilder().locId(locId).build(), requestOptions)

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            locId: String,
            params: InfoRetrieveParams = InfoRetrieveParams.none(),
        ): HttpResponseFor<InfoRetrieveResponse> = retrieve(locId, params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: InfoRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InfoRetrieveResponse>

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(params: InfoRetrieveParams): HttpResponseFor<InfoRetrieveResponse> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            locId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<InfoRetrieveResponse> =
            retrieve(locId, InfoRetrieveParams.none(), requestOptions)
    }
}
