package Lesson_6

import java.util.*

fun main() {

    var scanner: String? = readLine()
    print("Введите количество секунд для засечки: ")
    val seconds = scanner

    // Создание объекта Timer
    val timer = Timer()

// Определение действия, выполняемого по истечении заданного времени
timer.schedule(object : TimerTask() {
    override fun run() {
        println("Прошло $scanner секунд")
        timer.cancel() // Остановка таймера
    }
    scanner * 1000L) // Перевод секунд в миллисекунд и задержка выполнения
}
    // Пауза программы
    try {
        Thread.sleep(seconds * 1000L)
    } catch (e: InterruptedException) {
        e.printStackTrace()
    }

}

/*
Создай простой таймер, который запрашивает у пользователя количество секунд, которые нужно засечь. По истечении
заданного времени, выведется сообщение в консоли: “Прошло N секунд”. Где N – количество секунд, введенных пользователем.
Программа должна вставать на паузу.

*/