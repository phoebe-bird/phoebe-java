// File generated from our OpenAPI spec by Stainless.

package com.phoebe.api.services.async.ref

import com.phoebe.api.services.async.ref.taxonomy.EbirdServiceAsync
import com.phoebe.api.services.async.ref.taxonomy.FormServiceAsync
import com.phoebe.api.services.async.ref.taxonomy.LocaleServiceAsync
import com.phoebe.api.services.async.ref.taxonomy.SpeciesGroupServiceAsync
import com.phoebe.api.services.async.ref.taxonomy.VersionServiceAsync

interface TaxonomyServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    fun ebird(): EbirdServiceAsync

    fun forms(): FormServiceAsync

    fun locales(): LocaleServiceAsync

    fun versions(): VersionServiceAsync

    fun speciesGroups(): SpeciesGroupServiceAsync

    /**
     * A view of [TaxonomyServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        fun ebird(): EbirdServiceAsync.WithRawResponse

        fun forms(): FormServiceAsync.WithRawResponse

        fun locales(): LocaleServiceAsync.WithRawResponse

        fun versions(): VersionServiceAsync.WithRawResponse

        fun speciesGroups(): SpeciesGroupServiceAsync.WithRawResponse
    }
}
