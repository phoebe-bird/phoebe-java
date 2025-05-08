// File generated from our OpenAPI spec by Stainless.

package com.phoebe.api.services.blocking

import com.phoebe.api.core.ClientOptions
import com.phoebe.api.services.blocking.ref.HotspotService
import com.phoebe.api.services.blocking.ref.HotspotServiceImpl
import com.phoebe.api.services.blocking.ref.RegionService
import com.phoebe.api.services.blocking.ref.RegionServiceImpl
import com.phoebe.api.services.blocking.ref.TaxonomyService
import com.phoebe.api.services.blocking.ref.TaxonomyServiceImpl

class RefServiceImpl internal constructor(private val clientOptions: ClientOptions) : RefService {

    private val withRawResponse: RefService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val region: RegionService by lazy { RegionServiceImpl(clientOptions) }

    private val hotspot: HotspotService by lazy { HotspotServiceImpl(clientOptions) }

    private val taxonomy: TaxonomyService by lazy { TaxonomyServiceImpl(clientOptions) }

    override fun withRawResponse(): RefService.WithRawResponse = withRawResponse

    override fun region(): RegionService = region

    override fun hotspot(): HotspotService = hotspot

    override fun taxonomy(): TaxonomyService = taxonomy

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        RefService.WithRawResponse {

        private val region: RegionService.WithRawResponse by lazy {
            RegionServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val hotspot: HotspotService.WithRawResponse by lazy {
            HotspotServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val taxonomy: TaxonomyService.WithRawResponse by lazy {
            TaxonomyServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun region(): RegionService.WithRawResponse = region

        override fun hotspot(): HotspotService.WithRawResponse = hotspot

        override fun taxonomy(): TaxonomyService.WithRawResponse = taxonomy
    }
}
