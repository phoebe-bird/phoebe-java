// File generated from our OpenAPI spec by Stainless.

package com.phoebe.api.models.product.checklist

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ChecklistViewParamsTest {

    @Test
    fun create() {
        ChecklistViewParams.builder().subId("subId").build()
    }

    @Test
    fun pathParams() {
        val params = ChecklistViewParams.builder().subId("subId").build()

        assertThat(params._pathParam(0)).isEqualTo("subId")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
