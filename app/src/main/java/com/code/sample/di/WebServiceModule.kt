package com.code.sample.di


import com.code.sample.webservice.WebService
import com.code.sample.webservice.apis.IUserApi
import com.code.sample.webservice.utils.network.IOkHttpClient
import com.code.sample.webservice.utils.network.LoggingInterceptor
import com.code.sample.webservice.utils.network.OkHttpClient
import org.koin.dsl.module

object WebServiceModule {

    val module = module {

        single<IOkHttpClient> { OkHttpClient(get()) }

        single { LoggingInterceptor }

        single<IUserApi> { WebService.createUserApi() }
    }


}