package _10_Operasi_Collection._19_Plus_Minus_Operators.app

import _MyHelper.MyHelper.spaceLine

/**
 * Plus & Minus Operators
 * ● Di kotlin, ada operator extension function plus dan minus untuk collection
 * ● Parameter pertama adalah collection, dan parameter selanjutnya bisa collection atau element, dan
 * akan menghasilkan collection baru
 *
 * Plus & Minus Operators
 *
 * plus(element)
 * Membuat collection baru dengan menambahkan element
 *
 * plus(collection)
 * Membuat collection baru dengan menambahkan collection
 *
 * minus(element)
 * Membuat collection baru dengan menghapus element
 *
 * minus(collection)
 * Membuat collection baru dengan menghapus collection
 */

fun main() {

    // COLLECTION
    val names = listOf("Yoga", "Dimas", "Pambudi")


    // tambah element
    val list2 = names + "Programmer Cuy"
    println("list2 : $list2")

    // tambah collection
    val list3 = names + listOf("Programmer", "Zaman", "Now")
    println("list3 : $list3")

    // kurangi elemen
    val list4 = names - "Yoga"
    println("list4 : $list4")

    // kurangi collection
    val list5 = names - listOf("Dimas", "Pambudi")
    println("list5 : $list5")

    println("names : $names")

    spaceLine()

    // MAP
    val map1 = mapOf("a" to "Yoga", "b" to "Dimas")

    // tipe data Pair harus digunakan untuk operasi pertambahan
    val map2 = map1 + ("c" to "Khannedy")
    println("map2 : $map2")

    // Key harus digunakan untuk operasi pengurangan
    val map3 = map1 - "a"
    println("map3 : $map3")



}