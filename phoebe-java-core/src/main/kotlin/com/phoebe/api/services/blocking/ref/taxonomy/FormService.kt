// File generated from our OpenAPI spec by Stainless.

package com.phoebe.api.services.blocking.ref.taxonomy

import com.google.errorprone.annotations.MustBeClosed
import com.phoebe.api.core.RequestOptions
import com.phoebe.api.core.http.HttpResponseFor
import com.phoebe.api.models.ref.taxonomy.forms.FormListParams

interface FormService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * For a species, get the list of subspecies recognised in the taxonomy. The results include the
     * species that was passed in.
     */
    fun list(params: FormListParams): List<String> = list(params, RequestOptions.none())

    /** @see [list] */
    fun list(
        params: FormListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<String>

    /** A view of [FormService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /ref/taxon/forms/{speciesCode}`, but is otherwise
         * the same as [FormService.list].
         */
        @MustBeClosed
        fun list(params: FormListParams): HttpResponseFor<List<String>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: FormListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<String>>
    }
}
