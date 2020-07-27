package classess/*
* T
*
* */

class Student {

    fun admit(name: String, age: Int, grade: String) {
        println("New classess.Student $name and age $age and is in grade $grade")
    }

    fun promote(name: String, grade: String) {
        println("classess.Student $name has been promoted to grade $grade")
    }

    fun suspend(name: String) {
        println("classess.Student $name has been Suspended ")
    }

}

fun main() {
    var student = Student()

    student.admit("James Nyakundi", 10, "3rd")
    student.promote("James Nyakundi", "4th")
    student.suspend("James Nyakundi")


}