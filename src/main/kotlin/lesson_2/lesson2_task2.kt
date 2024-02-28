package lesson_2

fun main () {

    var a_emploees = 50
    var b_students = 30

    var a_salary = 30000
    var b_salary = 20000

    // ЗП постоянных и ЗП стажеров
    var constant_salary = (a_emploees * a_salary)
    var students_salary = (b_students * b_salary)

    // Сумма ЗП постоянных сотрудников и стажеров
    var joint_salary = (constant_salary + students_salary)

    // Средняя ЗП одного сотрудника после устройства стажеров
    var everage_salary = (joint_salary / (a_emploees + b_students))

    println(constant_salary)
    println(joint_salary)
    println(everage_salary)

    // Не обозначал Int, так как все они Int и если навести на переменную то в справке автоматом пишет Int


}