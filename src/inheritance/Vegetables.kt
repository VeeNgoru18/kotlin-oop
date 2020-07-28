package inheritance

/*
*
*---------------------------------------------------------------------------------------------
* What is Inheritance in Kotlin
*---------------------------------------------------------------------------------------------
* Inheritance is a feature using which a class inherits all the features of another class.
* The class from which the features are inherited is known as base class or super class or
* parent class and the class that inherits the features is known as derived class or sub
* class or child class.
*
* */
open class Vegetable(seeds: String, leaves: String, roots: String) {
    init {
        println("Vegetable is Seeded: $seeds")
        println("Vegetable Leaves are $leaves in color")
        println("Vegetable has $roots root type")
    }
}

//inherting vegetable class  with  : Vegetable(seeds, leaves, roots) {}
class Cucumber(seeds: String, leaves: String, roots: String) : Vegetable(seeds, leaves, roots) {
    fun cucumber() {
        println("Cucumber is a true inheritance.Vegetable")
    }
}

fun main() {
    var veg = Cucumber("true", "Green", "node_modules")

    veg.cucumber()
}