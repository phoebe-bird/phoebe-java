// File generated from our OpenAPI spec by Stainless.

package com.phoebe.api.models.data.observations

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.phoebe.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ObservationTest {

    @Test
    fun create() {
        val observation =
            Observation.builder()
                .id(0L)
                .comName("comName")
                .firstname("firstname")
                .howMany(0L)
                .lastname("lastname")
                .lat(0.0)
                .lng(0.0)
                .locationPrivate(true)
                .locId("locId")
                .locName("locName")
                .obsDt("obsDt")
                .obsReviewed(true)
                .obsValid(true)
                .sciName("sciName")
                .speciesCode("speciesCode")
                .subId("subId")
                .build()

        assertThat(observation.id()).contains(0L)
        assertThat(observation.comName()).contains("comName")
        assertThat(observation.firstname()).contains("firstname")
        assertThat(observation.howMany()).contains(0L)
        assertThat(observation.lastname()).contains("lastname")
        assertThat(observation.lat()).contains(0.0)
        assertThat(observation.lng()).contains(0.0)
        assertThat(observation.locationPrivate()).contains(true)
        assertThat(observation.locId()).contains("locId")
        assertThat(observation.locName()).contains("locName")
        assertThat(observation.obsDt()).contains("obsDt")
        assertThat(observation.obsReviewed()).contains(true)
        assertThat(observation.obsValid()).contains(true)
        assertThat(observation.sciName()).contains("sciName")
        assertThat(observation.speciesCode()).contains("speciesCode")
        assertThat(observation.subId()).contains("subId")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val observation =
            Observation.builder()
                .id(0L)
                .comName("comName")
                .firstname("firstname")
                .howMany(0L)
                .lastname("lastname")
                .lat(0.0)
                .lng(0.0)
                .locationPrivate(true)
                .locId("locId")
                .locName("locName")
                .obsDt("obsDt")
                .obsReviewed(true)
                .obsValid(true)
                .sciName("sciName")
                .speciesCode("speciesCode")
                .subId("subId")
                .build()

        val roundtrippedObservation =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(observation),
                jacksonTypeRef<Observation>(),
            )

        assertThat(roundtrippedObservation).isEqualTo(observation)
    }
}
