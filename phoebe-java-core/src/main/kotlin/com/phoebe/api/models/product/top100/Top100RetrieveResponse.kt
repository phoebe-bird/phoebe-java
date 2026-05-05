// File generated from our OpenAPI spec by Stainless.

package com.phoebe.api.models.product.top100

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

class Top100RetrieveResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val numCompleteChecklists: JsonField<Int>,
    private val numSpecies: JsonField<Int>,
    private val profileHandle: JsonField<String>,
    private val rowNum: JsonField<Int>,
    private val userDisplayName: JsonField<String>,
    private val userId: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("numCompleteChecklists")
        @ExcludeMissing
        numCompleteChecklists: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("numSpecies") @ExcludeMissing numSpecies: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("profileHandle")
        @ExcludeMissing
        profileHandle: JsonField<String> = JsonMissing.of(),
        @JsonProperty("rowNum") @ExcludeMissing rowNum: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("userDisplayName")
        @ExcludeMissing
        userDisplayName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("userId") @ExcludeMissing userId: JsonField<String> = JsonMissing.of(),
    ) : this(
        numCompleteChecklists,
        numSpecies,
        profileHandle,
        rowNum,
        userDisplayName,
        userId,
        mutableMapOf(),
    )

    /**
     * @throws PhoebeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun numCompleteChecklists(): Optional<Int> =
        numCompleteChecklists.getOptional("numCompleteChecklists")

    /**
     * @throws PhoebeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun numSpecies(): Optional<Int> = numSpecies.getOptional("numSpecies")

    /**
     * @throws PhoebeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun profileHandle(): Optional<String> = profileHandle.getOptional("profileHandle")

    /**
     * @throws PhoebeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun rowNum(): Optional<Int> = rowNum.getOptional("rowNum")

    /**
     * @throws PhoebeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun userDisplayName(): Optional<String> = userDisplayName.getOptional("userDisplayName")

    /**
     * @throws PhoebeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun userId(): Optional<String> = userId.getOptional("userId")

    /**
     * Returns the raw JSON value of [numCompleteChecklists].
     *
     * Unlike [numCompleteChecklists], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("numCompleteChecklists")
    @ExcludeMissing
    fun _numCompleteChecklists(): JsonField<Int> = numCompleteChecklists

    /**
     * Returns the raw JSON value of [numSpecies].
     *
     * Unlike [numSpecies], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("numSpecies") @ExcludeMissing fun _numSpecies(): JsonField<Int> = numSpecies

    /**
     * Returns the raw JSON value of [profileHandle].
     *
     * Unlike [profileHandle], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("profileHandle")
    @ExcludeMissing
    fun _profileHandle(): JsonField<String> = profileHandle

    /**
     * Returns the raw JSON value of [rowNum].
     *
     * Unlike [rowNum], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("rowNum") @ExcludeMissing fun _rowNum(): JsonField<Int> = rowNum

    /**
     * Returns the raw JSON value of [userDisplayName].
     *
     * Unlike [userDisplayName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("userDisplayName")
    @ExcludeMissing
    fun _userDisplayName(): JsonField<String> = userDisplayName

    /**
     * Returns the raw JSON value of [userId].
     *
     * Unlike [userId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("userId") @ExcludeMissing fun _userId(): JsonField<String> = userId

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

        /** Returns a mutable builder for constructing an instance of [Top100RetrieveResponse]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [Top100RetrieveResponse]. */
    class Builder internal constructor() {

        private var numCompleteChecklists: JsonField<Int> = JsonMissing.of()
        private var numSpecies: JsonField<Int> = JsonMissing.of()
        private var profileHandle: JsonField<String> = JsonMissing.of()
        private var rowNum: JsonField<Int> = JsonMissing.of()
        private var userDisplayName: JsonField<String> = JsonMissing.of()
        private var userId: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(top100RetrieveResponse: Top100RetrieveResponse) = apply {
            numCompleteChecklists = top100RetrieveResponse.numCompleteChecklists
            numSpecies = top100RetrieveResponse.numSpecies
            profileHandle = top100RetrieveResponse.profileHandle
            rowNum = top100RetrieveResponse.rowNum
            userDisplayName = top100RetrieveResponse.userDisplayName
            userId = top100RetrieveResponse.userId
            additionalProperties = top100RetrieveResponse.additionalProperties.toMutableMap()
        }

        fun numCompleteChecklists(numCompleteChecklists: Int) =
            numCompleteChecklists(JsonField.of(numCompleteChecklists))

        /**
         * Sets [Builder.numCompleteChecklists] to an arbitrary JSON value.
         *
         * You should usually call [Builder.numCompleteChecklists] with a well-typed [Int] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun numCompleteChecklists(numCompleteChecklists: JsonField<Int>) = apply {
            this.numCompleteChecklists = numCompleteChecklists
        }

        fun numSpecies(numSpecies: Int) = numSpecies(JsonField.of(numSpecies))

        /**
         * Sets [Builder.numSpecies] to an arbitrary JSON value.
         *
         * You should usually call [Builder.numSpecies] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun numSpecies(numSpecies: JsonField<Int>) = apply { this.numSpecies = numSpecies }

        fun profileHandle(profileHandle: String) = profileHandle(JsonField.of(profileHandle))

        /**
         * Sets [Builder.profileHandle] to an arbitrary JSON value.
         *
         * You should usually call [Builder.profileHandle] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun profileHandle(profileHandle: JsonField<String>) = apply {
            this.profileHandle = profileHandle
        }

        fun rowNum(rowNum: Int) = rowNum(JsonField.of(rowNum))

        /**
         * Sets [Builder.rowNum] to an arbitrary JSON value.
         *
         * You should usually call [Builder.rowNum] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun rowNum(rowNum: JsonField<Int>) = apply { this.rowNum = rowNum }

        fun userDisplayName(userDisplayName: String) =
            userDisplayName(JsonField.of(userDisplayName))

        /**
         * Sets [Builder.userDisplayName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.userDisplayName] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun userDisplayName(userDisplayName: JsonField<String>) = apply {
            this.userDisplayName = userDisplayName
        }

        fun userId(userId: String) = userId(JsonField.of(userId))

        /**
         * Sets [Builder.userId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.userId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun userId(userId: JsonField<String>) = apply { this.userId = userId }

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
         * Returns an immutable instance of [Top100RetrieveResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): Top100RetrieveResponse =
            Top100RetrieveResponse(
                numCompleteChecklists,
                numSpecies,
                profileHandle,
                rowNum,
                userDisplayName,
                userId,
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
    fun validate(): Top100RetrieveResponse = apply {
        if (validated) {
            return@apply
        }

        numCompleteChecklists()
        numSpecies()
        profileHandle()
        rowNum()
        userDisplayName()
        userId()
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
        (if (numCompleteChecklists.asKnown().isPresent) 1 else 0) +
            (if (numSpecies.asKnown().isPresent) 1 else 0) +
            (if (profileHandle.asKnown().isPresent) 1 else 0) +
            (if (rowNum.asKnown().isPresent) 1 else 0) +
            (if (userDisplayName.asKnown().isPresent) 1 else 0) +
            (if (userId.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is Top100RetrieveResponse &&
            numCompleteChecklists == other.numCompleteChecklists &&
            numSpecies == other.numSpecies &&
            profileHandle == other.profileHandle &&
            rowNum == other.rowNum &&
            userDisplayName == other.userDisplayName &&
            userId == other.userId &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            numCompleteChecklists,
            numSpecies,
            profileHandle,
            rowNum,
            userDisplayName,
            userId,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Top100RetrieveResponse{numCompleteChecklists=$numCompleteChecklists, numSpecies=$numSpecies, profileHandle=$profileHandle, rowNum=$rowNum, userDisplayName=$userDisplayName, userId=$userId, additionalProperties=$additionalProperties}"
}
