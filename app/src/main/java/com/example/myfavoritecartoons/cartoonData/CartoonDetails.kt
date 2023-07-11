package com.example.myfavoritecartoons.cartoonData

import com.example.myfavoritecartoons.R

class CartoonDetails(private val cartoonId: Int) {

    var cartoonDetailList: MutableList<CartoonDetail> =ArrayList()
    var cartoonImageList = listOf<Int>()
    fun setCartoonDetailData() {
        when (cartoonId) {
            1 -> {
                cartoonImageList = listOf(
                    R.drawable.yugioh,
                    R.drawable.bakugan,
                    R.drawable.pokemon,
                    R.drawable.clonewars
                )
                cartoonDetailList.add(
                    CartoonDetail(
                        1,
                        "Yu-Gi-Oh",
                        cartoonImageList,
                        R.string.YuGiOh_Description.toString()
                    )
                )
            }

            2 -> {
                cartoonImageList = listOf(R.drawable.bakugan)
                /*cartoonDetails = cartoonDetails + CartoonDetail(
                    2,
                    "Bakugan",
                    cartoonImageList,
                    R.string.YuGiOh_Description.toString()
                )*/
            }

            3 -> {
                cartoonImageList = listOf(R.drawable.pokemon)
                /*cartoonDetails = cartoonDetails + CartoonDetail(
                    3,
                    "Pokemon",
                    cartoonImageList,
                    R.string.YuGiOh_Description.toString()
                )*/
            }

            4 -> {
                cartoonImageList = listOf(R.drawable.clonewars)
                /*cartoonDetails = cartoonDetails + CartoonDetail(
                    4,
                    "Star Wars: The Clone Wars",
                    cartoonImageList,
                    R.string.YuGiOh_Description.toString()
                )*/
            }

            5 -> {
                cartoonImageList = listOf(R.drawable.samuraijack)
                /* cartoonDetails = cartoonDetails + CartoonDetail(
                     5,
                     "Samurai Jack",
                     cartoonImageList,
                     R.string.YuGiOh_Description.toString()
                 )*/
            }

            6 -> {
                cartoonImageList = listOf(R.drawable.scobydo)
                /* cartoonDetails = cartoonDetails + CartoonDetail(
                     6,
                     "Scooby-Doo",
                     cartoonImageList,
                     R.string.YuGiOh_Description.toString()
                 )*/
            }
        }
    }

    fun getCartoonDetailsById(): MutableList<CartoonDetail> {
        return cartoonDetailList
    }

}