open class Vegetable(seeds: String, leaves: String, roots: String) {
    init {
        println("Vegetable is Seeded  : $seeds")
        println("Vegetable Leaves are $leaves in color")
        println("Vegetable has $roots root type")
    }
}

class Cucumber(seeds: String, leaves: String, roots: String) : Vegetable(seeds, leaves, roots) {
    fun cucumber() {
        println("Cucumber is a true Vegetable")
    }
}

fun main() {
    var veg = Cucumber("true", "Green", "node_modules")

    veg.cucumber()
}