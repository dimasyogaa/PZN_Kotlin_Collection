package _10_Operasi_Collection._25_27_Retrieving_Single_Elements._26_Condition.app

/**
 * Retrieve Single Elements by Condition
 * ● Selain mengambil satu element di collection berdasarkan posisi,
 * kita juga bisa mengambil single element berdasarkan kondisi
 *
 * Retrieve Single Element by Position
 *
 * first((T) -> Boolean)
 * Mengambil element pertama yang sesuai kondisi
 *
 * last((T) -> Boolean)
 * Mengambil element terakhir yang sesuai dengan kondisi
 *
 * firstOrNull((T) -> Boolean) / find()
 * Mengambil element pertama yang sesuai kondisi, atau null jika tidak ada
 *
 * lastOrNull((T) -> Boolean) / findLast()
 * Mengambil element terakhir yang sesuai kondisi, atau null jika tidak ada
 */

fun main() {

    val range = (1..20).toList()
    println(range)

    // 1. first()
    val first = range.first { it > 10 }
    println("first : $first") // 11

    // 2. last()
    val last = range.last { it > 10 }
    println("last : $last") // 20

    // 3. firstOrNull()
    val firstOrNull = range.firstOrNull { it > 10 }
    println("firstOrNull : $firstOrNull") // null

    // 4. lastOrNull()
    val lastOrNull = range.lastOrNull { it > 10 }
    println("lastOrNull : $lastOrNull") // null

    // 5. find()
    val find = range.find { it > 50 }
    println("find : $find") // null

    // 6. findLast()
    val findLast = range.findLast { it > 50 }
    println("findLast : $findLast") // null

}