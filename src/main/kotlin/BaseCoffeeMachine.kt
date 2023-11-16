open class BaseCoffeeMachine(
    private val price: Double,
    private val color: String
) {
    fun makeCoffee(){
        println("Your $color coloured coffee of price $${price} is ready")
    }
}