package com.example.movieandme.injection

import com.example.movieandme.MainViewModel
import org.koin.dsl.module

val presentaionModule = module {
    factory { MainViewModel() }
}