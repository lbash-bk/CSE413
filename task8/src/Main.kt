// Base class
open class Person(val name: String, val age: Int) {
    fun printPersonDetails() {
        println("Name: $name")
        println("Age: $age")
    }
}

// Subclass
class Student(name: String, age: Int, val grade: String) : Person(name, age) {
    fun printStudentDetails() {
        printPersonDetails()  // Call base class method
        println("Grade: $grade")
    }
}

fun main() {
    // Create objects
    val person = Person("Bash", 20)
    val student = Student("Ahmad", 18, "A")

    // Print details
    println("Person Details:")
    person.printPersonDetails()

    println("\nStudent Details:")
    student.printStudentDetails()
}