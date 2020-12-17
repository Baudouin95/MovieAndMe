package com.example.movieandme

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel(){

    val text: MutableLiveData<String> = MutableLiveData()

    init {
        text.value = "Texte LiveData"
    }
}