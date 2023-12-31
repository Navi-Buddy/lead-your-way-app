package com.navibuddy.leadyourway.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.navibuddy.leadyourway.ui.auth.activities.Home
import com.navibuddy.leadyourway.ui.auth.activities.Login
import com.navibuddy.leadyourway.ui.auth.activities.Register

sealed class Routes(val route: String) {
  object Login : Routes("Login")
  object Register : Routes("Register")
  object Home : Routes("Home")
}

@Composable
fun Navigation() {
  val navController = rememberNavController()

  NavHost(
    navController = navController,
    startDestination = Routes.Login.route
  ) {

    composable(Routes.Login.route) {
      Login(navController)
    }

    composable(Routes.Register.route) {
      Register(navController)
    }

    composable(Routes.Home.route) {
      Home()
    }
  }
}