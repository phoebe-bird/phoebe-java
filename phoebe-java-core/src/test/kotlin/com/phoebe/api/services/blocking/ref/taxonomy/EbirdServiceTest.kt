// File generated from our OpenAPI spec by Stainless.

package com.phoebe.api.services.blocking.ref.taxonomy

import com.phoebe.api.TestServerExtension
import com.phoebe.api.client.okhttp.PhoebeOkHttpClient
import com.phoebe.api.models.ref.taxonomy.ebird.EbirdRetrieveParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class EbirdServiceTest {

    @Test
    fun retrieve() {
        val client =
            PhoebeOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val ebirdService = client.ref().taxonomy().ebird()

        val ebirds =
            ebirdService.retrieve(
                EbirdRetrieveParams.builder()
                    .cat("cat")
                    .fmt(EbirdRetrieveParams.Fmt.CSV)
                    .locale("locale")
                    .species("species")
                    .version("version")
                    .build()
            )

        ebirds.forEach { it.validate() }
    }
}
