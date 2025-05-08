// File generated from our OpenAPI spec by Stainless.

package com.phoebe.api.models.data.observations.recent.historic

import com.phoebe.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class HistoricListParamsTest {

    @Test
    fun create() {
        HistoricListParams.builder()
            .regionCode("regionCode")
            .y(0L)
            .m(1L)
            .d(1L)
            .cat(HistoricListParams.Cat.SPECIES)
            .detail(HistoricListParams.Detail.SIMPLE)
            .hotspot(true)
            .includeProvisional(true)
            .maxResults(1L)
            .addR("string")
            .rank(HistoricListParams.Rank.MREC)
            .sppLocale("sppLocale")
            .build()
    }

    @Test
    fun pathParams() {
        val params = HistoricListParams.builder().regionCode("regionCode").y(0L).m(1L).d(1L).build()

        assertThat(params._pathParam(0)).isEqualTo("regionCode")
        assertThat(params._pathParam(1)).isEqualTo("0")
        assertThat(params._pathParam(2)).isEqualTo("1")
        assertThat(params._pathParam(3)).isEqualTo("1")
        // out-of-bound path param
        assertThat(params._pathParam(4)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            HistoricListParams.builder()
                .regionCode("regionCode")
                .y(0L)
                .m(1L)
                .d(1L)
                .cat(HistoricListParams.Cat.SPECIES)
                .detail(HistoricListParams.Detail.SIMPLE)
                .hotspot(true)
                .includeProvisional(true)
                .maxResults(1L)
                .addR("string")
                .rank(HistoricListParams.Rank.MREC)
                .sppLocale("sppLocale")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("cat", "species")
                    .put("detail", "simple")
                    .put("hotspot", "true")
                    .put("includeProvisional", "true")
                    .put("maxResults", "1")
                    .put("r", listOf("string").joinToString(","))
                    .put("rank", "mrec")
                    .put("sppLocale", "sppLocale")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = HistoricListParams.builder().regionCode("regionCode").y(0L).m(1L).d(1L).build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
