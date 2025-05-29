// File generated from our OpenAPI spec by Stainless.

package com.phoebe.api.services.async.ref.hotspot

import com.phoebe.api.core.RequestOptions
import com.phoebe.api.core.http.HttpResponseFor
import com.phoebe.api.models.ref.hotspot.info.InfoRetrieveParams
import com.phoebe.api.models.ref.hotspot.info.InfoRetrieveResponse
import java.util.concurrent.CompletableFuture

interface InfoServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Get information on the location of a hotspot. #### Notes This API call only works for
     * hotspots. If you pass the location code for a private location or an invalid location code
     * then an HTTP 410 (Gone) error is returned.
     */
    fun retrieve(locId: String): CompletableFuture<InfoRetrieveResponse> =
        retrieve(locId, InfoRetrieveParams.none())

    /** @see [retrieve] */
    fun retrieve(
        locId: String,
        params: InfoRetrieveParams = InfoRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InfoRetrieveResponse> =
        retrieve(params.toBuilder().locId(locId).build(), requestOptions)

    /** @see [retrieve] */
    fun retrieve(
        locId: String,
        params: InfoRetrieveParams = InfoRetrieveParams.none(),
    ): CompletableFuture<InfoRetrieveResponse> = retrieve(locId, params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: InfoRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InfoRetrieveResponse>

    /** @see [retrieve] */
    fun retrieve(params: InfoRetrieveParams): CompletableFuture<InfoRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        locId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<InfoRetrieveResponse> =
        retrieve(locId, InfoRetrieveParams.none(), requestOptions)

    /** A view of [InfoServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /ref/hotspot/info/{locId}`, but is otherwise the
         * same as [InfoServiceAsync.retrieve].
         */
        fun retrieve(locId: String): CompletableFuture<HttpResponseFor<InfoRetrieveResponse>> =
            retrieve(locId, InfoRetrieveParams.none())

        /** @see [retrieve] */
        fun retrieve(
            locId: String,
            params: InfoRetrieveParams = InfoRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InfoRetrieveResponse>> =
            retrieve(params.toBuilder().locId(locId).build(), requestOptions)

        /** @see [retrieve] */
        fun retrieve(
            locId: String,
            params: InfoRetrieveParams = InfoRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<InfoRetrieveResponse>> =
            retrieve(locId, params, RequestOptions.none())

        /** @see [retrieve] */
        fun retrieve(
            params: InfoRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InfoRetrieveResponse>>

        /** @see [retrieve] */
        fun retrieve(
            params: InfoRetrieveParams
        ): CompletableFuture<HttpResponseFor<InfoRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        fun retrieve(
            locId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<InfoRetrieveResponse>> =
            retrieve(locId, InfoRetrieveParams.none(), requestOptions)
    }
}
