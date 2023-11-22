package _10_Operasi_Collection._33_Aggregate._36_38_Specific_Operations._36_List.app

/**
 * List Specific Operator
 *
 * indexOf(value)
 * Mengambil index element yang sama dengan value
 *
 * lastIndexOf(value)
 * Mengambil index element terakhir yang sama dengan value
 *
 * indexOfFirst((T) -> Boolean)
 * Mengambil index element yang sama dengan kondisi
 *
 * indexOfLast((T) -> Boolean)
 * Mengambil index element terakhir yang sama dengan kondisi
 */

fun main() {

    val numbers = listOf(10, 10, 20, 20, 30, 30, 40, 40, 50, 50)
    println("numbers : $numbers")

    // 1. indexOf(element) : Index
    val indexOf = numbers.indexOf(20)
    println("indexOf : $indexOf")// 2

    // 2. lastIndexOf(element) : Index
    val lastIndexOf = numbers.lastIndexOf(30)
    println("lastIndexOf : $lastIndexOf") // 5

    // 3. indexOfFirst((T) -> Boolean) : Index
    val indexOfFirst = numbers.indexOfFirst { it > 30}
    println("lastIndexOf : $indexOfFirst") // 6

    // 4. indexOfLast((T) -> Boolean) : Index
    val indexOfLast = numbers.indexOfLast { it > 30}
    println("indexOfLast : $indexOfLast") // 9

}