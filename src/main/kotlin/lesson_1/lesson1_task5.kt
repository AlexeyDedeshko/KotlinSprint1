package lesson_1

fun main() {
    val totalSeconds = 6480
    var hours = 1
    var minutes = 48
    var remainingSeconds = 0

    val secondsPerMinute = 60
    val secondsPerHour = secondsPerMinute * 60

    // Делим общее количество секунд на количество секунд в часе и минуте
    hours = totalSeconds / secondsPerHour
    minutes = (totalSeconds % secondsPerHour) / secondsPerMinute

    // Определяем остаток секунд
    remainingSeconds = totalSeconds % secondsPerMinute

    // Форматируем секунды с двумя чифрами
    val formattedHours = hours.toString().padStart(2, '0')

    // Форматируем секунды с двумя нулями
    val formattedRemainingSecond = remainingSeconds.toString().padStart(2, '0')

    println("$formattedHours:$minutes:$formattedRemainingSecond")
}