package lesson_2

import java.lang.StrictMath.pow
import kotlin.math.pow

fun main() {
    val initialDeposit = 70_000.0 // сумма вклада в рублях
    val annualInterestRate = 16.7 // процентная ставка
    val years = 20 // продолжительность вклада в годах

    // Формула для расчета через возведение в степень
    val sum = initialDeposit * (1 + annualInterestRate / 100).pow(years)
    println("Размер вклада через 20 лет (возведение в степень): $sum")

}
