// File generated from our OpenAPI spec by Stainless.

package com.phoebe.api.services.blocking.data.observations

import com.phoebe.api.core.ClientOptions
import com.phoebe.api.services.blocking.data.observations.nearest.GeoSpecieService
import com.phoebe.api.services.blocking.data.observations.nearest.GeoSpecieServiceImpl
import java.util.function.Consumer

class NearestServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    NearestService {

    private val withRawResponse: NearestService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val geoSpecies: GeoSpecieService by lazy { GeoSpecieServiceImpl(clientOptions) }

    override fun withRawResponse(): NearestService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): NearestService =
        NearestServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun geoSpecies(): GeoSpecieService = geoSpecies

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        NearestService.WithRawResponse {

        private val geoSpecies: GeoSpecieService.WithRawResponse by lazy {
            GeoSpecieServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): NearestService.WithRawResponse =
            NearestServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun geoSpecies(): GeoSpecieService.WithRawResponse = geoSpecies
    }
}
