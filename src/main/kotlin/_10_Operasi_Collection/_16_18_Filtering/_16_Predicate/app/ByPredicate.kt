package _10_Operasi_Collection._16_18_Filtering._16_Predicate.app

import _MyHelper.MyHelper.spaceLine

/**
 * Filtering by Predicate
 * ● Filtering adalah salah satu operasi collection yang sangat popular
 * ● Di kotlin, filtering bisa menggunakan predicate berupa lambda yang berisi kondisi filter nya
 * ● Jika return dari predicate tersebut true, maka data di terima, jika false maka data dibuang
 *
 * Filtering by Predicate Operation
 *
 * filter((T) -> Boolean)
 * Melakukan filtering terhadap collection
 *
 * filterIndexed((index, T) -> Boolean)
 * Melakukan filtering terhadap collection, dengan tambahan informasi index
 *
 * filterNot((T) -> Boolean)
 * Kebalikan dari filter((T) -> Boolean)
 *
 * filterIsInstance<T>()
 * Mengambil hanya data instant dari T
 *
 * filterNotNull()
 * Mengambil hanya data yang tidak null
 */

fun main() {

    val names = listOf("Yoga", "Dimas", "Pambudi")

    // 1. filter()
    val list2 = names.filter { it.length > 5 }

    println(list2) // [Pambudi]

    // 2. filterIndexed()
    val list3 = names.filterIndexed { index, value -> index % 2 == 0 }
    println(list3) // [Yoga, Pambudi]

    spaceLine()

    val randomList = listOf(null, 1, "Yoga", "Pambudi", 2, null)

    // 3. filterIsInstance
    val listString = randomList.filterIsInstance<String>()
    println(listString) // [Yoga, Pambudi]

    val listInt = randomList.filterIsInstance<Int>()
    println(listInt) // [1, 2]

    // 4. filterNotNull
    val listNotNull = randomList.filterNotNull()
    println(listNotNull)


}