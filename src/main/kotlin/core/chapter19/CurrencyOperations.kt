package main.kotlin.core.chapter19

import java.math.BigDecimal

data class Money(
    val amount: BigDecimal,
    val currency: Currency,
) {
    operator fun plus(other: Money): Money {
        return Money(this.amount + other.amount, currency)
    }
    operator fun minus(other: Money): Money {
        return Money(this.amount + other.amount, currency)
    }
    operator fun times(scalar: Int): Money {
        return Money(this.amount * scalar.toBigDecimal(), currency)
    }
    operator fun unaryMinus(): Money {
        return Money(-this.amount, currency)
    }

    companion object {
        fun eur(amount: String) = Money(BigDecimal(amount), Currency.EUR)
    }
}

enum class Currency {
    EUR, USD, GBP, RUB
}

fun main() {
    val money1 = Money.eur("10.00")
    val money2 = Money.eur("29.99")

    println(money1 + money2)
    println(money1 - money2)
    println(-money1)
    println(money1 * 3)
}