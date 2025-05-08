// File generated from our OpenAPI spec by Stainless.

package com.phoebe.api.services.blocking.ref.region

import com.phoebe.api.TestServerExtension
import com.phoebe.api.client.okhttp.PhoebeOkHttpClient
import com.phoebe.api.models.ref.region.info.InfoRetrieveParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class InfoServiceTest {

    @Test
    fun retrieve() {
        val client =
            PhoebeOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val infoService = client.ref().region().info()

        val info =
            infoService.retrieve(
                InfoRetrieveParams.builder()
                    .regionCode("regionCode")
                    .delim("delim")
                    .regionNameFormat(InfoRetrieveParams.RegionNameFormat.DETAILED)
                    .build()
            )

        info.validate()
    }
}
