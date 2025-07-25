// File generated from our OpenAPI spec by Stainless.

package com.phoebe.api.services.blocking.ref.taxonomy

import com.google.errorprone.annotations.MustBeClosed
import com.phoebe.api.core.ClientOptions
import com.phoebe.api.core.RequestOptions
import com.phoebe.api.core.http.HttpResponseFor
import com.phoebe.api.models.ref.taxonomy.forms.FormListParams
import java.util.function.Consumer

interface FormService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): FormService

    /**
     * For a species, get the list of subspecies recognised in the taxonomy. The results include the
     * species that was passed in.
     */
    fun list(speciesCode: String): List<String> = list(speciesCode, FormListParams.none())

    /** @see list */
    fun list(
        speciesCode: String,
        params: FormListParams = FormListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<String> = list(params.toBuilder().speciesCode(speciesCode).build(), requestOptions)

    /** @see list */
    fun list(speciesCode: String, params: FormListParams = FormListParams.none()): List<String> =
        list(speciesCode, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: FormListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<String>

    /** @see list */
    fun list(params: FormListParams): List<String> = list(params, RequestOptions.none())

    /** @see list */
    fun list(speciesCode: String, requestOptions: RequestOptions): List<String> =
        list(speciesCode, FormListParams.none(), requestOptions)

    /** A view of [FormService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): FormService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /ref/taxon/forms/{speciesCode}`, but is otherwise
         * the same as [FormService.list].
         */
        @MustBeClosed
        fun list(speciesCode: String): HttpResponseFor<List<String>> =
            list(speciesCode, FormListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            speciesCode: String,
            params: FormListParams = FormListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<String>> =
            list(params.toBuilder().speciesCode(speciesCode).build(), requestOptions)

        /** @see list */
        @MustBeClosed
        fun list(
            speciesCode: String,
            params: FormListParams = FormListParams.none(),
        ): HttpResponseFor<List<String>> = list(speciesCode, params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: FormListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<String>>

        /** @see list */
        @MustBeClosed
        fun list(params: FormListParams): HttpResponseFor<List<String>> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            speciesCode: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<String>> = list(speciesCode, FormListParams.none(), requestOptions)
    }
}
