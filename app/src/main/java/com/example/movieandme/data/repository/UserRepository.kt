package com.example.movieandme.data.repository

import com.example.movieandme.data.local.DataBaseDao
import com.example.movieandme.data.local.models.toData
import com.example.movieandme.data.local.models.toEntity
import com.example.movieandme.domain.entity.User

class UserRepository(
    private val dataBaseDao: DataBaseDao
    ) {
    suspend fun createUser(user: User) {
        dataBaseDao.insert(user.toData())
    }

    fun getUser(email: String): User {
        val userLocal = dataBaseDao.findByName(email)
        return userLocal.toEntity()
    }
}