// File generated from our OpenAPI spec by Stainless.

package com.phoebe.api.models.ref.hotspot.info

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.phoebe.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InfoRetrieveResponseTest {

    @Test
    fun create() {
        val infoRetrieveResponse =
            InfoRetrieveResponse.builder()
                .countryCode("countryCode")
                .countryName("countryName")
                .hierarchicalName("hierarchicalName")
                .isHotspot(true)
                .lat(0.0)
                .latitude(0.0)
                .lng(0.0)
                .locId("locId")
                .locName("locName")
                .longitude(0.0)
                .name("name")
                .subnational1Code("subnational1Code")
                .subnational1Name("subnational1Name")
                .build()

        assertThat(infoRetrieveResponse.countryCode()).contains("countryCode")
        assertThat(infoRetrieveResponse.countryName()).contains("countryName")
        assertThat(infoRetrieveResponse.hierarchicalName()).contains("hierarchicalName")
        assertThat(infoRetrieveResponse.isHotspot()).contains(true)
        assertThat(infoRetrieveResponse.lat()).contains(0.0)
        assertThat(infoRetrieveResponse.latitude()).contains(0.0)
        assertThat(infoRetrieveResponse.lng()).contains(0.0)
        assertThat(infoRetrieveResponse.locId()).contains("locId")
        assertThat(infoRetrieveResponse.locName()).contains("locName")
        assertThat(infoRetrieveResponse.longitude()).contains(0.0)
        assertThat(infoRetrieveResponse.name()).contains("name")
        assertThat(infoRetrieveResponse.subnational1Code()).contains("subnational1Code")
        assertThat(infoRetrieveResponse.subnational1Name()).contains("subnational1Name")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val infoRetrieveResponse =
            InfoRetrieveResponse.builder()
                .countryCode("countryCode")
                .countryName("countryName")
                .hierarchicalName("hierarchicalName")
                .isHotspot(true)
                .lat(0.0)
                .latitude(0.0)
                .lng(0.0)
                .locId("locId")
                .locName("locName")
                .longitude(0.0)
                .name("name")
                .subnational1Code("subnational1Code")
                .subnational1Name("subnational1Name")
                .build()

        val roundtrippedInfoRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(infoRetrieveResponse),
                jacksonTypeRef<InfoRetrieveResponse>(),
            )

        assertThat(roundtrippedInfoRetrieveResponse).isEqualTo(infoRetrieveResponse)
    }
}
