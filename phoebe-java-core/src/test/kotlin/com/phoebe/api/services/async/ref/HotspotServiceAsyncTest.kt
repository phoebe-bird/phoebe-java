// File generated from our OpenAPI spec by Stainless.

package com.phoebe.api.services.async.ref

import com.phoebe.api.TestServerExtension
import com.phoebe.api.client.okhttp.PhoebeOkHttpClientAsync
import com.phoebe.api.models.ref.hotspot.HotspotListParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class HotspotServiceAsyncTest {

    @Test
    fun list() {
        val client =
            PhoebeOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val hotspotServiceAsync = client.ref().hotspot()

        val hotspotsFuture =
            hotspotServiceAsync.list(
                HotspotListParams.builder()
                    .regionCode("regionCode")
                    .back(1L)
                    .fmt(HotspotListParams.Fmt.CSV)
                    .build()
            )

        val hotspots = hotspotsFuture.get()
        hotspots.forEach { it.validate() }
    }
}
