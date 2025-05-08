// File generated from our OpenAPI spec by Stainless.

package com.phoebe.api.services.async.ref.taxonomy

import com.google.errorprone.annotations.MustBeClosed
import com.phoebe.api.core.RequestOptions
import com.phoebe.api.core.http.HttpResponseFor
import com.phoebe.api.models.ref.taxonomy.locales.LocaleListParams
import com.phoebe.api.models.ref.taxonomy.locales.LocaleListResponse
import java.util.concurrent.CompletableFuture

interface LocaleServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns the list of supported locale codes and names for species common names, with the last
     * time they were updated. Use the accept-language header to get translated language names when
     * available.
     *
     * NOTE: The locale codes and names are stable but the other fields in this result are not yet
     * finalized and should be used with caution.
     */
    fun list(): CompletableFuture<List<LocaleListResponse>> = list(LocaleListParams.none())

    /** @see [list] */
    fun list(
        params: LocaleListParams = LocaleListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<LocaleListResponse>>

    /** @see [list] */
    fun list(
        params: LocaleListParams = LocaleListParams.none()
    ): CompletableFuture<List<LocaleListResponse>> = list(params, RequestOptions.none())

    /** @see [list] */
    fun list(requestOptions: RequestOptions): CompletableFuture<List<LocaleListResponse>> =
        list(LocaleListParams.none(), requestOptions)

    /**
     * A view of [LocaleServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /ref/taxa-locales/ebird`, but is otherwise the same
         * as [LocaleServiceAsync.list].
         */
        @MustBeClosed
        fun list(): CompletableFuture<HttpResponseFor<List<LocaleListResponse>>> =
            list(LocaleListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: LocaleListParams = LocaleListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<LocaleListResponse>>>

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: LocaleListParams = LocaleListParams.none()
        ): CompletableFuture<HttpResponseFor<List<LocaleListResponse>>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<List<LocaleListResponse>>> =
            list(LocaleListParams.none(), requestOptions)
    }
}
