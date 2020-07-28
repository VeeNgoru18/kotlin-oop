package constructor

/*
*
*---------------------------------------------------------------------------------------------
*  What Are Constructor in Kotlin ?
*---------------------------------------------------------------------------------------------
*  The main purpose of constructor is to initialize the properties of a class.
*  Constructor is called when we create the object of a class.
*
* Types of Constructors in Kotlin
*   1. Primary Constructor – Initialize the properties of class.
*   2. Secondary Constructor – Initialize the properties of class,
*      we can have additional initialization code inside secondary constructor.
*
* */
class Car {

    // Secondary Constructor
    constructor(brand: String, year: Int, model: String, price: Int) {
        println("Brand = $brand")
        println("Year  = $year")
        println("Model = $model")
        println("Price = $price")
    }
}

/*
* Program Entry Point
* */
fun main() {
    // Car Object Initialization
    Car("Toyota", 2012, "Wish", 2000000)
}

