// File generated from our OpenAPI spec by Stainless.

package com.phoebe.api.models.product.top100

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
 * Get the top 100 contributors on a given date for a country or region.
 *
 * #### Notes
 *
 * The results are updated every 15 minutes.
 *
 * When ordering by the number of completed checklists, the number of species seen will always be
 * zero. Similarly when ordering by the number of species seen the number of completed checklists
 * will always be zero. <b>Selected Response Field Notes</b>
 *
 * profileHandle - if a user has enabled their profile, this is the handle to reach it via
 * ebird.org/ebird/profile/{profileHandle}
 *
 * numSpecies - always zero when checklistSort parameter is true. Invalid observations ARE included
 * in this total numCompleteChecklists - always zero when checklistSort parameter is false
 */
class Top100RetrieveParams
private constructor(
    private val regionCode: String,
    private val y: Long,
    private val m: Long,
    private val d: Long?,
    private val maxResults: Long?,
    private val rankedBy: RankedBy?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun regionCode(): String = regionCode

    fun y(): Long = y

    fun m(): Long = m

    fun d(): Optional<Long> = Optional.ofNullable(d)

    /** Only fetch this number of contributors. */
    fun maxResults(): Optional<Long> = Optional.ofNullable(maxResults)

    /** Order by number of complete checklists (cl) or by number of species seen (spp). */
    fun rankedBy(): Optional<RankedBy> = Optional.ofNullable(rankedBy)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [Top100RetrieveParams].
         *
         * The following fields are required:
         * ```java
         * .regionCode()
         * .y()
         * .m()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [Top100RetrieveParams]. */
    class Builder internal constructor() {

        private var regionCode: String? = null
        private var y: Long? = null
        private var m: Long? = null
        private var d: Long? = null
        private var maxResults: Long? = null
        private var rankedBy: RankedBy? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(top100RetrieveParams: Top100RetrieveParams) = apply {
            regionCode = top100RetrieveParams.regionCode
            y = top100RetrieveParams.y
            m = top100RetrieveParams.m
            d = top100RetrieveParams.d
            maxResults = top100RetrieveParams.maxResults
            rankedBy = top100RetrieveParams.rankedBy
            additionalHeaders = top100RetrieveParams.additionalHeaders.toBuilder()
            additionalQueryParams = top100RetrieveParams.additionalQueryParams.toBuilder()
        }

        fun regionCode(regionCode: String) = apply { this.regionCode = regionCode }

        fun y(y: Long) = apply { this.y = y }

        fun m(m: Long) = apply { this.m = m }

        fun d(d: Long?) = apply { this.d = d }

        /**
         * Alias for [Builder.d].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun d(d: Long) = d(d as Long?)

        /** Alias for calling [Builder.d] with `d.orElse(null)`. */
        fun d(d: Optional<Long>) = d(d.getOrNull())

        /** Only fetch this number of contributors. */
        fun maxResults(maxResults: Long?) = apply { this.maxResults = maxResults }

        /**
         * Alias for [Builder.maxResults].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun maxResults(maxResults: Long) = maxResults(maxResults as Long?)

        /** Alias for calling [Builder.maxResults] with `maxResults.orElse(null)`. */
        fun maxResults(maxResults: Optional<Long>) = maxResults(maxResults.getOrNull())

        /** Order by number of complete checklists (cl) or by number of species seen (spp). */
        fun rankedBy(rankedBy: RankedBy?) = apply { this.rankedBy = rankedBy }

        /** Alias for calling [Builder.rankedBy] with `rankedBy.orElse(null)`. */
        fun rankedBy(rankedBy: Optional<RankedBy>) = rankedBy(rankedBy.getOrNull())

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
         * Returns an immutable instance of [Top100RetrieveParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .regionCode()
         * .y()
         * .m()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): Top100RetrieveParams =
            Top100RetrieveParams(
                checkRequired("regionCode", regionCode),
                checkRequired("y", y),
                checkRequired("m", m),
                d,
                maxResults,
                rankedBy,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> regionCode
            1 -> y.toString()
            2 -> m.toString()
            3 -> d?.toString() ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                maxResults?.let { put("maxResults", it.toString()) }
                rankedBy?.let { put("rankedBy", it.toString()) }
                putAll(additionalQueryParams)
            }
            .build()

    /** Order by number of complete checklists (cl) or by number of species seen (spp). */
    class RankedBy @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val SPP = of("spp")

            @JvmField val CL = of("cl")

            @JvmStatic fun of(value: String) = RankedBy(JsonField.of(value))
        }

        /** An enum containing [RankedBy]'s known values. */
        enum class Known {
            SPP,
            CL,
        }

        /**
         * An enum containing [RankedBy]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [RankedBy] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            SPP,
            CL,
            /** An enum member indicating that [RankedBy] was instantiated with an unknown value. */
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
                SPP -> Value.SPP
                CL -> Value.CL
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
                SPP -> Known.SPP
                CL -> Known.CL
                else -> throw PhoebeInvalidDataException("Unknown RankedBy: $value")
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
        fun validate(): RankedBy = apply {
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

            return other is RankedBy && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is Top100RetrieveParams &&
            regionCode == other.regionCode &&
            y == other.y &&
            m == other.m &&
            d == other.d &&
            maxResults == other.maxResults &&
            rankedBy == other.rankedBy &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            regionCode,
            y,
            m,
            d,
            maxResults,
            rankedBy,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "Top100RetrieveParams{regionCode=$regionCode, y=$y, m=$m, d=$d, maxResults=$maxResults, rankedBy=$rankedBy, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
