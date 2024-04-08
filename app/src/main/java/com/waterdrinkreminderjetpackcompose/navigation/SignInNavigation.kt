package com.waterdrinkreminderjetpackcompose.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.waterdrinkreminderjetpackcompose.screen.signin.SignInScreen
import com.waterdrinkreminderjetpackcompose.screen.signup.SignUpScreen

sealed class SignInNavigation(val screenName: String) {
    data object SignUp : SignInNavigation("sign_up")

    data object SignIn : SignInNavigation("sign_in")
}

@Composable
fun SignInNavigation() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = SignInNavigation.SignUp.screenName) {
        composable(route = SignInNavigation.SignUp.screenName) {
            SignUpScreen(onSignInClick = {
                navController.navigate(SignInNavigation.SignIn.screenName)
            })
        }
        composable(route = SignInNavigation.SignIn.screenName) {
            SignInScreen(onSignUpClick = {
                navController.navigate(SignInNavigation.SignUp.screenName)
            })
        }
    }
}