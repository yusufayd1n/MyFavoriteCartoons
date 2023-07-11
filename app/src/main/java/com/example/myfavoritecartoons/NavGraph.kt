package com.example.myfavoritecartoons

import android.util.Log
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument

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
            Screen.CartoonDetail.route,
            arguments = listOf(navArgument(CARTOON_DETAIL_ID) {
                type = NavType.IntType
            })
        ) {
            CartoonDetailScreen()
        }
    }
}