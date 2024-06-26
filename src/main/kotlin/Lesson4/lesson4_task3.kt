package Lesson4

fun main() {

    // Текущие условия
    val isWeatherSunny: Boolean = true
    val isTentOpen: Boolean = true
    val humidityToday = 20
    val currentSeasonWinter: String = "winter"

    println(currentSeasonWinter != SEASON_WINTER && isTentOpen == IS_AWNING_OPEN && humidityToday == HUMIDITY
            && isWeatherSunny == IS_SUNNY)

}
    // Критерии благоприятных условий
    const val IS_SUNNY = true // "sunny"
    const val IS_AWNING_OPEN = true // "open"
    const val HUMIDITY: Int = 20
    const val SEASON_WINTER: String = "winter"
/*
На территории агрокомплекса функционирует система автоматического мониторинга условий для роста растений. Напиши программу,
которая будет определять, подходят ли текущие условия для успешного роста бобовых культур.

Критерии благоприятных условий включают:

- наличие солнечной погоды;
- открытый тент;
- влажность воздуха составляет 20%;
- текущее время года - не зима.

Программа должна выводить результат анализа условий в формате: “Благоприятные ли условия сейчас для роста бобовых? true/false”

Для проверки работы программы, инициализируй переменные следующими значениями:

- погода сегодня - солнечная;
- тент на данный момент - открыт;
- влажность воздуха - 20%;
- текущее время года - зима.

И типами данных - boolean, boolean, int, String.

 */