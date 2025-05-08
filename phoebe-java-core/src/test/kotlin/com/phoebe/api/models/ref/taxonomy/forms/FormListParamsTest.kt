// File generated from our OpenAPI spec by Stainless.

package com.phoebe.api.models.ref.taxonomy.forms

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FormListParamsTest {

    @Test
    fun create() {
        FormListParams.builder().speciesCode("speciesCode").build()
    }

    @Test
    fun pathParams() {
        val params = FormListParams.builder().speciesCode("speciesCode").build()

        assertThat(params._pathParam(0)).isEqualTo("speciesCode")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
