// File generated from our OpenAPI spec by Stainless.

package com.phoebe.api.services.blocking.data.observations

import com.phoebe.api.TestServerExtension
import com.phoebe.api.client.okhttp.PhoebeOkHttpClient
import com.phoebe.api.models.data.observations.recent.RecentListParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class RecentServiceTest {

    @Test
    fun list() {
        val client =
            PhoebeOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val recentService = client.data().observations().recent()

        val observations =
            recentService.list(
                RecentListParams.builder()
                    .regionCode("regionCode")
                    .back(1L)
                    .cat(RecentListParams.Cat.SPECIES)
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
