// File generated from our OpenAPI spec by Stainless.

package com.phoebe.api.services.async.data.observations.geo.recent

import com.phoebe.api.TestServerExtension
import com.phoebe.api.client.okhttp.PhoebeOkHttpClientAsync
import com.phoebe.api.models.data.observations.geo.recent.notable.NotableListParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class NotableServiceAsyncTest {

    @Test
    fun list() {
        val client =
            PhoebeOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val notableServiceAsync = client.data().observations().geo().recent().notable()

        val observationsFuture =
            notableServiceAsync.list(
                NotableListParams.builder()
                    .lat(-90.0)
                    .lng(-180.0)
                    .back(1L)
                    .detail(NotableListParams.Detail.SIMPLE)
                    .dist(0L)
                    .hotspot(true)
                    .maxResults(1L)
                    .sppLocale("sppLocale")
                    .build()
            )

        val observations = observationsFuture.get()
        observations.forEach { it.validate() }
    }
}
