package com.example.viewmodelwithtextfeild

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.viewmodelwithtextfeild.ui.theme.ViewModelWithTextFeildTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ViewModelWithTextFeildTheme {
                val viewmodel : InputViewModel = viewModel()
                InputScreen(
                    value = viewmodel.input.value,
                    onValueChanged = {viewmodel.onInputChange(it)}
                )
            }
        }
    }
}

