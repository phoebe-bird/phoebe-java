// File generated from our OpenAPI spec by Stainless.

package com.phoebe.api.services.blocking.ref.region

import com.phoebe.api.TestServerExtension
import com.phoebe.api.client.okhttp.PhoebeOkHttpClient
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class AdjacentServiceTest {

    @Test
    fun list() {
        val client =
            PhoebeOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val adjacentService = client.ref().region().adjacent()

        val adjacents = adjacentService.list("regionCode")

        adjacents.forEach { it.validate() }
    }
}
