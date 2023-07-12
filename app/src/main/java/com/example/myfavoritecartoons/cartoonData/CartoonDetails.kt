package com.example.myfavoritecartoons.cartoonData

import android.content.Context
import androidx.compose.ui.platform.LocalContext
import com.example.myfavoritecartoons.R

class CartoonDetails(private val cartoonId: Int, val context: Context) {

    var cartoonDetailList: MutableList<CartoonDetail> = ArrayList()
    var cartoonImageList = listOf<Int>()

    fun setCartoonDetailData() {

        when (cartoonId) {
            1 -> {
                cartoonImageList = listOf(
                    R.drawable.iv_yugioh_1,
                    R.drawable.iv_yugioh_2,
                    R.drawable.iv_yugioh_3,
                    R.drawable.iv_yugioh_4,
                    R.drawable.iv_yugioh_5,
                )

                cartoonDetailList.add(
                    CartoonDetail(
                        cartoonId,
                        "Yu-Gi-Oh",
                        cartoonImageList,
                        context.getString(R.string.YuGiOh_Description)
                    )
                )
            }

            2 -> {
                cartoonImageList = listOf(
                    R.drawable.iv_bakugan_1,
                    R.drawable.iv_bakugan_2,
                    R.drawable.iv_bakugan_3,
                    R.drawable.iv_bakugan_4,
                    R.drawable.iv_bakugan_5,
                )

                cartoonDetailList.add(
                    CartoonDetail(
                        cartoonId,
                        "Bakugan",
                        cartoonImageList,
                        context.getString(R.string.Bakugan_Description)
                    )
                )

            }

            3 -> {
                cartoonImageList = listOf(
                    R.drawable.iv_pokemon_1,
                    R.drawable.iv_pokemon_2,
                    R.drawable.iv_pokemon_3,
                    R.drawable.iv_pokemon_4,
                    R.drawable.iv_pokemon_5,
                )

                cartoonDetailList.add(
                    CartoonDetail(
                        cartoonId,
                        "Pokemon",
                        cartoonImageList,
                        context.getString(R.string.Pokemon_Description)
                    )
                )
            }

            4 -> {
                cartoonImageList = listOf(
                    R.drawable.iv_clonewars_1,
                    R.drawable.iv_clonewars_2,
                    R.drawable.iv_clonewars_3,
                    R.drawable.iv_clonewars_4,
                    R.drawable.iv_clonewars_5,
                )

                cartoonDetailList.add(
                    CartoonDetail(
                        cartoonId,
                        "Clone Wars",
                        cartoonImageList,
                        context.getString(R.string.Clone_Wars_Description)
                    )
                )
            }

            5 -> {
                cartoonImageList = listOf(
                    R.drawable.iv_samurai_1,
                    R.drawable.iv_samurai_2,
                    R.drawable.iv_samurai_3,
                    R.drawable.iv_samurai_4,
                    R.drawable.iv_samurai_5,
                )

                cartoonDetailList.add(
                    CartoonDetail(
                        cartoonId,
                        "Samurai-Jack",
                        cartoonImageList,
                        context.getString(R.string.Samurai_Jack_Description)
                    )
                )
            }

            6 -> {
                cartoonImageList = listOf(
                    R.drawable.iv_scooby_1,
                    R.drawable.iv_scooby_2,
                    R.drawable.iv_scooby_3,
                    R.drawable.iv_scooby_4,
                    R.drawable.iv_scooby_5,
                )

                cartoonDetailList.add(
                    CartoonDetail(
                        cartoonId,
                        "Scooby Doo",
                        cartoonImageList,
                        context.getString(R.string.Scooby_Doo_Description)
                    )
                )
            }
        }
    }

    fun getCartoonDetailsById(): MutableList<CartoonDetail> {
        return cartoonDetailList
    }

}