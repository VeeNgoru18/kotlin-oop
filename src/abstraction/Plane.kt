package abstraction

abstract class Plane {

    fun flight() {
        println("Nairobi to Amsterdam")
    }

    abstract fun start(msg: String)

    abstract fun fly(feet: Int)

    abstract fun landing(msg: String)
}

class KLM : Plane() {
    override fun start(msg: String) {
        println("abstraction.Plane is now leaving: $msg")
    }

    override fun fly(feet: Int) {
        println("abstraction.Plane is now $feet feet above sea level")
    }

    override fun landing(msg: String) {
        println("abstraction.Plane is now landing @$msg")
    }

}


fun main() {
    var plane = KLM()

    plane.flight()

    plane.start("Nairobi")

    plane.fly(1500)

    plane.landing("Amsterdam")


}