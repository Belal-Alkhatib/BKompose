package com.bk.bkompose.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.bk.bkompose.ui.screens.MainScreen
import com.bk.bkompose.ui.screens.SampleScreen

sealed class Screen(val route: String) {
    object Main : Screen("main")
    object Sample : Screen("sample")
}

@Composable
fun AppNavigation() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = Screen.Main.route
    ) {
        composable(Screen.Main.route) {
            MainScreen(
                onNavigateToSample = {
                    navController.navigate(Screen.Sample.route)
                }
            )
        }
        composable(Screen.Sample.route) {
            SampleScreen()
        }
    }
}
