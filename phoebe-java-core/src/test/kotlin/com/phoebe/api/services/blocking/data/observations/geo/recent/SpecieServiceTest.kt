// File generated from our OpenAPI spec by Stainless.

package com.phoebe.api.services.blocking.data.observations.geo.recent

import com.phoebe.api.TestServerExtension
import com.phoebe.api.client.okhttp.PhoebeOkHttpClient
import com.phoebe.api.models.data.observations.geo.recent.species.SpecieListParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class SpecieServiceTest {

    @Test
    fun list() {
        val client =
            PhoebeOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val specieService = client.data().observations().geo().recent().species()

        val observations =
            specieService.list(
                SpecieListParams.builder()
                    .speciesCode("speciesCode")
                    .lat(-90.0)
                    .lng(-180.0)
                    .back(1L)
                    .dist(0L)
                    .hotspot(true)
                    .includeProvisional(true)
                    .maxResults(1L)
                    .sppLocale("sppLocale")
                    .build()
            )

        observations.forEach { it.validate() }
    }
}
