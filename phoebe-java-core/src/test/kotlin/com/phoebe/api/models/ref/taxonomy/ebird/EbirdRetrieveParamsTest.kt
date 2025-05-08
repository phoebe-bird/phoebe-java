// File generated from our OpenAPI spec by Stainless.

package com.phoebe.api.models.ref.taxonomy.ebird

import com.phoebe.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EbirdRetrieveParamsTest {

    @Test
    fun create() {
        EbirdRetrieveParams.builder()
            .cat("cat")
            .fmt(EbirdRetrieveParams.Fmt.CSV)
            .locale("locale")
            .species("species")
            .version("version")
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            EbirdRetrieveParams.builder()
                .cat("cat")
                .fmt(EbirdRetrieveParams.Fmt.CSV)
                .locale("locale")
                .species("species")
                .version("version")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("cat", "cat")
                    .put("fmt", "csv")
                    .put("locale", "locale")
                    .put("species", "species")
                    .put("version", "version")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = EbirdRetrieveParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
