package com.navibuddy.leadyourway.ui.auth.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType

@Composable
fun EmailTextField(email: String, setEmail: (String) -> Unit) {
  OutlinedTextField(
    value = email,
    onValueChange = { newEmail -> setEmail(newEmail) },
    label = { Text(text = "Email") },
    leadingIcon = { Icon(Icons.Filled.Email, "Email icon") },
    singleLine = true,
    keyboardOptions = KeyboardOptions(
      keyboardType = KeyboardType.Email,
      imeAction = ImeAction.Default
    ),
    modifier = Modifier
      .fillMaxWidth()
  )
}