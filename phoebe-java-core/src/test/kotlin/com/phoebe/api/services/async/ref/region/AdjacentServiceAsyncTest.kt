// File generated from our OpenAPI spec by Stainless.

package com.phoebe.api.services.async.ref.region

import com.phoebe.api.TestServerExtension
import com.phoebe.api.client.okhttp.PhoebeOkHttpClientAsync
import com.phoebe.api.models.ref.region.adjacent.AdjacentListParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class AdjacentServiceAsyncTest {

    @Test
    fun list() {
        val client =
            PhoebeOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val adjacentServiceAsync = client.ref().region().adjacent()

        val adjacentsFuture =
            adjacentServiceAsync.list(AdjacentListParams.builder().regionCode("regionCode").build())

        val adjacents = adjacentsFuture.get()
        adjacents.forEach { it.validate() }
    }
}
