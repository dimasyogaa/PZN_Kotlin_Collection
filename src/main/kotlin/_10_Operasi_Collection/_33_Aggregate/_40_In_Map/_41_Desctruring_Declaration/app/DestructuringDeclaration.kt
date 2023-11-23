package _10_Operasi_Collection._33_Aggregate._40_In_Map._41_Desctruring_Declaration.app

import _MyHelper.MyHelper.spaceLine

/**
 * Destructuring Declarations di Map
 * ● Sebelumnya kita telah belajar destructuring declaration
 * ● Map menyimpan datanya dalam Entry<K,V>,
 * dimana Entry memiliki function component1() untuk mendapatkan Key, dan
 * component2() untuk mendapatkan Value
 * ● Hal ini jadi memungkinkan kita melakukan desctructuring di Entry Map
 */

fun main() {

    val namesMap = mapOf(
        "a" to "Yoga",
        "b" to "Dimas",
        "c" to "Pambudi"
    )

    for ((key, value) in namesMap) {
        println("$key : $value")
    }

    spaceLine()

    namesMap.forEach{ (key, value) -> println("$key : $value") }

    spaceLine()

    namesMap.forEach{ entry -> println("${entry.component1()} : ${entry.component2()}") }

}