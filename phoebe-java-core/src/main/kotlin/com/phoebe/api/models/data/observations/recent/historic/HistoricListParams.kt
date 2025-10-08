// File generated from our OpenAPI spec by Stainless.

package com.phoebe.api.models.data.observations.recent.historic

import com.fasterxml.jackson.annotation.JsonCreator
import com.phoebe.api.core.Enum
import com.phoebe.api.core.JsonField
import com.phoebe.api.core.Params
import com.phoebe.api.core.checkRequired
import com.phoebe.api.core.http.Headers
import com.phoebe.api.core.http.QueryParams
import com.phoebe.api.core.toImmutable
import com.phoebe.api.errors.PhoebeInvalidDataException
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Get a list of all taxa seen in a country, region or location on a specific date, with the
 * specific observations determined by the "rank" parameter (defaults to latest observation on the
 * date).
 *
 * #### Notes Responses may be cached for 30 minutes
 */
class HistoricListParams
private constructor(
    private val regionCode: String,
    private val y: Long,
    private val m: Long,
    private val d: Long?,
    private val cat: Cat?,
    private val detail: Detail?,
    private val hotspot: Boolean?,
    private val includeProvisional: Boolean?,
    private val maxResults: Long?,
    private val r: List<String>?,
    private val rank: Rank?,
    private val sppLocale: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun regionCode(): String = regionCode

    fun y(): Long = y

    fun m(): Long = m

    fun d(): Optional<Long> = Optional.ofNullable(d)

    /** Only fetch observations from these taxonomic categories */
    fun cat(): Optional<Cat> = Optional.ofNullable(cat)

    /** Include a subset (simple), or all (full), of the fields available. */
    fun detail(): Optional<Detail> = Optional.ofNullable(detail)

    /** Only fetch observations from hotspots */
    fun hotspot(): Optional<Boolean> = Optional.ofNullable(hotspot)

    /** Include observations which have not yet been reviewed. */
    fun includeProvisional(): Optional<Boolean> = Optional.ofNullable(includeProvisional)

    /** Only fetch this number of observations */
    fun maxResults(): Optional<Long> = Optional.ofNullable(maxResults)

    /** Fetch observations from up to 50 locations */
    fun r(): Optional<List<String>> = Optional.ofNullable(r)

    /** Include latest observation of the day, or the first added */
    fun rank(): Optional<Rank> = Optional.ofNullable(rank)

    /** Use this language for species common names */
    fun sppLocale(): Optional<String> = Optional.ofNullable(sppLocale)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [HistoricListParams].
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

    /** A builder for [HistoricListParams]. */
    class Builder internal constructor() {

        private var regionCode: String? = null
        private var y: Long? = null
        private var m: Long? = null
        private var d: Long? = null
        private var cat: Cat? = null
        private var detail: Detail? = null
        private var hotspot: Boolean? = null
        private var includeProvisional: Boolean? = null
        private var maxResults: Long? = null
        private var r: MutableList<String>? = null
        private var rank: Rank? = null
        private var sppLocale: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(historicListParams: HistoricListParams) = apply {
            regionCode = historicListParams.regionCode
            y = historicListParams.y
            m = historicListParams.m
            d = historicListParams.d
            cat = historicListParams.cat
            detail = historicListParams.detail
            hotspot = historicListParams.hotspot
            includeProvisional = historicListParams.includeProvisional
            maxResults = historicListParams.maxResults
            r = historicListParams.r?.toMutableList()
            rank = historicListParams.rank
            sppLocale = historicListParams.sppLocale
            additionalHeaders = historicListParams.additionalHeaders.toBuilder()
            additionalQueryParams = historicListParams.additionalQueryParams.toBuilder()
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

        /** Only fetch observations from these taxonomic categories */
        fun cat(cat: Cat?) = apply { this.cat = cat }

        /** Alias for calling [Builder.cat] with `cat.orElse(null)`. */
        fun cat(cat: Optional<Cat>) = cat(cat.getOrNull())

        /** Include a subset (simple), or all (full), of the fields available. */
        fun detail(detail: Detail?) = apply { this.detail = detail }

        /** Alias for calling [Builder.detail] with `detail.orElse(null)`. */
        fun detail(detail: Optional<Detail>) = detail(detail.getOrNull())

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

        /** Fetch observations from up to 50 locations */
        fun r(r: List<String>?) = apply { this.r = r?.toMutableList() }

        /** Alias for calling [Builder.r] with `r.orElse(null)`. */
        fun r(r: Optional<List<String>>) = r(r.getOrNull())

        /**
         * Adds a single [String] to [Builder.r].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addR(r: String) = apply { this.r = (this.r ?: mutableListOf()).apply { add(r) } }

        /** Include latest observation of the day, or the first added */
        fun rank(rank: Rank?) = apply { this.rank = rank }

        /** Alias for calling [Builder.rank] with `rank.orElse(null)`. */
        fun rank(rank: Optional<Rank>) = rank(rank.getOrNull())

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
         * Returns an immutable instance of [HistoricListParams].
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
        fun build(): HistoricListParams =
            HistoricListParams(
                checkRequired("regionCode", regionCode),
                checkRequired("y", y),
                checkRequired("m", m),
                d,
                cat,
                detail,
                hotspot,
                includeProvisional,
                maxResults,
                r?.toImmutable(),
                rank,
                sppLocale,
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
                cat?.let { put("cat", it.toString()) }
                detail?.let { put("detail", it.toString()) }
                hotspot?.let { put("hotspot", it.toString()) }
                includeProvisional?.let { put("includeProvisional", it.toString()) }
                maxResults?.let { put("maxResults", it.toString()) }
                r?.let { put("r", it.joinToString(",")) }
                rank?.let { put("rank", it.toString()) }
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

    /** Include latest observation of the day, or the first added */
    class Rank @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val MREC = of("mrec")

            @JvmField val CREATE = of("create")

            @JvmStatic fun of(value: String) = Rank(JsonField.of(value))
        }

        /** An enum containing [Rank]'s known values. */
        enum class Known {
            MREC,
            CREATE,
        }

        /**
         * An enum containing [Rank]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Rank] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            MREC,
            CREATE,
            /** An enum member indicating that [Rank] was instantiated with an unknown value. */
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
                MREC -> Value.MREC
                CREATE -> Value.CREATE
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
                MREC -> Known.MREC
                CREATE -> Known.CREATE
                else -> throw PhoebeInvalidDataException("Unknown Rank: $value")
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

        fun validate(): Rank = apply {
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

            return other is Rank && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is HistoricListParams &&
            regionCode == other.regionCode &&
            y == other.y &&
            m == other.m &&
            d == other.d &&
            cat == other.cat &&
            detail == other.detail &&
            hotspot == other.hotspot &&
            includeProvisional == other.includeProvisional &&
            maxResults == other.maxResults &&
            r == other.r &&
            rank == other.rank &&
            sppLocale == other.sppLocale &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            regionCode,
            y,
            m,
            d,
            cat,
            detail,
            hotspot,
            includeProvisional,
            maxResults,
            r,
            rank,
            sppLocale,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "HistoricListParams{regionCode=$regionCode, y=$y, m=$m, d=$d, cat=$cat, detail=$detail, hotspot=$hotspot, includeProvisional=$includeProvisional, maxResults=$maxResults, r=$r, rank=$rank, sppLocale=$sppLocale, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
