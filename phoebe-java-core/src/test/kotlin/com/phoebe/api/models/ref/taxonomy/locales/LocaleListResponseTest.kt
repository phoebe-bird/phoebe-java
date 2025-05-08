// File generated from our OpenAPI spec by Stainless.

package com.phoebe.api.models.ref.taxonomy.locales

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.phoebe.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LocaleListResponseTest {

    @Test
    fun create() {
        val localeListResponse =
            LocaleListResponse.builder()
                .code("en")
                .lastUpdated("2023-10-29 12:50")
                .name("English")
                .build()

        assertThat(localeListResponse.code()).contains("en")
        assertThat(localeListResponse.lastUpdated()).contains("2023-10-29 12:50")
        assertThat(localeListResponse.name()).contains("English")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val localeListResponse =
            LocaleListResponse.builder()
                .code("en")
                .lastUpdated("2023-10-29 12:50")
                .name("English")
                .build()

        val roundtrippedLocaleListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(localeListResponse),
                jacksonTypeRef<LocaleListResponse>(),
            )

        assertThat(roundtrippedLocaleListResponse).isEqualTo(localeListResponse)
    }
}
