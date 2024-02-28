fun main () {

    // Исходные данные
    var exitHourToMin = 9 * 60 + 39 // 9 часов и 39 минут
    var onTheWay = 457

    // Складываем минуты отбытия с минутами в пути
    val exitPlusWay = exitHourToMin + onTheWay

    // Подсчитываем время прибытия
    val arrivalHour = exitPlusWay / 60
    val remainingMin = arrivalHour % 60


    // Форматируем время прибытия с двумя нулями
    val formattedHours = arrivalHour.toString().padStart(2, '0')
    val formattedMinutes = remainingMin.toString().padStart(2, '0')

    // Выводим результат в консоль
    println("Прибытие поезда в $formattedHours:$formattedMinutes")





}