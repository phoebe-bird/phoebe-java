// File generated from our OpenAPI spec by Stainless.

package com.phoebe.api.services.blocking.ref.hotspot

import com.phoebe.api.TestServerExtension
import com.phoebe.api.client.okhttp.PhoebeOkHttpClient
import com.phoebe.api.models.ref.hotspot.geo.GeoRetrieveParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class GeoServiceTest {

    @Test
    fun retrieve() {
        val client =
            PhoebeOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val geoService = client.ref().hotspot().geo()

        val geos =
            geoService.retrieve(
                GeoRetrieveParams.builder()
                    .lat(-90.0f)
                    .lng(-180.0f)
                    .back(1L)
                    .dist(0L)
                    .fmt(GeoRetrieveParams.Fmt.CSV)
                    .build()
            )

        geos.forEach { it.validate() }
    }
}
