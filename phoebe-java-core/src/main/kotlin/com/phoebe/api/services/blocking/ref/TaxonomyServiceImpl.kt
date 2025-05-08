// File generated from our OpenAPI spec by Stainless.

package com.phoebe.api.services.blocking.ref

import com.phoebe.api.core.ClientOptions
import com.phoebe.api.services.blocking.ref.taxonomy.EbirdService
import com.phoebe.api.services.blocking.ref.taxonomy.EbirdServiceImpl
import com.phoebe.api.services.blocking.ref.taxonomy.FormService
import com.phoebe.api.services.blocking.ref.taxonomy.FormServiceImpl
import com.phoebe.api.services.blocking.ref.taxonomy.LocaleService
import com.phoebe.api.services.blocking.ref.taxonomy.LocaleServiceImpl
import com.phoebe.api.services.blocking.ref.taxonomy.SpeciesGroupService
import com.phoebe.api.services.blocking.ref.taxonomy.SpeciesGroupServiceImpl
import com.phoebe.api.services.blocking.ref.taxonomy.VersionService
import com.phoebe.api.services.blocking.ref.taxonomy.VersionServiceImpl

class TaxonomyServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    TaxonomyService {

    private val withRawResponse: TaxonomyService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val ebird: EbirdService by lazy { EbirdServiceImpl(clientOptions) }

    private val forms: FormService by lazy { FormServiceImpl(clientOptions) }

    private val locales: LocaleService by lazy { LocaleServiceImpl(clientOptions) }

    private val versions: VersionService by lazy { VersionServiceImpl(clientOptions) }

    private val speciesGroups: SpeciesGroupService by lazy {
        SpeciesGroupServiceImpl(clientOptions)
    }

    override fun withRawResponse(): TaxonomyService.WithRawResponse = withRawResponse

    override fun ebird(): EbirdService = ebird

    override fun forms(): FormService = forms

    override fun locales(): LocaleService = locales

    override fun versions(): VersionService = versions

    override fun speciesGroups(): SpeciesGroupService = speciesGroups

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        TaxonomyService.WithRawResponse {

        private val ebird: EbirdService.WithRawResponse by lazy {
            EbirdServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val forms: FormService.WithRawResponse by lazy {
            FormServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val locales: LocaleService.WithRawResponse by lazy {
            LocaleServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val versions: VersionService.WithRawResponse by lazy {
            VersionServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val speciesGroups: SpeciesGroupService.WithRawResponse by lazy {
            SpeciesGroupServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun ebird(): EbirdService.WithRawResponse = ebird

        override fun forms(): FormService.WithRawResponse = forms

        override fun locales(): LocaleService.WithRawResponse = locales

        override fun versions(): VersionService.WithRawResponse = versions

        override fun speciesGroups(): SpeciesGroupService.WithRawResponse = speciesGroups
    }
}
