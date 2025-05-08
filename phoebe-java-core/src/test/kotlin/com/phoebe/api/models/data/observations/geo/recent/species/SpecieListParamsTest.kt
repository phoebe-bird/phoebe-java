// File generated from our OpenAPI spec by Stainless.

package com.phoebe.api.models.data.observations.geo.recent.species

import com.phoebe.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SpecieListParamsTest {

    @Test
    fun create() {
        SpecieListParams.builder()
            .speciesCode("speciesCode")
            .lat(-90.0)
            .lng(-180.0)
            .back(1L)
            .dist(0L)
            .hotspot(true)
            .includeProvisional(true)
            .maxResults(1L)
            .sppLocale("sppLocale")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            SpecieListParams.builder().speciesCode("speciesCode").lat(-90.0).lng(-180.0).build()

        assertThat(params._pathParam(0)).isEqualTo("speciesCode")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            SpecieListParams.builder()
                .speciesCode("speciesCode")
                .lat(-90.0)
                .lng(-180.0)
                .back(1L)
                .dist(0L)
                .hotspot(true)
                .includeProvisional(true)
                .maxResults(1L)
                .sppLocale("sppLocale")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("lat", "-90.0")
                    .put("lng", "-180.0")
                    .put("back", "1")
                    .put("dist", "0")
                    .put("hotspot", "true")
                    .put("includeProvisional", "true")
                    .put("maxResults", "1")
                    .put("sppLocale", "sppLocale")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            SpecieListParams.builder().speciesCode("speciesCode").lat(-90.0).lng(-180.0).build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(QueryParams.builder().put("lat", "-90.0").put("lng", "-180.0").build())
    }
}
