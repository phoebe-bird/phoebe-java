// File generated from our OpenAPI spec by Stainless.

package com.phoebe.api.models.data.observations.recent.notable

import com.phoebe.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NotableListParamsTest {

    @Test
    fun create() {
        NotableListParams.builder()
            .regionCode("regionCode")
            .back(1L)
            .detail(NotableListParams.Detail.SIMPLE)
            .hotspot(true)
            .maxResults(1L)
            .addR("string")
            .sppLocale("sppLocale")
            .build()
    }

    @Test
    fun pathParams() {
        val params = NotableListParams.builder().regionCode("regionCode").build()

        assertThat(params._pathParam(0)).isEqualTo("regionCode")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            NotableListParams.builder()
                .regionCode("regionCode")
                .back(1L)
                .detail(NotableListParams.Detail.SIMPLE)
                .hotspot(true)
                .maxResults(1L)
                .addR("string")
                .sppLocale("sppLocale")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("back", "1")
                    .put("detail", "simple")
                    .put("hotspot", "true")
                    .put("maxResults", "1")
                    .put("r", listOf("string").joinToString(","))
                    .put("sppLocale", "sppLocale")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = NotableListParams.builder().regionCode("regionCode").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
