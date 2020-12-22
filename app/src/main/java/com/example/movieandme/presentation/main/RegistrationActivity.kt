package com.example.movieandme.presentation.main

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import com.example.movieandme.R
import org.koin.android.ext.android.inject

class RegistrationActivity: AppCompatActivity() {
    val mainViewModel : MainViewModel by inject()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registration)
    }

}