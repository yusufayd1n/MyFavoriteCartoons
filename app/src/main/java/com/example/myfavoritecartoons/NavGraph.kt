package com.example.myfavoritecartoons

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@Composable
fun InitNavGraph(
    navController: NavHostController
) {
    NavHost(
        navController = navController,
        startDestination = Screen.Cartoons.route
    ) {
        composable(
            Screen.Cartoons.route
        ) {
            CartoonScreen(navController = navController)
        }

        composable(
            Screen.CartoonDetail.route
        ) {
            CartoonDetailScreen()
        }
    }
}