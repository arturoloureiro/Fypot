package com.example.fypot

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.fypot.presentation.initial.InitialScreen
import com.example.fypot.presentation.login.LoginScreen
import com.example.fypot.presentation.signup.SignUpScreen
import com.google.firebase.auth.FirebaseAuth

@Composable

fun NavigationWrapper(navHostController: NavHostController, auth: FirebaseAuth){

    NavHost(navController = navHostController, startDestination = "initial"){
        composable("initial"){
            InitialScreen(
                navigateToLogin = {navHostController.navigate("Login")},
                navigateToSignUp = {navHostController.navigate("signUp")}
            )
        }
        composable("login"){
            LoginScreen()
        }
        composable("signup"){
            SignUpScreen()
        }
    }

}