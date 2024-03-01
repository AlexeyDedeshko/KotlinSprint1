package lesson_2
import java.lang.StrictMath.pow
fun main() {
    val initialDeposit = 70_000.0 // сумма вклада в рублях
    val annualInterestRate = 0.167 // процентная ставка в качестве доли
    val years = 20 // продолжительность вклада в годах

    val futureValue = calculateFutureValue(initialDeposit, annualInterestRate, years)
    val formattedFutureValue = "%.3f".format(futureValue)

    println("Размер вклада через 20 лет: $formattedFutureValue рублей")

    // Функция для возведения в степень
    val base = 2.0
    val exponent = 3.0
    val result = pow(base, exponent)
    println("$base в степени $exponent равно ${result}")

}

fun calculateFutureValue(initialDeposit: Double, annualInterestRate: Double, years: Int): Double {
    var futureValue = initialDeposit * (1 + annualInterestRate)
    for (i in 1 until years) {
        futureValue *= (1 + annualInterestRate)
    }
    return futureValue
}


