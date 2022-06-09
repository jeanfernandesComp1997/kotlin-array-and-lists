fun array1() {
    val ages = intArrayOf(23, 25, 9)
    // or
    //    val ages2 = IntArray(3)
    //    ages[0] = 23
    //    ages[1] = 25
    //    ages[2] = 9

    var olderAge = 0

    for (age in ages) {
        if (age > olderAge) {
            olderAge = age
        }
    }

    println("The older age is $olderAge")

    // or

    var underAge = Int.MAX_VALUE

    ages.forEach { age ->
        if (age < underAge) {
            underAge = age
        }
    }

    println("The under age is $underAge")
}