import java.math.BigDecimal
import java.math.RoundingMode

fun testArrayFunctions() {
    val salary = bigDecimalArrayOf("1500.55", "2000.00", "10000.00", "800.00")

    println(salary.contentToString())

    val increase = "1.1".toBigDecimal()
    val salaryWithIncrease = salary
        .map { wage -> increaseRelativeCalculator(wage, increase) }
        .toTypedArray()

    println("Salary with increase ${salaryWithIncrease.contentToString()}")

    val initialExpense = salaryWithIncrease.sum()
    println("Initial expense $initialExpense")

    val months = 6.toBigDecimal()
    val totalExpense = salaryWithIncrease.fold(initialExpense) { acc, wage ->
        acc + (wage * months).setScale(2, RoundingMode.UP)
    }

    println("Total expense $totalExpense")

    val average = salaryWithIncrease
        .sorted()
        .takeLast(3)
        .toTypedArray()
        .average()
    println("Average last 3 salary: $average")

    val averageFirstSalary = salaryWithIncrease
        .sorted()
        .take(3)
        .toTypedArray()
        .average()
    println("Average first 3 salary: $averageFirstSalary")
}

fun increaseRelativeCalculator(wage: BigDecimal, increase: BigDecimal): BigDecimal {
    return if (wage < "5000".toBigDecimal()) {
        wage + "500".toBigDecimal()
    } else {
        (wage * increase).setScale(2, RoundingMode.UP)
    }
}