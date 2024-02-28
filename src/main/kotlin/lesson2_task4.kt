fun main () {

    var a = 7
    var b = 11

    var baff = 1.2

    var aBaff: Double = a * baff - a
    var bBaff: Double = b * baff - b

    val aIntegerPart = aBaff.toInt()
    val bIntegerPart = bBaff.toInt()


    println("Бафф ко кристалической руде $aIntegerPart")
    println ("Бафф к железной руде $bIntegerPart")







}