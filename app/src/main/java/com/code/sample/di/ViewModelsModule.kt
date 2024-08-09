package com.code.sample.di


import com.code.sample.ui.login.LoginViewModel
import org.koin.androidx.viewmodel.dsl.viewModelOf
import org.koin.dsl.module

object ViewModelsModule {
    val module = module {

        viewModelOf(::LoginViewModel)

    }
}