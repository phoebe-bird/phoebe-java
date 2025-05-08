// File generated from our OpenAPI spec by Stainless.

package com.phoebe.api.services.blocking.ref.region

import com.phoebe.api.TestServerExtension
import com.phoebe.api.client.okhttp.PhoebeOkHttpClient
import com.phoebe.api.models.ref.region.list.ListListParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ListServiceTest {

    @Test
    fun list() {
        val client =
            PhoebeOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val listService = client.ref().region().list()

        val lists =
            listService.list(
                ListListParams.builder()
                    .regionType("regionType")
                    .parentRegionCode("parentRegionCode")
                    .fmt(ListListParams.Fmt.CSV)
                    .build()
            )

        lists.forEach { it.validate() }
    }
}
