// File generated from our OpenAPI spec by Stainless.

package com.phoebe.api.models.data.observations.geo.recent.species

import com.phoebe.api.core.Params
import com.phoebe.api.core.checkRequired
import com.phoebe.api.core.http.Headers
import com.phoebe.api.core.http.QueryParams
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Get all observations of a species, seen up to 30 days ago, at any location within a radius of up
 * to 50 kilometers, from a given set of coordinates. Results include only the most recent
 * observation from each location in the region specified.
 *
 * #### URL parameters
 * | Name        | Description             |
 * |-------------|-------------------------|
 * | speciesCode | The eBird species code. |
 *
 * #### Notes
 *
 * The species code is typically a 6-letter code, e.g. horlar for Horned Lark. You can get complete
 * set of species code from the GET eBird Taxonomy end-point.
 */
class SpecieListParams
private constructor(
    private val speciesCode: String?,
    private val lat: Double,
    private val lng: Double,
    private val back: Long?,
    private val dist: Long?,
    private val hotspot: Boolean?,
    private val includeProvisional: Boolean?,
    private val maxResults: Long?,
    private val sppLocale: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun speciesCode(): Optional<String> = Optional.ofNullable(speciesCode)

    fun lat(): Double = lat

    fun lng(): Double = lng

    /** The number of days back to fetch observations. */
    fun back(): Optional<Long> = Optional.ofNullable(back)

    /** The search radius from the given position, in kilometers. */
    fun dist(): Optional<Long> = Optional.ofNullable(dist)

    /** Only fetch observations from hotspots */
    fun hotspot(): Optional<Boolean> = Optional.ofNullable(hotspot)

    /** Include observations which have not yet been reviewed. */
    fun includeProvisional(): Optional<Boolean> = Optional.ofNullable(includeProvisional)

    /** Only fetch this number of observations */
    fun maxResults(): Optional<Long> = Optional.ofNullable(maxResults)

    /** Use this language for species common names */
    fun sppLocale(): Optional<String> = Optional.ofNullable(sppLocale)

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [SpecieListParams].
         *
         * The following fields are required:
         * ```java
         * .lat()
         * .lng()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [SpecieListParams]. */
    class Builder internal constructor() {

        private var speciesCode: String? = null
        private var lat: Double? = null
        private var lng: Double? = null
        private var back: Long? = null
        private var dist: Long? = null
        private var hotspot: Boolean? = null
        private var includeProvisional: Boolean? = null
        private var maxResults: Long? = null
        private var sppLocale: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(specieListParams: SpecieListParams) = apply {
            speciesCode = specieListParams.speciesCode
            lat = specieListParams.lat
            lng = specieListParams.lng
            back = specieListParams.back
            dist = specieListParams.dist
            hotspot = specieListParams.hotspot
            includeProvisional = specieListParams.includeProvisional
            maxResults = specieListParams.maxResults
            sppLocale = specieListParams.sppLocale
            additionalHeaders = specieListParams.additionalHeaders.toBuilder()
            additionalQueryParams = specieListParams.additionalQueryParams.toBuilder()
        }

        fun speciesCode(speciesCode: String?) = apply { this.speciesCode = speciesCode }

        /** Alias for calling [Builder.speciesCode] with `speciesCode.orElse(null)`. */
        fun speciesCode(speciesCode: Optional<String>) = speciesCode(speciesCode.getOrNull())

        fun lat(lat: Double) = apply { this.lat = lat }

        fun lng(lng: Double) = apply { this.lng = lng }

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

        /** The search radius from the given position, in kilometers. */
        fun dist(dist: Long?) = apply { this.dist = dist }

        /**
         * Alias for [Builder.dist].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun dist(dist: Long) = dist(dist as Long?)

        /** Alias for calling [Builder.dist] with `dist.orElse(null)`. */
        fun dist(dist: Optional<Long>) = dist(dist.getOrNull())

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
         * Returns an immutable instance of [SpecieListParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .lat()
         * .lng()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): SpecieListParams =
            SpecieListParams(
                speciesCode,
                checkRequired("lat", lat),
                checkRequired("lng", lng),
                back,
                dist,
                hotspot,
                includeProvisional,
                maxResults,
                sppLocale,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> speciesCode ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                put("lat", lat.toString())
                put("lng", lng.toString())
                back?.let { put("back", it.toString()) }
                dist?.let { put("dist", it.toString()) }
                hotspot?.let { put("hotspot", it.toString()) }
                includeProvisional?.let { put("includeProvisional", it.toString()) }
                maxResults?.let { put("maxResults", it.toString()) }
                sppLocale?.let { put("sppLocale", it) }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is SpecieListParams && speciesCode == other.speciesCode && lat == other.lat && lng == other.lng && back == other.back && dist == other.dist && hotspot == other.hotspot && includeProvisional == other.includeProvisional && maxResults == other.maxResults && sppLocale == other.sppLocale && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(speciesCode, lat, lng, back, dist, hotspot, includeProvisional, maxResults, sppLocale, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "SpecieListParams{speciesCode=$speciesCode, lat=$lat, lng=$lng, back=$back, dist=$dist, hotspot=$hotspot, includeProvisional=$includeProvisional, maxResults=$maxResults, sppLocale=$sppLocale, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
