// File generated from our OpenAPI spec by Stainless.

package com.phoebe.api.models.ref.taxonomy.speciesgroups

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.phoebe.api.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SpeciesGroupListResponseTest {

    @Test
    fun create() {
        val speciesGroupListResponse =
            SpeciesGroupListResponse.builder()
                .groupName("Waterfowl")
                .groupOrder(1L)
                .taxonOrderBounds(
                    listOf(listOf(211.0, 579.0), listOf(1968.0, 2063.0), listOf(16549.0, 16613.0))
                )
                .build()

        assertThat(speciesGroupListResponse.groupName()).contains("Waterfowl")
        assertThat(speciesGroupListResponse.groupOrder()).contains(1L)
        assertThat(speciesGroupListResponse.taxonOrderBounds().getOrNull())
            .containsExactly(listOf(211.0, 579.0), listOf(1968.0, 2063.0), listOf(16549.0, 16613.0))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val speciesGroupListResponse =
            SpeciesGroupListResponse.builder()
                .groupName("Waterfowl")
                .groupOrder(1L)
                .taxonOrderBounds(
                    listOf(listOf(211.0, 579.0), listOf(1968.0, 2063.0), listOf(16549.0, 16613.0))
                )
                .build()

        val roundtrippedSpeciesGroupListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(speciesGroupListResponse),
                jacksonTypeRef<SpeciesGroupListResponse>(),
            )

        assertThat(roundtrippedSpeciesGroupListResponse).isEqualTo(speciesGroupListResponse)
    }
}
