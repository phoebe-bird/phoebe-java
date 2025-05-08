// File generated from our OpenAPI spec by Stainless.

package com.phoebe.api.models.ref.region.info

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.phoebe.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InfoRetrieveResponseTest {

    @Test
    fun create() {
        val infoRetrieveResponse =
            InfoRetrieveResponse.builder()
                .bounds(
                    InfoRetrieveResponse.Bounds.builder()
                        .maxX(-75.764)
                        .maxY(42.896)
                        .minX(-75.764)
                        .minY(42.896)
                        .build()
                )
                .result("Madison, New York, United States")
                .build()

        assertThat(infoRetrieveResponse.bounds())
            .contains(
                InfoRetrieveResponse.Bounds.builder()
                    .maxX(-75.764)
                    .maxY(42.896)
                    .minX(-75.764)
                    .minY(42.896)
                    .build()
            )
        assertThat(infoRetrieveResponse.result()).contains("Madison, New York, United States")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val infoRetrieveResponse =
            InfoRetrieveResponse.builder()
                .bounds(
                    InfoRetrieveResponse.Bounds.builder()
                        .maxX(-75.764)
                        .maxY(42.896)
                        .minX(-75.764)
                        .minY(42.896)
                        .build()
                )
                .result("Madison, New York, United States")
                .build()

        val roundtrippedInfoRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(infoRetrieveResponse),
                jacksonTypeRef<InfoRetrieveResponse>(),
            )

        assertThat(roundtrippedInfoRetrieveResponse).isEqualTo(infoRetrieveResponse)
    }
}
