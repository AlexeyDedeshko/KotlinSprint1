package lesson_2

fun main () {

    val aEmploees = 50
    val bStudents = 30

    val aSalary = 30000
    val bSalary = 20000

    // ЗП постоянных и ЗП стажеров
    val constantSalary = (aEmploees * aSalary)
    val studentsSalary = (bStudents * bSalary)

    // Сумма ЗП постоянных сотрудников и стажеров
    val jointSalary = (constantSalary + studentsSalary)

    // Средняя ЗП одного сотрудника после устройства стажеров
    val everageSalary = (jointSalary / (aEmploees + bStudents))

    println(constantSalary)
    println(jointSalary)
    println(everageSalary)

    // Не обозначал Int, так как все они Int и если навести на переменную то в справке автоматом пишет Int


}