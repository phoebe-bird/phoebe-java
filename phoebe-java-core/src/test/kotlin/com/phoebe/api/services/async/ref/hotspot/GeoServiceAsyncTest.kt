// File generated from our OpenAPI spec by Stainless.

package com.phoebe.api.services.async.ref.hotspot

import com.phoebe.api.TestServerExtension
import com.phoebe.api.client.okhttp.PhoebeOkHttpClientAsync
import com.phoebe.api.models.ref.hotspot.geo.GeoRetrieveParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class GeoServiceAsyncTest {

    @Test
    fun retrieve() {
        val client =
            PhoebeOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val geoServiceAsync = client.ref().hotspot().geo()

        val geosFuture =
            geoServiceAsync.retrieve(
                GeoRetrieveParams.builder()
                    .lat(-90.0)
                    .lng(-180.0)
                    .back(1L)
                    .dist(0L)
                    .fmt(GeoRetrieveParams.Fmt.CSV)
                    .build()
            )

        val geos = geosFuture.get()
        geos.forEach { it.validate() }
    }
}
