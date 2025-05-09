// File generated from our OpenAPI spec by Stainless.

package com.phoebe.api.services.blocking.data.observations.geo.recent

import com.phoebe.api.TestServerExtension
import com.phoebe.api.client.okhttp.PhoebeOkHttpClient
import com.phoebe.api.models.data.observations.geo.recent.notable.NotableListParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class NotableServiceTest {

    @Test
    fun list() {
        val client =
            PhoebeOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val notableService = client.data().observations().geo().recent().notable()

        val observations =
            notableService.list(
                NotableListParams.builder()
                    .lat(-90.0f)
                    .lng(-180.0f)
                    .back(1L)
                    .detail(NotableListParams.Detail.SIMPLE)
                    .dist(0L)
                    .hotspot(true)
                    .maxResults(1L)
                    .sppLocale("sppLocale")
                    .build()
            )

        observations.forEach { it.validate() }
    }
}
