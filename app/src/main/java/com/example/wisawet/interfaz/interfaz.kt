package com.example.wisawet.interfaz

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.wisawet.ui.theme.WisaWetTheme

@Composable
fun Greeting( modifier: Modifier = Modifier) {
    var jappens = 2
    Column(
        modifier = modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Hello Fran",
            modifier = Modifier.padding(bottom = 16.dp)
        )
        Button(onClick = { }) {
            Text("Click Me")
        }
        Text(
            text = "Jappens?¿",
            modifier = Modifier.padding(bottom = 16.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    WisaWetTheme {
        Greeting()
    }
}