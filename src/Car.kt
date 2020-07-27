class Car {

    constructor(brand: String, year: Int, model: String, price: Int) {
        println("Brand = $brand")
        println("Year  = $year")
        println("Model = $model")
        println("Price = $price")
    }
}

fun main() {
    Car("Toyota", 2012, "Wish", 2000000)
}

