package com.phoebe.api.errors

class PhoebeInvalidDataException
@JvmOverloads
constructor(message: String? = null, cause: Throwable? = null) : PhoebeException(message, cause)
