// File generated from our OpenAPI spec by Stainless.

package com.phoebe.api.models.ref.taxonomy.ebird

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
 * Get the taxonomy used by eBird. #### Notes Each entry in the taxonomy contains a species code for
 * example, barswa for Barn Swallow. You can download the taxonomy for selected species using the
 * *species* query parameter with a comma separating each code. Otherwise the full taxonomy is
 * downloaded.
 */
class EbirdRetrieveParams
private constructor(
    private val cat: String?,
    private val fmt: Fmt?,
    private val locale: String?,
    private val species: String?,
    private val version: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** Only fetch records from these taxonomic categories. */
    fun cat(): Optional<String> = Optional.ofNullable(cat)

    /** Fetch the records in CSV or JSON format. */
    fun fmt(): Optional<Fmt> = Optional.ofNullable(fmt)

    /** Use this language for common names. */
    fun locale(): Optional<String> = Optional.ofNullable(locale)

    /** Only fetch records for these species. */
    fun species(): Optional<String> = Optional.ofNullable(species)

    /** Fetch a specific version of the taxonomy. */
    fun version(): Optional<String> = Optional.ofNullable(version)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): EbirdRetrieveParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [EbirdRetrieveParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [EbirdRetrieveParams]. */
    class Builder internal constructor() {

        private var cat: String? = null
        private var fmt: Fmt? = null
        private var locale: String? = null
        private var species: String? = null
        private var version: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(ebirdRetrieveParams: EbirdRetrieveParams) = apply {
            cat = ebirdRetrieveParams.cat
            fmt = ebirdRetrieveParams.fmt
            locale = ebirdRetrieveParams.locale
            species = ebirdRetrieveParams.species
            version = ebirdRetrieveParams.version
            additionalHeaders = ebirdRetrieveParams.additionalHeaders.toBuilder()
            additionalQueryParams = ebirdRetrieveParams.additionalQueryParams.toBuilder()
        }

        /** Only fetch records from these taxonomic categories. */
        fun cat(cat: String?) = apply { this.cat = cat }

        /** Alias for calling [Builder.cat] with `cat.orElse(null)`. */
        fun cat(cat: Optional<String>) = cat(cat.getOrNull())

        /** Fetch the records in CSV or JSON format. */
        fun fmt(fmt: Fmt?) = apply { this.fmt = fmt }

        /** Alias for calling [Builder.fmt] with `fmt.orElse(null)`. */
        fun fmt(fmt: Optional<Fmt>) = fmt(fmt.getOrNull())

        /** Use this language for common names. */
        fun locale(locale: String?) = apply { this.locale = locale }

        /** Alias for calling [Builder.locale] with `locale.orElse(null)`. */
        fun locale(locale: Optional<String>) = locale(locale.getOrNull())

        /** Only fetch records for these species. */
        fun species(species: String?) = apply { this.species = species }

        /** Alias for calling [Builder.species] with `species.orElse(null)`. */
        fun species(species: Optional<String>) = species(species.getOrNull())

        /** Fetch a specific version of the taxonomy. */
        fun version(version: String?) = apply { this.version = version }

        /** Alias for calling [Builder.version] with `version.orElse(null)`. */
        fun version(version: Optional<String>) = version(version.getOrNull())

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
         * Returns an immutable instance of [EbirdRetrieveParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): EbirdRetrieveParams =
            EbirdRetrieveParams(
                cat,
                fmt,
                locale,
                species,
                version,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                cat?.let { put("cat", it) }
                fmt?.let { put("fmt", it.toString()) }
                locale?.let { put("locale", it) }
                species?.let { put("species", it) }
                version?.let { put("version", it) }
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

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws PhoebeInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
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

        return other is EbirdRetrieveParams &&
            cat == other.cat &&
            fmt == other.fmt &&
            locale == other.locale &&
            species == other.species &&
            version == other.version &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(cat, fmt, locale, species, version, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "EbirdRetrieveParams{cat=$cat, fmt=$fmt, locale=$locale, species=$species, version=$version, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
