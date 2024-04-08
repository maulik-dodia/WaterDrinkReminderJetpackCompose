package com.waterdrinkreminderjetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.waterdrinkreminderjetpackcompose.navigation.SignInNavigation
import com.waterdrinkreminderjetpackcompose.ui.theme.WaterDrinkReminderJetpackComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            WaterDrinkReminderJetpackComposeTheme {
                SignInNavigation()
            }
        }
    }
}