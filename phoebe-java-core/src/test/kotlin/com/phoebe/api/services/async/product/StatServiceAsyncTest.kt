// File generated from our OpenAPI spec by Stainless.

package com.phoebe.api.services.async.product

import com.phoebe.api.TestServerExtension
import com.phoebe.api.client.okhttp.PhoebeOkHttpClientAsync
import com.phoebe.api.models.product.stats.StatRetrieveParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class StatServiceAsyncTest {

    @Test
    fun retrieve() {
        val client =
            PhoebeOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val statServiceAsync = client.product().stats()

        val statFuture =
            statServiceAsync.retrieve(
                StatRetrieveParams.builder().regionCode("regionCode").y(0L).m(1L).d(1L).build()
            )

        val stat = statFuture.get()
        stat.validate()
    }
}
