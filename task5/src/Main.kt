// Function to sum two integers
fun sum(a: Int, b: Int): Int {
    return a + b
}

fun main() {
    // Test cases
    println("5 + 3 = ${sum(5, 3)}")      // Output: 5 + 3 = 8
    println("10 + (-2) = ${sum(10, -2)}") // Output: 10 + (-2) = 8
    println("0 + 0 = ${sum(0, 0)}")       // Output: 0 + 0 = 0
}