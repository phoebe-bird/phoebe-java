// File generated from our OpenAPI spec by Stainless.

package com.phoebe.api.services.blocking.ref

import com.phoebe.api.TestServerExtension
import com.phoebe.api.client.okhttp.PhoebeOkHttpClient
import com.phoebe.api.models.ref.hotspot.HotspotListParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class HotspotServiceTest {

    @Test
    fun list() {
        val client =
            PhoebeOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val hotspotService = client.ref().hotspot()

        val hotspots =
            hotspotService.list(
                HotspotListParams.builder()
                    .regionCode("regionCode")
                    .back(1L)
                    .fmt(HotspotListParams.Fmt.CSV)
                    .build()
            )

        hotspots.forEach { it.validate() }
    }
}
