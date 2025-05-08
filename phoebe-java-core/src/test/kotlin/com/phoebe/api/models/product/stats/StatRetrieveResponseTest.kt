// File generated from our OpenAPI spec by Stainless.

package com.phoebe.api.models.product.stats

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.phoebe.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class StatRetrieveResponseTest {

    @Test
    fun create() {
        val statRetrieveResponse =
            StatRetrieveResponse.builder()
                .numChecklists(0L)
                .numContributors(0L)
                .numSpecies(0L)
                .build()

        assertThat(statRetrieveResponse.numChecklists()).contains(0L)
        assertThat(statRetrieveResponse.numContributors()).contains(0L)
        assertThat(statRetrieveResponse.numSpecies()).contains(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val statRetrieveResponse =
            StatRetrieveResponse.builder()
                .numChecklists(0L)
                .numContributors(0L)
                .numSpecies(0L)
                .build()

        val roundtrippedStatRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(statRetrieveResponse),
                jacksonTypeRef<StatRetrieveResponse>(),
            )

        assertThat(roundtrippedStatRetrieveResponse).isEqualTo(statRetrieveResponse)
    }
}
