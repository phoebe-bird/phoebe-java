// File generated from our OpenAPI spec by Stainless.

package com.phoebe.api.models.ref.region.adjacent

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.phoebe.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AdjacentListResponseTest {

    @Test
    fun create() {
        val adjacentListResponse =
            AdjacentListResponse.builder().code("US-CT").name("Connecticut").build()

        assertThat(adjacentListResponse.code()).contains("US-CT")
        assertThat(adjacentListResponse.name()).contains("Connecticut")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val adjacentListResponse =
            AdjacentListResponse.builder().code("US-CT").name("Connecticut").build()

        val roundtrippedAdjacentListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(adjacentListResponse),
                jacksonTypeRef<AdjacentListResponse>(),
            )

        assertThat(roundtrippedAdjacentListResponse).isEqualTo(adjacentListResponse)
    }
}
