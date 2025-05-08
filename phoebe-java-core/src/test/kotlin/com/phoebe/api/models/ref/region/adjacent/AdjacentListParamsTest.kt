// File generated from our OpenAPI spec by Stainless.

package com.phoebe.api.models.ref.region.adjacent

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AdjacentListParamsTest {

    @Test
    fun create() {
        AdjacentListParams.builder().regionCode("regionCode").build()
    }

    @Test
    fun pathParams() {
        val params = AdjacentListParams.builder().regionCode("regionCode").build()

        assertThat(params._pathParam(0)).isEqualTo("regionCode")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
