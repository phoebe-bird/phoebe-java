// File generated from our OpenAPI spec by Stainless.

package com.phoebe.api.models.ref.region.list

import com.phoebe.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ListListParamsTest {

    @Test
    fun create() {
        ListListParams.builder()
            .regionType("regionType")
            .parentRegionCode("parentRegionCode")
            .fmt(ListListParams.Fmt.CSV)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            ListListParams.builder()
                .regionType("regionType")
                .parentRegionCode("parentRegionCode")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("regionType")
        assertThat(params._pathParam(1)).isEqualTo("parentRegionCode")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            ListListParams.builder()
                .regionType("regionType")
                .parentRegionCode("parentRegionCode")
                .fmt(ListListParams.Fmt.CSV)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("fmt", "csv").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            ListListParams.builder()
                .regionType("regionType")
                .parentRegionCode("parentRegionCode")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
