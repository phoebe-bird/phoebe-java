// File generated from our OpenAPI spec by Stainless.

package com.phoebe.api.models.ref.region.info

import com.phoebe.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InfoRetrieveParamsTest {

    @Test
    fun create() {
        InfoRetrieveParams.builder()
            .regionCode("regionCode")
            .delim("delim")
            .regionNameFormat(InfoRetrieveParams.RegionNameFormat.DETAILED)
            .build()
    }

    @Test
    fun pathParams() {
        val params = InfoRetrieveParams.builder().regionCode("regionCode").build()

        assertThat(params._pathParam(0)).isEqualTo("regionCode")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            InfoRetrieveParams.builder()
                .regionCode("regionCode")
                .delim("delim")
                .regionNameFormat(InfoRetrieveParams.RegionNameFormat.DETAILED)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("delim", "delim")
                    .put("regionNameFormat", "detailed")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = InfoRetrieveParams.builder().regionCode("regionCode").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
