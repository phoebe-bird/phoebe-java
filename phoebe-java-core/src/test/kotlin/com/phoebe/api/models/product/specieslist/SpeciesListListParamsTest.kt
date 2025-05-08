// File generated from our OpenAPI spec by Stainless.

package com.phoebe.api.models.product.specieslist

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SpeciesListListParamsTest {

    @Test
    fun create() {
        SpeciesListListParams.builder().regionCode("regionCode").build()
    }

    @Test
    fun pathParams() {
        val params = SpeciesListListParams.builder().regionCode("regionCode").build()

        assertThat(params._pathParam(0)).isEqualTo("regionCode")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
