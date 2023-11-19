package _10_Operasi_Collection._11_15_Tranformations._11_Mapping.experiment

import _MyHelper.MyHelper.spaceLine

fun main() {

    val map = mapOf(1 to "Satu", 2 to "Dua", 3 to "Tiga")

    // Mengubah kunci menjadi string dan nilai menjadi panjang string
    val newMapKeys = map.mapKeys { entry -> entry.key.toString() }
    val newMapValues = map.mapValues { entry -> entry.value.length }

    println("Map baru dengan kunci yang telah diubah: $newMapKeys")

    spaceLine()

    println("Map baru dengan nilai-nilai yang telah diubah: $newMapValues")


}