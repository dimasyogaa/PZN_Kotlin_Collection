package _10_Operasi_Collection._11_15_Tranformations._11_Mapping.app

import _MyHelper.MyHelper.spaceLine


/**
 * Mapping Operations untuk Map
 *
 * mapKeys(transform: (Entry<K,V>) -> R)
 * Mengubah map menjadi map baru dengan nilai key baru sesuai dengan lambda transform
 *
 * mapValues(transform: (Entry<K,V>) -> R)
 * Mengubah map menjadi map baru dengan nilai value baru sesuai dengan lambda transform
 */

fun main() {

    val map: Map<Int, String> = mapOf(
        1 to "Yoga",
        2 to "Dimas",
        3 to "Pambudi"
    )

    val mapKeys = map.mapKeys { it.key * 10}
    println(mapKeys)

    spaceLine()

    val mapValues = map.mapValues { it.value.uppercase() }
    println(mapValues)

    spaceLine()

}