package lesson_4

fun main() {

    val tablesToday = 0
    val tablesTmr = 4

    println("Доступность столиков на сегодня: ${tablesToday <= 0}, " +
            "Доступность столиков на завтра: ${tablesTmr <= 0}")
}

const val NUMBER_OF_TABLES = 13

// не понял как вывести с новой строки не используя """ """, параметр fun printWithNewLine мы пока не изучали