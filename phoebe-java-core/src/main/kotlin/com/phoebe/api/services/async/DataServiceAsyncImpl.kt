// File generated from our OpenAPI spec by Stainless.

package com.phoebe.api.services.async

import com.phoebe.api.core.ClientOptions
import com.phoebe.api.services.async.data.ObservationServiceAsync
import com.phoebe.api.services.async.data.ObservationServiceAsyncImpl

class DataServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    DataServiceAsync {

    private val withRawResponse: DataServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val observations: ObservationServiceAsync by lazy {
        ObservationServiceAsyncImpl(clientOptions)
    }

    override fun withRawResponse(): DataServiceAsync.WithRawResponse = withRawResponse

    override fun observations(): ObservationServiceAsync = observations

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        DataServiceAsync.WithRawResponse {

        private val observations: ObservationServiceAsync.WithRawResponse by lazy {
            ObservationServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun observations(): ObservationServiceAsync.WithRawResponse = observations
    }
}
