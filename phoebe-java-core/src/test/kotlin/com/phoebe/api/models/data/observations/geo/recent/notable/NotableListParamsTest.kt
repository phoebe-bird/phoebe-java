// File generated from our OpenAPI spec by Stainless.

package com.phoebe.api.models.data.observations.geo.recent.notable

import com.phoebe.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NotableListParamsTest {

    @Test
    fun create() {
        NotableListParams.builder()
            .lat(-90.0)
            .lng(-180.0)
            .back(1L)
            .detail(NotableListParams.Detail.SIMPLE)
            .dist(0L)
            .hotspot(true)
            .maxResults(1L)
            .sppLocale("sppLocale")
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            NotableListParams.builder()
                .lat(-90.0)
                .lng(-180.0)
                .back(1L)
                .detail(NotableListParams.Detail.SIMPLE)
                .dist(0L)
                .hotspot(true)
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
                    .put("detail", "simple")
                    .put("dist", "0")
                    .put("hotspot", "true")
                    .put("maxResults", "1")
                    .put("sppLocale", "sppLocale")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = NotableListParams.builder().lat(-90.0).lng(-180.0).build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(QueryParams.builder().put("lat", "-90.0").put("lng", "-180.0").build())
    }
}
