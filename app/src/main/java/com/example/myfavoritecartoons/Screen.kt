package com.example.myfavoritecartoons

const val CARTOON_DETAIL_ID = "id"
sealed class Screen(val route : String){
    object Cartoons : Screen(route = "cartoons_screen")
    object CartoonDetail : Screen(route = "cartoon_detail_screen/{$CARTOON_DETAIL_ID}"){
        fun passCartoonId(id : Int) : String{
            return this.route.replace(oldValue = "{$CARTOON_DETAIL_ID}", newValue = id.toString())
        }
    }
}
