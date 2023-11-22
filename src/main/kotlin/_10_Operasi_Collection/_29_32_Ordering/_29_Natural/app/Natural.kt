package _10_Operasi_Collection._29_32_Ordering._29_Natural.app

/**
 * Ordering : Natural
 * ● Mengurutkan data sudah menjadi salah satu kebiasaan yang kita lakukan saat membuat program
 * ● Kotlin mendukung operasi untuk mengurutkan collection
 * ● Pada materi Kotlin Generic kita sudah belajar tentang interface Comparable, yaitu interface yang
 * digunakan untuk melakukan perbandingan dua buat object, yang biasanya digunakan untuk
 * mengurutkan data
 * ● Secara default tipe data yang ada di kotlin sudah memiliki Comparable (seperti Number, Char atau
 * String). Oleh karena itu kita tidak perlu lagi membuat Comparable sendiri untuk mengurutkan data
 * tersebut
 *
 *
 * Ordering : Natural Operator
 *
 * sorted()
 * Mengurutkan collection secara ascending
 *
 * sortedDescending()
 * Mengurutkan collection secara descending
 */

fun main() {

    val numbers = listOf(1, 4, 2, 4, 6, 3, 5)
    println(numbers.sorted()) // [1, 2, 3, 4, 4, 5, 6]
    println(numbers.sortedDescending()) // [6, 5, 4, 4, 3, 2, 1]


}