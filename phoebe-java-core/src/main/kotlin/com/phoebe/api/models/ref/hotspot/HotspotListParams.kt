// File generated from our OpenAPI spec by Stainless.

package com.phoebe.api.models.ref.hotspot

import com.fasterxml.jackson.annotation.JsonCreator
import com.phoebe.api.core.Enum
import com.phoebe.api.core.JsonField
import com.phoebe.api.core.Params
import com.phoebe.api.core.http.Headers
import com.phoebe.api.core.http.QueryParams
import com.phoebe.api.errors.PhoebeInvalidDataException
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Hotspots in a region */
class HotspotListParams
private constructor(
    private val regionCode: String?,
    private val back: Long?,
    private val fmt: Fmt?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun regionCode(): Optional<String> = Optional.ofNullable(regionCode)

    /** The number of days back to fetch hotspots. */
    fun back(): Optional<Long> = Optional.ofNullable(back)

    /** Fetch the records in CSV or JSON format. */
    fun fmt(): Optional<Fmt> = Optional.ofNullable(fmt)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): HotspotListParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [HotspotListParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [HotspotListParams]. */
    class Builder internal constructor() {

        private var regionCode: String? = null
        private var back: Long? = null
        private var fmt: Fmt? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(hotspotListParams: HotspotListParams) = apply {
            regionCode = hotspotListParams.regionCode
            back = hotspotListParams.back
            fmt = hotspotListParams.fmt
            additionalHeaders = hotspotListParams.additionalHeaders.toBuilder()
            additionalQueryParams = hotspotListParams.additionalQueryParams.toBuilder()
        }

        fun regionCode(regionCode: String?) = apply { this.regionCode = regionCode }

        /** Alias for calling [Builder.regionCode] with `regionCode.orElse(null)`. */
        fun regionCode(regionCode: Optional<String>) = regionCode(regionCode.getOrNull())

        /** The number of days back to fetch hotspots. */
        fun back(back: Long?) = apply { this.back = back }

        /**
         * Alias for [Builder.back].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun back(back: Long) = back(back as Long?)

        /** Alias for calling [Builder.back] with `back.orElse(null)`. */
        fun back(back: Optional<Long>) = back(back.getOrNull())

        /** Fetch the records in CSV or JSON format. */
        fun fmt(fmt: Fmt?) = apply { this.fmt = fmt }

        /** Alias for calling [Builder.fmt] with `fmt.orElse(null)`. */
        fun fmt(fmt: Optional<Fmt>) = fmt(fmt.getOrNull())

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
         * Returns an immutable instance of [HotspotListParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): HotspotListParams =
            HotspotListParams(
                regionCode,
                back,
                fmt,
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
                fmt?.let { put("fmt", it.toString()) }
                putAll(additionalQueryParams)
            }
            .build()

    /** Fetch the records in CSV or JSON format. */
    class Fmt @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val CSV = of("csv")

            @JvmField val JSON = of("json")

            @JvmStatic fun of(value: String) = Fmt(JsonField.of(value))
        }

        /** An enum containing [Fmt]'s known values. */
        enum class Known {
            CSV,
            JSON,
        }

        /**
         * An enum containing [Fmt]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Fmt] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            CSV,
            JSON,
            /** An enum member indicating that [Fmt] was instantiated with an unknown value. */
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
                CSV -> Value.CSV
                JSON -> Value.JSON
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
                CSV -> Known.CSV
                JSON -> Known.JSON
                else -> throw PhoebeInvalidDataException("Unknown Fmt: $value")
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

        fun validate(): Fmt = apply {
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

            return other is Fmt && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is HotspotListParams &&
            regionCode == other.regionCode &&
            back == other.back &&
            fmt == other.fmt &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(regionCode, back, fmt, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "HotspotListParams{regionCode=$regionCode, back=$back, fmt=$fmt, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
