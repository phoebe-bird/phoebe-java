// File generated from our OpenAPI spec by Stainless.

package com.phoebe.api.services.async.ref.taxonomy

import com.phoebe.api.core.ClientOptions
import com.phoebe.api.core.RequestOptions
import com.phoebe.api.core.http.HttpResponseFor
import com.phoebe.api.models.ref.taxonomy.forms.FormListParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface FormServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): FormServiceAsync

    /**
     * For a species, get the list of subspecies recognised in the taxonomy. The results include the
     * species that was passed in.
     */
    fun list(speciesCode: String): CompletableFuture<List<String>> =
        list(speciesCode, FormListParams.none())

    /** @see list */
    fun list(
        speciesCode: String,
        params: FormListParams = FormListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<String>> =
        list(params.toBuilder().speciesCode(speciesCode).build(), requestOptions)

    /** @see list */
    fun list(
        speciesCode: String,
        params: FormListParams = FormListParams.none(),
    ): CompletableFuture<List<String>> = list(speciesCode, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: FormListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<String>>

    /** @see list */
    fun list(params: FormListParams): CompletableFuture<List<String>> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(speciesCode: String, requestOptions: RequestOptions): CompletableFuture<List<String>> =
        list(speciesCode, FormListParams.none(), requestOptions)

    /** A view of [FormServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): FormServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /ref/taxon/forms/{speciesCode}`, but is otherwise
         * the same as [FormServiceAsync.list].
         */
        fun list(speciesCode: String): CompletableFuture<HttpResponseFor<List<String>>> =
            list(speciesCode, FormListParams.none())

        /** @see list */
        fun list(
            speciesCode: String,
            params: FormListParams = FormListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<String>>> =
            list(params.toBuilder().speciesCode(speciesCode).build(), requestOptions)

        /** @see list */
        fun list(
            speciesCode: String,
            params: FormListParams = FormListParams.none(),
        ): CompletableFuture<HttpResponseFor<List<String>>> =
            list(speciesCode, params, RequestOptions.none())

        /** @see list */
        fun list(
            params: FormListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<String>>>

        /** @see list */
        fun list(params: FormListParams): CompletableFuture<HttpResponseFor<List<String>>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            speciesCode: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<List<String>>> =
            list(speciesCode, FormListParams.none(), requestOptions)
    }
}
