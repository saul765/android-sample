package com.code.sample.webservice.apis

import com.code.sample.webservice.dto.request.LoginRequest
import com.code.sample.webservice.dto.responses.LoginResponseDTO
import retrofit2.http.Body
import retrofit2.http.POST

interface IUserApi {

    companion object {

        private const val USER_SERVICE = "users"

        //Endpoints
        private const val LOGIN_USER_PASSWORD = "${USER_SERVICE}/login"

    }

    @POST(LOGIN_USER_PASSWORD)
    suspend fun loginUserPassword(
        @Body loginRequest: LoginRequest
    ): LoginResponseDTO
}