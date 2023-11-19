package _10_Operasi_Collection._11_15_Tranformations._12_Zipping.app

import _MyHelper.MyHelper.spaceLine


/**
 * Transformations : Unzip Operations
 *
 * unzip() Mengubah collection Pair<T1, T2> menjadi dua collection, collection T1 dan collection T2
 */

fun main() {

    val list: List<Pair<String, String>> = listOf(
        "Yoga" to "Programmer",
        "Kurniawan" to "Zaman",
        "Khannedy" to "Now"
    )

    val pair: Pair<List<String>, List<String>> = list.unzip()

    println(pair)
    println(pair.first)
    println(pair.second)

    spaceLine()

    val (list1, list2) = list.unzip()
    println(list1)
    println(list2)


}