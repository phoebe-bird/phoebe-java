// File generated from our OpenAPI spec by Stainless.

package com.phoebe.api.services.async

import com.phoebe.api.core.ClientOptions
import com.phoebe.api.services.async.data.ObservationServiceAsync
import com.phoebe.api.services.async.data.ObservationServiceAsyncImpl
import java.util.function.Consumer

class DataServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    DataServiceAsync {

    private val withRawResponse: DataServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val observations: ObservationServiceAsync by lazy {
        ObservationServiceAsyncImpl(clientOptions)
    }

    override fun withRawResponse(): DataServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): DataServiceAsync =
        DataServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun observations(): ObservationServiceAsync = observations

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        DataServiceAsync.WithRawResponse {

        private val observations: ObservationServiceAsync.WithRawResponse by lazy {
            ObservationServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): DataServiceAsync.WithRawResponse =
            DataServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun observations(): ObservationServiceAsync.WithRawResponse = observations
    }
}
