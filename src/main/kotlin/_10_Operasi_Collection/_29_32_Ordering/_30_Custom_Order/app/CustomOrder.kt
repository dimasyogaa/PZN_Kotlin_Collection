package _10_Operasi_Collection._29_32_Ordering._30_Custom_Order.app

import _MyHelper.MyHelper.spaceLine

/**
 * Ordering : Custom
 * ● Selain menggunakan comparable bawaan kotlin, kita juga bisa membuat comparable sendiri
 * ● Ini cocok untuk mengurutkan data yang kita buat sendiri
 *
 * Ordering : Custom Operator
 *
 * sortedBy(selector: (T) -> R)
 * Mengurutkan collection secara ascending menggunakan selector
 *
 * sortedByDescending(selector: (T) -> R)
 * Mengurutkan collection secara descending menggunakan selector
 *
 * sortedWith(Comparator<T>)
 * Mengurutkan collection dengan Comparator<T>
 *
 * Comparator<T> :
 * - compareBy
 * - CompareByDescending
 * - Comparator
 */

data class Fruit(val name: String, val quantity: Int)

fun main() {

    val fruits = listOf(
        Fruit("Apple", 10),
        Fruit("Orange", 5),
        Fruit("Banana", 7),
        Fruit("Watermelon", 6),
        Fruit("Melon", 6)
    )

    // 1. sortedBy(selector: (T) -> R)
    val sortedByName = fruits.sortedBy { it.name }
    val sortedByQuantity = fruits.sortedBy { it.quantity }
    println("sortedByName : $sortedByName")
    println("sortedByQuantity : $sortedByQuantity")

    println()

    // 2. sortedByDescending(selector: (T) -> R)
    val sortedByDescendingName = fruits.sortedByDescending { it.name }
    val sortedByDescendingQuantity = fruits.sortedByDescending { it.quantity }
    println("sortedByDescendingName : $sortedByDescendingName")
    println("sortedByDescendingQuantity : $sortedByDescendingQuantity")

    spaceLine()

    // 3. sortedWith(selector: (T) -> R) | compareBy( selector: (T) -> Comparable<*>? )
    val sortedWith1 = fruits.sortedWith ( compareBy { it.quantity } )
    println("sortedWith - compareBy : $sortedWith1")

    // 4. sortedWith(selector: (T) -> R) | compareByDescending( selector: (T) -> Comparable<*>? )
    val sortedWith2 = fruits.sortedWith ( compareByDescending { it.quantity } )
    println("sortedWith - compareByDescending  : $sortedWith2")

    spaceLine()

    // 5. sortedWith(selector: (T) -> R) | compareByDescending( selector: (T) -> Comparable<*>? )
    val sortedWithComparator = fruits.sortedWith(
        Comparator { a, b ->
            // Mengurutkan berdasarkan quantity terlebih dahulu
            val result = a.quantity.compareTo(b.quantity)

            // Jika quantity sama, maka urutkan berdasarkan name
            if (result == 0) {
                a.name.compareTo(b.name)
            } else {
                result
            }
        }
    )
    println("Sorted with Comparator: $sortedWithComparator")

}

