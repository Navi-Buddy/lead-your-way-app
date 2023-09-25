package com.navibuddy.leadyourway.ui.auth.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Visibility
import androidx.compose.material.icons.filled.VisibilityOff
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation

@Composable
fun PasswordTextField(
  password: String,
  setPassword: (String) -> Unit,
  showPassword: Boolean,
  setShowPassword: (Boolean) -> Unit
) {
  OutlinedTextField(
    value = password,
    visualTransformation = if (showPassword) VisualTransformation.None else PasswordVisualTransformation(),
    onValueChange = { newPassword -> setPassword(newPassword) },
    label = { Text(text = "Password") },
    leadingIcon = { Icon(Icons.Filled.Lock, "Password icon") },
    trailingIcon = {
      if (showPassword) {
        IconButton(onClick = { setShowPassword(false) }) {
          Icon(Icons.Filled.Visibility, "Hide password")
        }
      }
      else {
        IconButton(onClick = { setShowPassword(true) }) {
          Icon(Icons.Filled.VisibilityOff, "Show password")
        }
      }
    },
    singleLine = true,
    keyboardOptions = KeyboardOptions(
      keyboardType = KeyboardType.Password,
      imeAction = ImeAction.Default
    ),
    modifier = Modifier
      .fillMaxWidth()
  )
}