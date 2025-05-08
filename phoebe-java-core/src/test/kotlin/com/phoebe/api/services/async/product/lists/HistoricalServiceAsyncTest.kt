// File generated from our OpenAPI spec by Stainless.

package com.phoebe.api.services.async.product.lists

import com.phoebe.api.TestServerExtension
import com.phoebe.api.client.okhttp.PhoebeOkHttpClientAsync
import com.phoebe.api.models.product.lists.historical.HistoricalRetrieveParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class HistoricalServiceAsyncTest {

    @Test
    fun retrieve() {
        val client =
            PhoebeOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val historicalServiceAsync = client.product().lists().historical()

        val historicalsFuture =
            historicalServiceAsync.retrieve(
                HistoricalRetrieveParams.builder()
                    .regionCode("regionCode")
                    .y(0L)
                    .m(1L)
                    .d(1L)
                    .maxResults(1L)
                    .sortKey(HistoricalRetrieveParams.SortKey.OBS_DT)
                    .build()
            )

        val historicals = historicalsFuture.get()
        historicals.forEach { it.validate() }
    }
}
