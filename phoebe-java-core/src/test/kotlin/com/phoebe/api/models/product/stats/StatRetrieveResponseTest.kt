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
            StatRetrieveResponse.builder().numChecklists(0).numContributors(0).numSpecies(0).build()

        assertThat(statRetrieveResponse.numChecklists()).contains(0)
        assertThat(statRetrieveResponse.numContributors()).contains(0)
        assertThat(statRetrieveResponse.numSpecies()).contains(0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val statRetrieveResponse =
            StatRetrieveResponse.builder().numChecklists(0).numContributors(0).numSpecies(0).build()

        val roundtrippedStatRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(statRetrieveResponse),
                jacksonTypeRef<StatRetrieveResponse>(),
            )

        assertThat(roundtrippedStatRetrieveResponse).isEqualTo(statRetrieveResponse)
    }
}
