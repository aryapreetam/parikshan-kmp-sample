package org.parikshankmpsample

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeContentPadding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import org.jetbrains.compose.resources.painterResource

import parikshan_kmp_sample.shared.generated.resources.Res
import parikshan_kmp_sample.shared.generated.resources.compose_multiplatform

@Composable
@Preview
fun App() {
  MaterialTheme {
    var name by remember { mutableStateOf("") }
    var greeting by remember { mutableStateOf("") }

    Column(
      modifier = Modifier.fillMaxSize().padding(24.dp),
      horizontalAlignment = Alignment.CenterHorizontally,
      verticalArrangement = Arrangement.Center
    ) {
      OutlinedTextField(
        value = name,
        onValueChange = { name = it },
        label = { Text("Enter your name") },
        modifier = Modifier.testTag("name_input") // (1)
      )

      Button(
        onClick = { greeting = "Hello, $name!" },
        modifier = Modifier.padding(top = 16.dp).testTag("greet_button") // (2)
      ) {
        Text("Greet")
      }

      if (greeting.isNotEmpty()) {
        Text(
          text = greeting,
          modifier = Modifier.padding(top = 24.dp).testTag("greeting_text") // (3)
        )
      }
    }
  }
}