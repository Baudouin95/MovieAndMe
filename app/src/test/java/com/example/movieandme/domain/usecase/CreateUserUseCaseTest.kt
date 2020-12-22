package com.example.movieandme.domain.usecase

import com.example.movieandme.data.repository.UserRepository
import com.example.movieandme.domain.entity.User

class CreateUserUseCaseTest(
    private val userRepository: UserRepository
) {
    suspend fun invoke(user: User){
        userRepository.createUser(user)
    }
}