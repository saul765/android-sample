package com.code.sample.repositories.user

import com.code.sample.domain.LoginResponse
import com.code.sample.webservice.dto.request.LoginRequest
import com.code.sample.webservice.dto.responses.LoginResponseDTO

interface IUserDataSource {

    interface Remote {

        suspend fun loginUserPassword(
            loginRequest: LoginRequest
        ): LoginResponseDTO

    }

    interface Local {

    }

    interface Repository {

        suspend fun loginUserPasswordAsync(
            loginRequest: LoginRequest
        ): LoginResponse
    }
}