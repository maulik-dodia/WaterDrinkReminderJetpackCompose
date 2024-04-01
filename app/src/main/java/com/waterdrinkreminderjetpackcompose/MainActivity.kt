package com.waterdrinkreminderjetpackcompose

import android.os.Bundle
import android.provider.ContactsContract.Profile
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.waterdrinkreminderjetpackcompose.screen.History
import com.waterdrinkreminderjetpackcompose.screen.Home
import com.waterdrinkreminderjetpackcompose.screen.ProfileScreen
import com.waterdrinkreminderjetpackcompose.ui.theme.WaterDrinkReminderJetpackComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            WaterDrinkReminderJetpackComposeTheme {
                History()
            }
        }
    }
}