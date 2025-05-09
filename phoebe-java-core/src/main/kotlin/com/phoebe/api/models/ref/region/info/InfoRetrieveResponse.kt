// File generated from our OpenAPI spec by Stainless.

package com.phoebe.api.models.ref.region.info

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
import kotlin.jvm.optionals.getOrNull

class InfoRetrieveResponse
private constructor(
    private val bounds: JsonField<Bounds>,
    private val result: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("bounds") @ExcludeMissing bounds: JsonField<Bounds> = JsonMissing.of(),
        @JsonProperty("result") @ExcludeMissing result: JsonField<String> = JsonMissing.of(),
    ) : this(bounds, result, mutableMapOf())

    /**
     * @throws PhoebeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun bounds(): Optional<Bounds> = bounds.getOptional("bounds")

    /**
     * @throws PhoebeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun result(): Optional<String> = result.getOptional("result")

    /**
     * Returns the raw JSON value of [bounds].
     *
     * Unlike [bounds], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("bounds") @ExcludeMissing fun _bounds(): JsonField<Bounds> = bounds

    /**
     * Returns the raw JSON value of [result].
     *
     * Unlike [result], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("result") @ExcludeMissing fun _result(): JsonField<String> = result

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

        private var bounds: JsonField<Bounds> = JsonMissing.of()
        private var result: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(infoRetrieveResponse: InfoRetrieveResponse) = apply {
            bounds = infoRetrieveResponse.bounds
            result = infoRetrieveResponse.result
            additionalProperties = infoRetrieveResponse.additionalProperties.toMutableMap()
        }

        fun bounds(bounds: Bounds) = bounds(JsonField.of(bounds))

        /**
         * Sets [Builder.bounds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.bounds] with a well-typed [Bounds] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun bounds(bounds: JsonField<Bounds>) = apply { this.bounds = bounds }

        fun result(result: String) = result(JsonField.of(result))

        /**
         * Sets [Builder.result] to an arbitrary JSON value.
         *
         * You should usually call [Builder.result] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun result(result: JsonField<String>) = apply { this.result = result }

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
            InfoRetrieveResponse(bounds, result, additionalProperties.toMutableMap())
    }

    private var validated: Boolean = false

    fun validate(): InfoRetrieveResponse = apply {
        if (validated) {
            return@apply
        }

        bounds().ifPresent { it.validate() }
        result()
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
        (bounds.asKnown().getOrNull()?.validity() ?: 0) + (if (result.asKnown().isPresent) 1 else 0)

    class Bounds
    private constructor(
        private val maxX: JsonField<Float>,
        private val maxY: JsonField<Float>,
        private val minX: JsonField<Float>,
        private val minY: JsonField<Float>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("maxX") @ExcludeMissing maxX: JsonField<Float> = JsonMissing.of(),
            @JsonProperty("maxY") @ExcludeMissing maxY: JsonField<Float> = JsonMissing.of(),
            @JsonProperty("minX") @ExcludeMissing minX: JsonField<Float> = JsonMissing.of(),
            @JsonProperty("minY") @ExcludeMissing minY: JsonField<Float> = JsonMissing.of(),
        ) : this(maxX, maxY, minX, minY, mutableMapOf())

        /**
         * @throws PhoebeInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun maxX(): Optional<Float> = maxX.getOptional("maxX")

        /**
         * @throws PhoebeInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun maxY(): Optional<Float> = maxY.getOptional("maxY")

        /**
         * @throws PhoebeInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun minX(): Optional<Float> = minX.getOptional("minX")

        /**
         * @throws PhoebeInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun minY(): Optional<Float> = minY.getOptional("minY")

        /**
         * Returns the raw JSON value of [maxX].
         *
         * Unlike [maxX], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("maxX") @ExcludeMissing fun _maxX(): JsonField<Float> = maxX

        /**
         * Returns the raw JSON value of [maxY].
         *
         * Unlike [maxY], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("maxY") @ExcludeMissing fun _maxY(): JsonField<Float> = maxY

        /**
         * Returns the raw JSON value of [minX].
         *
         * Unlike [minX], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("minX") @ExcludeMissing fun _minX(): JsonField<Float> = minX

        /**
         * Returns the raw JSON value of [minY].
         *
         * Unlike [minY], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("minY") @ExcludeMissing fun _minY(): JsonField<Float> = minY

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

            /** Returns a mutable builder for constructing an instance of [Bounds]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Bounds]. */
        class Builder internal constructor() {

            private var maxX: JsonField<Float> = JsonMissing.of()
            private var maxY: JsonField<Float> = JsonMissing.of()
            private var minX: JsonField<Float> = JsonMissing.of()
            private var minY: JsonField<Float> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(bounds: Bounds) = apply {
                maxX = bounds.maxX
                maxY = bounds.maxY
                minX = bounds.minX
                minY = bounds.minY
                additionalProperties = bounds.additionalProperties.toMutableMap()
            }

            fun maxX(maxX: Float) = maxX(JsonField.of(maxX))

            /**
             * Sets [Builder.maxX] to an arbitrary JSON value.
             *
             * You should usually call [Builder.maxX] with a well-typed [Float] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun maxX(maxX: JsonField<Float>) = apply { this.maxX = maxX }

            fun maxY(maxY: Float) = maxY(JsonField.of(maxY))

            /**
             * Sets [Builder.maxY] to an arbitrary JSON value.
             *
             * You should usually call [Builder.maxY] with a well-typed [Float] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun maxY(maxY: JsonField<Float>) = apply { this.maxY = maxY }

            fun minX(minX: Float) = minX(JsonField.of(minX))

            /**
             * Sets [Builder.minX] to an arbitrary JSON value.
             *
             * You should usually call [Builder.minX] with a well-typed [Float] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun minX(minX: JsonField<Float>) = apply { this.minX = minX }

            fun minY(minY: Float) = minY(JsonField.of(minY))

            /**
             * Sets [Builder.minY] to an arbitrary JSON value.
             *
             * You should usually call [Builder.minY] with a well-typed [Float] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun minY(minY: JsonField<Float>) = apply { this.minY = minY }

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
             * Returns an immutable instance of [Bounds].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Bounds =
                Bounds(maxX, maxY, minX, minY, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): Bounds = apply {
            if (validated) {
                return@apply
            }

            maxX()
            maxY()
            minX()
            minY()
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
            (if (maxX.asKnown().isPresent) 1 else 0) +
                (if (maxY.asKnown().isPresent) 1 else 0) +
                (if (minX.asKnown().isPresent) 1 else 0) +
                (if (minY.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Bounds && maxX == other.maxX && maxY == other.maxY && minX == other.minX && minY == other.minY && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(maxX, maxY, minX, minY, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Bounds{maxX=$maxX, maxY=$maxY, minX=$minX, minY=$minY, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is InfoRetrieveResponse && bounds == other.bounds && result == other.result && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(bounds, result, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "InfoRetrieveResponse{bounds=$bounds, result=$result, additionalProperties=$additionalProperties}"
}
