// File generated from our OpenAPI spec by Stainless.

package com.phoebe.api.models.product.stats

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.phoebe.api.core.ExcludeMissing
import com.phoebe.api.core.JsonField
import com.phoebe.api.core.JsonMissing
import com.phoebe.api.core.JsonValue
import com.phoebe.api.errors.PhoebeInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional

class StatRetrieveResponse
private constructor(
    private val numChecklists: JsonField<Long>,
    private val numContributors: JsonField<Long>,
    private val numSpecies: JsonField<Long>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("numChecklists")
        @ExcludeMissing
        numChecklists: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("numContributors")
        @ExcludeMissing
        numContributors: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("numSpecies") @ExcludeMissing numSpecies: JsonField<Long> = JsonMissing.of(),
    ) : this(numChecklists, numContributors, numSpecies, mutableMapOf())

    /**
     * @throws PhoebeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun numChecklists(): Optional<Long> = numChecklists.getOptional("numChecklists")

    /**
     * @throws PhoebeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun numContributors(): Optional<Long> = numContributors.getOptional("numContributors")

    /**
     * @throws PhoebeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun numSpecies(): Optional<Long> = numSpecies.getOptional("numSpecies")

    /**
     * Returns the raw JSON value of [numChecklists].
     *
     * Unlike [numChecklists], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("numChecklists")
    @ExcludeMissing
    fun _numChecklists(): JsonField<Long> = numChecklists

    /**
     * Returns the raw JSON value of [numContributors].
     *
     * Unlike [numContributors], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("numContributors")
    @ExcludeMissing
    fun _numContributors(): JsonField<Long> = numContributors

    /**
     * Returns the raw JSON value of [numSpecies].
     *
     * Unlike [numSpecies], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("numSpecies") @ExcludeMissing fun _numSpecies(): JsonField<Long> = numSpecies

    @JsonAnySetter
    private fun putAdditionalProperty(key: String, value: JsonValue) {
        additionalProperties.put(key, value)
    }

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> =
        Collections.unmodifiableMap(additionalProperties)

    fun toBuilder() = Builder().from(this)

    companion object {

        /** Returns a mutable builder for constructing an instance of [StatRetrieveResponse]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [StatRetrieveResponse]. */
    class Builder internal constructor() {

        private var numChecklists: JsonField<Long> = JsonMissing.of()
        private var numContributors: JsonField<Long> = JsonMissing.of()
        private var numSpecies: JsonField<Long> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(statRetrieveResponse: StatRetrieveResponse) = apply {
            numChecklists = statRetrieveResponse.numChecklists
            numContributors = statRetrieveResponse.numContributors
            numSpecies = statRetrieveResponse.numSpecies
            additionalProperties = statRetrieveResponse.additionalProperties.toMutableMap()
        }

        fun numChecklists(numChecklists: Long) = numChecklists(JsonField.of(numChecklists))

        /**
         * Sets [Builder.numChecklists] to an arbitrary JSON value.
         *
         * You should usually call [Builder.numChecklists] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun numChecklists(numChecklists: JsonField<Long>) = apply {
            this.numChecklists = numChecklists
        }

        fun numContributors(numContributors: Long) = numContributors(JsonField.of(numContributors))

        /**
         * Sets [Builder.numContributors] to an arbitrary JSON value.
         *
         * You should usually call [Builder.numContributors] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun numContributors(numContributors: JsonField<Long>) = apply {
            this.numContributors = numContributors
        }

        fun numSpecies(numSpecies: Long) = numSpecies(JsonField.of(numSpecies))

        /**
         * Sets [Builder.numSpecies] to an arbitrary JSON value.
         *
         * You should usually call [Builder.numSpecies] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun numSpecies(numSpecies: JsonField<Long>) = apply { this.numSpecies = numSpecies }

        fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.clear()
            putAllAdditionalProperties(additionalProperties)
        }

        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
            additionalProperties.put(key, value)
        }

        fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.putAll(additionalProperties)
        }

        fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalProperty)
        }

        /**
         * Returns an immutable instance of [StatRetrieveResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): StatRetrieveResponse =
            StatRetrieveResponse(
                numChecklists,
                numContributors,
                numSpecies,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): StatRetrieveResponse = apply {
        if (validated) {
            return@apply
        }

        numChecklists()
        numContributors()
        numSpecies()
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        (if (numChecklists.asKnown().isPresent) 1 else 0) +
            (if (numContributors.asKnown().isPresent) 1 else 0) +
            (if (numSpecies.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is StatRetrieveResponse && numChecklists == other.numChecklists && numContributors == other.numContributors && numSpecies == other.numSpecies && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(numChecklists, numContributors, numSpecies, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "StatRetrieveResponse{numChecklists=$numChecklists, numContributors=$numContributors, numSpecies=$numSpecies, additionalProperties=$additionalProperties}"
}
