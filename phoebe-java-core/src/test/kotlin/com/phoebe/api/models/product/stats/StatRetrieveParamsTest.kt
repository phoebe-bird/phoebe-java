// File generated from our OpenAPI spec by Stainless.

package com.phoebe.api.models.product.stats

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class StatRetrieveParamsTest {

    @Test
    fun create() {
        StatRetrieveParams.builder().regionCode("regionCode").y(0L).m(1L).d(1L).build()
    }

    @Test
    fun pathParams() {
        val params = StatRetrieveParams.builder().regionCode("regionCode").y(0L).m(1L).d(1L).build()

        assertThat(params._pathParam(0)).isEqualTo("regionCode")
        assertThat(params._pathParam(1)).isEqualTo("0")
        assertThat(params._pathParam(2)).isEqualTo("1")
        assertThat(params._pathParam(3)).isEqualTo("1")
        // out-of-bound path param
        assertThat(params._pathParam(4)).isEqualTo("")
    }
}
