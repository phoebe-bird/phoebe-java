// File generated from our OpenAPI spec by Stainless.

package com.phoebe.api.models.ref.hotspot.geo

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

class GeoRetrieveResponse
private constructor(
    private val countryCode: JsonField<String>,
    private val lat: JsonField<Double>,
    private val latestObsDt: JsonField<String>,
    private val lng: JsonField<Double>,
    private val locId: JsonField<String>,
    private val locName: JsonField<String>,
    private val numSpeciesAllTime: JsonField<Int>,
    private val subnational1Code: JsonField<String>,
    private val subnational2Code: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("countryCode")
        @ExcludeMissing
        countryCode: JsonField<String> = JsonMissing.of(),
        @JsonProperty("lat") @ExcludeMissing lat: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("latestObsDt")
        @ExcludeMissing
        latestObsDt: JsonField<String> = JsonMissing.of(),
        @JsonProperty("lng") @ExcludeMissing lng: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("locId") @ExcludeMissing locId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("locName") @ExcludeMissing locName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("numSpeciesAllTime")
        @ExcludeMissing
        numSpeciesAllTime: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("subnational1Code")
        @ExcludeMissing
        subnational1Code: JsonField<String> = JsonMissing.of(),
        @JsonProperty("subnational2Code")
        @ExcludeMissing
        subnational2Code: JsonField<String> = JsonMissing.of(),
    ) : this(
        countryCode,
        lat,
        latestObsDt,
        lng,
        locId,
        locName,
        numSpeciesAllTime,
        subnational1Code,
        subnational2Code,
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
    fun lat(): Optional<Double> = lat.getOptional("lat")

    /**
     * @throws PhoebeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun latestObsDt(): Optional<String> = latestObsDt.getOptional("latestObsDt")

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
    fun numSpeciesAllTime(): Optional<Int> = numSpeciesAllTime.getOptional("numSpeciesAllTime")

    /**
     * @throws PhoebeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun subnational1Code(): Optional<String> = subnational1Code.getOptional("subnational1Code")

    /**
     * @throws PhoebeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun subnational2Code(): Optional<String> = subnational2Code.getOptional("subnational2Code")

    /**
     * Returns the raw JSON value of [countryCode].
     *
     * Unlike [countryCode], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("countryCode") @ExcludeMissing fun _countryCode(): JsonField<String> = countryCode

    /**
     * Returns the raw JSON value of [lat].
     *
     * Unlike [lat], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("lat") @ExcludeMissing fun _lat(): JsonField<Double> = lat

    /**
     * Returns the raw JSON value of [latestObsDt].
     *
     * Unlike [latestObsDt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("latestObsDt") @ExcludeMissing fun _latestObsDt(): JsonField<String> = latestObsDt

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
     * Returns the raw JSON value of [numSpeciesAllTime].
     *
     * Unlike [numSpeciesAllTime], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("numSpeciesAllTime")
    @ExcludeMissing
    fun _numSpeciesAllTime(): JsonField<Int> = numSpeciesAllTime

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
     * Returns the raw JSON value of [subnational2Code].
     *
     * Unlike [subnational2Code], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("subnational2Code")
    @ExcludeMissing
    fun _subnational2Code(): JsonField<String> = subnational2Code

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

        /** Returns a mutable builder for constructing an instance of [GeoRetrieveResponse]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [GeoRetrieveResponse]. */
    class Builder internal constructor() {

        private var countryCode: JsonField<String> = JsonMissing.of()
        private var lat: JsonField<Double> = JsonMissing.of()
        private var latestObsDt: JsonField<String> = JsonMissing.of()
        private var lng: JsonField<Double> = JsonMissing.of()
        private var locId: JsonField<String> = JsonMissing.of()
        private var locName: JsonField<String> = JsonMissing.of()
        private var numSpeciesAllTime: JsonField<Int> = JsonMissing.of()
        private var subnational1Code: JsonField<String> = JsonMissing.of()
        private var subnational2Code: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(geoRetrieveResponse: GeoRetrieveResponse) = apply {
            countryCode = geoRetrieveResponse.countryCode
            lat = geoRetrieveResponse.lat
            latestObsDt = geoRetrieveResponse.latestObsDt
            lng = geoRetrieveResponse.lng
            locId = geoRetrieveResponse.locId
            locName = geoRetrieveResponse.locName
            numSpeciesAllTime = geoRetrieveResponse.numSpeciesAllTime
            subnational1Code = geoRetrieveResponse.subnational1Code
            subnational2Code = geoRetrieveResponse.subnational2Code
            additionalProperties = geoRetrieveResponse.additionalProperties.toMutableMap()
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

        fun lat(lat: Double) = lat(JsonField.of(lat))

        /**
         * Sets [Builder.lat] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lat] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun lat(lat: JsonField<Double>) = apply { this.lat = lat }

        fun latestObsDt(latestObsDt: String) = latestObsDt(JsonField.of(latestObsDt))

        /**
         * Sets [Builder.latestObsDt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.latestObsDt] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun latestObsDt(latestObsDt: JsonField<String>) = apply { this.latestObsDt = latestObsDt }

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

        fun numSpeciesAllTime(numSpeciesAllTime: Int) =
            numSpeciesAllTime(JsonField.of(numSpeciesAllTime))

        /**
         * Sets [Builder.numSpeciesAllTime] to an arbitrary JSON value.
         *
         * You should usually call [Builder.numSpeciesAllTime] with a well-typed [Int] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun numSpeciesAllTime(numSpeciesAllTime: JsonField<Int>) = apply {
            this.numSpeciesAllTime = numSpeciesAllTime
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

        fun subnational2Code(subnational2Code: String) =
            subnational2Code(JsonField.of(subnational2Code))

        /**
         * Sets [Builder.subnational2Code] to an arbitrary JSON value.
         *
         * You should usually call [Builder.subnational2Code] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun subnational2Code(subnational2Code: JsonField<String>) = apply {
            this.subnational2Code = subnational2Code
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
         * Returns an immutable instance of [GeoRetrieveResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): GeoRetrieveResponse =
            GeoRetrieveResponse(
                countryCode,
                lat,
                latestObsDt,
                lng,
                locId,
                locName,
                numSpeciesAllTime,
                subnational1Code,
                subnational2Code,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): GeoRetrieveResponse = apply {
        if (validated) {
            return@apply
        }

        countryCode()
        lat()
        latestObsDt()
        lng()
        locId()
        locName()
        numSpeciesAllTime()
        subnational1Code()
        subnational2Code()
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
            (if (lat.asKnown().isPresent) 1 else 0) +
            (if (latestObsDt.asKnown().isPresent) 1 else 0) +
            (if (lng.asKnown().isPresent) 1 else 0) +
            (if (locId.asKnown().isPresent) 1 else 0) +
            (if (locName.asKnown().isPresent) 1 else 0) +
            (if (numSpeciesAllTime.asKnown().isPresent) 1 else 0) +
            (if (subnational1Code.asKnown().isPresent) 1 else 0) +
            (if (subnational2Code.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is GeoRetrieveResponse && countryCode == other.countryCode && lat == other.lat && latestObsDt == other.latestObsDt && lng == other.lng && locId == other.locId && locName == other.locName && numSpeciesAllTime == other.numSpeciesAllTime && subnational1Code == other.subnational1Code && subnational2Code == other.subnational2Code && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(countryCode, lat, latestObsDt, lng, locId, locName, numSpeciesAllTime, subnational1Code, subnational2Code, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "GeoRetrieveResponse{countryCode=$countryCode, lat=$lat, latestObsDt=$latestObsDt, lng=$lng, locId=$locId, locName=$locName, numSpeciesAllTime=$numSpeciesAllTime, subnational1Code=$subnational1Code, subnational2Code=$subnational2Code, additionalProperties=$additionalProperties}"
}
