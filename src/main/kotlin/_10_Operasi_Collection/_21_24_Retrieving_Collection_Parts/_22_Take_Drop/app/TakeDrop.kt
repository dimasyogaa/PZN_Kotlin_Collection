package _10_Operasi_Collection._21_24_Retrieving_Collection_Parts._22_Take_Drop.app

import _MyHelper.MyHelper.spaceLine

/**
 * Take & Drop Operators
 * ● Untuk mengambil sebagian element di collection, selain menggunakan slice, kita juga bisa
 * menggunakan operator take dan drop
 *
 * =============================================================================================
 *
 * Take Operators
 *
 * take(n)
 * Mengambil collection diawal sejumlah n
 *
 * takeLast(n)
 * Mengambil collection diakhir sejumlah n
 *
 * takeWhile((T) -> Boolean)
 * Mengambil element dari awal selama kondisi bernilai true, jika false, maka berhenti
 *
 * takeWhileLast((T) -> Boolean)
 * Sama seperti takeWhile, namun dimulai dari element akhir
 *
 * =============================================================================================
 *
 * Drop Operators
 *
 * drop(n)
 * Menghapus collection diawal sejumlah n
 *
 * dropLast(n)
 * Menghapus collection diakhir sejumlah n
 *
 * dropWhile((T) -> Boolean)
 * Menghapus element dari awal selama kondisi bernilai true, jika false, maka berhenti
 *
 * dropWhileLast((T) -> Boolean)
 * Sama seperti dropWhile, namun dimulai dari element akhir
 */

fun main() {

    val chars = ('a'..'z').toList()
    println("chars : $chars")

    // 1. take()
    val take = chars.take(3)
    println("take : $take") // [a, b, c]

    // 2. takeWhile((T) -> Boolean)
    val takeWhile = chars.takeWhile { it < 'f' }
    println("takeWhile : $takeWhile") // [a, b, c, d, e]

    // 3. takeLast()
    val takeLast = chars.takeLast(2)
    println("takeLast : $takeLast") // [y, z]

    // 4. takeLastWhile((T) -> Boolean)
    val takeLastWhile = chars.takeLastWhile { it > 'w' }
    println("takeLast : $takeLastWhile") // [x, y, z]

    spaceLine()

    println("chars : $chars")

    // 1. drop()
    val drop = chars.drop(23)
    println("drop : $drop") // [x, y, z]

    // 2. dropWhile((T) -> Boolean)
    val dropWhile = chars.dropWhile{ it < 'x' }
    println("dropWhile : $dropWhile") // [x, y, z]

    // 3. dropLast()
    val dropLast = chars.dropLast(23)
    println("dropLast : $dropLast") // [a, b, c]

    // 4. dropLastWhile((T) -> Boolean)
    val dropLastWhile = chars.dropLastWhile { it > 'c' }
    println("dropLastWhile : $dropLastWhile") // [a, b, c]

}