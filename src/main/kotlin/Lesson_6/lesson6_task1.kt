package Lesson_6

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
        }

        // Блок программы для авторизации пользователя
        println("Авторизация")
        var inputLogin: String? = null
        var inputPassword: String? = null

        while (inputLogin != login || inputPassword != password) {
            print("Введите логин: ")
            inputLogin = readLine()?.trim()
            print("Введите пароль: ")
            inputPassword = readLine()?.trim()

            if (inputLogin != login || inputPassword != password) {
                println("Логин или пароль неверны. Попробуйте еще раз.")
            }
        }

        // Вывод сообщения об успешной авторизации
        println("Авторизация прошла успешно")
    }

// Вызываем функцию для регистрации и авторизации пользователя
    registerAndLogin()

}


/*
На этапе авторизации в приложении пользователь, не имея аккаунта, выбрал регистрацию. Нужно создать блок программы,
который сначала предлагает создать логин и пароль, затем запрашивает их, чтобы войти в приложение.

Если логин или пароль введены неверно – данные запрашиваются заново. Если данные верны, выводится сообщение –
“Авторизация прошла успешно”.
 */