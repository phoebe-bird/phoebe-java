// File generated from our OpenAPI spec by Stainless.

package com.phoebe.api.models.product.stats

import com.phoebe.api.core.Params
import com.phoebe.api.core.checkRequired
import com.phoebe.api.core.http.Headers
import com.phoebe.api.core.http.QueryParams
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Get a summary of the number of checklist submitted, species seen and contributors on a given date
 * for a country or region.
 *
 * #### Notes The results are updated every 15 minutes.
 */
class StatRetrieveParams
private constructor(
    private val regionCode: String,
    private val y: Long,
    private val m: Long,
    private val d: Long?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun regionCode(): String = regionCode

    fun y(): Long = y

    fun m(): Long = m

    fun d(): Optional<Long> = Optional.ofNullable(d)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [StatRetrieveParams].
         *
         * The following fields are required:
         * ```java
         * .regionCode()
         * .y()
         * .m()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [StatRetrieveParams]. */
    class Builder internal constructor() {

        private var regionCode: String? = null
        private var y: Long? = null
        private var m: Long? = null
        private var d: Long? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(statRetrieveParams: StatRetrieveParams) = apply {
            regionCode = statRetrieveParams.regionCode
            y = statRetrieveParams.y
            m = statRetrieveParams.m
            d = statRetrieveParams.d
            additionalHeaders = statRetrieveParams.additionalHeaders.toBuilder()
            additionalQueryParams = statRetrieveParams.additionalQueryParams.toBuilder()
        }

        fun regionCode(regionCode: String) = apply { this.regionCode = regionCode }

        fun y(y: Long) = apply { this.y = y }

        fun m(m: Long) = apply { this.m = m }

        fun d(d: Long?) = apply { this.d = d }

        /**
         * Alias for [Builder.d].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun d(d: Long) = d(d as Long?)

        /** Alias for calling [Builder.d] with `d.orElse(null)`. */
        fun d(d: Optional<Long>) = d(d.getOrNull())

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        /**
         * Returns an immutable instance of [StatRetrieveParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .regionCode()
         * .y()
         * .m()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): StatRetrieveParams =
            StatRetrieveParams(
                checkRequired("regionCode", regionCode),
                checkRequired("y", y),
                checkRequired("m", m),
                d,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> regionCode
            1 -> y.toString()
            2 -> m.toString()
            3 -> d?.toString() ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is StatRetrieveParams && regionCode == other.regionCode && y == other.y && m == other.m && d == other.d && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(regionCode, y, m, d, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "StatRetrieveParams{regionCode=$regionCode, y=$y, m=$m, d=$d, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
