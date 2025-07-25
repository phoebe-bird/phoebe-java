// File generated from our OpenAPI spec by Stainless.

package com.phoebe.api.services.blocking.product

import com.google.errorprone.annotations.MustBeClosed
import com.phoebe.api.core.ClientOptions
import com.phoebe.api.core.RequestOptions
import com.phoebe.api.core.http.HttpResponseFor
import com.phoebe.api.models.product.checklist.ChecklistViewParams
import com.phoebe.api.models.product.checklist.ChecklistViewResponse
import java.util.function.Consumer

interface ChecklistService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ChecklistService

    /**
     * Get the details and observations of a checklist.
     *
     * #### Notes Do NOT use this to download large amounts of data. You will be banned if you do.
     * In the fields for each observation, the following fields are duplicates or obsolete and will
     * be removed at a future date: _howManyAtleast_, _howManyAtmost_, _hideFlags_, _projId_,
     * _subId_, _subnational1Code_ and _present_.
     */
    fun view(subId: String): ChecklistViewResponse = view(subId, ChecklistViewParams.none())

    /** @see view */
    fun view(
        subId: String,
        params: ChecklistViewParams = ChecklistViewParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ChecklistViewResponse = view(params.toBuilder().subId(subId).build(), requestOptions)

    /** @see view */
    fun view(
        subId: String,
        params: ChecklistViewParams = ChecklistViewParams.none(),
    ): ChecklistViewResponse = view(subId, params, RequestOptions.none())

    /** @see view */
    fun view(
        params: ChecklistViewParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ChecklistViewResponse

    /** @see view */
    fun view(params: ChecklistViewParams): ChecklistViewResponse =
        view(params, RequestOptions.none())

    /** @see view */
    fun view(subId: String, requestOptions: RequestOptions): ChecklistViewResponse =
        view(subId, ChecklistViewParams.none(), requestOptions)

    /** A view of [ChecklistService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): ChecklistService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /product/checklist/view/{subId}`, but is otherwise
         * the same as [ChecklistService.view].
         */
        @MustBeClosed
        fun view(subId: String): HttpResponseFor<ChecklistViewResponse> =
            view(subId, ChecklistViewParams.none())

        /** @see view */
        @MustBeClosed
        fun view(
            subId: String,
            params: ChecklistViewParams = ChecklistViewParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ChecklistViewResponse> =
            view(params.toBuilder().subId(subId).build(), requestOptions)

        /** @see view */
        @MustBeClosed
        fun view(
            subId: String,
            params: ChecklistViewParams = ChecklistViewParams.none(),
        ): HttpResponseFor<ChecklistViewResponse> = view(subId, params, RequestOptions.none())

        /** @see view */
        @MustBeClosed
        fun view(
            params: ChecklistViewParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ChecklistViewResponse>

        /** @see view */
        @MustBeClosed
        fun view(params: ChecklistViewParams): HttpResponseFor<ChecklistViewResponse> =
            view(params, RequestOptions.none())

        /** @see view */
        @MustBeClosed
        fun view(
            subId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ChecklistViewResponse> =
            view(subId, ChecklistViewParams.none(), requestOptions)
    }
}
