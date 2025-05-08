package com.phoebe.api.errors

open class PhoebeException
@JvmOverloads
constructor(message: String? = null, cause: Throwable? = null) : RuntimeException(message, cause)
