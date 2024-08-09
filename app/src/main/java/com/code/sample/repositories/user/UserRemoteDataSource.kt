package com.code.sample.repositories.user

import com.code.sample.webservice.apis.IUserApi
import com.code.sample.webservice.dto.request.LoginRequest
import com.code.sample.webservice.dto.responses.LoginResponseDTO

class UserRemoteDataSource(private val userApi: IUserApi) : IUserDataSource.Remote {

    override suspend fun loginUserPassword(loginRequest: LoginRequest): LoginResponseDTO =
        userApi.loginUserPassword(loginRequest)


}