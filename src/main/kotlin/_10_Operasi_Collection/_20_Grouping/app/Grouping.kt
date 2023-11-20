package _10_Operasi_Collection._20_Grouping.app

import _MyHelper.MyHelper.spaceLine


/**
 * Grouping
 * ● Grouping adalah operasi untuk meng-grup kan element-element yang ada di collection.
 *
 * Grouping Operators
 *
 * groupBy((T) -> K) :
 * Map<K, List<T>> Menggabungkan collection menjadi group Map<K, List<T>>
 *
 * groupingBy((T) -> K) : Grouping<K, T>
 * Menggabungkan collection menjadi object Grouping<K, T>
 *
 * Grouping interface akan dibahas lebih detail di materi terpisah
 *
 * K : Key
 */

fun main() {

    val list1 = listOf("a", "a", "b", "b", "c", "c", "d", "aa", "aa", "abc")

    // group berdasarkan element
    val map: Map<String, List<String>> = list1.groupBy { it }

    // group berdasarkan panjang element
    val map2: Map<Int, List<String>> = list1.groupBy { it.length }

    //group berdasarkan element yang dicustom
    val map3: Map<String, List<String>> = list1.groupBy { "KEY_${it.uppercase()}" }

    println("groupBy 1 : $map")
    // groupBy 1 : {a=[a, a], b=[b, b], c=[c, c], d=[d], aa=[aa, aa], abc=[abc]}

    println("groupBy 2 : $map2")
    // groupBy 2 : {1=[a, a, b, b, c, c, d], 2=[aa, aa], 3=[abc]}

    println("groupBy 3 : $map3")
    // groupBy 3 : {KEY_A=[a, a], KEY_B=[b, b], KEY_C=[c, c], KEY_D=[d], KEY_AA=[aa, aa], KEY_ABC=[abc]}

    spaceLine()

    // akan dibahas di materi terpisah
    val grouping: Grouping<String, String> = list1.groupingBy { it }
    println("groupingBy : $grouping")

}