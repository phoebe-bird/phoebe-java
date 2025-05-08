// File generated from our OpenAPI spec by Stainless.

package com.phoebe.api.errors

import com.phoebe.api.core.JsonValue
import com.phoebe.api.core.http.Headers

abstract class PhoebeServiceException
protected constructor(message: String, cause: Throwable? = null) : PhoebeException(message, cause) {

    abstract fun statusCode(): Int

    abstract fun headers(): Headers

    abstract fun body(): JsonValue
}
