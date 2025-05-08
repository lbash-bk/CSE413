fun main() {
    val multiply: (Int, Int) -> Int = { a, b -> a * b }

    val result = multiply(4, 5)

    println("The product is: $result")
}