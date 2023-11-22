package _10_Operasi_Collection._29_32_Ordering._32_Random_Order.app

/**
 * Ordering : Random
 * ● Di Kotlin, kita juga bisa mengacak isi element di collection
 *
 * Ordering : Random Operator
 *
 * shuffled()
 * Membuat collection baru dengan posisi element random
 */

fun main() {

    val numbers = (1..10).toList()

    println(numbers.shuffled())

    println(numbers.shuffled())

    println(numbers.shuffled())

    println(numbers.shuffled())

}