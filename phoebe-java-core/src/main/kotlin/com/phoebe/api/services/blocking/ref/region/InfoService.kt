// File generated from our OpenAPI spec by Stainless.

package com.phoebe.api.services.blocking.ref.region

import com.google.errorprone.annotations.MustBeClosed
import com.phoebe.api.core.RequestOptions
import com.phoebe.api.core.http.HttpResponseFor
import com.phoebe.api.models.ref.region.info.InfoRetrieveParams
import com.phoebe.api.models.ref.region.info.InfoRetrieveResponse

interface InfoService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Get information on the name and geographical area covered by a region.
     *
     * #### Notes
     *
     * Taking Madison County, New York, USA (location code US-NY-053) as an example the various
     * values for the regionNameFormat query parameter work as follows:
     *
     * |Value         |Description                               |Result                          |
     * |--------------|------------------------------------------|--------------------------------|
     * |detailed      |return a detailed description             |Madison County, New York, US    |
     * |detailednoqual|return the name to the subnational1 level |Madison, New York               |
     * |full          |return the full description               |Madison, New York, United States|
     * |namequal      |return the qualified name                 |Madison County                  |
     * |nameonly      |return only the name of the region        |Madison                         |
     * |revdetailed   |return the detailed description in reverse|US, New York, Madison County    |
     */
    fun retrieve(params: InfoRetrieveParams): InfoRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: InfoRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InfoRetrieveResponse

    /** A view of [InfoService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /ref/region/info/{regionCode}`, but is otherwise the
         * same as [InfoService.retrieve].
         */
        @MustBeClosed
        fun retrieve(params: InfoRetrieveParams): HttpResponseFor<InfoRetrieveResponse> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: InfoRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InfoRetrieveResponse>
    }
}
