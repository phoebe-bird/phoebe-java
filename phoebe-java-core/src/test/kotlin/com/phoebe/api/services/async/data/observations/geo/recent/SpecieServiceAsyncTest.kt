// File generated from our OpenAPI spec by Stainless.

package com.phoebe.api.services.async.data.observations.geo.recent

import com.phoebe.api.TestServerExtension
import com.phoebe.api.client.okhttp.PhoebeOkHttpClientAsync
import com.phoebe.api.models.data.observations.geo.recent.species.SpecieListParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class SpecieServiceAsyncTest {

    @Test
    fun list() {
        val client =
            PhoebeOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val specieServiceAsync = client.data().observations().geo().recent().species()

        val observationsFuture =
            specieServiceAsync.list(
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

        val observations = observationsFuture.get()
        observations.forEach { it.validate() }
    }
}
