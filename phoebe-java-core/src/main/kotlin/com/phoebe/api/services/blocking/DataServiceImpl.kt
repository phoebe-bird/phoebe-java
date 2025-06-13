// File generated from our OpenAPI spec by Stainless.

package com.phoebe.api.services.blocking

import com.phoebe.api.core.ClientOptions
import com.phoebe.api.services.blocking.data.ObservationService
import com.phoebe.api.services.blocking.data.ObservationServiceImpl
import java.util.function.Consumer

class DataServiceImpl internal constructor(private val clientOptions: ClientOptions) : DataService {

    private val withRawResponse: DataService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val observations: ObservationService by lazy { ObservationServiceImpl(clientOptions) }

    override fun withRawResponse(): DataService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): DataService =
        DataServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun observations(): ObservationService = observations

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        DataService.WithRawResponse {

        private val observations: ObservationService.WithRawResponse by lazy {
            ObservationServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): DataService.WithRawResponse =
            DataServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun observations(): ObservationService.WithRawResponse = observations
    }
}
