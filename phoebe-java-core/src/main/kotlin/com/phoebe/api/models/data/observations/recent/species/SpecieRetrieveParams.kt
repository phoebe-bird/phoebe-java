// File generated from our OpenAPI spec by Stainless.

package com.phoebe.api.models.data.observations.recent.species

import com.phoebe.api.core.Params
import com.phoebe.api.core.checkRequired
import com.phoebe.api.core.http.Headers
import com.phoebe.api.core.http.QueryParams
import com.phoebe.api.core.toImmutable
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Get the recent observations, up to 30 days ago, of a particular species in a country, region or
 * location. Results include only the most recent observation from each location in the region
 * specified.
 *
 * #### Notes
 *
 * The species code is typically a 6-letter code, e.g. cangoo for Canada Goose. You can get complete
 * set of species code from the GET eBird Taxonomy end-point.
 *
 * When using the _r_ query parameter set the _regionCode_ URL parameter to an empty string.
 */
class SpecieRetrieveParams
private constructor(
    private val regionCode: String,
    private val speciesCode: String,
    private val back: Long?,
    private val hotspot: Boolean?,
    private val includeProvisional: Boolean?,
    private val maxResults: Long?,
    private val r: List<String>?,
    private val sppLocale: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun regionCode(): String = regionCode

    fun speciesCode(): String = speciesCode

    /** The number of days back to fetch observations. */
    fun back(): Optional<Long> = Optional.ofNullable(back)

    /** Only fetch observations from hotspots */
    fun hotspot(): Optional<Boolean> = Optional.ofNullable(hotspot)

    /** Include observations which have not yet been reviewed. */
    fun includeProvisional(): Optional<Boolean> = Optional.ofNullable(includeProvisional)

    /** Only fetch this number of observations */
    fun maxResults(): Optional<Long> = Optional.ofNullable(maxResults)

    /** Fetch observations from up to 10 locations */
    fun r(): Optional<List<String>> = Optional.ofNullable(r)

    /** Use this language for species common names */
    fun sppLocale(): Optional<String> = Optional.ofNullable(sppLocale)

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [SpecieRetrieveParams].
         *
         * The following fields are required:
         * ```java
         * .regionCode()
         * .speciesCode()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [SpecieRetrieveParams]. */
    class Builder internal constructor() {

        private var regionCode: String? = null
        private var speciesCode: String? = null
        private var back: Long? = null
        private var hotspot: Boolean? = null
        private var includeProvisional: Boolean? = null
        private var maxResults: Long? = null
        private var r: MutableList<String>? = null
        private var sppLocale: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(specieRetrieveParams: SpecieRetrieveParams) = apply {
            regionCode = specieRetrieveParams.regionCode
            speciesCode = specieRetrieveParams.speciesCode
            back = specieRetrieveParams.back
            hotspot = specieRetrieveParams.hotspot
            includeProvisional = specieRetrieveParams.includeProvisional
            maxResults = specieRetrieveParams.maxResults
            r = specieRetrieveParams.r?.toMutableList()
            sppLocale = specieRetrieveParams.sppLocale
            additionalHeaders = specieRetrieveParams.additionalHeaders.toBuilder()
            additionalQueryParams = specieRetrieveParams.additionalQueryParams.toBuilder()
        }

        fun regionCode(regionCode: String) = apply { this.regionCode = regionCode }

        fun speciesCode(speciesCode: String) = apply { this.speciesCode = speciesCode }

        /** The number of days back to fetch observations. */
        fun back(back: Long?) = apply { this.back = back }

        /**
         * Alias for [Builder.back].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun back(back: Long) = back(back as Long?)

        /** Alias for calling [Builder.back] with `back.orElse(null)`. */
        fun back(back: Optional<Long>) = back(back.getOrNull())

        /** Only fetch observations from hotspots */
        fun hotspot(hotspot: Boolean?) = apply { this.hotspot = hotspot }

        /**
         * Alias for [Builder.hotspot].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun hotspot(hotspot: Boolean) = hotspot(hotspot as Boolean?)

        /** Alias for calling [Builder.hotspot] with `hotspot.orElse(null)`. */
        fun hotspot(hotspot: Optional<Boolean>) = hotspot(hotspot.getOrNull())

        /** Include observations which have not yet been reviewed. */
        fun includeProvisional(includeProvisional: Boolean?) = apply {
            this.includeProvisional = includeProvisional
        }

        /**
         * Alias for [Builder.includeProvisional].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun includeProvisional(includeProvisional: Boolean) =
            includeProvisional(includeProvisional as Boolean?)

        /**
         * Alias for calling [Builder.includeProvisional] with `includeProvisional.orElse(null)`.
         */
        fun includeProvisional(includeProvisional: Optional<Boolean>) =
            includeProvisional(includeProvisional.getOrNull())

        /** Only fetch this number of observations */
        fun maxResults(maxResults: Long?) = apply { this.maxResults = maxResults }

        /**
         * Alias for [Builder.maxResults].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun maxResults(maxResults: Long) = maxResults(maxResults as Long?)

        /** Alias for calling [Builder.maxResults] with `maxResults.orElse(null)`. */
        fun maxResults(maxResults: Optional<Long>) = maxResults(maxResults.getOrNull())

        /** Fetch observations from up to 10 locations */
        fun r(r: List<String>?) = apply { this.r = r?.toMutableList() }

        /** Alias for calling [Builder.r] with `r.orElse(null)`. */
        fun r(r: Optional<List<String>>) = r(r.getOrNull())

        /**
         * Adds a single [String] to [Builder.r].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addR(r: String) = apply { this.r = (this.r ?: mutableListOf()).apply { add(r) } }

        /** Use this language for species common names */
        fun sppLocale(sppLocale: String?) = apply { this.sppLocale = sppLocale }

        /** Alias for calling [Builder.sppLocale] with `sppLocale.orElse(null)`. */
        fun sppLocale(sppLocale: Optional<String>) = sppLocale(sppLocale.getOrNull())

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        /**
         * Returns an immutable instance of [SpecieRetrieveParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .regionCode()
         * .speciesCode()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): SpecieRetrieveParams =
            SpecieRetrieveParams(
                checkRequired("regionCode", regionCode),
                checkRequired("speciesCode", speciesCode),
                back,
                hotspot,
                includeProvisional,
                maxResults,
                r?.toImmutable(),
                sppLocale,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> regionCode
            1 -> speciesCode
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                back?.let { put("back", it.toString()) }
                hotspot?.let { put("hotspot", it.toString()) }
                includeProvisional?.let { put("includeProvisional", it.toString()) }
                maxResults?.let { put("maxResults", it.toString()) }
                r?.let { put("r", it.joinToString(",")) }
                sppLocale?.let { put("sppLocale", it) }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is SpecieRetrieveParams && regionCode == other.regionCode && speciesCode == other.speciesCode && back == other.back && hotspot == other.hotspot && includeProvisional == other.includeProvisional && maxResults == other.maxResults && r == other.r && sppLocale == other.sppLocale && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(regionCode, speciesCode, back, hotspot, includeProvisional, maxResults, r, sppLocale, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "SpecieRetrieveParams{regionCode=$regionCode, speciesCode=$speciesCode, back=$back, hotspot=$hotspot, includeProvisional=$includeProvisional, maxResults=$maxResults, r=$r, sppLocale=$sppLocale, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
