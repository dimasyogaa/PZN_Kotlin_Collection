package _4_Pair

import _MyHelper.MyHelper.spaceLine

/**
 * Pair
 * ● Sebelum kita bahas collection Map, ada baiknya kita mengenal Pair
 * ● Pair adalah representasi dari data yang berpasangan
 * ● Di Map, Pair digunakan sebagai data Map ketika pertama kali Map dibuat
 *
 * ketika membuat data map, kita memasukan data ke dalam map dalam bentuk pair
 * tapi ketika nanti udah jadi di map nya, datanya menjadi entry
 *
 */


fun main() {
    val pair = Pair("Yoga", "Dimas")
    println(pair.first)
    println(pair.second)

    spaceLine()

    val pair2: Pair<String, String> = "Pambudi" to "Pratama" // auto convert menjadi pair
    println(pair2.first)
    println(pair2.second)
}