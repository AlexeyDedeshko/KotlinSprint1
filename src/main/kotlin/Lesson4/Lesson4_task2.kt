package Lesson4

fun main() {

    val weightFrom = 35
    val weightTo = 100
    val volumeLit = 100

    val cargo1Weight = 20
    val cargo1Volume = 80

    val cargo2Weight = 50
    val cargo2Volume = 100

    // val categoryAverage = gruz1Weight > weightFrom && gruz1Weight <= weightTo && gruz1Volume < volumeLit

    // && gruz1Volume < volumeLit

    println("Груз с весом $cargo1Weight и объемом $cargo1Volume соответствует категории 'Average': " +
            "${cargo1Weight > weightFrom && cargo1Weight <= weightTo && cargo1Volume < volumeLit}")
    println("Груз с весом $cargo2Weight и объемом $cargo2Volume соответствует категории 'Average': " +
            "${cargo2Weight > weightFrom && cargo2Weight <= weightTo && cargo2Volume < volumeLit}")

}