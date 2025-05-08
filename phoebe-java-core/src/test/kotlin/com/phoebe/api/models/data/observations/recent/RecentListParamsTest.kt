// File generated from our OpenAPI spec by Stainless.

package com.phoebe.api.models.data.observations.recent

import com.phoebe.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RecentListParamsTest {

    @Test
    fun create() {
        RecentListParams.builder()
            .regionCode("regionCode")
            .back(1L)
            .cat(RecentListParams.Cat.SPECIES)
            .hotspot(true)
            .includeProvisional(true)
            .maxResults(1L)
            .addR("string")
            .sppLocale("sppLocale")
            .build()
    }

    @Test
    fun pathParams() {
        val params = RecentListParams.builder().regionCode("regionCode").build()

        assertThat(params._pathParam(0)).isEqualTo("regionCode")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            RecentListParams.builder()
                .regionCode("regionCode")
                .back(1L)
                .cat(RecentListParams.Cat.SPECIES)
                .hotspot(true)
                .includeProvisional(true)
                .maxResults(1L)
                .addR("string")
                .sppLocale("sppLocale")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("back", "1")
                    .put("cat", "species")
                    .put("hotspot", "true")
                    .put("includeProvisional", "true")
                    .put("maxResults", "1")
                    .put("r", listOf("string").joinToString(","))
                    .put("sppLocale", "sppLocale")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = RecentListParams.builder().regionCode("regionCode").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
