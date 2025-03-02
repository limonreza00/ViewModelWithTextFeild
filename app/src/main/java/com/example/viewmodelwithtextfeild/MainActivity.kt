package com.example.viewmodelwithtextfeild

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.viewmodelwithtextfeild.ui.theme.ViewModelWithTextFeildTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ViewModelWithTextFeildTheme {

                SimpleTextField()
            }
        }
    }
}

@Composable
fun SimpleTextField(viewModel: InputViewModel = viewModel()) {

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        TextField(
            value = viewModel.input.value,
            onValueChange = { viewModel.onInputChange(it) },
            label = { Text("Enter text") }
        )
        Text(text = "You typed: ${viewModel.input.value}")
    }
}
