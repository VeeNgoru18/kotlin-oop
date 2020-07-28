package `interface`

/*
*
*------------------------------------------------------------------------------------------------------------
* What is Interfaces in Kotlin
*------------------------------------------------------------------------------------------------------------
*
* Similar to an abstract class, an interface cannot be instantiated because it doesn’t have any constructor.
*
*------------------------------------------------------------------------------------------------------------
*  Points to Note
*------------------------------------------------------------------------------------------------------------
*
* 1. An interface can have both abstract and non-abstract function.
* 2. An interface can only have abstract property (data member), non-abstract properties are not allowed.
* 3. A class can implement more than one interfaces.
* 4. All abstract properties and abstract member functions of an interface must be overriden in the classes
*  that implement it.
* */
interface Auth {
    fun Onstart(msg: String)
    fun OnSuccess()
    fun OnFailure(msg: String)
}

class Interfaces : Auth {
    override fun Onstart(msg: String) {
        println("Please wait $msg ..........")
    }

    override fun OnSuccess() {
        println("Logged In Successfully")
    }

    override fun OnFailure(msg: String) {
        println("Logged In failed Due to $msg")
    }

}

fun main() {

    var auth = Interfaces()

    auth.Onstart("Fetching from Server")

    auth.OnSuccess()

    auth.OnFailure("Poor Internet")

}