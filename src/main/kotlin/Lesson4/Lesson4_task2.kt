package Lesson4

fun main() {

    val cargo1Weight = 20
    val cargo1Volume = 80

    val cargo2Weight = 50
    val cargo2Volume = 100

    // val categoryAverage = gruz1Weight > weightFrom && gruz1Weight <= weightTo && gruz1Volume < volumeLit

    // && gruz1Volume < volumeLit

    println("Груз с весом $cargo1Weight и объемом $cargo1Volume соответствует категории 'Average': " +
            "${cargo1Weight > WEIGHT_FROM && cargo1Weight <= WEIGHT_TO && cargo1Volume < VOLUNE_LIT}")
    println("Груз с весом $cargo2Weight и объемом $cargo2Volume соответствует категории 'Average': " +
            "${cargo2Weight > WEIGHT_FROM && cargo2Weight <= WEIGHT_TO && cargo2Volume < VOLUNE_LIT}")

}
const val WEIGHT_FROM = 35
const val WEIGHT_TO = 100
const val VOLUNE_LIT = 100