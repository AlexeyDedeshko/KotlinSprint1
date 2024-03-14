package lesson_3

fun main() {
    val nameMiss = "Татьяна"
    var sernameMiss = "Андреева"
    val patronymicMiss = "Сергеевна"
    var ageMiss = 20
    println("$nameMiss $patronymicMiss ${run {sernameMiss}}, ${run {ageMiss}}")

    sernameMiss = "Сидорова"
    ageMiss = 22

    println("$nameMiss $patronymicMiss $sernameMiss, $ageMiss")

}