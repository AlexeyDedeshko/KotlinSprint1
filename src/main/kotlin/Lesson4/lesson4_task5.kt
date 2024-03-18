package Lesson4

fun main() {

    // условия долгосрочного плавания
    val cond1 = "корабль не имеет повреждений"
    val cond21Crew = 55 //"число экипажа составляет от 55 до 70 человек (включительно)"
    val cond22Crew = 70 //"число экипажа составляет от 55 до 70 человек (включительно)"
    val cond3 = 50
    val cond41Blag = "погода благоприятная"
    val cond41NeBlag = "погода неблагоприятная"

    // текущие условия
    val damageOfHousing = "корабль не имеет повреждений"
    val currentCrew = 60
    val provisionOnBoard = 51
    val weatherCond = "погода благоприятная"

    // альтернативные условия (может так же отплыть есил соблюдаются следующие условия)

    val condAlternative1 = "корабль имеет незначительные повреждения"
    val condAlternative2 = 70
    val condAlternative3 = "погода благоприятная"
    val condAlternative4 = 50

    // альтернативные условия
    val damageOfHousingAlt = "корабль имеет незначительные повреждения"
    val currentCrewAlt = 70
    val provisionOnBoardAlt = 51
    val weatherCondAlt = "погода благоприятная"

    // строка расчета стандартных условий
    val counting: Boolean = (cond1 == damageOfHousing) && (currentCrew in cond21Crew .. cond22Crew)
            && (provisionOnBoard > cond3) && (weatherCond == cond41Blag) || (weatherCond == cond41NeBlag)

    // строка расчета альтернативных условий
    val countingAlt = (condAlternative1 == damageOfHousingAlt) && (currentCrewAlt == condAlternative2)
            && (provisionOnBoardAlt > condAlternative4) && (weatherCondAlt == condAlternative3)

    println("Ставндартные условия: $counting")
    println("Альтернативные условия: $countingAlt")

}

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