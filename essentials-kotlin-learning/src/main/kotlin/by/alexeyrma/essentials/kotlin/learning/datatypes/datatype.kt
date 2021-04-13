package by.alexeyrma.essentials.kotlin.learning.datatypes

fun main(){
    var count: Int = 0
    val number: Int = 42
    val otherNumber = 43
    val long: Long = 3000000L
    val byte: Byte = 42
    val short: Short = 42
    val double: Double = 4.2
    val float: Float = 412.2F

    val binary = 0b1001
    val hex = 0xAFAC

    print("""
        integer count is $count is actual ${count is Int}
        integer number is $number is actual ${count is Int}
        integer otherNumber is $otherNumber is actual ${count is Int}
        long long is $long is actual ${long is Long}
        byte vyte is $byte is actual ${byte is Byte}
        short short is $short is actual ${short is Short}
        double double is $double is actual ${double is Double}
        float float is $float is actual ${float is Float}
        binary number is $binary
        hex number is $hex
    """.trimIndent())
}