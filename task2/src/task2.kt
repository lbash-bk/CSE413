fun main() {
    print("Enter your name: ")
    val name = readLine()

    print("Enter your age: ")
    val age = readLine()?.toIntOrNull() // Safely converts input to Int (or null if invalid)

    println("Hello $name, you are $age years old!")
}