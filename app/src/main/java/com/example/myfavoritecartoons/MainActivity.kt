package com.example.myfavoritecartoons

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController

import com.example.myfavoritecartoons.ui.theme.MyFavoriteCartoonsTheme

class MainActivity : ComponentActivity() {

    lateinit var navController: NavHostController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyFavoriteCartoonsTheme {
                navController = rememberNavController()
                InitNavGraph(navController = navController)
            }
        }
    }
}
