package _10_Operasi_Collection._11_15_Tranformations._15_String_Representation.app

import _MyHelper.MyHelper.spaceLine

/**
 * Transformations : String Representation
 * ● String Representations adalah operasi transformasi untuk mengubah collection menjadi string
 *
 * String Representation Operation
 *
 * joinToString(separator, prefix, suffix)
 * Mengubah collection menjadi string dengan separator, prefix dan suffix
 *
 * joinToString(separator, prefix, suffix, transform)
 * Mengubah collection menjadi string dengan separator, prefix dan suffix, namun akan diubah dalam transform terlebih dahulu
 *
 * joinTo(Appendable, separator, prefix, suffix,
 * transform)
 * Sama seperti joinToString, namun string ditambahkan ke Appendable
 */

fun main() {

    val names = listOf("Yoga", "Dimas", "Pambudi")

    println(names.joinToString(" ", "|", "~"))
    println(names.joinToString(" ", "|", "~"){ string -> "Item $string"})
    println(names.joinToString(" ", "|", "~"){it.uppercase()})

    spaceLine()

    val appendable = StringBuilder()
    names.joinTo(appendable, ",", "|", "~") {it.lowercase()}
    println(appendable.toString())

    spaceLine()

    val builder = StringBuilder()
    names.joinTo(builder, " ", "|", "~")
    names.joinTo(builder, " ", ">", "<")
    names.joinTo(builder, " ", "@", "@")
    val string3 =  builder.toString()
    println(string3)

    spaceLine()

    val numbers = (1..10).toList()
    println(numbers.joinToString())

}