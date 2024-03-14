package lesson3

fun main() {

    var from = "E2"
    var to = "E4"
    var numberOfStroke = 1

    val string1 = ("$from - $to; $numberOfStroke")
    println(string1)

    from = "D2"
    to = "D3"
    numberOfStroke = 2

    val string2 = ("$from - $to; $numberOfStroke")

    println(string2)

}