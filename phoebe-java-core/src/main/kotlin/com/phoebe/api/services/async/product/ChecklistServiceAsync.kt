// File generated from our OpenAPI spec by Stainless.

package com.phoebe.api.services.async.product

import com.phoebe.api.core.ClientOptions
import com.phoebe.api.core.RequestOptions
import com.phoebe.api.core.http.HttpResponseFor
import com.phoebe.api.models.product.checklist.ChecklistViewParams
import com.phoebe.api.models.product.checklist.ChecklistViewResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/**
 * The product end-points make it easy to get the information shown in various pages on the eBird
 * web site: 1. The Top 100 contributors on a given date. 2. The checklists submitted on a given
 * date. 3. The most recent checklists submitted. 4. A summary of the checklists submitted on a
 * given date. 5. The details and all the observations of a checklist.
 */
interface ChecklistServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ChecklistServiceAsync

    /**
     * Get the details and observations of a checklist.
     *
     * #### Notes Do NOT use this to download large amounts of data. You will be banned if you do.
     * In the fields for each observation, the following fields are duplicates or obsolete and will
     * be removed at a future date: *howManyAtleast*, *howManyAtmost*, *hideFlags*, *projId*,
     * *subId*, *subnational1Code* and *present*.
     */
    fun view(subId: String): CompletableFuture<ChecklistViewResponse> =
        view(subId, ChecklistViewParams.none())

    /** @see view */
    fun view(
        subId: String,
        params: ChecklistViewParams = ChecklistViewParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ChecklistViewResponse> =
        view(params.toBuilder().subId(subId).build(), requestOptions)

    /** @see view */
    fun view(
        subId: String,
        params: ChecklistViewParams = ChecklistViewParams.none(),
    ): CompletableFuture<ChecklistViewResponse> = view(subId, params, RequestOptions.none())

    /** @see view */
    fun view(
        params: ChecklistViewParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ChecklistViewResponse>

    /** @see view */
    fun view(params: ChecklistViewParams): CompletableFuture<ChecklistViewResponse> =
        view(params, RequestOptions.none())

    /** @see view */
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
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ChecklistServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /product/checklist/view/{subId}`, but is otherwise
         * the same as [ChecklistServiceAsync.view].
         */
        fun view(subId: String): CompletableFuture<HttpResponseFor<ChecklistViewResponse>> =
            view(subId, ChecklistViewParams.none())

        /** @see view */
        fun view(
            subId: String,
            params: ChecklistViewParams = ChecklistViewParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ChecklistViewResponse>> =
            view(params.toBuilder().subId(subId).build(), requestOptions)

        /** @see view */
        fun view(
            subId: String,
            params: ChecklistViewParams = ChecklistViewParams.none(),
        ): CompletableFuture<HttpResponseFor<ChecklistViewResponse>> =
            view(subId, params, RequestOptions.none())

        /** @see view */
        fun view(
            params: ChecklistViewParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ChecklistViewResponse>>

        /** @see view */
        fun view(
            params: ChecklistViewParams
        ): CompletableFuture<HttpResponseFor<ChecklistViewResponse>> =
            view(params, RequestOptions.none())

        /** @see view */
        fun view(
            subId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ChecklistViewResponse>> =
            view(subId, ChecklistViewParams.none(), requestOptions)
    }
}
