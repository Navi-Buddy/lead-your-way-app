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
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation

@Composable
fun RepeatedPasswordTextField(
    repeatedPassword: String,
    setRepeatedPassword: (String) -> Unit,
) {
    var showRepeatedPassword by remember { mutableStateOf(false) }

    OutlinedTextField(
        modifier = Modifier.fillMaxWidth(),
        value = repeatedPassword,
        onValueChange = setRepeatedPassword,
        leadingIcon = { Icon(Icons.Filled.Lock, "Lock") },
        label = { Text(text = "Confirm password") },
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
        singleLine = true,
        visualTransformation =
        if (showRepeatedPassword) VisualTransformation.None else PasswordVisualTransformation(),
        trailingIcon = {
            IconButton(onClick = { showRepeatedPassword = !showRepeatedPassword }) {
                if (showRepeatedPassword)
                    Icon(Icons.Filled.Visibility, "Visibility on")
                else
                    Icon(Icons.Filled.VisibilityOff, "Visibility off")
            }
        }
    )
}