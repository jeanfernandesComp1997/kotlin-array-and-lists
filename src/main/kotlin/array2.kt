fun array2() {
    val salary = doubleArrayOf(1500.50, 2300.0, 5000.0, 8000.0, 10000.0)

    val increase = 1.1
//    var index = 0
//
//    for (salaryUnit in salary) {
//        salary[index] = salaryUnit * increase
//        index++
//    }

    for (index in salary.indices) {
        salary[index] = salary[index] * increase
    }

    println("New salary: ${salary.contentToString()}")

    salary.forEachIndexed { i, salaryUnit ->
        salary[i] = salaryUnit * increase
    }

    println("New salary: ${salary.contentToString()}")
}