package _10_Operasi_Collection._33_Aggregate._36_38_Specific_Operations._36_List.app

import _MyHelper.MyHelper.spaceLine

/**
 * List Specific Operation
 * ● Di kotlin ada banyak operasi yang khusus dibuat untuk List
 *
 * List Specific Operator
 *
 * getOrElse(index, (index) -> T)
 * Mengambil element di index, jika tidak ada, mengembalikan nilai lambda
 *
 * getOrNull(index)
 * Mengambil element di index, jika tidak ada, mengembalikan null
 *
 * subList(from, to)
 * Mengambil semua element dari from (inclusive) ke to (exclusive)
 * exclucive => index - 1
 *
 * binarySearch(value) - datanya harus urut terlebih dahulu
 * Melakukan pencarian menggunakan algoritma binary search
 */

fun main() {

    val list = listOf("Yoga", "Dimas", "Pambudi")
    println("list : $list")

    spaceLine()

    // 1. getOrNull(1)
    val getOrNull = list.getOrNull(1)
    val getOrNull2 = list.getOrNull(4)
    println("getOrNull : $getOrNull")
    println("getOrNull2 : $getOrNull2")

    println()

    // 2. getOrElse(1)
    val getOrElse = list.getOrElse(5) { i -> "Ups, index $i tidak ditemukan"} //Ups, index 5 tidak ditemukan
    val getOrElse2 = list.getOrElse(0) { i -> "Ups, index $i tidak ditemukan"} //Ups, index 5 tidak ditemukan
    println("getOrElse : $getOrElse")
    println("getOrElse2 : $getOrElse2")

    println()

    // 3. subList()
    val subList = list.subList(0, 2)
    println("subList : $subList") // [Yoga, Dimas]

    println()


    // 4. binarySearch()
    val sorted = list.sorted()
    println("sorted : $sorted")
    val binarySearch = sorted.binarySearch("Yoga")
    println("binarySearch : $binarySearch")  // 2


}