// File generated from our OpenAPI spec by Stainless.

package com.phoebe.api.models.ref.taxonomy.versions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.phoebe.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class VersionListResponseTest {

    @Test
    fun create() {
        val versionListResponse =
            VersionListResponse.builder().authorityVer(2017.0).latest(true).build()

        assertThat(versionListResponse.authorityVer()).contains(2017.0)
        assertThat(versionListResponse.latest()).contains(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val versionListResponse =
            VersionListResponse.builder().authorityVer(2017.0).latest(true).build()

        val roundtrippedVersionListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(versionListResponse),
                jacksonTypeRef<VersionListResponse>(),
            )

        assertThat(roundtrippedVersionListResponse).isEqualTo(versionListResponse)
    }
}
