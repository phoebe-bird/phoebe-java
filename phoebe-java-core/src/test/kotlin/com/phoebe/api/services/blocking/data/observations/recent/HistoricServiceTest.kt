// File generated from our OpenAPI spec by Stainless.

package com.phoebe.api.services.blocking.data.observations.recent

import com.phoebe.api.TestServerExtension
import com.phoebe.api.client.okhttp.PhoebeOkHttpClient
import com.phoebe.api.models.data.observations.recent.historic.HistoricListParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class HistoricServiceTest {

    @Test
    fun list() {
        val client =
            PhoebeOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val historicService = client.data().observations().recent().historic()

        val observations =
            historicService.list(
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

        observations.forEach { it.validate() }
    }
}
