class PremiumCoffeeMachine(
    private val price: Double,
    private val color: String,
    private val quantity: Double = 2.0
): BaseCoffeeMachine(9999.9,"random") {

    //constructor(): this(0.0, "brown", 0.0)

    fun makeCoffee2(){
        println("Your $color coloured coffee of price $${price} and quantity ${quantity}cm^3 is ready")
    }

}