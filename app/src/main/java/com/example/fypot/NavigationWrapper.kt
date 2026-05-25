package com.example.fypot

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.fypot.presentation.home.HomeScreen
import com.example.fypot.presentation.initial.InitialScreen
import com.example.fypot.presentation.login.LoginScreen
import com.example.fypot.presentation.signup.SignUpScreen
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.FirebaseFirestore

@Composable

fun NavigationWrapper(
    navHostController: NavHostController,
    auth: FirebaseAuth){

    NavHost(navController = navHostController, startDestination = "home"){
        composable("initial"){
            InitialScreen(
                navigateToLogin = {navHostController.navigate("Login")},
                navigateToSignUp = {navHostController.navigate("signUp")}
            )
        }
        composable("login"){
            LoginScreen(auth){
                navHostController.navigate("home")
            }
        }
        composable("signup"){
            SignUpScreen(auth)
        }
        composable("home"){
            HomeScreen()
        }
    }

}