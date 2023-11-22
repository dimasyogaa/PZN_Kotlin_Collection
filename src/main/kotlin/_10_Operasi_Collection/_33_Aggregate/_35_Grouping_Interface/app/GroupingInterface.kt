package _10_Operasi_Collection._33_Aggregate._35_Grouping_Interface.app

/**
 * Grouping Interface
 * ● Sebelumnya kita sudah bahas tentang operasi Grouping, salah satunya adalah groupingBy yang
 * menghasilkan object dari interface Grouping
 *
 *Grouping Interface Operator
 *
 * eachCount() Menghitung jumlah data di tiap group
 *
 * reduce() dan fold() Operasi reduce() dan fold() di tiap group
 *
 * aggregate(key: K, accumulator: R?, element: T, first: Boolean)
 * Operasi aggregate data di tiap group, dimana jika data pertama mana parameter
 * first bernilai true, dan accumulator akan bernilai null
 */

fun main() {

    val list = listOf("a" , "a", "b", "b", "c", "c", "c")

    val group = list.groupBy { it }
    val grouping = list.groupingBy { it }
    println("group : $group")
    println("grouping : $grouping")

    // 1. eachCount()
    println("eachCount : ${grouping.eachCount()}") //  {a=2, b=2, c=2}

    // 2. fold
    val fold = grouping.fold(""){first, second -> first + second}
    println("fold : $fold") // {a=aa, b=bb, c=cc}

    // 3. reduce
    val reduce = grouping.reduce{key, first, second -> first + second}
    println("reduce : $reduce") // {a=aa, b=bb, c=cc}

    // 4. aggregate
    val aggregate = grouping.aggregate { key, first: String?, second, isFirst ->
        if (isFirst) second
        else first + second
    }
    println("aggregate : $aggregate")

}