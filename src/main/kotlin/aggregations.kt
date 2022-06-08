fun aggregations() {
    val ages = intArrayOf(10, 12, 18, 33, 40, 67)
    val maxAge = ages.maxOrNull()

    println("Max age is: $maxAge")

    val underage = ages.minOrNull()
    println("Underage age is: $underage")

    val ageAverage = ages.average()
    println("Age average is $ageAverage")

    val allOfAge = ages.all { it >= 18 }
    println("All of age? $allOfAge")

    val anyOfAge = ages.any { it >= 18 }
    println("Anyone is of age? $anyOfAge")

    val ofAge = ages.filter { it >= 18 }
    println("Of age: $ofAge")

    val age18 = ages.find { it >= 18 }
    println("Find: $age18")
}