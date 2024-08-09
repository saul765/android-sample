package com.code.sample.coroutines

import kotlinx.coroutines.Dispatchers

class CoroutineContextProvider : ICoroutineContextProvider {

    override fun getMainContext() = Dispatchers.Main

    override fun getIoContext() = Dispatchers.IO

}