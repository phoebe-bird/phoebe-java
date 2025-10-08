// File generated from our OpenAPI spec by Stainless.

package com.phoebe.api.proguard

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.phoebe.api.client.okhttp.PhoebeOkHttpClient
import com.phoebe.api.core.jsonMapper
import com.phoebe.api.models.ref.hotspot.info.InfoRetrieveResponse
import kotlin.reflect.full.memberFunctions
import kotlin.reflect.jvm.javaMethod
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ProGuardCompatibilityTest {

    companion object {

        @JvmStatic
        fun main(args: Array<String>) {
            // To debug that we're using the right JAR.
            val jarPath = this::class.java.getProtectionDomain().codeSource.location
            println("JAR being used: $jarPath")

            // We have to manually run the test methods instead of using the JUnit runner because it
            // seems impossible to get working with R8.
            val test = ProGuardCompatibilityTest()
            test::class
                .memberFunctions
                .asSequence()
                .filter { function ->
                    function.javaMethod?.isAnnotationPresent(Test::class.java) == true
                }
                .forEach { it.call(test) }
        }
    }

    @Test
    fun proguardRules() {
        val rulesFile =
            javaClass.classLoader.getResourceAsStream("META-INF/proguard/phoebe-java-core.pro")

        assertThat(rulesFile).isNotNull()
    }

    @Test
    fun client() {
        val client = PhoebeOkHttpClient.builder().apiKey("My API Key").build()

        assertThat(client).isNotNull()
        assertThat(client.data()).isNotNull()
        assertThat(client.product()).isNotNull()
        assertThat(client.ref()).isNotNull()
    }

    @Test
    fun infoRetrieveResponseRoundtrip() {
        val jsonMapper = jsonMapper()
        val infoRetrieveResponse =
            InfoRetrieveResponse.builder()
                .countryCode("countryCode")
                .countryName("countryName")
                .hierarchicalName("hierarchicalName")
                .isHotspot(true)
                .lat(0.0)
                .latitude(0.0)
                .lng(0.0)
                .locId("locId")
                .locName("locName")
                .longitude(0.0)
                .name("name")
                .subnational1Code("subnational1Code")
                .subnational1Name("subnational1Name")
                .build()

        val roundtrippedInfoRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(infoRetrieveResponse),
                jacksonTypeRef<InfoRetrieveResponse>(),
            )

        assertThat(roundtrippedInfoRetrieveResponse).isEqualTo(infoRetrieveResponse)
    }
}
