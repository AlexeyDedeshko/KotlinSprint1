package lesson_2

fun main() {
    val initialDeposit = 70_000.0 // сумма вклада в рублях
    val annualInterestRate = 0.167 // процентная ставка в качестве доли
    val years = 20 // продолжительность вклада в годах

    val futureValue = calculateFutureValue(initialDeposit, annualInterestRate, years)
    val formattedFutureValue = "%.3f".format(futureValue)

    println("Размер вклада через 20 лет: $formattedFutureValue рублей")
}

fun calculateFutureValue(initialDeposit: Double, annualInterestRate: Double, years: Int): Double {
    var futureValue = initialDeposit * (1 + annualInterestRate)
    for (i in 1 until years) {
        futureValue *= (1 + annualInterestRate)
    }
    return futureValue
}


