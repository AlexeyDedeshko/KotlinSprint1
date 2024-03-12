package lesson_3

fun main() {

    val greetingsDay = "Добрый день"
    val greetingsEvening = "Доброе вечер"
    val name = "Иван!"

    val greetNameDay = greetingsDay + name
    val greetNameEvening = greetingsEvening + name

    println("$greetingsDay, $name")
    println("$greetingsEvening, $name")
}