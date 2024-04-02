package com.waterdrinkreminderjetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.AccountCircle
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.List
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.waterdrinkreminderjetpackcompose.navigation.MainNavigation
import com.waterdrinkreminderjetpackcompose.screen.History
import com.waterdrinkreminderjetpackcompose.screen.Home
import com.waterdrinkreminderjetpackcompose.screen.ProfileScreen
import com.waterdrinkreminderjetpackcompose.ui.theme.WaterDrinkReminderJetpackComposeTheme
import com.waterdrinkreminderjetpackcompose.ui.theme.bottomNavBar

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            WaterDrinkReminderJetpackComposeTheme {
                BottomNavBar()
            }
        }
    }
}

@Composable
fun BottomNavBar() {
    val navController = rememberNavController()
    val selected = remember {
        mutableStateOf(Icons.Outlined.Home)
    }
    Scaffold(bottomBar = {
        BottomAppBar(
            containerColor = bottomNavBar
        ) {
            IconButton(
                onClick = {
                    selected.value = Icons.Outlined.Home
                    navController.navigate(MainNavigation.Home.screenName) {
                        popUpTo(0)
                    }
                },
                modifier = Modifier.weight(1f)
            ) {
                Icon(
                    imageVector = Icons.Outlined.Home,
                    contentDescription = stringResource(id = R.string.label_home),
                    modifier = Modifier.size(26.dp),
                    tint = if (selected.value == Icons.Outlined.Home) Color.White else Color.Gray
                )
            }
            IconButton(
                onClick = {
                    selected.value = Icons.Outlined.List
                    navController.navigate(MainNavigation.History.screenName) {
                        popUpTo(0)
                    }
                },
                modifier = Modifier.weight(1f)
            ) {
                Icon(
                    imageVector = Icons.Outlined.List,
                    contentDescription = stringResource(id = R.string.label_search),
                    modifier = Modifier.size(26.dp),
                    tint = if (selected.value == Icons.Outlined.List) Color.White else Color.Gray
                )
            }
            IconButton(
                onClick = {
                    selected.value = Icons.Outlined.AccountCircle
                    navController.navigate(MainNavigation.Profile.screenName) {
                        popUpTo(0)
                    }
                },
                modifier = Modifier.weight(1f)
            ) {
                Icon(
                    imageVector = Icons.Outlined.AccountCircle,
                    contentDescription = stringResource(id = R.string.label_info),
                    modifier = Modifier.size(26.dp),
                    tint = if (selected.value == Icons.Outlined.AccountCircle) Color.White else Color.Gray
                )
            }
        }
    }) { paddingValues ->
        NavHost(
            navController = navController,
            startDestination = MainNavigation.Home.screenName,
            modifier = Modifier.padding(paddingValues)
        ) {
            composable(MainNavigation.Home.screenName) {
                Home()
            }
            composable(MainNavigation.History.screenName) {
                History()
            }
            composable(MainNavigation.Profile.screenName) {
                ProfileScreen()
            }
        }
    }
}