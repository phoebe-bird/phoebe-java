// File generated from our OpenAPI spec by Stainless.

package com.phoebe.api.services.blocking.data.observations

import com.phoebe.api.core.ClientOptions
import com.phoebe.api.services.blocking.data.observations.geo.RecentService
import com.phoebe.api.services.blocking.data.observations.geo.RecentServiceImpl

class GeoServiceImpl internal constructor(private val clientOptions: ClientOptions) : GeoService {

    private val withRawResponse: GeoService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val recent: RecentService by lazy { RecentServiceImpl(clientOptions) }

    override fun withRawResponse(): GeoService.WithRawResponse = withRawResponse

    override fun recent(): RecentService = recent

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        GeoService.WithRawResponse {

        private val recent: RecentService.WithRawResponse by lazy {
            RecentServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun recent(): RecentService.WithRawResponse = recent
    }
}
