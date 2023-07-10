package com.example.myfavoritecartoons.cartoonData

class CartoonNames {
    var cartoons = listOf<String>()

    fun getCartoonNames() : List<String> {
        cartoons = cartoons + "Yu-Gi-Oh"
        cartoons = cartoons + "Bakugan"
        cartoons = cartoons + "Pokemon"
        cartoons = cartoons + "Star Wars: The Clone Wars"
        cartoons = cartoons + "Samurai Jack"
        cartoons = cartoons + "Scooby-Doo"
        return cartoons
    }

}