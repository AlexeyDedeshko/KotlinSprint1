fun main() {

    // Исходные данные
    val exitHour = 9
    val exitMin = 39
    val onTheWay = 457
    val minInHour = 60

    // Получаем минуты отбытия
    val exitTimeToMin = 9 * 60 + 39
    // Складываем минуты отбытия с минутами в пути
    val exitPlusWay = exitTimeToMin + onTheWay

    // Подсчитываем время прибытия
    val arrivalHour = exitPlusWay / minInHour
    val remainingMin = arrivalHour % minInHour

    // Форматируем время прибытия с двумя нулями
    val formattedHours = arrivalHour.toString().padStart(2, '0')
    val formattedMinutes = remainingMin.toString().padStart(2, '0')

    // Выводим результат в консоль
    println("Прибытие поезда в $formattedHours:$formattedMinutes")

}