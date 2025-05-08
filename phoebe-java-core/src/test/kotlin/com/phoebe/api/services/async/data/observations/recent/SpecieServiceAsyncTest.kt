// File generated from our OpenAPI spec by Stainless.

package com.phoebe.api.services.async.data.observations.recent

import com.phoebe.api.TestServerExtension
import com.phoebe.api.client.okhttp.PhoebeOkHttpClientAsync
import com.phoebe.api.models.data.observations.recent.species.SpecieRetrieveParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class SpecieServiceAsyncTest {

    @Test
    fun retrieve() {
        val client =
            PhoebeOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val specieServiceAsync = client.data().observations().recent().species()

        val observationsFuture =
            specieServiceAsync.retrieve(
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

        val observations = observationsFuture.get()
        observations.forEach { it.validate() }
    }
}
