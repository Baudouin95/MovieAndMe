package com.example.movieandme.domain.usecase

import com.example.movieandme.data.repository.UserRepository
import com.example.movieandme.domain.entity.User

class GetUserUseCase(
    private val userRepository: UserRepository
) {
    suspend fun invoke(email: String): User {
        return userRepository.getUser(email)
    }
}