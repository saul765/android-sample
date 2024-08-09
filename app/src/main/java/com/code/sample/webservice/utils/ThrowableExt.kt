package com.code.sample.webservice.utils

import android.content.Context
import com.code.sample.R
import retrofit2.HttpException

fun Throwable.getErrorMessage(context: Context): String {
    return when (this) {
        is HttpException -> {
            val errorMessage = message.orEmpty()
            return errorMessage.ifEmpty { context.getString(R.string.generic_error) }
        }
        else -> context.getString(R.string.error_no_internet_connection_body)
    }
}