// File generated from our OpenAPI spec by Stainless.

package com.phoebe.api.models.ref.region.list

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.phoebe.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ListListResponseTest {

    @Test
    fun create() {
        val listListResponse = ListListResponse.builder().code("US-NY").name("New York").build()

        assertThat(listListResponse.code()).contains("US-NY")
        assertThat(listListResponse.name()).contains("New York")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val listListResponse = ListListResponse.builder().code("US-NY").name("New York").build()

        val roundtrippedListListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(listListResponse),
                jacksonTypeRef<ListListResponse>(),
            )

        assertThat(roundtrippedListListResponse).isEqualTo(listListResponse)
    }
}
