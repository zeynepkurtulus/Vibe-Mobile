package model

data class RegisterPayload(
    val email: String,
    val username: String,
    val password: String
)