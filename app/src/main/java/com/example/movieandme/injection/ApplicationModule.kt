package com.example.movieandme.injection

import android.content.Context
import androidx.room.Room
import com.example.movieandme.data.local.AppDatabase
import com.example.movieandme.data.local.DataBaseDao
import com.example.movieandme.data.repository.UserRepository
import com.example.movieandme.domain.usecase.CreateUserUseCase
import com.example.movieandme.domain.usecase.GetUserUseCase
import com.example.movieandme.presentation.main.MainViewModel
import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module

val presentaionModule = module {
    factory { MainViewModel(get(), get()) }
}

val domainModule = module {
    factory { CreateUserUseCase(get()) }
    factory { GetUserUseCase(get()) }
}

val dataModule = module {
    single { UserRepository(get()) }
    single { createDataBase(androidContext())}
}

fun createDataBase(context: Context): DataBaseDao {
    val appDatabase = Room.databaseBuilder(
        context,
        AppDatabase::class.java, "database-name"
    ).build()
    return appDatabase.databaseDao()
}
