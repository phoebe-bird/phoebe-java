// File generated from our OpenAPI spec by Stainless.

package com.phoebe.api.models.product.lists

import com.phoebe.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ListRetrieveParamsTest {

    @Test
    fun create() {
        ListRetrieveParams.builder().regionCode("regionCode").maxResults(1L).build()
    }

    @Test
    fun pathParams() {
        val params = ListRetrieveParams.builder().regionCode("regionCode").build()

        assertThat(params._pathParam(0)).isEqualTo("regionCode")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params = ListRetrieveParams.builder().regionCode("regionCode").maxResults(1L).build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("maxResults", "1").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = ListRetrieveParams.builder().regionCode("regionCode").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
