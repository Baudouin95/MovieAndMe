package com.example.movieandme.data.local

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.example.movieandme.data.local.models.UserLocal
import com.example.movieandme.domain.entity.User

@Dao
interface DataBaseDao {
    @Query("SELECT * FROM userlocal")
    fun getAll(): List<UserLocal>



    @Query("SELECT * FROM userlocal WHERE email LIKE :email LIMIT 1")
    fun findByName(email: String): UserLocal

    @Insert
    fun insert(user: UserLocal)

    @Delete
    fun delete(user: UserLocal)
}