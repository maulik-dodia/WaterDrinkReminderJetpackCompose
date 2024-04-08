package com.waterdrinkreminderjetpackcompose.navigation

sealed class MainNavigation(val screenName: String) {
    data object SignUp: MainNavigation("signup")
    data object Home: MainNavigation("home")
    data object History: MainNavigation("history")
    data object Profile: MainNavigation("profile")
}