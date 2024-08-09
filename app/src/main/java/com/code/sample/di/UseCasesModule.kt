package com.code.sample.di

import com.code.sample.usecases.ILoginUserAndPasswordUseCase
import com.code.sample.usecases.LoginUserAndPasswordUseCase
import org.koin.dsl.module

object UseCasesModule {
    val module = module {

        // Login Use case
        single<ILoginUserAndPasswordUseCase> { LoginUserAndPasswordUseCase(get()) }
    }
}