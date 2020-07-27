package extensions

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