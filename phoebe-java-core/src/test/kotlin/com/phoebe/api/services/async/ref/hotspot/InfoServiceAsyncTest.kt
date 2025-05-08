// File generated from our OpenAPI spec by Stainless.

package com.phoebe.api.services.async.ref.hotspot

import com.phoebe.api.TestServerExtension
import com.phoebe.api.client.okhttp.PhoebeOkHttpClientAsync
import com.phoebe.api.models.ref.hotspot.info.InfoRetrieveParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class InfoServiceAsyncTest {

    @Test
    fun retrieve() {
        val client =
            PhoebeOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val infoServiceAsync = client.ref().hotspot().info()

        val infoFuture =
            infoServiceAsync.retrieve(InfoRetrieveParams.builder().locId("locId").build())

        val info = infoFuture.get()
        info.validate()
    }
}
