package org.example

fun main() {
    println("Hello World!")

    val numberOfOrders = 42

    var notificationText = "Не забудте маску и перчатки"

    println(numberOfOrders)
    // println(notificationText)

    notificationText = "Маски больше не потребуются"
    println(notificationText)

    // целочисленные
    val intNum1: Int = -2147483648 // 32 bit
    val intNum2: Int = 2147483647 // 32 bit
    val longNum: Long // 64 bit
    val byteNum: Byte // 8 bit
    val unsignedNum: UInt = 214748648u //32 bit


    // вещественные
    val doubleInt: Double = 234.42 // 64 bit
    val floatNum: Float = 8472F // 32 bit

    // строковые
    val stringValue: String = "Уещ stroka"
    val charValue: Char = '1'

    // логические
    val trueValue: Boolean = true
    val falseValue: Boolean = false

}