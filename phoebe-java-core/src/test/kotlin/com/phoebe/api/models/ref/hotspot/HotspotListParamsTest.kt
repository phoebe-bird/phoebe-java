// File generated from our OpenAPI spec by Stainless.

package com.phoebe.api.models.ref.hotspot

import com.phoebe.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class HotspotListParamsTest {

    @Test
    fun create() {
        HotspotListParams.builder()
            .regionCode("regionCode")
            .back(1L)
            .fmt(HotspotListParams.Fmt.CSV)
            .build()
    }

    @Test
    fun pathParams() {
        val params = HotspotListParams.builder().regionCode("regionCode").build()

        assertThat(params._pathParam(0)).isEqualTo("regionCode")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            HotspotListParams.builder()
                .regionCode("regionCode")
                .back(1L)
                .fmt(HotspotListParams.Fmt.CSV)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(QueryParams.builder().put("back", "1").put("fmt", "csv").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = HotspotListParams.builder().regionCode("regionCode").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
