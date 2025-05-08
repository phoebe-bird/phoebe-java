// File generated from our OpenAPI spec by Stainless.

package com.phoebe.api.services.blocking.ref.taxonomy

import com.phoebe.api.TestServerExtension
import com.phoebe.api.client.okhttp.PhoebeOkHttpClient
import com.phoebe.api.models.ref.taxonomy.locales.LocaleListParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class LocaleServiceTest {

    @Test
    fun list() {
        val client =
            PhoebeOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val localeService = client.ref().taxonomy().locales()

        val locales = localeService.list(LocaleListParams.builder().acceptLanguage("en").build())

        locales.forEach { it.validate() }
    }
}
