package com.code.sample.usecases

import com.code.sample.domain.LoginResponse
import com.code.sample.repositories.user.IUserDataSource
import com.code.sample.webservice.dto.request.LoginRequest
import kotlinx.coroutines.delay


interface ILoginUserAndPasswordUseCase {
    suspend fun execute(email: String, password: String): LoginResponse
}


class LoginUserAndPasswordUseCase(private val userRepository: IUserDataSource.Repository) :
    ILoginUserAndPasswordUseCase {

    override suspend fun execute(email: String, password: String): LoginResponse {
        val loginRequest = LoginRequest(email, password)

        //The following response should retrieve the oauth token, but in this context we are going to mock it
        //  val response = userRepository.loginUserPasswordAsync(loginRequest)
        // return response

        //we are creating a delay of 1 second simulating a network call
        delay(1000L)

        return LoginResponse("token")
    }
}