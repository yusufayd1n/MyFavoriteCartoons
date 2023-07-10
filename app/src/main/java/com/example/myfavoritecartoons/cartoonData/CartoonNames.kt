package com.example.myfavoritecartoons.cartoonData

class CartoonNames {
    var cartoons = listOf<Cartoon>()

    fun getCartoonNames() : List<Cartoon> {
        cartoons = cartoons + Cartoon(1,"Yu-Gi-Oh")
        cartoons = cartoons + Cartoon(2,"Bakugan")
        cartoons = cartoons + Cartoon(3,"Pokemon")
        cartoons = cartoons + Cartoon(4,"Star Wars: The Clone Wars")
        cartoons = cartoons + Cartoon(5,"Samurai Jack")
        cartoons = cartoons + Cartoon(6,"Scooby-Doo")
        return cartoons
    }

}