// File generated from our OpenAPI spec by Stainless.

package com.phoebe.api.services.blocking.data.observations.recent

import com.phoebe.api.TestServerExtension
import com.phoebe.api.client.okhttp.PhoebeOkHttpClient
import com.phoebe.api.models.data.observations.recent.species.SpecieRetrieveParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class SpecieServiceTest {

    @Test
    fun retrieve() {
        val client =
            PhoebeOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val specieService = client.data().observations().recent().species()

        val observations =
            specieService.retrieve(
                SpecieRetrieveParams.builder()
                    .regionCode("regionCode")
                    .speciesCode("speciesCode")
                    .back(1L)
                    .hotspot(true)
                    .includeProvisional(true)
                    .maxResults(1L)
                    .addR("string")
                    .sppLocale("sppLocale")
                    .build()
            )

        observations.forEach { it.validate() }
    }
}
