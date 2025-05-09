// File generated from our OpenAPI spec by Stainless.

package com.phoebe.api.models.ref.region.info

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

/**
 * Get information on the name and geographical area covered by a region.
 *
 * #### Notes
 *
 * Taking Madison County, New York, USA (location code US-NY-053) as an example the various values
 * for the regionNameFormat query parameter work as follows:
 *
 * | Value          | Description                                | Result                           |
 * |----------------|--------------------------------------------|----------------------------------|
 * | detailed       | return a detailed description              | Madison County, New York, US     |
 * | detailednoqual | return the name to the subnational1 level  | Madison, New York                |
 * | full           | return the full description                | Madison, New York, United States |
 * | namequal       | return the qualified name                  | Madison County                   |
 * | nameonly       | return only the name of the region         | Madison                          |
 * | revdetailed    | return the detailed description in reverse | US, New York, Madison County     |
 */
class InfoRetrieveParams
private constructor(
    private val regionCode: String?,
    private val delim: String?,
    private val regionNameFormat: RegionNameFormat?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun regionCode(): Optional<String> = Optional.ofNullable(regionCode)

    /** The characters used to separate elements in the name. */
    fun delim(): Optional<String> = Optional.ofNullable(delim)

    /** Control how the name is displayed. */
    fun regionNameFormat(): Optional<RegionNameFormat> = Optional.ofNullable(regionNameFormat)

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): InfoRetrieveParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [InfoRetrieveParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [InfoRetrieveParams]. */
    class Builder internal constructor() {

        private var regionCode: String? = null
        private var delim: String? = null
        private var regionNameFormat: RegionNameFormat? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(infoRetrieveParams: InfoRetrieveParams) = apply {
            regionCode = infoRetrieveParams.regionCode
            delim = infoRetrieveParams.delim
            regionNameFormat = infoRetrieveParams.regionNameFormat
            additionalHeaders = infoRetrieveParams.additionalHeaders.toBuilder()
            additionalQueryParams = infoRetrieveParams.additionalQueryParams.toBuilder()
        }

        fun regionCode(regionCode: String?) = apply { this.regionCode = regionCode }

        /** Alias for calling [Builder.regionCode] with `regionCode.orElse(null)`. */
        fun regionCode(regionCode: Optional<String>) = regionCode(regionCode.getOrNull())

        /** The characters used to separate elements in the name. */
        fun delim(delim: String?) = apply { this.delim = delim }

        /** Alias for calling [Builder.delim] with `delim.orElse(null)`. */
        fun delim(delim: Optional<String>) = delim(delim.getOrNull())

        /** Control how the name is displayed. */
        fun regionNameFormat(regionNameFormat: RegionNameFormat?) = apply {
            this.regionNameFormat = regionNameFormat
        }

        /** Alias for calling [Builder.regionNameFormat] with `regionNameFormat.orElse(null)`. */
        fun regionNameFormat(regionNameFormat: Optional<RegionNameFormat>) =
            regionNameFormat(regionNameFormat.getOrNull())

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
         * Returns an immutable instance of [InfoRetrieveParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): InfoRetrieveParams =
            InfoRetrieveParams(
                regionCode,
                delim,
                regionNameFormat,
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
                delim?.let { put("delim", it) }
                regionNameFormat?.let { put("regionNameFormat", it.toString()) }
                putAll(additionalQueryParams)
            }
            .build()

    /** Control how the name is displayed. */
    class RegionNameFormat @JsonCreator private constructor(private val value: JsonField<String>) :
        Enum {

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

            @JvmField val DETAILED = of("detailed")

            @JvmField val DETAILEDNOQUAL = of("detailednoqual")

            @JvmField val FULL = of("full")

            @JvmField val NAMEQUAL = of("namequal")

            @JvmField val NAMEONLY = of("nameonly")

            @JvmField val REVDETAILED = of("revdetailed")

            @JvmStatic fun of(value: String) = RegionNameFormat(JsonField.of(value))
        }

        /** An enum containing [RegionNameFormat]'s known values. */
        enum class Known {
            DETAILED,
            DETAILEDNOQUAL,
            FULL,
            NAMEQUAL,
            NAMEONLY,
            REVDETAILED,
        }

        /**
         * An enum containing [RegionNameFormat]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [RegionNameFormat] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            DETAILED,
            DETAILEDNOQUAL,
            FULL,
            NAMEQUAL,
            NAMEONLY,
            REVDETAILED,
            /**
             * An enum member indicating that [RegionNameFormat] was instantiated with an unknown
             * value.
             */
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
                DETAILED -> Value.DETAILED
                DETAILEDNOQUAL -> Value.DETAILEDNOQUAL
                FULL -> Value.FULL
                NAMEQUAL -> Value.NAMEQUAL
                NAMEONLY -> Value.NAMEONLY
                REVDETAILED -> Value.REVDETAILED
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
                DETAILED -> Known.DETAILED
                DETAILEDNOQUAL -> Known.DETAILEDNOQUAL
                FULL -> Known.FULL
                NAMEQUAL -> Known.NAMEQUAL
                NAMEONLY -> Known.NAMEONLY
                REVDETAILED -> Known.REVDETAILED
                else -> throw PhoebeInvalidDataException("Unknown RegionNameFormat: $value")
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

        fun validate(): RegionNameFormat = apply {
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

            return /* spotless:off */ other is RegionNameFormat && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is InfoRetrieveParams && regionCode == other.regionCode && delim == other.delim && regionNameFormat == other.regionNameFormat && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(regionCode, delim, regionNameFormat, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "InfoRetrieveParams{regionCode=$regionCode, delim=$delim, regionNameFormat=$regionNameFormat, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
