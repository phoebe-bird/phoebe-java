// File generated from our OpenAPI spec by Stainless.

package com.phoebe.api.models.data.observations.geo.recent

import com.phoebe.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RecentListParamsTest {

    @Test
    fun create() {
        RecentListParams.builder()
            .lat(-90.0)
            .lng(-180.0)
            .back(1L)
            .cat(RecentListParams.Cat.SPECIES)
            .dist(0L)
            .hotspot(true)
            .includeProvisional(true)
            .maxResults(1L)
            .sort(RecentListParams.Sort.DATE)
            .sppLocale("sppLocale")
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            RecentListParams.builder()
                .lat(-90.0)
                .lng(-180.0)
                .back(1L)
                .cat(RecentListParams.Cat.SPECIES)
                .dist(0L)
                .hotspot(true)
                .includeProvisional(true)
                .maxResults(1L)
                .sort(RecentListParams.Sort.DATE)
                .sppLocale("sppLocale")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("lat", "-90.0")
                    .put("lng", "-180.0")
                    .put("back", "1")
                    .put("cat", "species")
                    .put("dist", "0")
                    .put("hotspot", "true")
                    .put("includeProvisional", "true")
                    .put("maxResults", "1")
                    .put("sort", "date")
                    .put("sppLocale", "sppLocale")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = RecentListParams.builder().lat(-90.0).lng(-180.0).build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(QueryParams.builder().put("lat", "-90.0").put("lng", "-180.0").build())
    }
}
