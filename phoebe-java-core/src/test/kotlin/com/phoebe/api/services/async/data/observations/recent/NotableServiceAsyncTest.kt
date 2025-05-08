// File generated from our OpenAPI spec by Stainless.

package com.phoebe.api.services.async.data.observations.recent

import com.phoebe.api.TestServerExtension
import com.phoebe.api.client.okhttp.PhoebeOkHttpClientAsync
import com.phoebe.api.models.data.observations.recent.notable.NotableListParams
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
        val notableServiceAsync = client.data().observations().recent().notable()

        val observationsFuture =
            notableServiceAsync.list(
                NotableListParams.builder()
                    .regionCode("regionCode")
                    .back(1L)
                    .detail(NotableListParams.Detail.SIMPLE)
                    .hotspot(true)
                    .maxResults(1L)
                    .addR("string")
                    .sppLocale("sppLocale")
                    .build()
            )

        val observations = observationsFuture.get()
        observations.forEach { it.validate() }
    }
}
