package com.navibuddy.leadyourway.ui.auth.activities

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Visibility
import androidx.compose.material.icons.filled.VisibilityOff
import androidx.compose.material3.FilledIconButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.navibuddy.leadyourway.R
import com.navibuddy.leadyourway.ui.auth.components.EmailTextField
import com.navibuddy.leadyourway.ui.auth.components.PasswordTextField
import com.navibuddy.leadyourway.ui.navigation.Routes

@Composable
fun Register(navController: NavController) {
    val (email, setEmail) = remember { mutableStateOf("") }
    val (password, setPassword) = remember { mutableStateOf("") }
    val (showPassword, setShowPassword) = remember { mutableStateOf(false) }
    val (repeatedPassword, setRepeatedPassword) = remember { mutableStateOf("") }
    var showRepeatedPassword by remember { mutableStateOf(false) }

    Column(
        verticalArrangement = Arrangement.SpaceAround,
        modifier = Modifier.padding(32.dp)
    ) {
        Column {
            Box(
                modifier = Modifier.fillMaxWidth(),
                contentAlignment = Alignment.Center
            ) {
                Image(
                    painter = painterResource(id = R.drawable.transparent_icon),
                    contentDescription = null,
                    modifier = Modifier
                )
            }
        }

        Column {
            Text(
                modifier = Modifier.padding(vertical = 15.dp),
                text = "Create account",
                fontSize = 32.sp,
                fontWeight = FontWeight.Bold
            )
            EmailTextField(email = email, setEmail = setEmail)
            Spacer(Modifier.padding(8.dp))
            PasswordTextField(
                password = password,
                setPassword = setPassword,
                showPassword = showPassword,
                setShowPassword = setShowPassword
            )
            Spacer(Modifier.padding(8.dp))
            OutlinedTextField(
                modifier = Modifier.fillMaxWidth(),
                value = repeatedPassword,
                onValueChange = setRepeatedPassword,
                leadingIcon = { Icon(Icons.Filled.Lock, "Lock") },
                label = { Text(text = "Confirm password") },
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
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
            Spacer(Modifier.padding(3.dp))
            if (password != repeatedPassword) {
                Text(
                    text = stringResource(R.string.password_do_not_match),
                    color = colorResource(R.color.soft_red300),
                    fontSize = 14.sp
                )
            }

        }

        Column {
            FilledIconButton(
                onClick = { /*TODO*/ },
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(
                    text = "Register",
                    fontSize = 20.sp,
                )
            }
            Spacer(modifier = Modifier.padding(4.dp))
            TextButton(onClick = { navController.navigate(Routes.Register.route) }) {
                Text("Already signed up? ")
                Text(text = "Login", fontWeight = FontWeight.ExtraBold)
            }
        }
    }
}