// File generated from our OpenAPI spec by Stainless.

package com.phoebe.api.models.ref.hotspot.info

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

class InfoRetrieveResponse
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
        @JsonProperty("isHotspot") @ExcludeMissing isHotspot: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("lat") @ExcludeMissing lat: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("latitude") @ExcludeMissing latitude: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("lng") @ExcludeMissing lng: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("locId") @ExcludeMissing locId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("locName") @ExcludeMissing locName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("longitude") @ExcludeMissing longitude: JsonField<Double> = JsonMissing.of(),
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
    @JsonProperty("countryCode") @ExcludeMissing fun _countryCode(): JsonField<String> = countryCode

    /**
     * Returns the raw JSON value of [countryName].
     *
     * Unlike [countryName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("countryName") @ExcludeMissing fun _countryName(): JsonField<String> = countryName

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

        /** Returns a mutable builder for constructing an instance of [InfoRetrieveResponse]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [InfoRetrieveResponse]. */
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
        internal fun from(infoRetrieveResponse: InfoRetrieveResponse) = apply {
            countryCode = infoRetrieveResponse.countryCode
            countryName = infoRetrieveResponse.countryName
            hierarchicalName = infoRetrieveResponse.hierarchicalName
            isHotspot = infoRetrieveResponse.isHotspot
            lat = infoRetrieveResponse.lat
            latitude = infoRetrieveResponse.latitude
            lng = infoRetrieveResponse.lng
            locId = infoRetrieveResponse.locId
            locName = infoRetrieveResponse.locName
            longitude = infoRetrieveResponse.longitude
            name = infoRetrieveResponse.name
            subnational1Code = infoRetrieveResponse.subnational1Code
            subnational1Name = infoRetrieveResponse.subnational1Name
            additionalProperties = infoRetrieveResponse.additionalProperties.toMutableMap()
        }

        fun countryCode(countryCode: String) = countryCode(JsonField.of(countryCode))

        /**
         * Sets [Builder.countryCode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.countryCode] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun countryCode(countryCode: JsonField<String>) = apply { this.countryCode = countryCode }

        fun countryName(countryName: String) = countryName(JsonField.of(countryName))

        /**
         * Sets [Builder.countryName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.countryName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun countryName(countryName: JsonField<String>) = apply { this.countryName = countryName }

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
         * You should usually call [Builder.isHotspot] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun isHotspot(isHotspot: JsonField<Boolean>) = apply { this.isHotspot = isHotspot }

        fun lat(lat: Double) = lat(JsonField.of(lat))

        /**
         * Sets [Builder.lat] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lat] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun lat(lat: JsonField<Double>) = apply { this.lat = lat }

        fun latitude(latitude: Double) = latitude(JsonField.of(latitude))

        /**
         * Sets [Builder.latitude] to an arbitrary JSON value.
         *
         * You should usually call [Builder.latitude] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun latitude(latitude: JsonField<Double>) = apply { this.latitude = latitude }

        fun lng(lng: Double) = lng(JsonField.of(lng))

        /**
         * Sets [Builder.lng] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lng] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun lng(lng: JsonField<Double>) = apply { this.lng = lng }

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

        fun longitude(longitude: Double) = longitude(JsonField.of(longitude))

        /**
         * Sets [Builder.longitude] to an arbitrary JSON value.
         *
         * You should usually call [Builder.longitude] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun longitude(longitude: JsonField<Double>) = apply { this.longitude = longitude }

        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
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
         * Returns an immutable instance of [InfoRetrieveResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): InfoRetrieveResponse =
            InfoRetrieveResponse(
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
     * Validates that the types of all values in this object match their expected types recursively.
     *
     * This method is _not_ forwards compatible with new types from the API for existing fields.
     *
     * @throws PhoebeInvalidDataException if any value type in this object doesn't match its
     *   expected type.
     */
    fun validate(): InfoRetrieveResponse = apply {
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
     * Returns a score indicating how many valid values are contained in this object recursively.
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

        return other is InfoRetrieveResponse &&
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
        "InfoRetrieveResponse{countryCode=$countryCode, countryName=$countryName, hierarchicalName=$hierarchicalName, isHotspot=$isHotspot, lat=$lat, latitude=$latitude, lng=$lng, locId=$locId, locName=$locName, longitude=$longitude, name=$name, subnational1Code=$subnational1Code, subnational1Name=$subnational1Name, additionalProperties=$additionalProperties}"
}
