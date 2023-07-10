package com.example.myfavoritecartoons

sealed class Screen(val route : String){
    object Cartoons : Screen(route = "cartoons_screen")
    object CartoonDetail : Screen(route = "cartoon_detail_screen")
}
