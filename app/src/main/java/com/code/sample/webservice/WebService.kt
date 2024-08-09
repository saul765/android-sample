package com.code.sample.webservice

import android.content.Context
import com.code.sample.webservice.utils.network.IOkHttpClient
import com.code.sample.R
import com.code.sample.webservice.apis.IUserApi


import org.koin.core.component.KoinComponent
import org.koin.core.component.inject
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object WebService : KoinComponent {

    private val context by inject<Context>()

    private val okHttpClient by inject<IOkHttpClient>()

    fun createUserApi(): IUserApi {
        val client = okHttpClient.create()
        val retrofit = Retrofit.Builder()
            .baseUrl(context.getString(R.string.user_service_base_url))
            .addConverterFactory(GsonConverterFactory.create())
            .client(client)
            .build()
        return retrofit.create(IUserApi::class.java)
    }

}