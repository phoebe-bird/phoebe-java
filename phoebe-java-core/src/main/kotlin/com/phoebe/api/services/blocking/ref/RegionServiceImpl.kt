// File generated from our OpenAPI spec by Stainless.

package com.phoebe.api.services.blocking.ref

import com.phoebe.api.core.ClientOptions
import com.phoebe.api.services.blocking.ref.region.AdjacentService
import com.phoebe.api.services.blocking.ref.region.AdjacentServiceImpl
import com.phoebe.api.services.blocking.ref.region.InfoService
import com.phoebe.api.services.blocking.ref.region.InfoServiceImpl
import com.phoebe.api.services.blocking.ref.region.ListService
import com.phoebe.api.services.blocking.ref.region.ListServiceImpl

class RegionServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    RegionService {

    private val withRawResponse: RegionService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val adjacent: AdjacentService by lazy { AdjacentServiceImpl(clientOptions) }

    private val info: InfoService by lazy { InfoServiceImpl(clientOptions) }

    private val list: ListService by lazy { ListServiceImpl(clientOptions) }

    override fun withRawResponse(): RegionService.WithRawResponse = withRawResponse

    override fun adjacent(): AdjacentService = adjacent

    override fun info(): InfoService = info

    override fun list(): ListService = list

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        RegionService.WithRawResponse {

        private val adjacent: AdjacentService.WithRawResponse by lazy {
            AdjacentServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val info: InfoService.WithRawResponse by lazy {
            InfoServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val list: ListService.WithRawResponse by lazy {
            ListServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun adjacent(): AdjacentService.WithRawResponse = adjacent

        override fun info(): InfoService.WithRawResponse = info

        override fun list(): ListService.WithRawResponse = list
    }
}
