// File generated from our OpenAPI spec by Stainless.

package com.phoebe.api.services.async.ref.taxonomy

import com.phoebe.api.TestServerExtension
import com.phoebe.api.client.okhttp.PhoebeOkHttpClientAsync
import com.phoebe.api.models.ref.taxonomy.ebird.EbirdRetrieveParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class EbirdServiceAsyncTest {

    @Test
    fun retrieve() {
        val client =
            PhoebeOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val ebirdServiceAsync = client.ref().taxonomy().ebird()

        val ebirdsFuture =
            ebirdServiceAsync.retrieve(
                EbirdRetrieveParams.builder()
                    .cat("cat")
                    .fmt(EbirdRetrieveParams.Fmt.CSV)
                    .locale("locale")
                    .species("species")
                    .version("version")
                    .build()
            )

        val ebirds = ebirdsFuture.get()
        ebirds.forEach { it.validate() }
    }
}
