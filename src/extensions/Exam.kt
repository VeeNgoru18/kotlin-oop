package extensions


/*
*
*---------------------------------------------------------------------------------------------
* What are Extension Functions in Kotlin ?
*---------------------------------------------------------------------------------------------
*
* Kotlin provides the ability to extend a class with new functionality without having to inherit
* from the class or use design patterns such as Decorator.
* This is done via special declarations called extensions.
* For example, you can write new functions for a class from a third-party library that you can't modify.
* Such functions are available for calling in the usual way as if they were methods of the original class.
* This mechanism is called extension functions.
*  There are also extension properties that let you define new properties for existing classes.
* */
class Exam {
    fun isPassed(marks: Int): Boolean {
        return marks >= 70
    }
}

fun Exam.isFailed(marks: Int): Boolean {
    return marks < 70
}

fun main() {

    var exam = Exam()

    var passed = exam.isPassed(70)

    println("The Certification  Passing Status is $passed")

    var failed = exam.isFailed(30)

    println("The Certification Failing Status is $failed")
}