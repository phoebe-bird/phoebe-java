// File generated from our OpenAPI spec by Stainless.

package com.phoebe.api.models.ref.taxonomy.locales

import com.phoebe.api.core.http.Headers
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LocaleListParamsTest {

    @Test
    fun create() {
        LocaleListParams.builder().acceptLanguage("en").build()
    }

    @Test
    fun headers() {
        val params = LocaleListParams.builder().acceptLanguage("en").build()

        val headers = params._headers()

        assertThat(headers).isEqualTo(Headers.builder().put("Accept-Language", "en").build())
    }

    @Test
    fun headersWithoutOptionalFields() {
        val params = LocaleListParams.builder().build()

        val headers = params._headers()

        assertThat(headers).isEqualTo(Headers.builder().build())
    }
}
