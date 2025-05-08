// File generated from our OpenAPI spec by Stainless.

package com.phoebe.api.services.async.product

import com.phoebe.api.TestServerExtension
import com.phoebe.api.client.okhttp.PhoebeOkHttpClientAsync
import com.phoebe.api.models.product.lists.ListRetrieveParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ListServiceAsyncTest {

    @Test
    fun retrieve() {
        val client =
            PhoebeOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val listServiceAsync = client.product().lists()

        val listsFuture =
            listServiceAsync.retrieve(
                ListRetrieveParams.builder().regionCode("regionCode").maxResults(1L).build()
            )

        val lists = listsFuture.get()
        lists.forEach { it.validate() }
    }
}
