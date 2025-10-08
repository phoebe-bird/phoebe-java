// File generated from our OpenAPI spec by Stainless.

package com.phoebe.api.models.data.observations

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

class Observation
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<Long>,
    private val comName: JsonField<String>,
    private val firstname: JsonField<String>,
    private val howMany: JsonField<Long>,
    private val lastname: JsonField<String>,
    private val lat: JsonField<Float>,
    private val lng: JsonField<Float>,
    private val locationPrivate: JsonField<Boolean>,
    private val locId: JsonField<String>,
    private val locName: JsonField<String>,
    private val obsDt: JsonField<String>,
    private val obsReviewed: JsonField<Boolean>,
    private val obsValid: JsonField<Boolean>,
    private val sciName: JsonField<String>,
    private val speciesCode: JsonField<String>,
    private val subId: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("comName") @ExcludeMissing comName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("firstname") @ExcludeMissing firstname: JsonField<String> = JsonMissing.of(),
        @JsonProperty("howMany") @ExcludeMissing howMany: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("lastname") @ExcludeMissing lastname: JsonField<String> = JsonMissing.of(),
        @JsonProperty("lat") @ExcludeMissing lat: JsonField<Float> = JsonMissing.of(),
        @JsonProperty("lng") @ExcludeMissing lng: JsonField<Float> = JsonMissing.of(),
        @JsonProperty("locationPrivate")
        @ExcludeMissing
        locationPrivate: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("locId") @ExcludeMissing locId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("locName") @ExcludeMissing locName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("obsDt") @ExcludeMissing obsDt: JsonField<String> = JsonMissing.of(),
        @JsonProperty("obsReviewed")
        @ExcludeMissing
        obsReviewed: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("obsValid") @ExcludeMissing obsValid: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("sciName") @ExcludeMissing sciName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("speciesCode")
        @ExcludeMissing
        speciesCode: JsonField<String> = JsonMissing.of(),
        @JsonProperty("subId") @ExcludeMissing subId: JsonField<String> = JsonMissing.of(),
    ) : this(
        id,
        comName,
        firstname,
        howMany,
        lastname,
        lat,
        lng,
        locationPrivate,
        locId,
        locName,
        obsDt,
        obsReviewed,
        obsValid,
        sciName,
        speciesCode,
        subId,
        mutableMapOf(),
    )

    /**
     * @throws PhoebeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun id(): Optional<Long> = id.getOptional("id")

    /**
     * @throws PhoebeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun comName(): Optional<String> = comName.getOptional("comName")

    /**
     * @throws PhoebeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun firstname(): Optional<String> = firstname.getOptional("firstname")

    /**
     * @throws PhoebeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun howMany(): Optional<Long> = howMany.getOptional("howMany")

    /**
     * @throws PhoebeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun lastname(): Optional<String> = lastname.getOptional("lastname")

    /**
     * @throws PhoebeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun lat(): Optional<Float> = lat.getOptional("lat")

    /**
     * @throws PhoebeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun lng(): Optional<Float> = lng.getOptional("lng")

    /**
     * @throws PhoebeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun locationPrivate(): Optional<Boolean> = locationPrivate.getOptional("locationPrivate")

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
    fun obsDt(): Optional<String> = obsDt.getOptional("obsDt")

    /**
     * @throws PhoebeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun obsReviewed(): Optional<Boolean> = obsReviewed.getOptional("obsReviewed")

    /**
     * @throws PhoebeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun obsValid(): Optional<Boolean> = obsValid.getOptional("obsValid")

    /**
     * @throws PhoebeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun sciName(): Optional<String> = sciName.getOptional("sciName")

    /**
     * @throws PhoebeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun speciesCode(): Optional<String> = speciesCode.getOptional("speciesCode")

    /**
     * @throws PhoebeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun subId(): Optional<String> = subId.getOptional("subId")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<Long> = id

    /**
     * Returns the raw JSON value of [comName].
     *
     * Unlike [comName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("comName") @ExcludeMissing fun _comName(): JsonField<String> = comName

    /**
     * Returns the raw JSON value of [firstname].
     *
     * Unlike [firstname], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("firstname") @ExcludeMissing fun _firstname(): JsonField<String> = firstname

    /**
     * Returns the raw JSON value of [howMany].
     *
     * Unlike [howMany], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("howMany") @ExcludeMissing fun _howMany(): JsonField<Long> = howMany

    /**
     * Returns the raw JSON value of [lastname].
     *
     * Unlike [lastname], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("lastname") @ExcludeMissing fun _lastname(): JsonField<String> = lastname

    /**
     * Returns the raw JSON value of [lat].
     *
     * Unlike [lat], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("lat") @ExcludeMissing fun _lat(): JsonField<Float> = lat

    /**
     * Returns the raw JSON value of [lng].
     *
     * Unlike [lng], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("lng") @ExcludeMissing fun _lng(): JsonField<Float> = lng

    /**
     * Returns the raw JSON value of [locationPrivate].
     *
     * Unlike [locationPrivate], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("locationPrivate")
    @ExcludeMissing
    fun _locationPrivate(): JsonField<Boolean> = locationPrivate

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
     * Returns the raw JSON value of [obsDt].
     *
     * Unlike [obsDt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("obsDt") @ExcludeMissing fun _obsDt(): JsonField<String> = obsDt

    /**
     * Returns the raw JSON value of [obsReviewed].
     *
     * Unlike [obsReviewed], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("obsReviewed")
    @ExcludeMissing
    fun _obsReviewed(): JsonField<Boolean> = obsReviewed

    /**
     * Returns the raw JSON value of [obsValid].
     *
     * Unlike [obsValid], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("obsValid") @ExcludeMissing fun _obsValid(): JsonField<Boolean> = obsValid

    /**
     * Returns the raw JSON value of [sciName].
     *
     * Unlike [sciName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("sciName") @ExcludeMissing fun _sciName(): JsonField<String> = sciName

    /**
     * Returns the raw JSON value of [speciesCode].
     *
     * Unlike [speciesCode], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("speciesCode") @ExcludeMissing fun _speciesCode(): JsonField<String> = speciesCode

    /**
     * Returns the raw JSON value of [subId].
     *
     * Unlike [subId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("subId") @ExcludeMissing fun _subId(): JsonField<String> = subId

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

        /** Returns a mutable builder for constructing an instance of [Observation]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [Observation]. */
    class Builder internal constructor() {

        private var id: JsonField<Long> = JsonMissing.of()
        private var comName: JsonField<String> = JsonMissing.of()
        private var firstname: JsonField<String> = JsonMissing.of()
        private var howMany: JsonField<Long> = JsonMissing.of()
        private var lastname: JsonField<String> = JsonMissing.of()
        private var lat: JsonField<Float> = JsonMissing.of()
        private var lng: JsonField<Float> = JsonMissing.of()
        private var locationPrivate: JsonField<Boolean> = JsonMissing.of()
        private var locId: JsonField<String> = JsonMissing.of()
        private var locName: JsonField<String> = JsonMissing.of()
        private var obsDt: JsonField<String> = JsonMissing.of()
        private var obsReviewed: JsonField<Boolean> = JsonMissing.of()
        private var obsValid: JsonField<Boolean> = JsonMissing.of()
        private var sciName: JsonField<String> = JsonMissing.of()
        private var speciesCode: JsonField<String> = JsonMissing.of()
        private var subId: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(observation: Observation) = apply {
            id = observation.id
            comName = observation.comName
            firstname = observation.firstname
            howMany = observation.howMany
            lastname = observation.lastname
            lat = observation.lat
            lng = observation.lng
            locationPrivate = observation.locationPrivate
            locId = observation.locId
            locName = observation.locName
            obsDt = observation.obsDt
            obsReviewed = observation.obsReviewed
            obsValid = observation.obsValid
            sciName = observation.sciName
            speciesCode = observation.speciesCode
            subId = observation.subId
            additionalProperties = observation.additionalProperties.toMutableMap()
        }

        fun id(id: Long) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [Long] value instead. This method
         * is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<Long>) = apply { this.id = id }

        fun comName(comName: String) = comName(JsonField.of(comName))

        /**
         * Sets [Builder.comName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.comName] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun comName(comName: JsonField<String>) = apply { this.comName = comName }

        fun firstname(firstname: String) = firstname(JsonField.of(firstname))

        /**
         * Sets [Builder.firstname] to an arbitrary JSON value.
         *
         * You should usually call [Builder.firstname] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun firstname(firstname: JsonField<String>) = apply { this.firstname = firstname }

        fun howMany(howMany: Long) = howMany(JsonField.of(howMany))

        /**
         * Sets [Builder.howMany] to an arbitrary JSON value.
         *
         * You should usually call [Builder.howMany] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun howMany(howMany: JsonField<Long>) = apply { this.howMany = howMany }

        fun lastname(lastname: String) = lastname(JsonField.of(lastname))

        /**
         * Sets [Builder.lastname] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lastname] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun lastname(lastname: JsonField<String>) = apply { this.lastname = lastname }

        fun lat(lat: Float) = lat(JsonField.of(lat))

        /**
         * Sets [Builder.lat] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lat] with a well-typed [Float] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun lat(lat: JsonField<Float>) = apply { this.lat = lat }

        fun lng(lng: Float) = lng(JsonField.of(lng))

        /**
         * Sets [Builder.lng] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lng] with a well-typed [Float] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun lng(lng: JsonField<Float>) = apply { this.lng = lng }

        fun locationPrivate(locationPrivate: Boolean) =
            locationPrivate(JsonField.of(locationPrivate))

        /**
         * Sets [Builder.locationPrivate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.locationPrivate] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun locationPrivate(locationPrivate: JsonField<Boolean>) = apply {
            this.locationPrivate = locationPrivate
        }

        fun locId(locId: String) = locId(JsonField.of(locId))

        /**
         * Sets [Builder.locId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.locId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun locId(locId: JsonField<String>) = apply { this.locId = locId }

        fun locName(locName: String) = locName(JsonField.of(locName))

        /**
         * Sets [Builder.locName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.locName] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun locName(locName: JsonField<String>) = apply { this.locName = locName }

        fun obsDt(obsDt: String) = obsDt(JsonField.of(obsDt))

        /**
         * Sets [Builder.obsDt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.obsDt] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun obsDt(obsDt: JsonField<String>) = apply { this.obsDt = obsDt }

        fun obsReviewed(obsReviewed: Boolean) = obsReviewed(JsonField.of(obsReviewed))

        /**
         * Sets [Builder.obsReviewed] to an arbitrary JSON value.
         *
         * You should usually call [Builder.obsReviewed] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun obsReviewed(obsReviewed: JsonField<Boolean>) = apply { this.obsReviewed = obsReviewed }

        fun obsValid(obsValid: Boolean) = obsValid(JsonField.of(obsValid))

        /**
         * Sets [Builder.obsValid] to an arbitrary JSON value.
         *
         * You should usually call [Builder.obsValid] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun obsValid(obsValid: JsonField<Boolean>) = apply { this.obsValid = obsValid }

        fun sciName(sciName: String) = sciName(JsonField.of(sciName))

        /**
         * Sets [Builder.sciName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sciName] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun sciName(sciName: JsonField<String>) = apply { this.sciName = sciName }

        fun speciesCode(speciesCode: String) = speciesCode(JsonField.of(speciesCode))

        /**
         * Sets [Builder.speciesCode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.speciesCode] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun speciesCode(speciesCode: JsonField<String>) = apply { this.speciesCode = speciesCode }

        fun subId(subId: String) = subId(JsonField.of(subId))

        /**
         * Sets [Builder.subId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.subId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun subId(subId: JsonField<String>) = apply { this.subId = subId }

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
         * Returns an immutable instance of [Observation].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): Observation =
            Observation(
                id,
                comName,
                firstname,
                howMany,
                lastname,
                lat,
                lng,
                locationPrivate,
                locId,
                locName,
                obsDt,
                obsReviewed,
                obsValid,
                sciName,
                speciesCode,
                subId,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): Observation = apply {
        if (validated) {
            return@apply
        }

        id()
        comName()
        firstname()
        howMany()
        lastname()
        lat()
        lng()
        locationPrivate()
        locId()
        locName()
        obsDt()
        obsReviewed()
        obsValid()
        sciName()
        speciesCode()
        subId()
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
        (if (id.asKnown().isPresent) 1 else 0) +
            (if (comName.asKnown().isPresent) 1 else 0) +
            (if (firstname.asKnown().isPresent) 1 else 0) +
            (if (howMany.asKnown().isPresent) 1 else 0) +
            (if (lastname.asKnown().isPresent) 1 else 0) +
            (if (lat.asKnown().isPresent) 1 else 0) +
            (if (lng.asKnown().isPresent) 1 else 0) +
            (if (locationPrivate.asKnown().isPresent) 1 else 0) +
            (if (locId.asKnown().isPresent) 1 else 0) +
            (if (locName.asKnown().isPresent) 1 else 0) +
            (if (obsDt.asKnown().isPresent) 1 else 0) +
            (if (obsReviewed.asKnown().isPresent) 1 else 0) +
            (if (obsValid.asKnown().isPresent) 1 else 0) +
            (if (sciName.asKnown().isPresent) 1 else 0) +
            (if (speciesCode.asKnown().isPresent) 1 else 0) +
            (if (subId.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is Observation &&
            id == other.id &&
            comName == other.comName &&
            firstname == other.firstname &&
            howMany == other.howMany &&
            lastname == other.lastname &&
            lat == other.lat &&
            lng == other.lng &&
            locationPrivate == other.locationPrivate &&
            locId == other.locId &&
            locName == other.locName &&
            obsDt == other.obsDt &&
            obsReviewed == other.obsReviewed &&
            obsValid == other.obsValid &&
            sciName == other.sciName &&
            speciesCode == other.speciesCode &&
            subId == other.subId &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            comName,
            firstname,
            howMany,
            lastname,
            lat,
            lng,
            locationPrivate,
            locId,
            locName,
            obsDt,
            obsReviewed,
            obsValid,
            sciName,
            speciesCode,
            subId,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Observation{id=$id, comName=$comName, firstname=$firstname, howMany=$howMany, lastname=$lastname, lat=$lat, lng=$lng, locationPrivate=$locationPrivate, locId=$locId, locName=$locName, obsDt=$obsDt, obsReviewed=$obsReviewed, obsValid=$obsValid, sciName=$sciName, speciesCode=$speciesCode, subId=$subId, additionalProperties=$additionalProperties}"
}
