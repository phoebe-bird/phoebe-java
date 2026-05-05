// File generated from our OpenAPI spec by Stainless.

package com.phoebe.api.models.product.lists

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

class ListRetrieveResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val allObsReported: JsonField<Boolean>,
    private val checklistId: JsonField<String>,
    private val creationDt: JsonField<String>,
    private val durationHrs: JsonField<Double>,
    private val isoObsDate: JsonField<String>,
    private val lastEditedDt: JsonField<String>,
    private val loc: JsonField<Loc>,
    private val locId: JsonField<String>,
    private val numObservers: JsonField<Long>,
    private val numSpecies: JsonField<Int>,
    private val obs: JsonField<List<Ob>>,
    private val obsDt: JsonField<String>,
    private val obsTime: JsonField<String>,
    private val obsTimeValid: JsonField<Boolean>,
    private val projId: JsonField<String>,
    private val protocolId: JsonField<String>,
    private val subId: JsonField<String>,
    private val submissionMethodCode: JsonField<String>,
    private val subnational1Code: JsonField<String>,
    private val userDisplayName: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("allObsReported")
        @ExcludeMissing
        allObsReported: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("checklistId")
        @ExcludeMissing
        checklistId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("creationDt")
        @ExcludeMissing
        creationDt: JsonField<String> = JsonMissing.of(),
        @JsonProperty("durationHrs")
        @ExcludeMissing
        durationHrs: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("isoObsDate")
        @ExcludeMissing
        isoObsDate: JsonField<String> = JsonMissing.of(),
        @JsonProperty("lastEditedDt")
        @ExcludeMissing
        lastEditedDt: JsonField<String> = JsonMissing.of(),
        @JsonProperty("loc") @ExcludeMissing loc: JsonField<Loc> = JsonMissing.of(),
        @JsonProperty("locId") @ExcludeMissing locId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("numObservers")
        @ExcludeMissing
        numObservers: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("numSpecies") @ExcludeMissing numSpecies: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("obs") @ExcludeMissing obs: JsonField<List<Ob>> = JsonMissing.of(),
        @JsonProperty("obsDt") @ExcludeMissing obsDt: JsonField<String> = JsonMissing.of(),
        @JsonProperty("obsTime") @ExcludeMissing obsTime: JsonField<String> = JsonMissing.of(),
        @JsonProperty("obsTimeValid")
        @ExcludeMissing
        obsTimeValid: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("projId") @ExcludeMissing projId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("protocolId")
        @ExcludeMissing
        protocolId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("subId") @ExcludeMissing subId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("submissionMethodCode")
        @ExcludeMissing
        submissionMethodCode: JsonField<String> = JsonMissing.of(),
        @JsonProperty("subnational1Code")
        @ExcludeMissing
        subnational1Code: JsonField<String> = JsonMissing.of(),
        @JsonProperty("userDisplayName")
        @ExcludeMissing
        userDisplayName: JsonField<String> = JsonMissing.of(),
    ) : this(
        allObsReported,
        checklistId,
        creationDt,
        durationHrs,
        isoObsDate,
        lastEditedDt,
        loc,
        locId,
        numObservers,
        numSpecies,
        obs,
        obsDt,
        obsTime,
        obsTimeValid,
        projId,
        protocolId,
        subId,
        submissionMethodCode,
        subnational1Code,
        userDisplayName,
        mutableMapOf(),
    )

    /**
     * @throws PhoebeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun allObsReported(): Optional<Boolean> = allObsReported.getOptional("allObsReported")

    /**
     * @throws PhoebeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun checklistId(): Optional<String> = checklistId.getOptional("checklistId")

    /**
     * @throws PhoebeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun creationDt(): Optional<String> = creationDt.getOptional("creationDt")

    /**
     * @throws PhoebeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun durationHrs(): Optional<Double> = durationHrs.getOptional("durationHrs")

    /**
     * @throws PhoebeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun isoObsDate(): Optional<String> = isoObsDate.getOptional("isoObsDate")

    /**
     * @throws PhoebeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun lastEditedDt(): Optional<String> = lastEditedDt.getOptional("lastEditedDt")

    /**
     * @throws PhoebeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun loc(): Optional<Loc> = loc.getOptional("loc")

    /**
     * @throws PhoebeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun locId(): Optional<String> = locId.getOptional("locId")

    /**
     * @throws PhoebeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun numObservers(): Optional<Long> = numObservers.getOptional("numObservers")

    /**
     * @throws PhoebeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun numSpecies(): Optional<Int> = numSpecies.getOptional("numSpecies")

    /**
     * @throws PhoebeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun obs(): Optional<List<Ob>> = obs.getOptional("obs")

    /**
     * @throws PhoebeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun obsDt(): Optional<String> = obsDt.getOptional("obsDt")

    /**
     * @throws PhoebeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun obsTime(): Optional<String> = obsTime.getOptional("obsTime")

    /**
     * @throws PhoebeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun obsTimeValid(): Optional<Boolean> = obsTimeValid.getOptional("obsTimeValid")

    /**
     * @throws PhoebeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun projId(): Optional<String> = projId.getOptional("projId")

    /**
     * @throws PhoebeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun protocolId(): Optional<String> = protocolId.getOptional("protocolId")

    /**
     * @throws PhoebeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun subId(): Optional<String> = subId.getOptional("subId")

    /**
     * @throws PhoebeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun submissionMethodCode(): Optional<String> =
        submissionMethodCode.getOptional("submissionMethodCode")

    /**
     * @throws PhoebeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun subnational1Code(): Optional<String> = subnational1Code.getOptional("subnational1Code")

    /**
     * @throws PhoebeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun userDisplayName(): Optional<String> = userDisplayName.getOptional("userDisplayName")

    /**
     * Returns the raw JSON value of [allObsReported].
     *
     * Unlike [allObsReported], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("allObsReported")
    @ExcludeMissing
    fun _allObsReported(): JsonField<Boolean> = allObsReported

    /**
     * Returns the raw JSON value of [checklistId].
     *
     * Unlike [checklistId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("checklistId") @ExcludeMissing fun _checklistId(): JsonField<String> = checklistId

    /**
     * Returns the raw JSON value of [creationDt].
     *
     * Unlike [creationDt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("creationDt") @ExcludeMissing fun _creationDt(): JsonField<String> = creationDt

    /**
     * Returns the raw JSON value of [durationHrs].
     *
     * Unlike [durationHrs], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("durationHrs") @ExcludeMissing fun _durationHrs(): JsonField<Double> = durationHrs

    /**
     * Returns the raw JSON value of [isoObsDate].
     *
     * Unlike [isoObsDate], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("isoObsDate") @ExcludeMissing fun _isoObsDate(): JsonField<String> = isoObsDate

    /**
     * Returns the raw JSON value of [lastEditedDt].
     *
     * Unlike [lastEditedDt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("lastEditedDt")
    @ExcludeMissing
    fun _lastEditedDt(): JsonField<String> = lastEditedDt

    /**
     * Returns the raw JSON value of [loc].
     *
     * Unlike [loc], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("loc") @ExcludeMissing fun _loc(): JsonField<Loc> = loc

    /**
     * Returns the raw JSON value of [locId].
     *
     * Unlike [locId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("locId") @ExcludeMissing fun _locId(): JsonField<String> = locId

    /**
     * Returns the raw JSON value of [numObservers].
     *
     * Unlike [numObservers], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("numObservers")
    @ExcludeMissing
    fun _numObservers(): JsonField<Long> = numObservers

    /**
     * Returns the raw JSON value of [numSpecies].
     *
     * Unlike [numSpecies], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("numSpecies") @ExcludeMissing fun _numSpecies(): JsonField<Int> = numSpecies

    /**
     * Returns the raw JSON value of [obs].
     *
     * Unlike [obs], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("obs") @ExcludeMissing fun _obs(): JsonField<List<Ob>> = obs

    /**
     * Returns the raw JSON value of [obsDt].
     *
     * Unlike [obsDt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("obsDt") @ExcludeMissing fun _obsDt(): JsonField<String> = obsDt

    /**
     * Returns the raw JSON value of [obsTime].
     *
     * Unlike [obsTime], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("obsTime") @ExcludeMissing fun _obsTime(): JsonField<String> = obsTime

    /**
     * Returns the raw JSON value of [obsTimeValid].
     *
     * Unlike [obsTimeValid], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("obsTimeValid")
    @ExcludeMissing
    fun _obsTimeValid(): JsonField<Boolean> = obsTimeValid

    /**
     * Returns the raw JSON value of [projId].
     *
     * Unlike [projId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("projId") @ExcludeMissing fun _projId(): JsonField<String> = projId

    /**
     * Returns the raw JSON value of [protocolId].
     *
     * Unlike [protocolId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("protocolId") @ExcludeMissing fun _protocolId(): JsonField<String> = protocolId

    /**
     * Returns the raw JSON value of [subId].
     *
     * Unlike [subId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("subId") @ExcludeMissing fun _subId(): JsonField<String> = subId

    /**
     * Returns the raw JSON value of [submissionMethodCode].
     *
     * Unlike [submissionMethodCode], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("submissionMethodCode")
    @ExcludeMissing
    fun _submissionMethodCode(): JsonField<String> = submissionMethodCode

    /**
     * Returns the raw JSON value of [subnational1Code].
     *
     * Unlike [subnational1Code], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("subnational1Code")
    @ExcludeMissing
    fun _subnational1Code(): JsonField<String> = subnational1Code

    /**
     * Returns the raw JSON value of [userDisplayName].
     *
     * Unlike [userDisplayName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("userDisplayName")
    @ExcludeMissing
    fun _userDisplayName(): JsonField<String> = userDisplayName

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

        /** Returns a mutable builder for constructing an instance of [ListRetrieveResponse]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ListRetrieveResponse]. */
    class Builder internal constructor() {

        private var allObsReported: JsonField<Boolean> = JsonMissing.of()
        private var checklistId: JsonField<String> = JsonMissing.of()
        private var creationDt: JsonField<String> = JsonMissing.of()
        private var durationHrs: JsonField<Double> = JsonMissing.of()
        private var isoObsDate: JsonField<String> = JsonMissing.of()
        private var lastEditedDt: JsonField<String> = JsonMissing.of()
        private var loc: JsonField<Loc> = JsonMissing.of()
        private var locId: JsonField<String> = JsonMissing.of()
        private var numObservers: JsonField<Long> = JsonMissing.of()
        private var numSpecies: JsonField<Int> = JsonMissing.of()
        private var obs: JsonField<MutableList<Ob>>? = null
        private var obsDt: JsonField<String> = JsonMissing.of()
        private var obsTime: JsonField<String> = JsonMissing.of()
        private var obsTimeValid: JsonField<Boolean> = JsonMissing.of()
        private var projId: JsonField<String> = JsonMissing.of()
        private var protocolId: JsonField<String> = JsonMissing.of()
        private var subId: JsonField<String> = JsonMissing.of()
        private var submissionMethodCode: JsonField<String> = JsonMissing.of()
        private var subnational1Code: JsonField<String> = JsonMissing.of()
        private var userDisplayName: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(listRetrieveResponse: ListRetrieveResponse) = apply {
            allObsReported = listRetrieveResponse.allObsReported
            checklistId = listRetrieveResponse.checklistId
            creationDt = listRetrieveResponse.creationDt
            durationHrs = listRetrieveResponse.durationHrs
            isoObsDate = listRetrieveResponse.isoObsDate
            lastEditedDt = listRetrieveResponse.lastEditedDt
            loc = listRetrieveResponse.loc
            locId = listRetrieveResponse.locId
            numObservers = listRetrieveResponse.numObservers
            numSpecies = listRetrieveResponse.numSpecies
            obs = listRetrieveResponse.obs.map { it.toMutableList() }
            obsDt = listRetrieveResponse.obsDt
            obsTime = listRetrieveResponse.obsTime
            obsTimeValid = listRetrieveResponse.obsTimeValid
            projId = listRetrieveResponse.projId
            protocolId = listRetrieveResponse.protocolId
            subId = listRetrieveResponse.subId
            submissionMethodCode = listRetrieveResponse.submissionMethodCode
            subnational1Code = listRetrieveResponse.subnational1Code
            userDisplayName = listRetrieveResponse.userDisplayName
            additionalProperties = listRetrieveResponse.additionalProperties.toMutableMap()
        }

        fun allObsReported(allObsReported: Boolean) = allObsReported(JsonField.of(allObsReported))

        /**
         * Sets [Builder.allObsReported] to an arbitrary JSON value.
         *
         * You should usually call [Builder.allObsReported] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun allObsReported(allObsReported: JsonField<Boolean>) = apply {
            this.allObsReported = allObsReported
        }

        fun checklistId(checklistId: String) = checklistId(JsonField.of(checklistId))

        /**
         * Sets [Builder.checklistId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.checklistId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun checklistId(checklistId: JsonField<String>) = apply { this.checklistId = checklistId }

        fun creationDt(creationDt: String) = creationDt(JsonField.of(creationDt))

        /**
         * Sets [Builder.creationDt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.creationDt] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun creationDt(creationDt: JsonField<String>) = apply { this.creationDt = creationDt }

        fun durationHrs(durationHrs: Double) = durationHrs(JsonField.of(durationHrs))

        /**
         * Sets [Builder.durationHrs] to an arbitrary JSON value.
         *
         * You should usually call [Builder.durationHrs] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun durationHrs(durationHrs: JsonField<Double>) = apply { this.durationHrs = durationHrs }

        fun isoObsDate(isoObsDate: String) = isoObsDate(JsonField.of(isoObsDate))

        /**
         * Sets [Builder.isoObsDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.isoObsDate] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun isoObsDate(isoObsDate: JsonField<String>) = apply { this.isoObsDate = isoObsDate }

        fun lastEditedDt(lastEditedDt: String) = lastEditedDt(JsonField.of(lastEditedDt))

        /**
         * Sets [Builder.lastEditedDt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lastEditedDt] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun lastEditedDt(lastEditedDt: JsonField<String>) = apply {
            this.lastEditedDt = lastEditedDt
        }

        fun loc(loc: Loc) = loc(JsonField.of(loc))

        /**
         * Sets [Builder.loc] to an arbitrary JSON value.
         *
         * You should usually call [Builder.loc] with a well-typed [Loc] value instead. This method
         * is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun loc(loc: JsonField<Loc>) = apply { this.loc = loc }

        fun locId(locId: String) = locId(JsonField.of(locId))

        /**
         * Sets [Builder.locId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.locId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun locId(locId: JsonField<String>) = apply { this.locId = locId }

        fun numObservers(numObservers: Long) = numObservers(JsonField.of(numObservers))

        /**
         * Sets [Builder.numObservers] to an arbitrary JSON value.
         *
         * You should usually call [Builder.numObservers] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun numObservers(numObservers: JsonField<Long>) = apply { this.numObservers = numObservers }

        fun numSpecies(numSpecies: Int) = numSpecies(JsonField.of(numSpecies))

        /**
         * Sets [Builder.numSpecies] to an arbitrary JSON value.
         *
         * You should usually call [Builder.numSpecies] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun numSpecies(numSpecies: JsonField<Int>) = apply { this.numSpecies = numSpecies }

        fun obs(obs: List<Ob>) = obs(JsonField.of(obs))

        /**
         * Sets [Builder.obs] to an arbitrary JSON value.
         *
         * You should usually call [Builder.obs] with a well-typed `List<Ob>` value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun obs(obs: JsonField<List<Ob>>) = apply { this.obs = obs.map { it.toMutableList() } }

        /**
         * Adds a single [Ob] to [obs].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addOb(ob: Ob) = apply {
            obs = (obs ?: JsonField.of(mutableListOf())).also { checkKnown("obs", it).add(ob) }
        }

        fun obsDt(obsDt: String) = obsDt(JsonField.of(obsDt))

        /**
         * Sets [Builder.obsDt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.obsDt] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun obsDt(obsDt: JsonField<String>) = apply { this.obsDt = obsDt }

        fun obsTime(obsTime: String) = obsTime(JsonField.of(obsTime))

        /**
         * Sets [Builder.obsTime] to an arbitrary JSON value.
         *
         * You should usually call [Builder.obsTime] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun obsTime(obsTime: JsonField<String>) = apply { this.obsTime = obsTime }

        fun obsTimeValid(obsTimeValid: Boolean) = obsTimeValid(JsonField.of(obsTimeValid))

        /**
         * Sets [Builder.obsTimeValid] to an arbitrary JSON value.
         *
         * You should usually call [Builder.obsTimeValid] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun obsTimeValid(obsTimeValid: JsonField<Boolean>) = apply {
            this.obsTimeValid = obsTimeValid
        }

        fun projId(projId: String) = projId(JsonField.of(projId))

        /**
         * Sets [Builder.projId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.projId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun projId(projId: JsonField<String>) = apply { this.projId = projId }

        fun protocolId(protocolId: String) = protocolId(JsonField.of(protocolId))

        /**
         * Sets [Builder.protocolId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.protocolId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun protocolId(protocolId: JsonField<String>) = apply { this.protocolId = protocolId }

        fun subId(subId: String) = subId(JsonField.of(subId))

        /**
         * Sets [Builder.subId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.subId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun subId(subId: JsonField<String>) = apply { this.subId = subId }

        fun submissionMethodCode(submissionMethodCode: String) =
            submissionMethodCode(JsonField.of(submissionMethodCode))

        /**
         * Sets [Builder.submissionMethodCode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.submissionMethodCode] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun submissionMethodCode(submissionMethodCode: JsonField<String>) = apply {
            this.submissionMethodCode = submissionMethodCode
        }

        fun subnational1Code(subnational1Code: String) =
            subnational1Code(JsonField.of(subnational1Code))

        /**
         * Sets [Builder.subnational1Code] to an arbitrary JSON value.
         *
         * You should usually call [Builder.subnational1Code] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun subnational1Code(subnational1Code: JsonField<String>) = apply {
            this.subnational1Code = subnational1Code
        }

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
         * Returns an immutable instance of [ListRetrieveResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): ListRetrieveResponse =
            ListRetrieveResponse(
                allObsReported,
                checklistId,
                creationDt,
                durationHrs,
                isoObsDate,
                lastEditedDt,
                loc,
                locId,
                numObservers,
                numSpecies,
                (obs ?: JsonMissing.of()).map { it.toImmutable() },
                obsDt,
                obsTime,
                obsTimeValid,
                projId,
                protocolId,
                subId,
                submissionMethodCode,
                subnational1Code,
                userDisplayName,
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
    fun validate(): ListRetrieveResponse = apply {
        if (validated) {
            return@apply
        }

        allObsReported()
        checklistId()
        creationDt()
        durationHrs()
        isoObsDate()
        lastEditedDt()
        loc().ifPresent { it.validate() }
        locId()
        numObservers()
        numSpecies()
        obs().ifPresent { it.forEach { it.validate() } }
        obsDt()
        obsTime()
        obsTimeValid()
        projId()
        protocolId()
        subId()
        submissionMethodCode()
        subnational1Code()
        userDisplayName()
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
        (if (allObsReported.asKnown().isPresent) 1 else 0) +
            (if (checklistId.asKnown().isPresent) 1 else 0) +
            (if (creationDt.asKnown().isPresent) 1 else 0) +
            (if (durationHrs.asKnown().isPresent) 1 else 0) +
            (if (isoObsDate.asKnown().isPresent) 1 else 0) +
            (if (lastEditedDt.asKnown().isPresent) 1 else 0) +
            (loc.asKnown().getOrNull()?.validity() ?: 0) +
            (if (locId.asKnown().isPresent) 1 else 0) +
            (if (numObservers.asKnown().isPresent) 1 else 0) +
            (if (numSpecies.asKnown().isPresent) 1 else 0) +
            (obs.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (obsDt.asKnown().isPresent) 1 else 0) +
            (if (obsTime.asKnown().isPresent) 1 else 0) +
            (if (obsTimeValid.asKnown().isPresent) 1 else 0) +
            (if (projId.asKnown().isPresent) 1 else 0) +
            (if (protocolId.asKnown().isPresent) 1 else 0) +
            (if (subId.asKnown().isPresent) 1 else 0) +
            (if (submissionMethodCode.asKnown().isPresent) 1 else 0) +
            (if (subnational1Code.asKnown().isPresent) 1 else 0) +
            (if (userDisplayName.asKnown().isPresent) 1 else 0)

    class Loc
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val countryCode: JsonField<String>,
        private val countryName: JsonField<String>,
        private val hierarchicalName: JsonField<String>,
        private val isHotspot: JsonField<Boolean>,
        private val lat: JsonField<Double>,
        private val latitude: JsonField<Double>,
        private val lng: JsonField<Double>,
        private val locId: JsonField<String>,
        private val locName: JsonField<String>,
        private val longitude: JsonField<Double>,
        private val name: JsonField<String>,
        private val subnational1Code: JsonField<String>,
        private val subnational1Name: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("countryCode")
            @ExcludeMissing
            countryCode: JsonField<String> = JsonMissing.of(),
            @JsonProperty("countryName")
            @ExcludeMissing
            countryName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("hierarchicalName")
            @ExcludeMissing
            hierarchicalName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("isHotspot")
            @ExcludeMissing
            isHotspot: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("lat") @ExcludeMissing lat: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("latitude")
            @ExcludeMissing
            latitude: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("lng") @ExcludeMissing lng: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("locId") @ExcludeMissing locId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("locName") @ExcludeMissing locName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("longitude")
            @ExcludeMissing
            longitude: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("subnational1Code")
            @ExcludeMissing
            subnational1Code: JsonField<String> = JsonMissing.of(),
            @JsonProperty("subnational1Name")
            @ExcludeMissing
            subnational1Name: JsonField<String> = JsonMissing.of(),
        ) : this(
            countryCode,
            countryName,
            hierarchicalName,
            isHotspot,
            lat,
            latitude,
            lng,
            locId,
            locName,
            longitude,
            name,
            subnational1Code,
            subnational1Name,
            mutableMapOf(),
        )

        /**
         * @throws PhoebeInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun countryCode(): Optional<String> = countryCode.getOptional("countryCode")

        /**
         * @throws PhoebeInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun countryName(): Optional<String> = countryName.getOptional("countryName")

        /**
         * @throws PhoebeInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun hierarchicalName(): Optional<String> = hierarchicalName.getOptional("hierarchicalName")

        /**
         * @throws PhoebeInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun isHotspot(): Optional<Boolean> = isHotspot.getOptional("isHotspot")

        /**
         * @throws PhoebeInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun lat(): Optional<Double> = lat.getOptional("lat")

        /**
         * @throws PhoebeInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun latitude(): Optional<Double> = latitude.getOptional("latitude")

        /**
         * @throws PhoebeInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun lng(): Optional<Double> = lng.getOptional("lng")

        /**
         * @throws PhoebeInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun locId(): Optional<String> = locId.getOptional("locId")

        /**
         * @throws PhoebeInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun locName(): Optional<String> = locName.getOptional("locName")

        /**
         * @throws PhoebeInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun longitude(): Optional<Double> = longitude.getOptional("longitude")

        /**
         * @throws PhoebeInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun name(): Optional<String> = name.getOptional("name")

        /**
         * @throws PhoebeInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun subnational1Code(): Optional<String> = subnational1Code.getOptional("subnational1Code")

        /**
         * @throws PhoebeInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun subnational1Name(): Optional<String> = subnational1Name.getOptional("subnational1Name")

        /**
         * Returns the raw JSON value of [countryCode].
         *
         * Unlike [countryCode], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("countryCode")
        @ExcludeMissing
        fun _countryCode(): JsonField<String> = countryCode

        /**
         * Returns the raw JSON value of [countryName].
         *
         * Unlike [countryName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("countryName")
        @ExcludeMissing
        fun _countryName(): JsonField<String> = countryName

        /**
         * Returns the raw JSON value of [hierarchicalName].
         *
         * Unlike [hierarchicalName], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("hierarchicalName")
        @ExcludeMissing
        fun _hierarchicalName(): JsonField<String> = hierarchicalName

        /**
         * Returns the raw JSON value of [isHotspot].
         *
         * Unlike [isHotspot], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("isHotspot") @ExcludeMissing fun _isHotspot(): JsonField<Boolean> = isHotspot

        /**
         * Returns the raw JSON value of [lat].
         *
         * Unlike [lat], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("lat") @ExcludeMissing fun _lat(): JsonField<Double> = lat

        /**
         * Returns the raw JSON value of [latitude].
         *
         * Unlike [latitude], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("latitude") @ExcludeMissing fun _latitude(): JsonField<Double> = latitude

        /**
         * Returns the raw JSON value of [lng].
         *
         * Unlike [lng], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("lng") @ExcludeMissing fun _lng(): JsonField<Double> = lng

        /**
         * Returns the raw JSON value of [locId].
         *
         * Unlike [locId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("locId") @ExcludeMissing fun _locId(): JsonField<String> = locId

        /**
         * Returns the raw JSON value of [locName].
         *
         * Unlike [locName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("locName") @ExcludeMissing fun _locName(): JsonField<String> = locName

        /**
         * Returns the raw JSON value of [longitude].
         *
         * Unlike [longitude], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("longitude") @ExcludeMissing fun _longitude(): JsonField<Double> = longitude

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * Returns the raw JSON value of [subnational1Code].
         *
         * Unlike [subnational1Code], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("subnational1Code")
        @ExcludeMissing
        fun _subnational1Code(): JsonField<String> = subnational1Code

        /**
         * Returns the raw JSON value of [subnational1Name].
         *
         * Unlike [subnational1Name], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("subnational1Name")
        @ExcludeMissing
        fun _subnational1Name(): JsonField<String> = subnational1Name

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

            /** Returns a mutable builder for constructing an instance of [Loc]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Loc]. */
        class Builder internal constructor() {

            private var countryCode: JsonField<String> = JsonMissing.of()
            private var countryName: JsonField<String> = JsonMissing.of()
            private var hierarchicalName: JsonField<String> = JsonMissing.of()
            private var isHotspot: JsonField<Boolean> = JsonMissing.of()
            private var lat: JsonField<Double> = JsonMissing.of()
            private var latitude: JsonField<Double> = JsonMissing.of()
            private var lng: JsonField<Double> = JsonMissing.of()
            private var locId: JsonField<String> = JsonMissing.of()
            private var locName: JsonField<String> = JsonMissing.of()
            private var longitude: JsonField<Double> = JsonMissing.of()
            private var name: JsonField<String> = JsonMissing.of()
            private var subnational1Code: JsonField<String> = JsonMissing.of()
            private var subnational1Name: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(loc: Loc) = apply {
                countryCode = loc.countryCode
                countryName = loc.countryName
                hierarchicalName = loc.hierarchicalName
                isHotspot = loc.isHotspot
                lat = loc.lat
                latitude = loc.latitude
                lng = loc.lng
                locId = loc.locId
                locName = loc.locName
                longitude = loc.longitude
                name = loc.name
                subnational1Code = loc.subnational1Code
                subnational1Name = loc.subnational1Name
                additionalProperties = loc.additionalProperties.toMutableMap()
            }

            fun countryCode(countryCode: String) = countryCode(JsonField.of(countryCode))

            /**
             * Sets [Builder.countryCode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.countryCode] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun countryCode(countryCode: JsonField<String>) = apply {
                this.countryCode = countryCode
            }

            fun countryName(countryName: String) = countryName(JsonField.of(countryName))

            /**
             * Sets [Builder.countryName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.countryName] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun countryName(countryName: JsonField<String>) = apply {
                this.countryName = countryName
            }

            fun hierarchicalName(hierarchicalName: String) =
                hierarchicalName(JsonField.of(hierarchicalName))

            /**
             * Sets [Builder.hierarchicalName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.hierarchicalName] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun hierarchicalName(hierarchicalName: JsonField<String>) = apply {
                this.hierarchicalName = hierarchicalName
            }

            fun isHotspot(isHotspot: Boolean) = isHotspot(JsonField.of(isHotspot))

            /**
             * Sets [Builder.isHotspot] to an arbitrary JSON value.
             *
             * You should usually call [Builder.isHotspot] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun isHotspot(isHotspot: JsonField<Boolean>) = apply { this.isHotspot = isHotspot }

            fun lat(lat: Double) = lat(JsonField.of(lat))

            /**
             * Sets [Builder.lat] to an arbitrary JSON value.
             *
             * You should usually call [Builder.lat] with a well-typed [Double] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun lat(lat: JsonField<Double>) = apply { this.lat = lat }

            fun latitude(latitude: Double) = latitude(JsonField.of(latitude))

            /**
             * Sets [Builder.latitude] to an arbitrary JSON value.
             *
             * You should usually call [Builder.latitude] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun latitude(latitude: JsonField<Double>) = apply { this.latitude = latitude }

            fun lng(lng: Double) = lng(JsonField.of(lng))

            /**
             * Sets [Builder.lng] to an arbitrary JSON value.
             *
             * You should usually call [Builder.lng] with a well-typed [Double] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun lng(lng: JsonField<Double>) = apply { this.lng = lng }

            fun locId(locId: String) = locId(JsonField.of(locId))

            /**
             * Sets [Builder.locId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.locId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun locId(locId: JsonField<String>) = apply { this.locId = locId }

            fun locName(locName: String) = locName(JsonField.of(locName))

            /**
             * Sets [Builder.locName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.locName] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun locName(locName: JsonField<String>) = apply { this.locName = locName }

            fun longitude(longitude: Double) = longitude(JsonField.of(longitude))

            /**
             * Sets [Builder.longitude] to an arbitrary JSON value.
             *
             * You should usually call [Builder.longitude] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun longitude(longitude: JsonField<Double>) = apply { this.longitude = longitude }

            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            fun subnational1Code(subnational1Code: String) =
                subnational1Code(JsonField.of(subnational1Code))

            /**
             * Sets [Builder.subnational1Code] to an arbitrary JSON value.
             *
             * You should usually call [Builder.subnational1Code] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun subnational1Code(subnational1Code: JsonField<String>) = apply {
                this.subnational1Code = subnational1Code
            }

            fun subnational1Name(subnational1Name: String) =
                subnational1Name(JsonField.of(subnational1Name))

            /**
             * Sets [Builder.subnational1Name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.subnational1Name] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun subnational1Name(subnational1Name: JsonField<String>) = apply {
                this.subnational1Name = subnational1Name
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
             * Returns an immutable instance of [Loc].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Loc =
                Loc(
                    countryCode,
                    countryName,
                    hierarchicalName,
                    isHotspot,
                    lat,
                    latitude,
                    lng,
                    locId,
                    locName,
                    longitude,
                    name,
                    subnational1Code,
                    subnational1Name,
                    additionalProperties.toMutableMap(),
                )
        }

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
        fun validate(): Loc = apply {
            if (validated) {
                return@apply
            }

            countryCode()
            countryName()
            hierarchicalName()
            isHotspot()
            lat()
            latitude()
            lng()
            locId()
            locName()
            longitude()
            name()
            subnational1Code()
            subnational1Name()
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
        @JvmSynthetic
        internal fun validity(): Int =
            (if (countryCode.asKnown().isPresent) 1 else 0) +
                (if (countryName.asKnown().isPresent) 1 else 0) +
                (if (hierarchicalName.asKnown().isPresent) 1 else 0) +
                (if (isHotspot.asKnown().isPresent) 1 else 0) +
                (if (lat.asKnown().isPresent) 1 else 0) +
                (if (latitude.asKnown().isPresent) 1 else 0) +
                (if (lng.asKnown().isPresent) 1 else 0) +
                (if (locId.asKnown().isPresent) 1 else 0) +
                (if (locName.asKnown().isPresent) 1 else 0) +
                (if (longitude.asKnown().isPresent) 1 else 0) +
                (if (name.asKnown().isPresent) 1 else 0) +
                (if (subnational1Code.asKnown().isPresent) 1 else 0) +
                (if (subnational1Name.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Loc &&
                countryCode == other.countryCode &&
                countryName == other.countryName &&
                hierarchicalName == other.hierarchicalName &&
                isHotspot == other.isHotspot &&
                lat == other.lat &&
                latitude == other.latitude &&
                lng == other.lng &&
                locId == other.locId &&
                locName == other.locName &&
                longitude == other.longitude &&
                name == other.name &&
                subnational1Code == other.subnational1Code &&
                subnational1Name == other.subnational1Name &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                countryCode,
                countryName,
                hierarchicalName,
                isHotspot,
                lat,
                latitude,
                lng,
                locId,
                locName,
                longitude,
                name,
                subnational1Code,
                subnational1Name,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Loc{countryCode=$countryCode, countryName=$countryName, hierarchicalName=$hierarchicalName, isHotspot=$isHotspot, lat=$lat, latitude=$latitude, lng=$lng, locId=$locId, locName=$locName, longitude=$longitude, name=$name, subnational1Code=$subnational1Code, subnational1Name=$subnational1Name, additionalProperties=$additionalProperties}"
    }

    class Ob
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val obsAux: JsonField<List<ObsAux>>,
        private val obsDt: JsonField<String>,
        private val obsId: JsonField<String>,
        private val speciesCode: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("obsAux")
            @ExcludeMissing
            obsAux: JsonField<List<ObsAux>> = JsonMissing.of(),
            @JsonProperty("obsDt") @ExcludeMissing obsDt: JsonField<String> = JsonMissing.of(),
            @JsonProperty("obsId") @ExcludeMissing obsId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("speciesCode")
            @ExcludeMissing
            speciesCode: JsonField<String> = JsonMissing.of(),
        ) : this(obsAux, obsDt, obsId, speciesCode, mutableMapOf())

        /**
         * @throws PhoebeInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun obsAux(): Optional<List<ObsAux>> = obsAux.getOptional("obsAux")

        /**
         * @throws PhoebeInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun obsDt(): Optional<String> = obsDt.getOptional("obsDt")

        /**
         * @throws PhoebeInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun obsId(): Optional<String> = obsId.getOptional("obsId")

        /**
         * @throws PhoebeInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun speciesCode(): Optional<String> = speciesCode.getOptional("speciesCode")

        /**
         * Returns the raw JSON value of [obsAux].
         *
         * Unlike [obsAux], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("obsAux") @ExcludeMissing fun _obsAux(): JsonField<List<ObsAux>> = obsAux

        /**
         * Returns the raw JSON value of [obsDt].
         *
         * Unlike [obsDt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("obsDt") @ExcludeMissing fun _obsDt(): JsonField<String> = obsDt

        /**
         * Returns the raw JSON value of [obsId].
         *
         * Unlike [obsId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("obsId") @ExcludeMissing fun _obsId(): JsonField<String> = obsId

        /**
         * Returns the raw JSON value of [speciesCode].
         *
         * Unlike [speciesCode], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("speciesCode")
        @ExcludeMissing
        fun _speciesCode(): JsonField<String> = speciesCode

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

            /** Returns a mutable builder for constructing an instance of [Ob]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Ob]. */
        class Builder internal constructor() {

            private var obsAux: JsonField<MutableList<ObsAux>>? = null
            private var obsDt: JsonField<String> = JsonMissing.of()
            private var obsId: JsonField<String> = JsonMissing.of()
            private var speciesCode: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(ob: Ob) = apply {
                obsAux = ob.obsAux.map { it.toMutableList() }
                obsDt = ob.obsDt
                obsId = ob.obsId
                speciesCode = ob.speciesCode
                additionalProperties = ob.additionalProperties.toMutableMap()
            }

            fun obsAux(obsAux: List<ObsAux>) = obsAux(JsonField.of(obsAux))

            /**
             * Sets [Builder.obsAux] to an arbitrary JSON value.
             *
             * You should usually call [Builder.obsAux] with a well-typed `List<ObsAux>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun obsAux(obsAux: JsonField<List<ObsAux>>) = apply {
                this.obsAux = obsAux.map { it.toMutableList() }
            }

            /**
             * Adds a single [ObsAux] to [Builder.obsAux].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addObsAux(obsAux: ObsAux) = apply {
                this.obsAux =
                    (this.obsAux ?: JsonField.of(mutableListOf())).also {
                        checkKnown("obsAux", it).add(obsAux)
                    }
            }

            fun obsDt(obsDt: String) = obsDt(JsonField.of(obsDt))

            /**
             * Sets [Builder.obsDt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.obsDt] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun obsDt(obsDt: JsonField<String>) = apply { this.obsDt = obsDt }

            fun obsId(obsId: String) = obsId(JsonField.of(obsId))

            /**
             * Sets [Builder.obsId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.obsId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun obsId(obsId: JsonField<String>) = apply { this.obsId = obsId }

            fun speciesCode(speciesCode: String) = speciesCode(JsonField.of(speciesCode))

            /**
             * Sets [Builder.speciesCode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.speciesCode] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun speciesCode(speciesCode: JsonField<String>) = apply {
                this.speciesCode = speciesCode
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
             * Returns an immutable instance of [Ob].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Ob =
                Ob(
                    (obsAux ?: JsonMissing.of()).map { it.toImmutable() },
                    obsDt,
                    obsId,
                    speciesCode,
                    additionalProperties.toMutableMap(),
                )
        }

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
        fun validate(): Ob = apply {
            if (validated) {
                return@apply
            }

            obsAux().ifPresent { it.forEach { it.validate() } }
            obsDt()
            obsId()
            speciesCode()
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
        @JvmSynthetic
        internal fun validity(): Int =
            (obsAux.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (obsDt.asKnown().isPresent) 1 else 0) +
                (if (obsId.asKnown().isPresent) 1 else 0) +
                (if (speciesCode.asKnown().isPresent) 1 else 0)

        class ObsAux
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val auxCode: JsonField<String>,
            private val entryMethodCode: JsonField<String>,
            private val fieldName: JsonField<String>,
            private val obsId: JsonField<String>,
            private val speciesCode: JsonField<String>,
            private val subId: JsonField<String>,
            private val value: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("auxCode")
                @ExcludeMissing
                auxCode: JsonField<String> = JsonMissing.of(),
                @JsonProperty("entryMethodCode")
                @ExcludeMissing
                entryMethodCode: JsonField<String> = JsonMissing.of(),
                @JsonProperty("fieldName")
                @ExcludeMissing
                fieldName: JsonField<String> = JsonMissing.of(),
                @JsonProperty("obsId") @ExcludeMissing obsId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("speciesCode")
                @ExcludeMissing
                speciesCode: JsonField<String> = JsonMissing.of(),
                @JsonProperty("subId") @ExcludeMissing subId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("value") @ExcludeMissing value: JsonField<String> = JsonMissing.of(),
            ) : this(
                auxCode,
                entryMethodCode,
                fieldName,
                obsId,
                speciesCode,
                subId,
                value,
                mutableMapOf(),
            )

            /**
             * @throws PhoebeInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun auxCode(): Optional<String> = auxCode.getOptional("auxCode")

            /**
             * @throws PhoebeInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun entryMethodCode(): Optional<String> = entryMethodCode.getOptional("entryMethodCode")

            /**
             * @throws PhoebeInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun fieldName(): Optional<String> = fieldName.getOptional("fieldName")

            /**
             * @throws PhoebeInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun obsId(): Optional<String> = obsId.getOptional("obsId")

            /**
             * @throws PhoebeInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun speciesCode(): Optional<String> = speciesCode.getOptional("speciesCode")

            /**
             * @throws PhoebeInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun subId(): Optional<String> = subId.getOptional("subId")

            /**
             * @throws PhoebeInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun value(): Optional<String> = value.getOptional("value")

            /**
             * Returns the raw JSON value of [auxCode].
             *
             * Unlike [auxCode], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("auxCode") @ExcludeMissing fun _auxCode(): JsonField<String> = auxCode

            /**
             * Returns the raw JSON value of [entryMethodCode].
             *
             * Unlike [entryMethodCode], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("entryMethodCode")
            @ExcludeMissing
            fun _entryMethodCode(): JsonField<String> = entryMethodCode

            /**
             * Returns the raw JSON value of [fieldName].
             *
             * Unlike [fieldName], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("fieldName")
            @ExcludeMissing
            fun _fieldName(): JsonField<String> = fieldName

            /**
             * Returns the raw JSON value of [obsId].
             *
             * Unlike [obsId], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("obsId") @ExcludeMissing fun _obsId(): JsonField<String> = obsId

            /**
             * Returns the raw JSON value of [speciesCode].
             *
             * Unlike [speciesCode], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("speciesCode")
            @ExcludeMissing
            fun _speciesCode(): JsonField<String> = speciesCode

            /**
             * Returns the raw JSON value of [subId].
             *
             * Unlike [subId], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("subId") @ExcludeMissing fun _subId(): JsonField<String> = subId

            /**
             * Returns the raw JSON value of [value].
             *
             * Unlike [value], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("value") @ExcludeMissing fun _value(): JsonField<String> = value

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

                /** Returns a mutable builder for constructing an instance of [ObsAux]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [ObsAux]. */
            class Builder internal constructor() {

                private var auxCode: JsonField<String> = JsonMissing.of()
                private var entryMethodCode: JsonField<String> = JsonMissing.of()
                private var fieldName: JsonField<String> = JsonMissing.of()
                private var obsId: JsonField<String> = JsonMissing.of()
                private var speciesCode: JsonField<String> = JsonMissing.of()
                private var subId: JsonField<String> = JsonMissing.of()
                private var value: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(obsAux: ObsAux) = apply {
                    auxCode = obsAux.auxCode
                    entryMethodCode = obsAux.entryMethodCode
                    fieldName = obsAux.fieldName
                    obsId = obsAux.obsId
                    speciesCode = obsAux.speciesCode
                    subId = obsAux.subId
                    value = obsAux.value
                    additionalProperties = obsAux.additionalProperties.toMutableMap()
                }

                fun auxCode(auxCode: String) = auxCode(JsonField.of(auxCode))

                /**
                 * Sets [Builder.auxCode] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.auxCode] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun auxCode(auxCode: JsonField<String>) = apply { this.auxCode = auxCode }

                fun entryMethodCode(entryMethodCode: String) =
                    entryMethodCode(JsonField.of(entryMethodCode))

                /**
                 * Sets [Builder.entryMethodCode] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.entryMethodCode] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun entryMethodCode(entryMethodCode: JsonField<String>) = apply {
                    this.entryMethodCode = entryMethodCode
                }

                fun fieldName(fieldName: String) = fieldName(JsonField.of(fieldName))

                /**
                 * Sets [Builder.fieldName] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.fieldName] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun fieldName(fieldName: JsonField<String>) = apply { this.fieldName = fieldName }

                fun obsId(obsId: String) = obsId(JsonField.of(obsId))

                /**
                 * Sets [Builder.obsId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.obsId] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun obsId(obsId: JsonField<String>) = apply { this.obsId = obsId }

                fun speciesCode(speciesCode: String) = speciesCode(JsonField.of(speciesCode))

                /**
                 * Sets [Builder.speciesCode] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.speciesCode] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun speciesCode(speciesCode: JsonField<String>) = apply {
                    this.speciesCode = speciesCode
                }

                fun subId(subId: String) = subId(JsonField.of(subId))

                /**
                 * Sets [Builder.subId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.subId] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun subId(subId: JsonField<String>) = apply { this.subId = subId }

                fun value(value: String) = value(JsonField.of(value))

                /**
                 * Sets [Builder.value] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.value] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun value(value: JsonField<String>) = apply { this.value = value }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [ObsAux].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): ObsAux =
                    ObsAux(
                        auxCode,
                        entryMethodCode,
                        fieldName,
                        obsId,
                        speciesCode,
                        subId,
                        value,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws PhoebeInvalidDataException if any value type in this object doesn't match its
             *   expected type.
             */
            fun validate(): ObsAux = apply {
                if (validated) {
                    return@apply
                }

                auxCode()
                entryMethodCode()
                fieldName()
                obsId()
                speciesCode()
                subId()
                value()
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
            @JvmSynthetic
            internal fun validity(): Int =
                (if (auxCode.asKnown().isPresent) 1 else 0) +
                    (if (entryMethodCode.asKnown().isPresent) 1 else 0) +
                    (if (fieldName.asKnown().isPresent) 1 else 0) +
                    (if (obsId.asKnown().isPresent) 1 else 0) +
                    (if (speciesCode.asKnown().isPresent) 1 else 0) +
                    (if (subId.asKnown().isPresent) 1 else 0) +
                    (if (value.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is ObsAux &&
                    auxCode == other.auxCode &&
                    entryMethodCode == other.entryMethodCode &&
                    fieldName == other.fieldName &&
                    obsId == other.obsId &&
                    speciesCode == other.speciesCode &&
                    subId == other.subId &&
                    value == other.value &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    auxCode,
                    entryMethodCode,
                    fieldName,
                    obsId,
                    speciesCode,
                    subId,
                    value,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "ObsAux{auxCode=$auxCode, entryMethodCode=$entryMethodCode, fieldName=$fieldName, obsId=$obsId, speciesCode=$speciesCode, subId=$subId, value=$value, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Ob &&
                obsAux == other.obsAux &&
                obsDt == other.obsDt &&
                obsId == other.obsId &&
                speciesCode == other.speciesCode &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(obsAux, obsDt, obsId, speciesCode, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Ob{obsAux=$obsAux, obsDt=$obsDt, obsId=$obsId, speciesCode=$speciesCode, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ListRetrieveResponse &&
            allObsReported == other.allObsReported &&
            checklistId == other.checklistId &&
            creationDt == other.creationDt &&
            durationHrs == other.durationHrs &&
            isoObsDate == other.isoObsDate &&
            lastEditedDt == other.lastEditedDt &&
            loc == other.loc &&
            locId == other.locId &&
            numObservers == other.numObservers &&
            numSpecies == other.numSpecies &&
            obs == other.obs &&
            obsDt == other.obsDt &&
            obsTime == other.obsTime &&
            obsTimeValid == other.obsTimeValid &&
            projId == other.projId &&
            protocolId == other.protocolId &&
            subId == other.subId &&
            submissionMethodCode == other.submissionMethodCode &&
            subnational1Code == other.subnational1Code &&
            userDisplayName == other.userDisplayName &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            allObsReported,
            checklistId,
            creationDt,
            durationHrs,
            isoObsDate,
            lastEditedDt,
            loc,
            locId,
            numObservers,
            numSpecies,
            obs,
            obsDt,
            obsTime,
            obsTimeValid,
            projId,
            protocolId,
            subId,
            submissionMethodCode,
            subnational1Code,
            userDisplayName,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ListRetrieveResponse{allObsReported=$allObsReported, checklistId=$checklistId, creationDt=$creationDt, durationHrs=$durationHrs, isoObsDate=$isoObsDate, lastEditedDt=$lastEditedDt, loc=$loc, locId=$locId, numObservers=$numObservers, numSpecies=$numSpecies, obs=$obs, obsDt=$obsDt, obsTime=$obsTime, obsTimeValid=$obsTimeValid, projId=$projId, protocolId=$protocolId, subId=$subId, submissionMethodCode=$submissionMethodCode, subnational1Code=$subnational1Code, userDisplayName=$userDisplayName, additionalProperties=$additionalProperties}"
}
