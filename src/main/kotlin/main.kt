import java.math.BigDecimal
import java.math.RoundingMode

fun main(args: Array<String>) {
    val salary = bigDecimalArrayOf("1500.55", "2000.00", "10000.00", "800.00")

    println(salary.contentToString())

    val increase = "1.1".toBigDecimal()
    val salaryWithIncrease = salary
        .map { wage ->
            if (wage < "5000".toBigDecimal()) {
                wage + "500".toBigDecimal()
            } else {
                (wage * increase).setScale(2, RoundingMode.UP)
            }
        }
        .toTypedArray()

    println("Salary with increase ${salaryWithIncrease.contentToString()}")
}

fun bigDecimalArrayOf(vararg vals: String): Array<BigDecimal> {
    return Array(vals.size) { i ->
        vals[i].toBigDecimal()
    }
}