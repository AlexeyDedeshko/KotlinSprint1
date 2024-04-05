package Lesson4

fun main() {

    val day = 5
    // Определяем четные и не четные дни
    val isEven: Boolean = day % 2 == 0

    // Применяем флаг к переменной
    val hands = isEven
    val legs = !isEven

    // Выводим результат в консоль
    val stroke = "Упражнения для рук: $hands, Упражнения для пресса: $hands, Упражнения для ног: $legs, Упражнения для спины: $legs"

    val parts = stroke.split(",")
    val part1 = parts[0]
    val part2 = parts[1]
    val part3 = parts[2]
    val part4 = parts[3]

    println("$part1")
    println("$part2")
    println("$part3")
    println("$part4")
}

/*
Программа тренировок разбивает упражнения на две группы: упражнения для мышц рук/пресса и ног/спины.
Она рекомендует делать упражнения на каждую группу мышц через день. Пользователь начал занятия с рук
и пресса. Напиши программу, которая будет сообщать, какие упражнения нужно выполнить сегодня.

Предположим, что сегодня 5 день тренировок. В первый день выполнялись упражнения для рук и пресса.
Выведи сообщение в виде нескольких красивых ровных строк.

Вывод должен быть таким:

Упражнения для рук:       true
Упражнения для ног:       false
Упражнения для спины:  false
Упражнения для пресса: true

- все сообщение должно печататься в одном println();
- при изменении значения переменной дня тренировки на 1 день вперед, вывод должен меняться.
 */