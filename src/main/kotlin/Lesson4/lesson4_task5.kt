package Lesson4

import java.util.Scanner
fun main() {

    // текущие условия
    println("Корабль имеет повреждения? (да/нет)")
    val isDamageOfHousing = readLine() ?: false
    println("Текущее число экипажа:")
    val currentCrew = readLine()?.toIntOrNull() ?: 0
    println("Количество ящиков с провизией на борту:")
    val provisionOnBoard = readLine()?.toIntOrNull() ?: 0
    println("Погода благоприятная? (да/нет)")
    val isWeatherCond = readLine() ?: true

    // альтернативные условия (может так же отплыть есил соблюдаются следующие условия)

    val isDamageCondAlternative1 = false
    val condAlternative2 = 70
    val isWeatherCondAlternative3 = true
    val condAlternative4 = 50

    // альтернативные условия
    val isDamageOfHousingAlt = false
    val currentCrewAlt = 70
    val provisionOnBoardAlt = 51
    val isWeatherCondAlt = true

    // строка расчета стандартных условий
    val counting: Boolean = (IS_DAMAGE == isDamageOfHousing) && (currentCrew in CREW_MINIMUM .. CREW_MAXIMUM)
            && (provisionOnBoard > PROVISION) && (isWeatherCond == GOOD_WEATHER) || (isWeatherCond == BAD_WEATHER)

    // строка расчета альтернативных условий
    val countingAlt = (isDamageCondAlternative1 == isDamageOfHousingAlt) && (currentCrewAlt == condAlternative2)
            && (provisionOnBoardAlt > condAlternative4) && (isWeatherCondAlt == isWeatherCondAlternative3)

    println("Корабль может выходить в плавание: $counting")
    println("Корабль может выходить в плавание: $countingAlt")

}

// условия долгосрочного плавания - константы
const val IS_DAMAGE = false
const val CREW_MINIMUM = 55 //"число экипажа составляет от 55 до 70 человек (включительно)"
const val CREW_MAXIMUM = 70 //"число экипажа составляет от 55 до 70 человек (включительно)"
const val PROVISION = 50
const val GOOD_WEATHER = true
const val BAD_WEATHER = false

/*
Научно-исследовательский корабль может приступить к долгосрочному плаванию при выполнении следующих
условий:

- корабль не имеет повреждений;
- число экипажа составляет от 55 до 70 человек (включительно);
- на борту есть более 50 ящиков провизии;
- погода благоприятная или неблагоприятная.

Альтернативно, корабль может отплыть даже при наличии незначительных повреждений, при условии что:

- на борту рекомендованный состав экипажа - 70 человек;
- погода благоприятна;
- на борту есть 50 и более ящиков провизии.

В качестве входных данных используй информацию, введенную через консоль:

- наличие повреждений корпуса (Boolean переменная);
- текущий состав экипажа;
- количество ящиков с провизией на борту;
- благоприятность метеоусловий (Boolean переменная).

Напиши программу, которая будет определять, может ли корабль отправиться в плавание. Программа должна
анализировать эти данные и выводить результат в консоль. Для анализа должно использоваться единое
составное условие, состоящее только из логических операторов.
 */