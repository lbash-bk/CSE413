fun main() {
    print("Enter a number: ")
    val number = readLine()?.toIntOrNull()

    if (number != null) {
        val result = if (number % 2 == 0) "even" else "odd"
        println("$number is an $result number.")
    } else {
        println("Invalid input. Please enter a valid number.")
    }
}