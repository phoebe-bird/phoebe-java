package com.phoebe.api.errors

class PhoebeIoException
@JvmOverloads
constructor(message: String? = null, cause: Throwable? = null) : PhoebeException(message, cause)
