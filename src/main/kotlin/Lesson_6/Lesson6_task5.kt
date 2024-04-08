package Lesson_6

import java.lang.Math.random

class Lesson6_task5 {}

fun main() {

    // Создаем функцию для регистрации и авторизации пользователя
    fun registerAndLogin() {
        var login: String? = null
        var password: String? = null

        // Блок программы для создания логина и пароля
        println("Создайте логин и пароль")
        while (login == null || login.isEmpty()) {
            print("Введите логин: ")
            login = readLine()?.trim()
            if (login.isNullOrEmpty()) {
                println("Логин не может быть пустым")
            }
        }

        while (password == null || password.isEmpty()) {
            print("Введите пароль: ")
            password = readLine()?.trim()
            if (password.isNullOrEmpty()) {
                println("Пароль не может быть пустым")
            }
        } // закрыл функцию?

        // Блок программы для авторизации пользователя
        println("Авторизация")
        var inputLogin: String? = null
        var inputPassword: String? = null
    }
    // пользователь доказывает, что он не бот
    println("Докажите что вы не бот")
    var attempts = 3
    var isUserNotABot = false

    while (attempts > 0 && !isUserNotABot) {
        val randomNumber1 = (0..10).random()
        val randomNumber2 = (0..10).random()
        var correctAnswer = randomNumber1 + randomNumber2

        println("Сколько будет $randomNumber1 + $randomNumber2?")
        val userAnswer = readLine()?.trim()!!.toInt()

        if (userAnswer == correctAnswer) {
            println("Добро пожаловать!")
            isUserNotABot = true
        } else {
            attempts--
            println("У вас осталось $attempts попыток")

        }
    }
    if (!isUserNotABot) {
        println("Доступ запрещен.")
        return

    }
}

/*

Доработка задачи на авторизацию. Нужно написать часть модуля для авторизации пользователя. Для входа в приложение
пользователь должен доказать, что он не бот. Для этого программа предлагает решить простой математический пример –
сложить два числа. Имитируй эти действия в консоли, путем считывания данных с клавиатуры.

При успешном решении вход в программу символизируется сообщением “Добро пожаловать!". Дай пользователю три попытки
пройти тест. Для этого придется каждый раз генерировать новый математический пример и предлагать решить его заново.

Для простоты ограничься примерами на сложение с использованием цифр от 1 до 9. Если три попытки оказались неудачными,
вывести сообщение "Доступ запрещен".
*/