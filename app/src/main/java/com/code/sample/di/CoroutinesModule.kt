package com.code.sample.di

import com.code.sample.coroutines.CoroutineContextProvider
import com.code.sample.coroutines.ICoroutineContextProvider
import org.koin.dsl.module

object CoroutinesModule {

    val module = module {

        single<ICoroutineContextProvider> { CoroutineContextProvider() }
    }
}