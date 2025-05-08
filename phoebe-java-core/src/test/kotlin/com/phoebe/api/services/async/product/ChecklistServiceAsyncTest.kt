// File generated from our OpenAPI spec by Stainless.

package com.phoebe.api.services.async.product

import com.phoebe.api.TestServerExtension
import com.phoebe.api.client.okhttp.PhoebeOkHttpClientAsync
import com.phoebe.api.models.product.checklist.ChecklistViewParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ChecklistServiceAsyncTest {

    @Test
    fun view() {
        val client =
            PhoebeOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val checklistServiceAsync = client.product().checklist()

        val responseFuture =
            checklistServiceAsync.view(ChecklistViewParams.builder().subId("subId").build())

        val response = responseFuture.get()
        response.validate()
    }
}
