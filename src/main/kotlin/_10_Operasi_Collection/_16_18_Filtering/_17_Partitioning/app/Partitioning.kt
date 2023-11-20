package _10_Operasi_Collection._16_18_Filtering._17_Partitioning.app


/**
 * Filtering : Partitioning
 * ● Pada filtering by predicate, kita akan menghilangkan data yang tidak masuk kondisi filter
 * ● Dengan filtering partition, kita akan membagi collection menjadi dua, dimana collection pertama
 * yang masuk filtering, dan collection kedua yang tidak masuk filtering
 *
 * Filtering : Partitioning Operation
 *
 * partition((T) -> Boolean): Pair<List<T>, List<T>>
 * Mempartisi collection dengan filtering sehingga menghasilkan
 * Pair collection T yang masuk filter, dan
 * collection T yang tidak masuk filter
 */

fun main() {

    val names = listOf("Yoga", "Kurniawan", "Pambudi")

    val pair: Pair<List<String>, List<String>> = names.partition { it.length > 5 }

    val (listMatch, listNotMatch) = pair

    println("names : $names")
    println("pair : $pair")
    println("listMatch : $listMatch")
    println("listNotMatch : $listNotMatch")

}
