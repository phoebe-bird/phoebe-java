// File generated from our OpenAPI spec by Stainless.

package com.phoebe.api.models.product.top100

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.phoebe.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class Top100RetrieveResponseTest {

    @Test
    fun create() {
        val top100RetrieveResponse =
            Top100RetrieveResponse.builder()
                .numCompleteChecklists(0L)
                .numSpecies(0L)
                .profileHandle("profileHandle")
                .rowNum(0L)
                .userDisplayName("userDisplayName")
                .userId("userId")
                .build()

        assertThat(top100RetrieveResponse.numCompleteChecklists()).contains(0L)
        assertThat(top100RetrieveResponse.numSpecies()).contains(0L)
        assertThat(top100RetrieveResponse.profileHandle()).contains("profileHandle")
        assertThat(top100RetrieveResponse.rowNum()).contains(0L)
        assertThat(top100RetrieveResponse.userDisplayName()).contains("userDisplayName")
        assertThat(top100RetrieveResponse.userId()).contains("userId")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val top100RetrieveResponse =
            Top100RetrieveResponse.builder()
                .numCompleteChecklists(0L)
                .numSpecies(0L)
                .profileHandle("profileHandle")
                .rowNum(0L)
                .userDisplayName("userDisplayName")
                .userId("userId")
                .build()

        val roundtrippedTop100RetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(top100RetrieveResponse),
                jacksonTypeRef<Top100RetrieveResponse>(),
            )

        assertThat(roundtrippedTop100RetrieveResponse).isEqualTo(top100RetrieveResponse)
    }
}
