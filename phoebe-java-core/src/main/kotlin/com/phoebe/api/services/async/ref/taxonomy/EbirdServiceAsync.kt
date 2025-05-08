// File generated from our OpenAPI spec by Stainless.

package com.phoebe.api.services.async.ref.taxonomy

import com.google.errorprone.annotations.MustBeClosed
import com.phoebe.api.core.RequestOptions
import com.phoebe.api.core.http.HttpResponseFor
import com.phoebe.api.models.ref.taxonomy.ebird.EbirdRetrieveParams
import com.phoebe.api.models.ref.taxonomy.ebird.EbirdRetrieveResponse
import java.util.concurrent.CompletableFuture

interface EbirdServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Get the taxonomy used by eBird. #### Notes Each entry in the taxonomy contains a species code
     * for example, barswa for Barn Swallow. You can download the taxonomy for selected species
     * using the _species_ query parameter with a comma separating each code. Otherwise the full
     * taxonomy is downloaded.
     */
    fun retrieve(): CompletableFuture<List<EbirdRetrieveResponse>> =
        retrieve(EbirdRetrieveParams.none())

    /** @see [retrieve] */
    fun retrieve(
        params: EbirdRetrieveParams = EbirdRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<EbirdRetrieveResponse>>

    /** @see [retrieve] */
    fun retrieve(
        params: EbirdRetrieveParams = EbirdRetrieveParams.none()
    ): CompletableFuture<List<EbirdRetrieveResponse>> = retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(requestOptions: RequestOptions): CompletableFuture<List<EbirdRetrieveResponse>> =
        retrieve(EbirdRetrieveParams.none(), requestOptions)

    /** A view of [EbirdServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /ref/taxonomy/ebird`, but is otherwise the same as
         * [EbirdServiceAsync.retrieve].
         */
        @MustBeClosed
        fun retrieve(): CompletableFuture<HttpResponseFor<List<EbirdRetrieveResponse>>> =
            retrieve(EbirdRetrieveParams.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: EbirdRetrieveParams = EbirdRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<EbirdRetrieveResponse>>>

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: EbirdRetrieveParams = EbirdRetrieveParams.none()
        ): CompletableFuture<HttpResponseFor<List<EbirdRetrieveResponse>>> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<List<EbirdRetrieveResponse>>> =
            retrieve(EbirdRetrieveParams.none(), requestOptions)
    }
}
