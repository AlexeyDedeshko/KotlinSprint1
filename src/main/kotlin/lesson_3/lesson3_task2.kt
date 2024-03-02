package lesson_3

fun main() {
    val nameMiss = "Андреева Татьяна Сергеевна"
    val nameMissis = "Сидорова Татьяна Сергеевна"
    val ageMiss = 20
    val ageMissis = 22
    val space = ' '

    // Вариант с конкантенацией
    println(nameMiss + "," + space + ageMiss)
    println(nameMissis + "," + space + ageMissis)

    // Вариант с интерполяцией
    println("$nameMiss, $ageMiss")
    println("$nameMissis, $ageMissis")
}
