// File generated from our OpenAPI spec by Stainless.

package com.phoebe.api.services.blocking.ref

import com.phoebe.api.core.ClientOptions
import com.phoebe.api.services.blocking.ref.taxonomy.EbirdService
import com.phoebe.api.services.blocking.ref.taxonomy.FormService
import com.phoebe.api.services.blocking.ref.taxonomy.LocaleService
import com.phoebe.api.services.blocking.ref.taxonomy.SpeciesGroupService
import com.phoebe.api.services.blocking.ref.taxonomy.VersionService
import java.util.function.Consumer

interface TaxonomyService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): TaxonomyService

    fun ebird(): EbirdService

    fun forms(): FormService

    fun locales(): LocaleService

    fun versions(): VersionService

    fun speciesGroups(): SpeciesGroupService

    /** A view of [TaxonomyService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): TaxonomyService.WithRawResponse

        fun ebird(): EbirdService.WithRawResponse

        fun forms(): FormService.WithRawResponse

        fun locales(): LocaleService.WithRawResponse

        fun versions(): VersionService.WithRawResponse

        fun speciesGroups(): SpeciesGroupService.WithRawResponse
    }
}
