package classess

/*
*
*---------------------------------------------------------------------------------------------
* What are classes in kotlin ?
*---------------------------------------------------------------------------------------------
*
* Classes are the main building blocks of any object oriented programming language.
* All objects are part of a class and share the common property and behaviour
* defined by the class in form of data members and member functions respectively.
*
* A class is like a blueprint for the objects.
*
* A class is like a prototype for objects which you can create by grouping methods and variables.
* */

class Student {

    // This is a function with parameters
    fun admit(name: String, age: Int, grade: String) {
        println("New Student $name and age $age and is in grade $grade")
    }

    // This is a function with parameters
    fun promote(name: String, grade: String) {
        println("Student $name has been promoted to grade $grade")
    }

    // This is a function with parameters
    fun suspend(name: String) {
        println("Student $name has been Suspended ")
    }

}

/*
* program Entry point
* */
fun main() {

    // calling student object which is a class above
    var student = Student()

    // Admiting new Student
    student.admit("James Nyakundi", 10, "3rd")
    // Promoting to next grade
    student.promote("James Nyakundi", "4th")
    // Suspending a student
    student.suspend("James Nyakundi")
}