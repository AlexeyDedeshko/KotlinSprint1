package Lesson_7
import kotlin.random.Random

fun main() {
    fun generateCode(length: Int = 4): String {
        var code = ""
        for (i in 1..length) {
            val digit = Random.nextInt(0, 10) // Генерируем одну цифру от 0 до 9
            code += digit.toString() // Добавляем цифру к коду
        }
        return code
    }

    var code = generateCode()
    println("Ваш код авторизации: $code")
    do {
        println("Введите код авторизации: ")
        val userInput = readLine()!!
        if (userInput == code) {
            println("Авторизация успешна!")
            break
        } else {
            println("Неверный код. Попробуйте снова.")
            code = generateCode() // Генерируем новый код
            println("Ваш новый код авторизации: $code")
        }
    } while (true)
}
