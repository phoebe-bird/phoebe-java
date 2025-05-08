// File generated from our OpenAPI spec by Stainless.

package com.phoebe.api.services.blocking.product

import com.phoebe.api.TestServerExtension
import com.phoebe.api.client.okhttp.PhoebeOkHttpClient
import com.phoebe.api.models.product.top100.Top100RetrieveParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class Top100ServiceTest {

    @Test
    fun retrieve() {
        val client =
            PhoebeOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val top100Service = client.product().top100()

        val top100s =
            top100Service.retrieve(
                Top100RetrieveParams.builder()
                    .regionCode("regionCode")
                    .y(0L)
                    .m(1L)
                    .d(1L)
                    .maxResults(1L)
                    .rankedBy(Top100RetrieveParams.RankedBy.SPP)
                    .build()
            )

        top100s.forEach { it.validate() }
    }
}
