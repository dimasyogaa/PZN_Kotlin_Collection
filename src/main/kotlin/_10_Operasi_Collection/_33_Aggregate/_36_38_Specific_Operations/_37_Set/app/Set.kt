package _10_Operasi_Collection._33_Aggregate._36_38_Specific_Operations._37_Set.app

/**
 * Set Specific Operations
 * ● Di kotlin juga terdapat operations yang khusus digunakan untuk Set
 *
 * Set Specific Operator
 *
 * union(collection)
 * Mengembalikan semua element dari kedua set
 *
 * intersect(collection)
 * Mengembalikan semua element yang terdapat di kedua set
 *
 * substract(collection)
 * Mengembalikan semua element yang tidak dimiliki oleh set
 */

fun main() {

    val numbers1 = (1..10).toSet()
    val numbers2 = (6..15).toSet()

    // 1. Union
    val union = numbers1 union numbers2
    println("union : $union")
    // union : [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15]

    // 2. Intersect
    val intersect = numbers1 intersect numbers2
    println("intersect : $intersect")
    // intersect : [6, 7, 8, 9, 10]

    // 3. Subtract
    val subtract1 = numbers1 subtract numbers2
    val subtract2 = numbers2 subtract numbers1
    println("subtract1 : $subtract1")
    println("subtract2 : $subtract2")
    // subtract1 : [1, 2, 3, 4, 5]
    // subtract2 : [11, 12, 13, 14, 15]


}