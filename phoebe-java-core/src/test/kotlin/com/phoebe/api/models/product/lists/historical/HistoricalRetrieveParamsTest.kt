// File generated from our OpenAPI spec by Stainless.

package com.phoebe.api.models.product.lists.historical

import com.phoebe.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class HistoricalRetrieveParamsTest {

    @Test
    fun create() {
        HistoricalRetrieveParams.builder()
            .regionCode("regionCode")
            .y(0L)
            .m(1L)
            .d(1L)
            .maxResults(1L)
            .sortKey(HistoricalRetrieveParams.SortKey.OBS_DT)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            HistoricalRetrieveParams.builder().regionCode("regionCode").y(0L).m(1L).d(1L).build()

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
            HistoricalRetrieveParams.builder()
                .regionCode("regionCode")
                .y(0L)
                .m(1L)
                .d(1L)
                .maxResults(1L)
                .sortKey(HistoricalRetrieveParams.SortKey.OBS_DT)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder().put("maxResults", "1").put("sortKey", "obs_dt").build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            HistoricalRetrieveParams.builder().regionCode("regionCode").y(0L).m(1L).d(1L).build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
