// File generated from our OpenAPI spec by Stainless.

package com.phoebe.api.services.async.product

import com.phoebe.api.core.RequestOptions
import com.phoebe.api.core.http.HttpResponseFor
import com.phoebe.api.models.product.checklist.ChecklistViewParams
import com.phoebe.api.models.product.checklist.ChecklistViewResponse
import java.util.concurrent.CompletableFuture

interface ChecklistServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Get the details and observations of a checklist.
     *
     * #### Notes Do NOT use this to download large amounts of data. You will be banned if you do.
     * In the fields for each observation, the following fields are duplicates or obsolete and will
     * be removed at a future date: _howManyAtleast_, _howManyAtmost_, _hideFlags_, _projId_,
     * _subId_, _subnational1Code_ and _present_.
     */
    fun view(subId: String): CompletableFuture<ChecklistViewResponse> =
        view(subId, ChecklistViewParams.none())

    /** @see [view] */
    fun view(
        subId: String,
        params: ChecklistViewParams = ChecklistViewParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ChecklistViewResponse> =
        view(params.toBuilder().subId(subId).build(), requestOptions)

    /** @see [view] */
    fun view(
        subId: String,
        params: ChecklistViewParams = ChecklistViewParams.none(),
    ): CompletableFuture<ChecklistViewResponse> = view(subId, params, RequestOptions.none())

    /** @see [view] */
    fun view(
        params: ChecklistViewParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ChecklistViewResponse>

    /** @see [view] */
    fun view(params: ChecklistViewParams): CompletableFuture<ChecklistViewResponse> =
        view(params, RequestOptions.none())

    /** @see [view] */
    fun view(
        subId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<ChecklistViewResponse> =
        view(subId, ChecklistViewParams.none(), requestOptions)

    /**
     * A view of [ChecklistServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /product/checklist/view/{subId}`, but is otherwise
         * the same as [ChecklistServiceAsync.view].
         */
        fun view(subId: String): CompletableFuture<HttpResponseFor<ChecklistViewResponse>> =
            view(subId, ChecklistViewParams.none())

        /** @see [view] */
        fun view(
            subId: String,
            params: ChecklistViewParams = ChecklistViewParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ChecklistViewResponse>> =
            view(params.toBuilder().subId(subId).build(), requestOptions)

        /** @see [view] */
        fun view(
            subId: String,
            params: ChecklistViewParams = ChecklistViewParams.none(),
        ): CompletableFuture<HttpResponseFor<ChecklistViewResponse>> =
            view(subId, params, RequestOptions.none())

        /** @see [view] */
        fun view(
            params: ChecklistViewParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ChecklistViewResponse>>

        /** @see [view] */
        fun view(
            params: ChecklistViewParams
        ): CompletableFuture<HttpResponseFor<ChecklistViewResponse>> =
            view(params, RequestOptions.none())

        /** @see [view] */
        fun view(
            subId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ChecklistViewResponse>> =
            view(subId, ChecklistViewParams.none(), requestOptions)
    }
}
