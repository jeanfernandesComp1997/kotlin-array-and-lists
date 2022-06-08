fun range() {
    val series = 1.rangeTo(10)

    for (s in series) {
        print("$s ")
    }

    println()

    val evens = 0..100 step 2

    for (even in evens) {
        print("$even ")
    }

    println()

    val reverseEven = 100 downTo 0 step 2

    reverseEven.forEach { even ->
        print("$even ")
    }

    println()

    val interval = 1500.0..5000.0
    val salary = 4000.0

    if (salary in interval) {
        println("Is between interval")
    } else {
        println("Is out of interval")
    }

    val alphabet = "a".."z"
    val letter = "k"

    println(letter in alphabet)
}