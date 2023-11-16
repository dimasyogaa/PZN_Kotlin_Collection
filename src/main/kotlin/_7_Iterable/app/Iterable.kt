package _7_Iterable.app

import _MyHelper.MyHelper.spaceLine

/**
 * Iterable
 * ● Iterable adalah superclass dari Collection interface
 * ● Iterable adalah general operation untuk melakukan iterasi seluruh data di collection, atau
 * menghapus data di collection
 */

fun main() {

    // iterable() // immutable

    iniMutableIterable() // mutable

}


private fun iterable() {

    fun <T> displayIterable(iterable: Iterable<T>) {

        // kode singkat ini
        // for (value in iterable) {
        //     println(value)
        // }

        // detail nya seperti ini
        val iniIterator = iterable.iterator()
        while (iniIterator.hasNext()) {
            val value = iniIterator.next()
            println(value)
        }

    }

    displayIterable(listOf("Yoga", "Dimas"))
    displayIterable(mutableListOf("Yoga", "Dimas"))
    spaceLine()

    displayIterable(setOf("Yoga", "Dimas"))
    displayIterable(mutableSetOf("Yoga", "Dimas"))
    spaceLine()

    displayIterable(mapOf("y" to "Yoga").entries) // Tidak Error, karena entries me-return value Set, yang mana Set merupakan turunan Iterable
    displayIterable(mutableMapOf("y" to "Yoga").entries)


    // displayIterable(mapOf("y" to "Yoga")) // Error, Map bukan turunan Iterable
}


private fun iniMutableIterable() {
    fun <T> displayMutableIterable(iterable: MutableIterable<T>) {

        val iniIterator = iterable.iterator()
        while (iniIterator.hasNext()) {
            // iniIterator.remove() // menghapus data yang saat ini di-iterasi
            println(iniIterator.next())
        }

    }

    // displayMutableIterable(listOf("Yoga", "Dimas")) // error, List bukan turunan dari mutable iterator
    displayMutableIterable(mutableListOf("Yoga", "Dimas"))
    spaceLine()

    // displayMutableIterable(setOf("Yoga", "Dimas")) // error, Set bukan turunan dari mutable iterator
    displayMutableIterable(mutableSetOf("Yoga", "Dimas"))
    spaceLine()

    // displayMutableIterable(mapOf("y" to "Yoga").entries) // error, Map.entries bukan turunan dari mutable iterator
    displayMutableIterable(mutableMapOf("y" to "Yoga").entries)
}
