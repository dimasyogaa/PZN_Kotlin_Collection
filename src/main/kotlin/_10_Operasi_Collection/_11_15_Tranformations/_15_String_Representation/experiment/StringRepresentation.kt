package _10_Operasi_Collection._11_15_Tranformations._15_String_Representation.experiment

import _MyHelper.MyHelper.spaceLine

fun main() {

    val numbers = listOf(1, 2, 3, 4, 5)

    // Mengubah list menjadi string dengan pemisah, awalan, dan akhiran tertentu
    val result1 = numbers.joinToString(separator = " - ", prefix = "[", postfix = "]")
    println("joinToString: $result1")

    spaceLine()

    // Mengubah list menjadi string dengan pemisah, awalan, dan akhiran tertentu
    // Mengalikan setiap elemen dengan 2 sebelum mengonversi menjadi string
    val result2 = numbers.joinToString(separator = " - ", prefix = "[", postfix = "]", transform = { (it * 2).toString() })
    println("joinToString with transformation: $result2")

    spaceLine()

    // Mengubah list menjadi string dengan pemisah, awalan, dan akhiran tertentu
    // Menambahkan hasil ke StringBuilder
    val builder = StringBuilder("Result: ")
    numbers.joinTo(builder, separator = " | ", prefix = "[", postfix = "]")
    println("joinTo using StringBuilder: $builder")


}