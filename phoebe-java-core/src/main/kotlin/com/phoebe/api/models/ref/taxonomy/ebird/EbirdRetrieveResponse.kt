// File generated from our OpenAPI spec by Stainless.

package com.phoebe.api.models.ref.taxonomy.ebird

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

class EbirdRetrieveResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val bandingCodes: JsonField<List<String>>,
    private val category: JsonField<String>,
    private val comName: JsonField<String>,
    private val comNameCodes: JsonField<List<String>>,
    private val familyCode: JsonField<String>,
    private val familyComName: JsonField<String>,
    private val familySciName: JsonField<String>,
    private val order: JsonField<String>,
    private val sciName: JsonField<String>,
    private val sciNameCodes: JsonField<List<String>>,
    private val speciesCode: JsonField<String>,
    private val taxonOrder: JsonField<Int>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("bandingCodes")
        @ExcludeMissing
        bandingCodes: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("category") @ExcludeMissing category: JsonField<String> = JsonMissing.of(),
        @JsonProperty("comName") @ExcludeMissing comName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("comNameCodes")
        @ExcludeMissing
        comNameCodes: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("familyCode")
        @ExcludeMissing
        familyCode: JsonField<String> = JsonMissing.of(),
        @JsonProperty("familyComName")
        @ExcludeMissing
        familyComName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("familySciName")
        @ExcludeMissing
        familySciName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("order") @ExcludeMissing order: JsonField<String> = JsonMissing.of(),
        @JsonProperty("sciName") @ExcludeMissing sciName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("sciNameCodes")
        @ExcludeMissing
        sciNameCodes: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("speciesCode")
        @ExcludeMissing
        speciesCode: JsonField<String> = JsonMissing.of(),
        @JsonProperty("taxonOrder") @ExcludeMissing taxonOrder: JsonField<Int> = JsonMissing.of(),
    ) : this(
        bandingCodes,
        category,
        comName,
        comNameCodes,
        familyCode,
        familyComName,
        familySciName,
        order,
        sciName,
        sciNameCodes,
        speciesCode,
        taxonOrder,
        mutableMapOf(),
    )

    /**
     * @throws PhoebeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun bandingCodes(): Optional<List<String>> = bandingCodes.getOptional("bandingCodes")

    /**
     * @throws PhoebeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun category(): Optional<String> = category.getOptional("category")

    /**
     * @throws PhoebeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun comName(): Optional<String> = comName.getOptional("comName")

    /**
     * @throws PhoebeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun comNameCodes(): Optional<List<String>> = comNameCodes.getOptional("comNameCodes")

    /**
     * @throws PhoebeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun familyCode(): Optional<String> = familyCode.getOptional("familyCode")

    /**
     * @throws PhoebeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun familyComName(): Optional<String> = familyComName.getOptional("familyComName")

    /**
     * @throws PhoebeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun familySciName(): Optional<String> = familySciName.getOptional("familySciName")

    /**
     * @throws PhoebeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun order(): Optional<String> = order.getOptional("order")

    /**
     * @throws PhoebeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun sciName(): Optional<String> = sciName.getOptional("sciName")

    /**
     * @throws PhoebeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun sciNameCodes(): Optional<List<String>> = sciNameCodes.getOptional("sciNameCodes")

    /**
     * @throws PhoebeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun speciesCode(): Optional<String> = speciesCode.getOptional("speciesCode")

    /**
     * @throws PhoebeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun taxonOrder(): Optional<Int> = taxonOrder.getOptional("taxonOrder")

    /**
     * Returns the raw JSON value of [bandingCodes].
     *
     * Unlike [bandingCodes], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("bandingCodes")
    @ExcludeMissing
    fun _bandingCodes(): JsonField<List<String>> = bandingCodes

    /**
     * Returns the raw JSON value of [category].
     *
     * Unlike [category], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("category") @ExcludeMissing fun _category(): JsonField<String> = category

    /**
     * Returns the raw JSON value of [comName].
     *
     * Unlike [comName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("comName") @ExcludeMissing fun _comName(): JsonField<String> = comName

    /**
     * Returns the raw JSON value of [comNameCodes].
     *
     * Unlike [comNameCodes], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("comNameCodes")
    @ExcludeMissing
    fun _comNameCodes(): JsonField<List<String>> = comNameCodes

    /**
     * Returns the raw JSON value of [familyCode].
     *
     * Unlike [familyCode], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("familyCode") @ExcludeMissing fun _familyCode(): JsonField<String> = familyCode

    /**
     * Returns the raw JSON value of [familyComName].
     *
     * Unlike [familyComName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("familyComName")
    @ExcludeMissing
    fun _familyComName(): JsonField<String> = familyComName

    /**
     * Returns the raw JSON value of [familySciName].
     *
     * Unlike [familySciName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("familySciName")
    @ExcludeMissing
    fun _familySciName(): JsonField<String> = familySciName

    /**
     * Returns the raw JSON value of [order].
     *
     * Unlike [order], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("order") @ExcludeMissing fun _order(): JsonField<String> = order

    /**
     * Returns the raw JSON value of [sciName].
     *
     * Unlike [sciName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("sciName") @ExcludeMissing fun _sciName(): JsonField<String> = sciName

    /**
     * Returns the raw JSON value of [sciNameCodes].
     *
     * Unlike [sciNameCodes], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("sciNameCodes")
    @ExcludeMissing
    fun _sciNameCodes(): JsonField<List<String>> = sciNameCodes

    /**
     * Returns the raw JSON value of [speciesCode].
     *
     * Unlike [speciesCode], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("speciesCode") @ExcludeMissing fun _speciesCode(): JsonField<String> = speciesCode

    /**
     * Returns the raw JSON value of [taxonOrder].
     *
     * Unlike [taxonOrder], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("taxonOrder") @ExcludeMissing fun _taxonOrder(): JsonField<Int> = taxonOrder

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

        /** Returns a mutable builder for constructing an instance of [EbirdRetrieveResponse]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [EbirdRetrieveResponse]. */
    class Builder internal constructor() {

        private var bandingCodes: JsonField<MutableList<String>>? = null
        private var category: JsonField<String> = JsonMissing.of()
        private var comName: JsonField<String> = JsonMissing.of()
        private var comNameCodes: JsonField<MutableList<String>>? = null
        private var familyCode: JsonField<String> = JsonMissing.of()
        private var familyComName: JsonField<String> = JsonMissing.of()
        private var familySciName: JsonField<String> = JsonMissing.of()
        private var order: JsonField<String> = JsonMissing.of()
        private var sciName: JsonField<String> = JsonMissing.of()
        private var sciNameCodes: JsonField<MutableList<String>>? = null
        private var speciesCode: JsonField<String> = JsonMissing.of()
        private var taxonOrder: JsonField<Int> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(ebirdRetrieveResponse: EbirdRetrieveResponse) = apply {
            bandingCodes = ebirdRetrieveResponse.bandingCodes.map { it.toMutableList() }
            category = ebirdRetrieveResponse.category
            comName = ebirdRetrieveResponse.comName
            comNameCodes = ebirdRetrieveResponse.comNameCodes.map { it.toMutableList() }
            familyCode = ebirdRetrieveResponse.familyCode
            familyComName = ebirdRetrieveResponse.familyComName
            familySciName = ebirdRetrieveResponse.familySciName
            order = ebirdRetrieveResponse.order
            sciName = ebirdRetrieveResponse.sciName
            sciNameCodes = ebirdRetrieveResponse.sciNameCodes.map { it.toMutableList() }
            speciesCode = ebirdRetrieveResponse.speciesCode
            taxonOrder = ebirdRetrieveResponse.taxonOrder
            additionalProperties = ebirdRetrieveResponse.additionalProperties.toMutableMap()
        }

        fun bandingCodes(bandingCodes: List<String>) = bandingCodes(JsonField.of(bandingCodes))

        /**
         * Sets [Builder.bandingCodes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.bandingCodes] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun bandingCodes(bandingCodes: JsonField<List<String>>) = apply {
            this.bandingCodes = bandingCodes.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [bandingCodes].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addBandingCode(bandingCode: String) = apply {
            bandingCodes =
                (bandingCodes ?: JsonField.of(mutableListOf())).also {
                    checkKnown("bandingCodes", it).add(bandingCode)
                }
        }

        fun category(category: String) = category(JsonField.of(category))

        /**
         * Sets [Builder.category] to an arbitrary JSON value.
         *
         * You should usually call [Builder.category] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun category(category: JsonField<String>) = apply { this.category = category }

        fun comName(comName: String) = comName(JsonField.of(comName))

        /**
         * Sets [Builder.comName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.comName] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun comName(comName: JsonField<String>) = apply { this.comName = comName }

        fun comNameCodes(comNameCodes: List<String>) = comNameCodes(JsonField.of(comNameCodes))

        /**
         * Sets [Builder.comNameCodes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.comNameCodes] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun comNameCodes(comNameCodes: JsonField<List<String>>) = apply {
            this.comNameCodes = comNameCodes.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [comNameCodes].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addComNameCode(comNameCode: String) = apply {
            comNameCodes =
                (comNameCodes ?: JsonField.of(mutableListOf())).also {
                    checkKnown("comNameCodes", it).add(comNameCode)
                }
        }

        fun familyCode(familyCode: String) = familyCode(JsonField.of(familyCode))

        /**
         * Sets [Builder.familyCode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.familyCode] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun familyCode(familyCode: JsonField<String>) = apply { this.familyCode = familyCode }

        fun familyComName(familyComName: String) = familyComName(JsonField.of(familyComName))

        /**
         * Sets [Builder.familyComName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.familyComName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun familyComName(familyComName: JsonField<String>) = apply {
            this.familyComName = familyComName
        }

        fun familySciName(familySciName: String) = familySciName(JsonField.of(familySciName))

        /**
         * Sets [Builder.familySciName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.familySciName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun familySciName(familySciName: JsonField<String>) = apply {
            this.familySciName = familySciName
        }

        fun order(order: String) = order(JsonField.of(order))

        /**
         * Sets [Builder.order] to an arbitrary JSON value.
         *
         * You should usually call [Builder.order] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun order(order: JsonField<String>) = apply { this.order = order }

        fun sciName(sciName: String) = sciName(JsonField.of(sciName))

        /**
         * Sets [Builder.sciName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sciName] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun sciName(sciName: JsonField<String>) = apply { this.sciName = sciName }

        fun sciNameCodes(sciNameCodes: List<String>) = sciNameCodes(JsonField.of(sciNameCodes))

        /**
         * Sets [Builder.sciNameCodes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sciNameCodes] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun sciNameCodes(sciNameCodes: JsonField<List<String>>) = apply {
            this.sciNameCodes = sciNameCodes.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [sciNameCodes].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addSciNameCode(sciNameCode: String) = apply {
            sciNameCodes =
                (sciNameCodes ?: JsonField.of(mutableListOf())).also {
                    checkKnown("sciNameCodes", it).add(sciNameCode)
                }
        }

        fun speciesCode(speciesCode: String) = speciesCode(JsonField.of(speciesCode))

        /**
         * Sets [Builder.speciesCode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.speciesCode] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun speciesCode(speciesCode: JsonField<String>) = apply { this.speciesCode = speciesCode }

        fun taxonOrder(taxonOrder: Int) = taxonOrder(JsonField.of(taxonOrder))

        /**
         * Sets [Builder.taxonOrder] to an arbitrary JSON value.
         *
         * You should usually call [Builder.taxonOrder] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun taxonOrder(taxonOrder: JsonField<Int>) = apply { this.taxonOrder = taxonOrder }

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
         * Returns an immutable instance of [EbirdRetrieveResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): EbirdRetrieveResponse =
            EbirdRetrieveResponse(
                (bandingCodes ?: JsonMissing.of()).map { it.toImmutable() },
                category,
                comName,
                (comNameCodes ?: JsonMissing.of()).map { it.toImmutable() },
                familyCode,
                familyComName,
                familySciName,
                order,
                sciName,
                (sciNameCodes ?: JsonMissing.of()).map { it.toImmutable() },
                speciesCode,
                taxonOrder,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): EbirdRetrieveResponse = apply {
        if (validated) {
            return@apply
        }

        bandingCodes()
        category()
        comName()
        comNameCodes()
        familyCode()
        familyComName()
        familySciName()
        order()
        sciName()
        sciNameCodes()
        speciesCode()
        taxonOrder()
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
        (bandingCodes.asKnown().getOrNull()?.size ?: 0) +
            (if (category.asKnown().isPresent) 1 else 0) +
            (if (comName.asKnown().isPresent) 1 else 0) +
            (comNameCodes.asKnown().getOrNull()?.size ?: 0) +
            (if (familyCode.asKnown().isPresent) 1 else 0) +
            (if (familyComName.asKnown().isPresent) 1 else 0) +
            (if (familySciName.asKnown().isPresent) 1 else 0) +
            (if (order.asKnown().isPresent) 1 else 0) +
            (if (sciName.asKnown().isPresent) 1 else 0) +
            (sciNameCodes.asKnown().getOrNull()?.size ?: 0) +
            (if (speciesCode.asKnown().isPresent) 1 else 0) +
            (if (taxonOrder.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is EbirdRetrieveResponse &&
            bandingCodes == other.bandingCodes &&
            category == other.category &&
            comName == other.comName &&
            comNameCodes == other.comNameCodes &&
            familyCode == other.familyCode &&
            familyComName == other.familyComName &&
            familySciName == other.familySciName &&
            order == other.order &&
            sciName == other.sciName &&
            sciNameCodes == other.sciNameCodes &&
            speciesCode == other.speciesCode &&
            taxonOrder == other.taxonOrder &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            bandingCodes,
            category,
            comName,
            comNameCodes,
            familyCode,
            familyComName,
            familySciName,
            order,
            sciName,
            sciNameCodes,
            speciesCode,
            taxonOrder,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "EbirdRetrieveResponse{bandingCodes=$bandingCodes, category=$category, comName=$comName, comNameCodes=$comNameCodes, familyCode=$familyCode, familyComName=$familyComName, familySciName=$familySciName, order=$order, sciName=$sciName, sciNameCodes=$sciNameCodes, speciesCode=$speciesCode, taxonOrder=$taxonOrder, additionalProperties=$additionalProperties}"
}
