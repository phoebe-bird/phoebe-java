// File generated from our OpenAPI spec by Stainless.

package com.phoebe.api.models.data.observations.recent

import com.fasterxml.jackson.annotation.JsonCreator
import com.phoebe.api.core.Enum
import com.phoebe.api.core.JsonField
import com.phoebe.api.core.Params
import com.phoebe.api.core.http.Headers
import com.phoebe.api.core.http.QueryParams
import com.phoebe.api.core.toImmutable
import com.phoebe.api.errors.PhoebeInvalidDataException
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Get the list of recent observations (up to 30 days ago) of birds seen in a country, state,
 * county, or location. Results include only the most recent observation for each species in the
 * region specified.
 */
class RecentListParams
private constructor(
    private val regionCode: String?,
    private val back: Long?,
    private val cat: Cat?,
    private val hotspot: Boolean?,
    private val includeProvisional: Boolean?,
    private val maxResults: Long?,
    private val r: List<String>?,
    private val sppLocale: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun regionCode(): Optional<String> = Optional.ofNullable(regionCode)

    /** The number of days back to fetch observations. */
    fun back(): Optional<Long> = Optional.ofNullable(back)

    /** Only fetch observations from these taxonomic categories */
    fun cat(): Optional<Cat> = Optional.ofNullable(cat)

    /** Only fetch observations from hotspots */
    fun hotspot(): Optional<Boolean> = Optional.ofNullable(hotspot)

    /** Include observations which have not yet been reviewed */
    fun includeProvisional(): Optional<Boolean> = Optional.ofNullable(includeProvisional)

    /** Only fetch this number of observations */
    fun maxResults(): Optional<Long> = Optional.ofNullable(maxResults)

    /** Fetch observations from up to 10 locations */
    fun r(): Optional<List<String>> = Optional.ofNullable(r)

    /** Use this language for species common names */
    fun sppLocale(): Optional<String> = Optional.ofNullable(sppLocale)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): RecentListParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [RecentListParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [RecentListParams]. */
    class Builder internal constructor() {

        private var regionCode: String? = null
        private var back: Long? = null
        private var cat: Cat? = null
        private var hotspot: Boolean? = null
        private var includeProvisional: Boolean? = null
        private var maxResults: Long? = null
        private var r: MutableList<String>? = null
        private var sppLocale: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(recentListParams: RecentListParams) = apply {
            regionCode = recentListParams.regionCode
            back = recentListParams.back
            cat = recentListParams.cat
            hotspot = recentListParams.hotspot
            includeProvisional = recentListParams.includeProvisional
            maxResults = recentListParams.maxResults
            r = recentListParams.r?.toMutableList()
            sppLocale = recentListParams.sppLocale
            additionalHeaders = recentListParams.additionalHeaders.toBuilder()
            additionalQueryParams = recentListParams.additionalQueryParams.toBuilder()
        }

        fun regionCode(regionCode: String?) = apply { this.regionCode = regionCode }

        /** Alias for calling [Builder.regionCode] with `regionCode.orElse(null)`. */
        fun regionCode(regionCode: Optional<String>) = regionCode(regionCode.getOrNull())

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

        /** Only fetch observations from these taxonomic categories */
        fun cat(cat: Cat?) = apply { this.cat = cat }

        /** Alias for calling [Builder.cat] with `cat.orElse(null)`. */
        fun cat(cat: Optional<Cat>) = cat(cat.getOrNull())

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

        /** Include observations which have not yet been reviewed */
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
         * Returns an immutable instance of [RecentListParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): RecentListParams =
            RecentListParams(
                regionCode,
                back,
                cat,
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
            0 -> regionCode ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                back?.let { put("back", it.toString()) }
                cat?.let { put("cat", it.toString()) }
                hotspot?.let { put("hotspot", it.toString()) }
                includeProvisional?.let { put("includeProvisional", it.toString()) }
                maxResults?.let { put("maxResults", it.toString()) }
                r?.let { put("r", it.joinToString(",")) }
                sppLocale?.let { put("sppLocale", it) }
                putAll(additionalQueryParams)
            }
            .build()

    /** Only fetch observations from these taxonomic categories */
    class Cat @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val SPECIES = of("species")

            @JvmField val SLASH = of("slash")

            @JvmField val ISSF = of("issf")

            @JvmField val SPUH = of("spuh")

            @JvmField val HYBRID = of("hybrid")

            @JvmField val DOMESTIC = of("domestic")

            @JvmField val FORM = of("form")

            @JvmField val INTERGRADE = of("intergrade")

            @JvmStatic fun of(value: String) = Cat(JsonField.of(value))
        }

        /** An enum containing [Cat]'s known values. */
        enum class Known {
            SPECIES,
            SLASH,
            ISSF,
            SPUH,
            HYBRID,
            DOMESTIC,
            FORM,
            INTERGRADE,
        }

        /**
         * An enum containing [Cat]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Cat] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            SPECIES,
            SLASH,
            ISSF,
            SPUH,
            HYBRID,
            DOMESTIC,
            FORM,
            INTERGRADE,
            /** An enum member indicating that [Cat] was instantiated with an unknown value. */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                SPECIES -> Value.SPECIES
                SLASH -> Value.SLASH
                ISSF -> Value.ISSF
                SPUH -> Value.SPUH
                HYBRID -> Value.HYBRID
                DOMESTIC -> Value.DOMESTIC
                FORM -> Value.FORM
                INTERGRADE -> Value.INTERGRADE
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws PhoebeInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                SPECIES -> Known.SPECIES
                SLASH -> Known.SLASH
                ISSF -> Known.ISSF
                SPUH -> Known.SPUH
                HYBRID -> Known.HYBRID
                DOMESTIC -> Known.DOMESTIC
                FORM -> Known.FORM
                INTERGRADE -> Known.INTERGRADE
                else -> throw PhoebeInvalidDataException("Unknown Cat: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws PhoebeInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow { PhoebeInvalidDataException("Value is not a String") }

        private var validated: Boolean = false

        fun validate(): Cat = apply {
            if (validated) {
                return@apply
            }

            known()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: PhoebeInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Cat && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is RecentListParams &&
            regionCode == other.regionCode &&
            back == other.back &&
            cat == other.cat &&
            hotspot == other.hotspot &&
            includeProvisional == other.includeProvisional &&
            maxResults == other.maxResults &&
            r == other.r &&
            sppLocale == other.sppLocale &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            regionCode,
            back,
            cat,
            hotspot,
            includeProvisional,
            maxResults,
            r,
            sppLocale,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "RecentListParams{regionCode=$regionCode, back=$back, cat=$cat, hotspot=$hotspot, includeProvisional=$includeProvisional, maxResults=$maxResults, r=$r, sppLocale=$sppLocale, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
