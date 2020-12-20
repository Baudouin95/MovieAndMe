package com.example.movieandme.presentation.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import com.example.movieandme.R
import com.google.android.material.dialog.MaterialAlertDialogBuilder
import kotlinx.android.synthetic.main.activity_main.*
import org.koin.android.ext.android.inject

class MainActivity : AppCompatActivity() {
    val mainViewModel : MainViewModel by inject()
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mainViewModel.loginLiveData.observe(this, Observer { it ->
            when(it){
                is LoginSuccess -> {
                    // TODO navigation(page d'aceuil)
                }
                    LoginError -> {
                        MaterialAlertDialogBuilder(this)
                            .setTitle("Error")
                            .setMessage("Wrong detail !!!")
                            .setPositiveButton("OK") { dialog, which ->
                                dialog.dismiss()
                            }
                            .show()
                    }
            }
        })

        login_button.setOnClickListener{
            mainViewModel.onClickedLogin( login_edit.text.toString().trim(), password_edit.text.toString())
        }
    }
}