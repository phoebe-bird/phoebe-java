// File generated from our OpenAPI spec by Stainless.

package com.phoebe.api.services.async.data.observations.recent

import com.phoebe.api.TestServerExtension
import com.phoebe.api.client.okhttp.PhoebeOkHttpClientAsync
import com.phoebe.api.models.data.observations.recent.historic.HistoricListParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class HistoricServiceAsyncTest {

    @Test
    fun list() {
        val client =
            PhoebeOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val historicServiceAsync = client.data().observations().recent().historic()

        val observationsFuture =
            historicServiceAsync.list(
                HistoricListParams.builder()
                    .regionCode("regionCode")
                    .y(0L)
                    .m(1L)
                    .d(1L)
                    .cat(HistoricListParams.Cat.SPECIES)
                    .detail(HistoricListParams.Detail.SIMPLE)
                    .hotspot(true)
                    .includeProvisional(true)
                    .maxResults(1L)
                    .addR("string")
                    .rank(HistoricListParams.Rank.MREC)
                    .sppLocale("sppLocale")
                    .build()
            )

        val observations = observationsFuture.get()
        observations.forEach { it.validate() }
    }
}
