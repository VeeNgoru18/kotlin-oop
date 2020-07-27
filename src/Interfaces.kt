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