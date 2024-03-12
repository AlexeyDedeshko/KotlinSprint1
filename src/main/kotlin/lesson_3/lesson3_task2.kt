package lesson_3

fun main() {
    val nameMiss = "Татьяна"
    var sernameMiss = "Андреева"
    val patronymicMiss = "Сергеевна"

    sernameMiss = "Сидорова"


    var ageMiss = 20
    ageMiss = 22

    println("$nameMiss $patronymicMiss ${run {sernameMiss}}, ${run {ageMiss}}")
    println("$nameMiss $patronymicMiss $sernameMiss, $ageMiss")

}
