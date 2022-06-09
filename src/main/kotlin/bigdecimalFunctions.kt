import java.math.BigDecimal

fun bigDecimalArrayOf(vararg vals: String): Array<BigDecimal> {
    return Array(vals.size) { i ->
        vals[i].toBigDecimal()
    }
}

fun Array<BigDecimal>.sum(): BigDecimal {
    return this.reduce { acc, value ->
        acc + value
    }
}

fun Array<BigDecimal>.average(): BigDecimal {
    return if (this.isEmpty()) {
        BigDecimal.ZERO
    } else {
        this.sum() / this.size.toBigDecimal()
    }

}