package _8_Iterator.app

import _MyHelper.MyHelper.spaceLine

/**
 * Iterator
 * ● Sebelumnya kita sudah bahas tentang Iterator di Iterable dan MutableIterator di MutableIterable
 * ● Iterator juga memiliki child interface, yaitu ListIterator dan MutableListIterator
 * ● ListIterator digunakan oleh List, dan MutableListIterator digunakan oleh MutableList
 * ● Set tetap menggunakan Iterator
 * ● Sedangkan Map tidak mendukung Iterator
 *
 * perbedaan Iterator dengan ListIterator
 * jika Iterator hanya bisa iterasi maju, sedangkan ListIterator bisa iterasi mundur juga
 */


fun main() {

    // ListIterator
    // iterator() // immutable

    // MutableListIterator
    iniMutableIterator() // mutable

}

private fun iterator() {

    fun <T> displayListIterator(listIterator: ListIterator<T>) {
        println("Display Next")
        while (listIterator.hasNext()) println(listIterator.next())
        spaceLine()
        println("Display Previous")
        while (listIterator.hasPrevious()) println(listIterator.previous())
    }

    displayListIterator(listOf("Yoga", "Dimas", "Pambudi").listIterator())

}

private fun iniMutableIterator() {

    fun removeOddNumber(mutableListIterator: MutableListIterator<Int>) {
        while (mutableListIterator.hasNext()) {
            val item = mutableListIterator.next()
            if (item % 2 == 1) mutableListIterator.remove() // menghapus angka ganjil
        }
    }

    fun <T> displayMutableListIterator(mutablListIterator: MutableListIterator<T>) {
        while (mutablListIterator.hasNext()) println(mutablListIterator.next())
    }


    val mutableList = mutableListOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 1)

    removeOddNumber(mutableList.listIterator())

    displayMutableListIterator(mutableList.listIterator())

}