package _10_Operasi_Collection._29_32_Ordering._31_Reverse_Order.app

import _MyHelper.MyHelper.spaceLine

/**
 * Ordering : Reverse
 * ● Di Kotlin, kita bisa mendapatkan collection dengan urutan data terbalik dari data aslinya
 *
 * Ordering : Reverse Operator
 *
 * reversed()
 * Membuat collection baru dengan urutan terbalik dari collection aslinya
 *
 * asReversed()
 * Membuat view terhadap collection dengan urutan terbalik,
 * jika collection aslinya berubah, view pun akan ikut berubah
 */

fun main() {

    val list1 = mutableListOf("Yoga", "Dimas", "Pambudi")

    // 1. reversed()
    val listReserve = list1.reversed()

    // 2. asReversed()
    val listAsReserve = list1.asReversed()

    // hasil
    println("Reserved() : $listReserve")
    println("AsReserved() : $listAsReserve")

    spaceLine()

    // Manipulasi
    list1.add("Programmer")

    // Hasil setelah dimanipulasi
    println("Reserved() : $listReserve")
    println("AsReserved() : $listAsReserve")



}