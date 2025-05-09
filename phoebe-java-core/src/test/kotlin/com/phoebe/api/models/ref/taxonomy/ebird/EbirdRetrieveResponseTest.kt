// File generated from our OpenAPI spec by Stainless.

package com.phoebe.api.models.ref.taxonomy.ebird

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.phoebe.api.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EbirdRetrieveResponseTest {

    @Test
    fun create() {
        val ebirdRetrieveResponse =
            EbirdRetrieveResponse.builder()
                .addBandingCode("string")
                .category("category")
                .comName("comName")
                .addComNameCode("string")
                .familyCode("familyCode")
                .familyComName("familyComName")
                .familySciName("familySciName")
                .order("order")
                .sciName("sciName")
                .addSciNameCode("string")
                .speciesCode("speciesCode")
                .taxonOrder(0)
                .build()

        assertThat(ebirdRetrieveResponse.bandingCodes().getOrNull()).containsExactly("string")
        assertThat(ebirdRetrieveResponse.category()).contains("category")
        assertThat(ebirdRetrieveResponse.comName()).contains("comName")
        assertThat(ebirdRetrieveResponse.comNameCodes().getOrNull()).containsExactly("string")
        assertThat(ebirdRetrieveResponse.familyCode()).contains("familyCode")
        assertThat(ebirdRetrieveResponse.familyComName()).contains("familyComName")
        assertThat(ebirdRetrieveResponse.familySciName()).contains("familySciName")
        assertThat(ebirdRetrieveResponse.order()).contains("order")
        assertThat(ebirdRetrieveResponse.sciName()).contains("sciName")
        assertThat(ebirdRetrieveResponse.sciNameCodes().getOrNull()).containsExactly("string")
        assertThat(ebirdRetrieveResponse.speciesCode()).contains("speciesCode")
        assertThat(ebirdRetrieveResponse.taxonOrder()).contains(0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val ebirdRetrieveResponse =
            EbirdRetrieveResponse.builder()
                .addBandingCode("string")
                .category("category")
                .comName("comName")
                .addComNameCode("string")
                .familyCode("familyCode")
                .familyComName("familyComName")
                .familySciName("familySciName")
                .order("order")
                .sciName("sciName")
                .addSciNameCode("string")
                .speciesCode("speciesCode")
                .taxonOrder(0)
                .build()

        val roundtrippedEbirdRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(ebirdRetrieveResponse),
                jacksonTypeRef<EbirdRetrieveResponse>(),
            )

        assertThat(roundtrippedEbirdRetrieveResponse).isEqualTo(ebirdRetrieveResponse)
    }
}
