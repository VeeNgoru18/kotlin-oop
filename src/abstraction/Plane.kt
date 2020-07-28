package abstraction

/*
*
*---------------------------------------------------------------------------------------------
*  What is an abstract  class in Kotlin ?
*---------------------------------------------------------------------------------------------
*
* An abstract class is a class that cannot be instantiated.
* We create abstract classes to provide a common template for other classes to extend and use
*
*---------------------------------------------------------------------------------------------
*  Points to Note
*---------------------------------------------------------------------------------------------
*
* 1. We cannot create the object of an abstract class.
* 2. Property and member function of an abstract class are by default non-abstract.
*    If you want to override these in the child class then you need to use open keyword for them.
* 3. If a member function is abstract then it must be implemented in the child class.
*    An abstract member function doesn’t have a body only method signature,
*    the implementation is done in the child class.
* */

abstract class Plane {

    /*
    * Non-Abstract Function
    * */
    fun flight() {
        println("Nairobi to Amsterdam")
    }

    /*
    * This is an Abstract function that has a parameter
    * */
    abstract fun start(msg: String)

    /*
    * This is an Abstract function that has a parameter
    * */
    abstract fun fly(feet: Int)

    /*
    * This is an Abstract function that has a parameter
    * */
    abstract fun landing(msg: String)
}


/*
*  This is a normal class that extends Plane which is an Abstract class.
*
*  The plane Abstraction class overrides the following methods.
*    1. start(msg: String).
*    2. fly(feet: Int).
*    3. landing(msg: String).
*
*  Inside the overrides u can do data processing as u wish
*
* */

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

/*
*
* This the Entry of the program
* */

fun main() {

    // creating  an object of KLM Class Above
    var plane = KLM()

    //Calling flight function  fom KLM though its not part of it
    plane.flight()

    //calling start function in KLM and data processing starts
    plane.start("Nairobi")

    //calling fly function in KLM and data processing starts
    plane.fly(1500)

    //calling landing function in KLM and data processing starts
    plane.landing("Amsterdam")

}