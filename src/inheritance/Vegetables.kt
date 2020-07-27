package inheritance

open class Vegetable(seeds: String, leaves: String, roots: String) {
    init {
        println("inheritance.Vegetable is Seeded  : $seeds")
        println("inheritance.Vegetable Leaves are $leaves in color")
        println("inheritance.Vegetable has $roots root type")
    }
}

class Cucumber(seeds: String, leaves: String, roots: String) : Vegetable(seeds, leaves, roots) {
    fun cucumber() {
        println("inheritance.Cucumber is a true inheritance.Vegetable")
    }
}

fun main() {
    var veg = Cucumber("true", "Green", "node_modules")

    veg.cucumber()
}