package com.code.sample.coroutines

import kotlin.coroutines.CoroutineContext

interface ICoroutineContextProvider {
    fun getMainContext(): CoroutineContext
    fun getIoContext(): CoroutineContext
}