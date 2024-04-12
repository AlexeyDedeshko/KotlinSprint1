package Lesson_7
import kotlin.random.Random

fun main () {
    fun generatePassword(length: Int = 6): String {
        val letters = "abcdefghijklmnopqrstuvwxyz"
        val digits = "0123456789"
        var password = ""

        for (i in 1..length) {
            password += if (i % 2 == 0) {
                letters[Random.nextInt(letters.length)]
            } else {
                digits[Random.nextInt(digits.length)]
            }
        }

        return password
        println("Сгенерированный пароль: $password")
        println("Введите пароль для авторизации: ")
        val userPassword = readLine()

    }
}
/*
Создай программу, которая генерирует шестизначные пароли. Пусть пароль будет состоять из чередующихся цифр и строчных
букв латинского алфавита (без специальных символов). Например, k5p6m2. Выведи сгенерированный пароль в консоль.
 */