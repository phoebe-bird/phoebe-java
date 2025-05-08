// File generated from our OpenAPI spec by Stainless.

package com.phoebe.api.services.async.ref.region

import com.phoebe.api.TestServerExtension
import com.phoebe.api.client.okhttp.PhoebeOkHttpClientAsync
import com.phoebe.api.models.ref.region.list.ListListParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ListServiceAsyncTest {

    @Test
    fun list() {
        val client =
            PhoebeOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val listServiceAsync = client.ref().region().list()

        val listsFuture =
            listServiceAsync.list(
                ListListParams.builder()
                    .regionType("regionType")
                    .parentRegionCode("parentRegionCode")
                    .fmt(ListListParams.Fmt.CSV)
                    .build()
            )

        val lists = listsFuture.get()
        lists.forEach { it.validate() }
    }
}
