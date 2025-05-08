// File generated from our OpenAPI spec by Stainless.

package com.phoebe.api.models.ref.hotspot.info

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InfoRetrieveParamsTest {

    @Test
    fun create() {
        InfoRetrieveParams.builder().locId("locId").build()
    }

    @Test
    fun pathParams() {
        val params = InfoRetrieveParams.builder().locId("locId").build()

        assertThat(params._pathParam(0)).isEqualTo("locId")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
