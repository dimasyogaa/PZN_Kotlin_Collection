package _10_Operasi_Collection._28_Checking_Existence.app

/**
 * Checking Existence
 * ● Kotlin mendukung operasi untuk mengecek apakah dalam collection terdapat data yang kita cari
 *
 * Checking Existence Operator
 *
 * contains(element)
 * Boolean Mengecek apakah terdapat element di collection
 *
 * containsAll(Collection<T>)
 * Boolean Mengecek apakah terdapat element collection T di collection
 *
 * isEmpty()
 * Boolean Mengecek apakah collection kosong
 *
 * isNotEmpty()
 * Boolean Mengecek apakah collection tidak kosong
 */

fun main() {

    val range = (1..10).toSet()
    println("range : $range")

    // 1. contains(element)
    val contains = range.contains(5)
    println("contains : $contains")

    // 2. containsAll(collection<T>)
    val containsAll = range.containsAll(listOf(3, 4, 5))
    println("containsAll : $containsAll")

    // 3. isEmpty()
    val isEmpty = range.isEmpty()
    println("isEmpty : $isEmpty")

    // 4. isNotEmpty()
    val isNotEmpty = range.isNotEmpty()
    println("isNotEmpty : $isNotEmpty")

}