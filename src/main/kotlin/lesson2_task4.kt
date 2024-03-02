fun main() {
    // Исходные данные
    val aKristal = 7
    val bIron = 11
    val baff = 20.0
    // Преобразую Баф в дробь для расчетов
    val baffFraction: Double = baff / 100 + 1
    // Произвожу расчеты, преобразование
    val aBaff: Double = aKristal * baffFraction - aKristal
    val bBaff: Double = bIron * baffFraction - bIron
    val aIntegerPart = aBaff.toInt()
    val bIntegerPart = bBaff.toInt()
    // Вывожу
    println("Бафф ко кристалической руде $aIntegerPart")
    println("Бафф к железной руде $bIntegerPart")

}