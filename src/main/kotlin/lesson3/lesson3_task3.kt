package lesson3

fun main() {

    val digit = 9
    val multiplier1 = 1
    val multiplier2 = 2
    val multiplier3 = 3
    val multiplier4 = 4
    val multiplier5 = 5
    val multiplier6 = 6
    val multiplier7 = 7
    val multiplier8 = 8
    val multiplier9 = 9
    val multiString = """
        $digit * $multiplier1 = ${digit * multiplier1}
        $digit * $multiplier2 = ${digit * multiplier2}
        $digit * $multiplier3 = ${digit * multiplier3}
        $digit * $multiplier4 = ${digit * multiplier4}
        $digit * $multiplier5 = ${digit * multiplier5}
        $digit * $multiplier6 = ${digit * multiplier6}
        $digit * $multiplier7 = ${digit * multiplier7}
        $digit * $multiplier8 = ${digit * multiplier8}
        $digit * $multiplier9 = ${digit * multiplier9}
    """.trimMargin()

    println(multiString)
}