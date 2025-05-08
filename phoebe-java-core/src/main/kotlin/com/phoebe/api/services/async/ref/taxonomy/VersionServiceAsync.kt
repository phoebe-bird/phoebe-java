// File generated from our OpenAPI spec by Stainless.

package com.phoebe.api.services.async.ref.taxonomy

import com.google.errorprone.annotations.MustBeClosed
import com.phoebe.api.core.RequestOptions
import com.phoebe.api.core.http.HttpResponseFor
import com.phoebe.api.models.ref.taxonomy.versions.VersionListParams
import com.phoebe.api.models.ref.taxonomy.versions.VersionListResponse
import java.util.concurrent.CompletableFuture

interface VersionServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a list of all versions of the taxonomy, with a flag indicating which is the latest.
     */
    fun list(): CompletableFuture<List<VersionListResponse>> = list(VersionListParams.none())

    /** @see [list] */
    fun list(
        params: VersionListParams = VersionListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<VersionListResponse>>

    /** @see [list] */
    fun list(
        params: VersionListParams = VersionListParams.none()
    ): CompletableFuture<List<VersionListResponse>> = list(params, RequestOptions.none())

    /** @see [list] */
    fun list(requestOptions: RequestOptions): CompletableFuture<List<VersionListResponse>> =
        list(VersionListParams.none(), requestOptions)

    /**
     * A view of [VersionServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /ref/taxonomy/versions`, but is otherwise the same
         * as [VersionServiceAsync.list].
         */
        @MustBeClosed
        fun list(): CompletableFuture<HttpResponseFor<List<VersionListResponse>>> =
            list(VersionListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: VersionListParams = VersionListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<VersionListResponse>>>

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: VersionListParams = VersionListParams.none()
        ): CompletableFuture<HttpResponseFor<List<VersionListResponse>>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<List<VersionListResponse>>> =
            list(VersionListParams.none(), requestOptions)
    }
}
