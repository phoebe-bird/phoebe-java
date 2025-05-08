// File generated from our OpenAPI spec by Stainless.

package com.phoebe.api.models.ref.taxonomy.versions

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

class VersionListResponse
private constructor(
    private val authorityVer: JsonField<Double>,
    private val latest: JsonField<Boolean>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("authorityVer")
        @ExcludeMissing
        authorityVer: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("latest") @ExcludeMissing latest: JsonField<Boolean> = JsonMissing.of(),
    ) : this(authorityVer, latest, mutableMapOf())

    /**
     * @throws PhoebeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun authorityVer(): Optional<Double> = authorityVer.getOptional("authorityVer")

    /**
     * @throws PhoebeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun latest(): Optional<Boolean> = latest.getOptional("latest")

    /**
     * Returns the raw JSON value of [authorityVer].
     *
     * Unlike [authorityVer], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("authorityVer")
    @ExcludeMissing
    fun _authorityVer(): JsonField<Double> = authorityVer

    /**
     * Returns the raw JSON value of [latest].
     *
     * Unlike [latest], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("latest") @ExcludeMissing fun _latest(): JsonField<Boolean> = latest

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

        /** Returns a mutable builder for constructing an instance of [VersionListResponse]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [VersionListResponse]. */
    class Builder internal constructor() {

        private var authorityVer: JsonField<Double> = JsonMissing.of()
        private var latest: JsonField<Boolean> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(versionListResponse: VersionListResponse) = apply {
            authorityVer = versionListResponse.authorityVer
            latest = versionListResponse.latest
            additionalProperties = versionListResponse.additionalProperties.toMutableMap()
        }

        fun authorityVer(authorityVer: Double) = authorityVer(JsonField.of(authorityVer))

        /**
         * Sets [Builder.authorityVer] to an arbitrary JSON value.
         *
         * You should usually call [Builder.authorityVer] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun authorityVer(authorityVer: JsonField<Double>) = apply {
            this.authorityVer = authorityVer
        }

        fun latest(latest: Boolean) = latest(JsonField.of(latest))

        /**
         * Sets [Builder.latest] to an arbitrary JSON value.
         *
         * You should usually call [Builder.latest] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun latest(latest: JsonField<Boolean>) = apply { this.latest = latest }

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
         * Returns an immutable instance of [VersionListResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): VersionListResponse =
            VersionListResponse(authorityVer, latest, additionalProperties.toMutableMap())
    }

    private var validated: Boolean = false

    fun validate(): VersionListResponse = apply {
        if (validated) {
            return@apply
        }

        authorityVer()
        latest()
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
        (if (authorityVer.asKnown().isPresent) 1 else 0) +
            (if (latest.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is VersionListResponse && authorityVer == other.authorityVer && latest == other.latest && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(authorityVer, latest, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "VersionListResponse{authorityVer=$authorityVer, latest=$latest, additionalProperties=$additionalProperties}"
}
