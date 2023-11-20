package _10_Operasi_Collection._19_Plus_Minus_Operators.experiment

import _MyHelper.MyHelper.spaceLine

fun main() {
    val numbers = listOf(1, 2, 3)
    val newNumbers = numbers + 4 // Menambah elemen ke koleksi numbers
    val moreNumbers = numbers + listOf(4, 5, 6) // Menambah koleksi baru ke koleksi numbers
    val lessNumbers = numbers - 3 // Menghapus elemen dari koleksi numbers
    val fewerNumbers = numbers - listOf(2, 3) // Menghapus koleksi baru dari koleksi numbers

    println("Original: $numbers")
    println("After plus 4: $newNumbers")
    println("After plus a collection: $moreNumbers")
    println("After minus 3: $lessNumbers")
    println("After minus a collection: $fewerNumbers")

    spaceLine()


    val map = mapOf("a" to 1, "b" to 2)
    val newMap = map + ("c" to 3) // Menambah pasangan kunci-nilai ke dalam map
    val moreMap = map + mapOf("c" to 3, "d" to 4) // Menambah map baru ke dalam map yang ada

    println("Original Map: $map")
    println("After plus a key-value pair: $newMap")
    println("After plus a map: $moreMap")


    val map2 = mapOf("a" to 1, "b" to 2)
    val newMap2 = map - "b" // Menghapus elemen dengan kunci "b"

    println("Original Map: $map2")
    println("After minus a key: $newMap2")


}

