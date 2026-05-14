// File generated from our OpenAPI spec by Stainless.

package com.phoebe.api.models.ref.taxonomy.speciesgroups

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.phoebe.api.core.ExcludeMissing
import com.phoebe.api.core.JsonField
import com.phoebe.api.core.JsonMissing
import com.phoebe.api.core.JsonValue
import com.phoebe.api.core.checkKnown
import com.phoebe.api.core.toImmutable
import com.phoebe.api.errors.PhoebeInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class SpeciesGroupListResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val groupName: JsonField<String>,
    private val groupOrder: JsonField<Long>,
    private val taxonOrderBounds: JsonField<List<List<Float>>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("groupName") @ExcludeMissing groupName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("groupOrder") @ExcludeMissing groupOrder: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("taxonOrderBounds")
        @ExcludeMissing
        taxonOrderBounds: JsonField<List<List<Float>>> = JsonMissing.of(),
    ) : this(groupName, groupOrder, taxonOrderBounds, mutableMapOf())

    /**
     * @throws PhoebeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun groupName(): Optional<String> = groupName.getOptional("groupName")

    /**
     * @throws PhoebeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun groupOrder(): Optional<Long> = groupOrder.getOptional("groupOrder")

    /**
     * @throws PhoebeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun taxonOrderBounds(): Optional<List<List<Float>>> =
        taxonOrderBounds.getOptional("taxonOrderBounds")

    /**
     * Returns the raw JSON value of [groupName].
     *
     * Unlike [groupName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("groupName") @ExcludeMissing fun _groupName(): JsonField<String> = groupName

    /**
     * Returns the raw JSON value of [groupOrder].
     *
     * Unlike [groupOrder], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("groupOrder") @ExcludeMissing fun _groupOrder(): JsonField<Long> = groupOrder

    /**
     * Returns the raw JSON value of [taxonOrderBounds].
     *
     * Unlike [taxonOrderBounds], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("taxonOrderBounds")
    @ExcludeMissing
    fun _taxonOrderBounds(): JsonField<List<List<Float>>> = taxonOrderBounds

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

        /** Returns a mutable builder for constructing an instance of [SpeciesGroupListResponse]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [SpeciesGroupListResponse]. */
    class Builder internal constructor() {

        private var groupName: JsonField<String> = JsonMissing.of()
        private var groupOrder: JsonField<Long> = JsonMissing.of()
        private var taxonOrderBounds: JsonField<MutableList<List<Float>>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(speciesGroupListResponse: SpeciesGroupListResponse) = apply {
            groupName = speciesGroupListResponse.groupName
            groupOrder = speciesGroupListResponse.groupOrder
            taxonOrderBounds = speciesGroupListResponse.taxonOrderBounds.map { it.toMutableList() }
            additionalProperties = speciesGroupListResponse.additionalProperties.toMutableMap()
        }

        fun groupName(groupName: String) = groupName(JsonField.of(groupName))

        /**
         * Sets [Builder.groupName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.groupName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun groupName(groupName: JsonField<String>) = apply { this.groupName = groupName }

        fun groupOrder(groupOrder: Long) = groupOrder(JsonField.of(groupOrder))

        /**
         * Sets [Builder.groupOrder] to an arbitrary JSON value.
         *
         * You should usually call [Builder.groupOrder] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun groupOrder(groupOrder: JsonField<Long>) = apply { this.groupOrder = groupOrder }

        fun taxonOrderBounds(taxonOrderBounds: List<List<Float>>) =
            taxonOrderBounds(JsonField.of(taxonOrderBounds))

        /**
         * Sets [Builder.taxonOrderBounds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.taxonOrderBounds] with a well-typed `List<List<Float>>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun taxonOrderBounds(taxonOrderBounds: JsonField<List<List<Float>>>) = apply {
            this.taxonOrderBounds = taxonOrderBounds.map { it.toMutableList() }
        }

        /**
         * Adds a single [List<Float>] to [taxonOrderBounds].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addTaxonOrderBound(taxonOrderBound: List<Float>) = apply {
            taxonOrderBounds =
                (taxonOrderBounds ?: JsonField.of(mutableListOf())).also {
                    checkKnown("taxonOrderBounds", it).add(taxonOrderBound)
                }
        }

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
         * Returns an immutable instance of [SpeciesGroupListResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): SpeciesGroupListResponse =
            SpeciesGroupListResponse(
                groupName,
                groupOrder,
                (taxonOrderBounds ?: JsonMissing.of()).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    /**
     * Validates that the types of all values in this object match their expected types recursively.
     *
     * This method is _not_ forwards compatible with new types from the API for existing fields.
     *
     * @throws PhoebeInvalidDataException if any value type in this object doesn't match its
     *   expected type.
     */
    fun validate(): SpeciesGroupListResponse = apply {
        if (validated) {
            return@apply
        }

        groupName()
        groupOrder()
        taxonOrderBounds()
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
        (if (groupName.asKnown().isPresent) 1 else 0) +
            (if (groupOrder.asKnown().isPresent) 1 else 0) +
            (taxonOrderBounds.asKnown().getOrNull()?.sumOf { it.size.toInt() } ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SpeciesGroupListResponse &&
            groupName == other.groupName &&
            groupOrder == other.groupOrder &&
            taxonOrderBounds == other.taxonOrderBounds &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(groupName, groupOrder, taxonOrderBounds, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "SpeciesGroupListResponse{groupName=$groupName, groupOrder=$groupOrder, taxonOrderBounds=$taxonOrderBounds, additionalProperties=$additionalProperties}"
}
