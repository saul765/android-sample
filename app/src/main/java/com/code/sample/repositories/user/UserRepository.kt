package com.code.sample.repositories.user

import com.code.sample.domain.LoginResponse
import com.code.sample.webservice.dto.request.LoginRequest
import com.code.sample.webservice.dto.responses.toDomain

class UserRepository(
    private val remoteDataSource: IUserDataSource.Remote,
    private val localDataSource: IUserDataSource.Local
) : IUserDataSource.Repository {

    override suspend fun loginUserPasswordAsync(loginRequest: LoginRequest): LoginResponse =
        remoteDataSource.loginUserPassword(loginRequest).toDomain()
}