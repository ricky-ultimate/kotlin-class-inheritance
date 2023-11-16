fun main(){
    val coffeeMachine = PremiumCoffeeMachine(23.5,"gold")
    val coffeeMachine2 = PremiumCoffeeMachine()

    coffeeMachine.makeCoffee2()
    coffeeMachine.makeCoffee()

    println("")

    coffeeMachine2.makeCoffee2()
}