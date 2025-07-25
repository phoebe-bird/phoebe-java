// File generated from our OpenAPI spec by Stainless.

package com.phoebe.api.services.blocking.ref.taxonomy

import com.google.errorprone.annotations.MustBeClosed
import com.phoebe.api.core.ClientOptions
import com.phoebe.api.core.RequestOptions
import com.phoebe.api.core.http.HttpResponseFor
import com.phoebe.api.models.ref.taxonomy.versions.VersionListParams
import com.phoebe.api.models.ref.taxonomy.versions.VersionListResponse
import java.util.function.Consumer

interface VersionService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): VersionService

    /**
     * Returns a list of all versions of the taxonomy, with a flag indicating which is the latest.
     */
    fun list(): List<VersionListResponse> = list(VersionListParams.none())

    /** @see list */
    fun list(
        params: VersionListParams = VersionListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<VersionListResponse>

    /** @see list */
    fun list(params: VersionListParams = VersionListParams.none()): List<VersionListResponse> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): List<VersionListResponse> =
        list(VersionListParams.none(), requestOptions)

    /** A view of [VersionService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): VersionService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /ref/taxonomy/versions`, but is otherwise the same
         * as [VersionService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<List<VersionListResponse>> = list(VersionListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: VersionListParams = VersionListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<VersionListResponse>>

        /** @see list */
        @MustBeClosed
        fun list(
            params: VersionListParams = VersionListParams.none()
        ): HttpResponseFor<List<VersionListResponse>> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<List<VersionListResponse>> =
            list(VersionListParams.none(), requestOptions)
    }
}
