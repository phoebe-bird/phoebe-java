// File generated from our OpenAPI spec by Stainless.

package com.phoebe.api.models.ref.taxonomy.speciesgroups

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
 * Get the list of species groups, e.g. terns, finches, etc. #### Notes Merlin puts like birds
 * together, with Falcons next to Hawks, whereas eBird follows taxonomic order.
 */
class SpeciesGroupListParams
private constructor(
    private val speciesGrouping: SpeciesGrouping,
    private val groupNameLocale: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** The order in which groups are returned. */
    fun speciesGrouping(): SpeciesGrouping = speciesGrouping

    /**
     * Locale for species group names. English names are returned for any non-listed locale or any
     * non-translated group name.
     */
    fun groupNameLocale(): Optional<String> = Optional.ofNullable(groupNameLocale)

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [SpeciesGroupListParams].
         *
         * The following fields are required:
         * ```java
         * .speciesGrouping()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [SpeciesGroupListParams]. */
    class Builder internal constructor() {

        private var speciesGrouping: SpeciesGrouping? = null
        private var groupNameLocale: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(speciesGroupListParams: SpeciesGroupListParams) = apply {
            speciesGrouping = speciesGroupListParams.speciesGrouping
            groupNameLocale = speciesGroupListParams.groupNameLocale
            additionalHeaders = speciesGroupListParams.additionalHeaders.toBuilder()
            additionalQueryParams = speciesGroupListParams.additionalQueryParams.toBuilder()
        }

        /** The order in which groups are returned. */
        fun speciesGrouping(speciesGrouping: SpeciesGrouping) = apply {
            this.speciesGrouping = speciesGrouping
        }

        /**
         * Locale for species group names. English names are returned for any non-listed locale or
         * any non-translated group name.
         */
        fun groupNameLocale(groupNameLocale: String?) = apply {
            this.groupNameLocale = groupNameLocale
        }

        /** Alias for calling [Builder.groupNameLocale] with `groupNameLocale.orElse(null)`. */
        fun groupNameLocale(groupNameLocale: Optional<String>) =
            groupNameLocale(groupNameLocale.getOrNull())

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
         * Returns an immutable instance of [SpeciesGroupListParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .speciesGrouping()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): SpeciesGroupListParams =
            SpeciesGroupListParams(
                checkRequired("speciesGrouping", speciesGrouping),
                groupNameLocale,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> speciesGrouping.toString()
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                groupNameLocale?.let { put("groupNameLocale", it) }
                putAll(additionalQueryParams)
            }
            .build()

    /** The order in which groups are returned. */
    class SpeciesGrouping @JsonCreator private constructor(private val value: JsonField<String>) :
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

            @JvmField val MERLIN = of("merlin")

            @JvmField val EBIRD = of("ebird")

            @JvmStatic fun of(value: String) = SpeciesGrouping(JsonField.of(value))
        }

        /** An enum containing [SpeciesGrouping]'s known values. */
        enum class Known {
            MERLIN,
            EBIRD,
        }

        /**
         * An enum containing [SpeciesGrouping]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [SpeciesGrouping] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            MERLIN,
            EBIRD,
            /**
             * An enum member indicating that [SpeciesGrouping] was instantiated with an unknown
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
                MERLIN -> Value.MERLIN
                EBIRD -> Value.EBIRD
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
                MERLIN -> Known.MERLIN
                EBIRD -> Known.EBIRD
                else -> throw PhoebeInvalidDataException("Unknown SpeciesGrouping: $value")
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

        fun validate(): SpeciesGrouping = apply {
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

            return /* spotless:off */ other is SpeciesGrouping && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is SpeciesGroupListParams && speciesGrouping == other.speciesGrouping && groupNameLocale == other.groupNameLocale && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(speciesGrouping, groupNameLocale, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "SpeciesGroupListParams{speciesGrouping=$speciesGrouping, groupNameLocale=$groupNameLocale, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
