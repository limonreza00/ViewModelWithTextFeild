package com.example.viewmodelwithtextfeild

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class InputViewModel : ViewModel() {
    private val _input = mutableStateOf("")
    val input = _input

    fun onInputChange(newValue: String) {
        _input.value = newValue

    }
}