// File generated from our OpenAPI spec by Stainless.

package com.phoebe.api.models.data.observations.geo.recent.notable

import com.fasterxml.jackson.annotation.JsonCreator
import com.phoebe.api.core.Enum
import com.phoebe.api.core.JsonField
import com.phoebe.api.core.Params
import com.phoebe.api.core.checkRequired
import com.phoebe.api.core.http.Headers
import com.phoebe.api.core.http.QueryParams
import com.phoebe.api.errors.PhoebeInvalidDataException
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Get the list of notable observations (up to 30 days ago) of birds seen at locations within a
 * radius of up to 50 kilometers, from a given set of coordinates. Notable observations can be for
 * locally or nationally rare species or are otherwise unusual, for example over-wintering birds in
 * a species which is normally only a summer visitor.
 */
class NotableListParams
private constructor(
    private val lat: Float,
    private val lng: Float,
    private val back: Long?,
    private val detail: Detail?,
    private val dist: Long?,
    private val hotspot: Boolean?,
    private val maxResults: Long?,
    private val sppLocale: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun lat(): Float = lat

    fun lng(): Float = lng

    /** The number of days back to fetch observations. */
    fun back(): Optional<Long> = Optional.ofNullable(back)

    /** Include a subset (simple), or all (full), of the fields available. */
    fun detail(): Optional<Detail> = Optional.ofNullable(detail)

    /** The search radius from the given position, in kilometers. */
    fun dist(): Optional<Long> = Optional.ofNullable(dist)

    /** Only fetch observations from hotspots */
    fun hotspot(): Optional<Boolean> = Optional.ofNullable(hotspot)

    /** Only fetch this number of observations */
    fun maxResults(): Optional<Long> = Optional.ofNullable(maxResults)

    /** Use this language for species common names */
    fun sppLocale(): Optional<String> = Optional.ofNullable(sppLocale)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [NotableListParams].
         *
         * The following fields are required:
         * ```java
         * .lat()
         * .lng()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [NotableListParams]. */
    class Builder internal constructor() {

        private var lat: Float? = null
        private var lng: Float? = null
        private var back: Long? = null
        private var detail: Detail? = null
        private var dist: Long? = null
        private var hotspot: Boolean? = null
        private var maxResults: Long? = null
        private var sppLocale: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(notableListParams: NotableListParams) = apply {
            lat = notableListParams.lat
            lng = notableListParams.lng
            back = notableListParams.back
            detail = notableListParams.detail
            dist = notableListParams.dist
            hotspot = notableListParams.hotspot
            maxResults = notableListParams.maxResults
            sppLocale = notableListParams.sppLocale
            additionalHeaders = notableListParams.additionalHeaders.toBuilder()
            additionalQueryParams = notableListParams.additionalQueryParams.toBuilder()
        }

        fun lat(lat: Float) = apply { this.lat = lat }

        fun lng(lng: Float) = apply { this.lng = lng }

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

        /** Include a subset (simple), or all (full), of the fields available. */
        fun detail(detail: Detail?) = apply { this.detail = detail }

        /** Alias for calling [Builder.detail] with `detail.orElse(null)`. */
        fun detail(detail: Optional<Detail>) = detail(detail.getOrNull())

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
         * Returns an immutable instance of [NotableListParams].
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
        fun build(): NotableListParams =
            NotableListParams(
                checkRequired("lat", lat),
                checkRequired("lng", lng),
                back,
                detail,
                dist,
                hotspot,
                maxResults,
                sppLocale,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                put("lat", lat.toString())
                put("lng", lng.toString())
                back?.let { put("back", it.toString()) }
                detail?.let { put("detail", it.toString()) }
                dist?.let { put("dist", it.toString()) }
                hotspot?.let { put("hotspot", it.toString()) }
                maxResults?.let { put("maxResults", it.toString()) }
                sppLocale?.let { put("sppLocale", it) }
                putAll(additionalQueryParams)
            }
            .build()

    /** Include a subset (simple), or all (full), of the fields available. */
    class Detail @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val SIMPLE = of("simple")

            @JvmField val FULL = of("full")

            @JvmStatic fun of(value: String) = Detail(JsonField.of(value))
        }

        /** An enum containing [Detail]'s known values. */
        enum class Known {
            SIMPLE,
            FULL,
        }

        /**
         * An enum containing [Detail]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Detail] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            SIMPLE,
            FULL,
            /** An enum member indicating that [Detail] was instantiated with an unknown value. */
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
                SIMPLE -> Value.SIMPLE
                FULL -> Value.FULL
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
                SIMPLE -> Known.SIMPLE
                FULL -> Known.FULL
                else -> throw PhoebeInvalidDataException("Unknown Detail: $value")
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

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws PhoebeInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): Detail = apply {
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

            return other is Detail && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is NotableListParams &&
            lat == other.lat &&
            lng == other.lng &&
            back == other.back &&
            detail == other.detail &&
            dist == other.dist &&
            hotspot == other.hotspot &&
            maxResults == other.maxResults &&
            sppLocale == other.sppLocale &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            lat,
            lng,
            back,
            detail,
            dist,
            hotspot,
            maxResults,
            sppLocale,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "NotableListParams{lat=$lat, lng=$lng, back=$back, detail=$detail, dist=$dist, hotspot=$hotspot, maxResults=$maxResults, sppLocale=$sppLocale, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
