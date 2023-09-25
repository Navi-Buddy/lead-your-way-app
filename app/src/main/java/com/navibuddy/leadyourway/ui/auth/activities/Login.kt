package com.navibuddy.leadyourway.ui.auth.activities

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.FilledIconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.navibuddy.leadyourway.ui.auth.components.EmailTextField
import com.navibuddy.leadyourway.ui.auth.components.PasswordTextField
import com.navibuddy.leadyourway.ui.navigation.Routes

@Composable
fun Login(navController: NavController) {
  val (email, setEmail) = remember { mutableStateOf("") }
  val (password, setPassword) = remember { mutableStateOf("") }
  val (showPassword, setShowPassword) = remember { mutableStateOf(false) }

  Column(
    verticalArrangement = Arrangement.SpaceAround,
    modifier = Modifier.padding(32.dp)
  ) {

    Column {
      // TODO: Add Lead Your Way logo
      Text(
        text = "Welcome back!",
        fontSize = 32.sp,
        fontWeight = FontWeight.Bold
      )
    }

    Column {
      EmailTextField(email = email, setEmail = setEmail)
      Spacer(Modifier.padding(8.dp))
      PasswordTextField(
        password = password,
        setPassword = setPassword,
        showPassword = showPassword,
        setShowPassword = setShowPassword
      )
    }
    
    Column {
      FilledIconButton(
        onClick = { /*TODO*/ },
        modifier = Modifier.fillMaxWidth()
      ) {
        Text(
          text = "Login",
          fontSize = 20.sp,
        )
      }
      Spacer(modifier = Modifier.padding(4.dp))
      TextButton(onClick = { navController.navigate(Routes.Register.route) }) {
        Text("Don't have an account? ")
        Text(text = "Register now", fontWeight = FontWeight.ExtraBold)
      }
    }
  }
}