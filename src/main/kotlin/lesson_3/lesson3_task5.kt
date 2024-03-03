package lesson_3


fun main() {

    val string = "D2;D4;0"
    val parts = string.split(";").filterNot { it.isEmpty() }
    val part1 = parts[0]
    val part2 = parts[1]
    val part3 = parts[2]

    println("from: $part1")
    println("to: $part2")
    println("stroke number: $part3")
}

