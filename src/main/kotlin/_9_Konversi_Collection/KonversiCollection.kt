package _9_Konversi_Collection

/**
 * Konversi Collection
 * ● Di kotlin kita bisa melakukan konversi collection ke jenis collection lain secara mudah
 * ● Misal kita ingin mengubah dari array ke list, atau dari range ke set, atau dari set ke list, bisa
 * dilakukan dengan mudah
 * ● Semua function dimulai dengan kata “to”, misal toList, toSet, toMutableList, dan lain-lain
 */

fun main() {
    val array = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val range = 1..100

    val list = array.toList()
    val set = array.toSet()

    val mutableList = range.toMutableList()
    val mutableSet = range.toMutableSet()

    val listToMutableList = list.toMutableList()
    val setToMutableSet = list.toMutableSet()

    val sortedSetAsc = array.toSortedSet()
    val sortedSetDesc = array.toSortedSet(Comparator.reverseOrder())
}