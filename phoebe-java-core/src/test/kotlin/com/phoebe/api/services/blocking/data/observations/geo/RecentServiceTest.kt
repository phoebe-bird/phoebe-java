// File generated from our OpenAPI spec by Stainless.

package com.phoebe.api.services.blocking.data.observations.geo

import com.phoebe.api.TestServerExtension
import com.phoebe.api.client.okhttp.PhoebeOkHttpClient
import com.phoebe.api.models.data.observations.geo.recent.RecentListParams
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
        val recentService = client.data().observations().geo().recent()

        val observations =
            recentService.list(
                RecentListParams.builder()
                    .lat(-90.0f)
                    .lng(-180.0f)
                    .back(1L)
                    .cat(RecentListParams.Cat.SPECIES)
                    .dist(0L)
                    .hotspot(true)
                    .includeProvisional(true)
                    .maxResults(1L)
                    .sort(RecentListParams.Sort.DATE)
                    .sppLocale("sppLocale")
                    .build()
            )

        observations.forEach { it.validate() }
    }
}
