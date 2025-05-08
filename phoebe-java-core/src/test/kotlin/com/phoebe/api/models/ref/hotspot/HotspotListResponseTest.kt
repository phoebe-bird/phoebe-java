// File generated from our OpenAPI spec by Stainless.

package com.phoebe.api.models.ref.hotspot

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.phoebe.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class HotspotListResponseTest {

    @Test
    fun create() {
        val hotspotListResponse =
            HotspotListResponse.builder()
                .countryCode("countryCode")
                .lat(0.0)
                .latestObsDt("latestObsDt")
                .lng(0.0)
                .locId("locId")
                .locName("locName")
                .numSpeciesAllTime(0L)
                .subnational1Code("subnational1Code")
                .subnational2Code("subnational2Code")
                .build()

        assertThat(hotspotListResponse.countryCode()).contains("countryCode")
        assertThat(hotspotListResponse.lat()).contains(0.0)
        assertThat(hotspotListResponse.latestObsDt()).contains("latestObsDt")
        assertThat(hotspotListResponse.lng()).contains(0.0)
        assertThat(hotspotListResponse.locId()).contains("locId")
        assertThat(hotspotListResponse.locName()).contains("locName")
        assertThat(hotspotListResponse.numSpeciesAllTime()).contains(0L)
        assertThat(hotspotListResponse.subnational1Code()).contains("subnational1Code")
        assertThat(hotspotListResponse.subnational2Code()).contains("subnational2Code")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val hotspotListResponse =
            HotspotListResponse.builder()
                .countryCode("countryCode")
                .lat(0.0)
                .latestObsDt("latestObsDt")
                .lng(0.0)
                .locId("locId")
                .locName("locName")
                .numSpeciesAllTime(0L)
                .subnational1Code("subnational1Code")
                .subnational2Code("subnational2Code")
                .build()

        val roundtrippedHotspotListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(hotspotListResponse),
                jacksonTypeRef<HotspotListResponse>(),
            )

        assertThat(roundtrippedHotspotListResponse).isEqualTo(hotspotListResponse)
    }
}
