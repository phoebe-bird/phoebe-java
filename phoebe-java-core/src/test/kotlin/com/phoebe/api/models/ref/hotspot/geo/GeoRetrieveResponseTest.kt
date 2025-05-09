// File generated from our OpenAPI spec by Stainless.

package com.phoebe.api.models.ref.hotspot.geo

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.phoebe.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class GeoRetrieveResponseTest {

    @Test
    fun create() {
        val geoRetrieveResponse =
            GeoRetrieveResponse.builder()
                .countryCode("countryCode")
                .lat(0.0)
                .latestObsDt("latestObsDt")
                .lng(0.0)
                .locId("locId")
                .locName("locName")
                .numSpeciesAllTime(0)
                .subnational1Code("subnational1Code")
                .subnational2Code("subnational2Code")
                .build()

        assertThat(geoRetrieveResponse.countryCode()).contains("countryCode")
        assertThat(geoRetrieveResponse.lat()).contains(0.0)
        assertThat(geoRetrieveResponse.latestObsDt()).contains("latestObsDt")
        assertThat(geoRetrieveResponse.lng()).contains(0.0)
        assertThat(geoRetrieveResponse.locId()).contains("locId")
        assertThat(geoRetrieveResponse.locName()).contains("locName")
        assertThat(geoRetrieveResponse.numSpeciesAllTime()).contains(0)
        assertThat(geoRetrieveResponse.subnational1Code()).contains("subnational1Code")
        assertThat(geoRetrieveResponse.subnational2Code()).contains("subnational2Code")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val geoRetrieveResponse =
            GeoRetrieveResponse.builder()
                .countryCode("countryCode")
                .lat(0.0)
                .latestObsDt("latestObsDt")
                .lng(0.0)
                .locId("locId")
                .locName("locName")
                .numSpeciesAllTime(0)
                .subnational1Code("subnational1Code")
                .subnational2Code("subnational2Code")
                .build()

        val roundtrippedGeoRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(geoRetrieveResponse),
                jacksonTypeRef<GeoRetrieveResponse>(),
            )

        assertThat(roundtrippedGeoRetrieveResponse).isEqualTo(geoRetrieveResponse)
    }
}
