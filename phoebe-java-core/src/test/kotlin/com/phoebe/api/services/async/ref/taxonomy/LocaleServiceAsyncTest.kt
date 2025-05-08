// File generated from our OpenAPI spec by Stainless.

package com.phoebe.api.services.async.ref.taxonomy

import com.phoebe.api.TestServerExtension
import com.phoebe.api.client.okhttp.PhoebeOkHttpClientAsync
import com.phoebe.api.models.ref.taxonomy.locales.LocaleListParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class LocaleServiceAsyncTest {

    @Test
    fun list() {
        val client =
            PhoebeOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val localeServiceAsync = client.ref().taxonomy().locales()

        val localesFuture =
            localeServiceAsync.list(LocaleListParams.builder().acceptLanguage("en").build())

        val locales = localesFuture.get()
        locales.forEach { it.validate() }
    }
}
