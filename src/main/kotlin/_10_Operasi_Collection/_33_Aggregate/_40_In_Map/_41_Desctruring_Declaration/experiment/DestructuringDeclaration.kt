package _10_Operasi_Collection._33_Aggregate._40_In_Map._41_Desctruring_Declaration.experiment

import _MyHelper.MyHelper.spaceLine

fun main() {
    val map = mapOf("a" to 1, "b" to 2, "c" to 3)

    for ((key, value) in map) {
        println("Key: $key, Value: $value")
    }

    spaceLine()

    val (key, value) = map.entries.first()
    println("Key: $key, Value: $value")
}