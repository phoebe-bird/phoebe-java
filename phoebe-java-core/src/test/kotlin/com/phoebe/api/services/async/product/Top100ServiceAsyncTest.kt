// File generated from our OpenAPI spec by Stainless.

package com.phoebe.api.services.async.product

import com.phoebe.api.TestServerExtension
import com.phoebe.api.client.okhttp.PhoebeOkHttpClientAsync
import com.phoebe.api.models.product.top100.Top100RetrieveParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class Top100ServiceAsyncTest {

    @Test
    fun retrieve() {
        val client =
            PhoebeOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val top100ServiceAsync = client.product().top100()

        val top100sFuture =
            top100ServiceAsync.retrieve(
                Top100RetrieveParams.builder()
                    .regionCode("regionCode")
                    .y(0L)
                    .m(1L)
                    .d(1L)
                    .maxResults(1L)
                    .rankedBy(Top100RetrieveParams.RankedBy.SPP)
                    .build()
            )

        val top100s = top100sFuture.get()
        top100s.forEach { it.validate() }
    }
}
