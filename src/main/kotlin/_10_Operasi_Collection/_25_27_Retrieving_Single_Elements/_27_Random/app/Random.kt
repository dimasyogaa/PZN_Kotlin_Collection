package _10_Operasi_Collection._25_27_Retrieving_Single_Elements._27_Random.app

/**
 * Retrieve Single Element by Random
 * ● Kotlin juga mendukung operasi untuk mengambil element secara random di dalam collection
 *
 * Retrieve Single Element by Position
 *
 * random() Mengambil element secara random
 */

fun main() {

    val range = (1..100).toList()
    println(range.random())
    println(range.random())
    println(range.random())
    println(range.random())

}