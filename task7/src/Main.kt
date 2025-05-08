class Car(val brand: String, val model: String, val year: Int) {
    // Function to display car details
    fun displayDetails() {
        println("Car Details: $brand $model ($year)")
    }
}

fun main() {
    // Create two Car objects
    val car1 = Car("Toyota", "Camry", 2022)
    val car2 = Car("Tesla", "Model 3", 2023)

    // Display their details
    car1.displayDetails()  // Output: Car Details: Toyota Camry (2022)
    car2.displayDetails()  // Output: Car Details: Tesla Model 3 (2023)
}