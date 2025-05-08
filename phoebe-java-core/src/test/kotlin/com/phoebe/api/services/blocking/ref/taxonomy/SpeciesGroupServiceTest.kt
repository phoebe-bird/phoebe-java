// File generated from our OpenAPI spec by Stainless.

package com.phoebe.api.services.blocking.ref.taxonomy

import com.phoebe.api.TestServerExtension
import com.phoebe.api.client.okhttp.PhoebeOkHttpClient
import com.phoebe.api.models.ref.taxonomy.speciesgroups.SpeciesGroupListParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class SpeciesGroupServiceTest {

    @Test
    fun list() {
        val client =
            PhoebeOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val speciesGroupService = client.ref().taxonomy().speciesGroups()

        val speciesGroups =
            speciesGroupService.list(
                SpeciesGroupListParams.builder()
                    .speciesGrouping(SpeciesGroupListParams.SpeciesGrouping.MERLIN)
                    .groupNameLocale("groupNameLocale")
                    .build()
            )

        speciesGroups.forEach { it.validate() }
    }
}
