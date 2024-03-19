package Lesson4

fun main() {

    // Текущие условия
    val isWeatherSunny: Boolean = true
    val tentToday: Boolean = "open" == IS_AWNING_OPEN
    val humidityToday = 20
    val currentSeason: String = "зима"

    println(currentSeason == SEASON && tentToday && humidityToday == HUMIDITY
            && isWeatherSunny == true)

}
    // Критерии благоприятных условий
    const val IS_SUNNY = "sunny"
    const val IS_AWNING_OPEN = "open"
    const val HUMIDITY: Int = 20
    const val SEASON: String = "не зима"
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