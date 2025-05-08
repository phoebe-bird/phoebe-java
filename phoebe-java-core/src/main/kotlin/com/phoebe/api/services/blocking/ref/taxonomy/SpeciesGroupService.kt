// File generated from our OpenAPI spec by Stainless.

package com.phoebe.api.services.blocking.ref.taxonomy

import com.google.errorprone.annotations.MustBeClosed
import com.phoebe.api.core.RequestOptions
import com.phoebe.api.core.http.HttpResponseFor
import com.phoebe.api.models.ref.taxonomy.speciesgroups.SpeciesGroupListParams
import com.phoebe.api.models.ref.taxonomy.speciesgroups.SpeciesGroupListResponse

interface SpeciesGroupService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Get the list of species groups, e.g. terns, finches, etc. #### Notes Merlin puts like birds
     * together, with Falcons next to Hawks, whereas eBird follows taxonomic order.
     */
    fun list(params: SpeciesGroupListParams): List<SpeciesGroupListResponse> =
        list(params, RequestOptions.none())

    /** @see [list] */
    fun list(
        params: SpeciesGroupListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<SpeciesGroupListResponse>

    /**
     * A view of [SpeciesGroupService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /ref/sppgroup/{speciesGrouping}`, but is otherwise
         * the same as [SpeciesGroupService.list].
         */
        @MustBeClosed
        fun list(params: SpeciesGroupListParams): HttpResponseFor<List<SpeciesGroupListResponse>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: SpeciesGroupListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<SpeciesGroupListResponse>>
    }
}
