// File generated from our OpenAPI spec by Stainless.

package com.phoebe.api.models.data.observations.recent.species

import com.phoebe.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SpecieRetrieveParamsTest {

    @Test
    fun create() {
        SpecieRetrieveParams.builder()
            .regionCode("regionCode")
            .speciesCode("speciesCode")
            .back(1L)
            .hotspot(true)
            .includeProvisional(true)
            .maxResults(1L)
            .addR("string")
            .sppLocale("sppLocale")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            SpecieRetrieveParams.builder()
                .regionCode("regionCode")
                .speciesCode("speciesCode")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("regionCode")
        assertThat(params._pathParam(1)).isEqualTo("speciesCode")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            SpecieRetrieveParams.builder()
                .regionCode("regionCode")
                .speciesCode("speciesCode")
                .back(1L)
                .hotspot(true)
                .includeProvisional(true)
                .maxResults(1L)
                .addR("string")
                .sppLocale("sppLocale")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("back", "1")
                    .put("hotspot", "true")
                    .put("includeProvisional", "true")
                    .put("maxResults", "1")
                    .put("r", listOf("string").joinToString(","))
                    .put("sppLocale", "sppLocale")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            SpecieRetrieveParams.builder()
                .regionCode("regionCode")
                .speciesCode("speciesCode")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
