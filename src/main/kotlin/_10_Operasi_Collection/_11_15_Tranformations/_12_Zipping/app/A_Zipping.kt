package _10_Operasi_Collection._11_15_Tranformations._12_Zipping.app

import _MyHelper.MyHelper.spaceLine

/**
 * Transformations : Zipping
 * ● Zipping adalah transformasi yang digunakan untuk menggabungkan dua buah collection.
 *
 * Transformations : Zipping Operations
 *
 * zip(collection)
 * Menggabungkan dua collection, sehingga menghasilkan Pair<T1, T2>
 *
 *
 * zip(collection, transform: (T1, T2) -> R)
 * Menggabungkan dua collection dengan lambda transform sehingga menghasilkan collection baru dari result lambda transform
 */

fun main() {

    val list1 = listOf("Yoga", "Dimas", "Pambudi")
    val list2 = listOf("Progammer", "Zaman", "Now")
    val list21 = listOf("Progammer", "Zaman",)

    val list3: List<Pair<String, String>> = list1.zip(list2)
    println(list3) // [(Yoga, Progammer), (Dimas, Zaman), (Pambudi, Now)]

    println()

    val list31: List<Pair<String, String>> = list1.zip(list21)
    println(list31) // [(Yoga, Progammer), (Dimas, Zaman)]

    spaceLine()

    val list4 = list1.zip(list2) {value1, value2 ->
        "$value1 $value2"
    }
    println(list4) // [Yoga Progammer, Dimas Zaman, Pambudi Now]


}