package Lesson4

fun main() {

    val weightFrom = 35
    val weightTo = 100
    val volumeLit = 100

    val gruz1Weight = 20
    val gruz1Volume = 80

    val gruz2Weight = 50
    val gruz2Volume = 100

    // val categoryAverage = gruz1Weight > weightFrom && gruz1Weight <= weightTo && gruz1Volume < volumeLit

    // && gruz1Volume < volumeLit

    println("Груз с весом $gruz1Weight и объемом $gruz1Volume соответствует категории 'Average': ${gruz1Weight > weightFrom && gruz1Weight <= weightTo && gruz1Volume < volumeLit}")
    println("Груз с весом $gruz2Weight и объемом $gruz2Volume соответствует категории 'Average': ${gruz2Weight > weightFrom && gruz2Weight <= weightTo && gruz2Volume < volumeLit}")

}