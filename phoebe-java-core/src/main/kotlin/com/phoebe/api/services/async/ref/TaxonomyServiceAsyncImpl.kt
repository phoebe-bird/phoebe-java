// File generated from our OpenAPI spec by Stainless.

package com.phoebe.api.services.async.ref

import com.phoebe.api.core.ClientOptions
import com.phoebe.api.services.async.ref.taxonomy.EbirdServiceAsync
import com.phoebe.api.services.async.ref.taxonomy.EbirdServiceAsyncImpl
import com.phoebe.api.services.async.ref.taxonomy.FormServiceAsync
import com.phoebe.api.services.async.ref.taxonomy.FormServiceAsyncImpl
import com.phoebe.api.services.async.ref.taxonomy.LocaleServiceAsync
import com.phoebe.api.services.async.ref.taxonomy.LocaleServiceAsyncImpl
import com.phoebe.api.services.async.ref.taxonomy.SpeciesGroupServiceAsync
import com.phoebe.api.services.async.ref.taxonomy.SpeciesGroupServiceAsyncImpl
import com.phoebe.api.services.async.ref.taxonomy.VersionServiceAsync
import com.phoebe.api.services.async.ref.taxonomy.VersionServiceAsyncImpl

class TaxonomyServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    TaxonomyServiceAsync {

    private val withRawResponse: TaxonomyServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val ebird: EbirdServiceAsync by lazy { EbirdServiceAsyncImpl(clientOptions) }

    private val forms: FormServiceAsync by lazy { FormServiceAsyncImpl(clientOptions) }

    private val locales: LocaleServiceAsync by lazy { LocaleServiceAsyncImpl(clientOptions) }

    private val versions: VersionServiceAsync by lazy { VersionServiceAsyncImpl(clientOptions) }

    private val speciesGroups: SpeciesGroupServiceAsync by lazy {
        SpeciesGroupServiceAsyncImpl(clientOptions)
    }

    override fun withRawResponse(): TaxonomyServiceAsync.WithRawResponse = withRawResponse

    override fun ebird(): EbirdServiceAsync = ebird

    override fun forms(): FormServiceAsync = forms

    override fun locales(): LocaleServiceAsync = locales

    override fun versions(): VersionServiceAsync = versions

    override fun speciesGroups(): SpeciesGroupServiceAsync = speciesGroups

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        TaxonomyServiceAsync.WithRawResponse {

        private val ebird: EbirdServiceAsync.WithRawResponse by lazy {
            EbirdServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val forms: FormServiceAsync.WithRawResponse by lazy {
            FormServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val locales: LocaleServiceAsync.WithRawResponse by lazy {
            LocaleServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val versions: VersionServiceAsync.WithRawResponse by lazy {
            VersionServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val speciesGroups: SpeciesGroupServiceAsync.WithRawResponse by lazy {
            SpeciesGroupServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun ebird(): EbirdServiceAsync.WithRawResponse = ebird

        override fun forms(): FormServiceAsync.WithRawResponse = forms

        override fun locales(): LocaleServiceAsync.WithRawResponse = locales

        override fun versions(): VersionServiceAsync.WithRawResponse = versions

        override fun speciesGroups(): SpeciesGroupServiceAsync.WithRawResponse = speciesGroups
    }
}
