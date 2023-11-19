package _10_Operasi_Collection._11_15_Tranformations._13_Association.app

/**
 * Transformations : Association
 * ● Association adalah operasi transformasi dari collection menjadi map
 * ● Dalam beberapa operasi association, element hasil bisa menjadi key atau value
 *
 * Transformations : Association Operation
 *
 * associate((T) -> Pair<K, V>) Merubah collection T menjadi Map<K, V>
 *
 * Generate Value
 * associateWith(T -> V) Merubah collection T menjadi Map<T, V>
 *
 * Generate Key
 * associateBy(T -> K) Merubah collection T menjadi Map<K, T>
 *
 * T : Type
 * K : Key
 * V : Value
 */

fun main() {

    val list1 = listOf("Yoga", "Dimas", "Pambudi")

    // generate key and value from list1
    val map1: Map<String, Int> = list1.associate { Pair(it, it.length) }

    // generate value from list1
    val map2: Map<String, Int> = list1.associateWith { it.length }

    // generate key from list1
    val map3: Map<Int, String> = list1.associateBy { it.length}

    println(map1)
    println(map2)
    println(map3)

}