// File generated from our OpenAPI spec by Stainless.

package com.phoebe.api.models.ref.hotspot.geo

import com.phoebe.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class GeoRetrieveParamsTest {

    @Test
    fun create() {
        GeoRetrieveParams.builder()
            .lat(-90.0)
            .lng(-180.0)
            .back(1L)
            .dist(0L)
            .fmt(GeoRetrieveParams.Fmt.CSV)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            GeoRetrieveParams.builder()
                .lat(-90.0)
                .lng(-180.0)
                .back(1L)
                .dist(0L)
                .fmt(GeoRetrieveParams.Fmt.CSV)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("lat", "-90.0")
                    .put("lng", "-180.0")
                    .put("back", "1")
                    .put("dist", "0")
                    .put("fmt", "csv")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = GeoRetrieveParams.builder().lat(-90.0).lng(-180.0).build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(QueryParams.builder().put("lat", "-90.0").put("lng", "-180.0").build())
    }
}
