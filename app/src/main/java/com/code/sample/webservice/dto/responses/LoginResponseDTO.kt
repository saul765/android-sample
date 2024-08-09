package com.code.sample.webservice.dto.responses

import com.code.sample.domain.LoginResponse

data class LoginResponseDTO(val token: String?)


fun LoginResponseDTO.toDomain(): LoginResponse = LoginResponse(
    token = token.orEmpty()
)