fun main() {
    // Create map of students and their scores
    val studentScores = mapOf(
        "Bashir" to 85,
        "Sadeeq" to 62,
        "Umar" to 73,
        "Usman" to 91,
        "Sulaiman" to 68
    )

    // Print students with scores > 70
    println("Students who scored above 70:")
    studentScores.forEach { (name, score) ->
        if (score > 70) {
            println("$name: $score")
        }
    }
}