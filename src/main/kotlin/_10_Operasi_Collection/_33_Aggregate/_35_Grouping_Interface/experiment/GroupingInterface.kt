package _10_Operasi_Collection._33_Aggregate._35_Grouping_Interface.experiment

/**
 * Interface Grouping pada Kotlin memungkinkan kita untuk melakukan operasi grup (pengelompokan) pada koleksi data berdasarkan kriteria tertentu menggunakan fungsi groupingBy yang menghasilkan objek dari tipe Grouping.
 *
 * Berikut adalah beberapa operasi yang bisa dilakukan menggunakan Grouping Interface:
 *
 * eachCount()
 * Operasi eachCount() menghitung jumlah data di setiap grup yang dihasilkan dari operasi groupingBy.
 *
 * reduce() dan fold()
 * Kedua operasi ini (reduce() dan fold()) dapat dijalankan di setiap grup yang dihasilkan dari Grouping. Mereka memungkinkan kita untuk mengagregasi nilai-nilai dalam grup menjadi satu nilai tunggal berdasarkan operasi yang diberikan.
 *
 * aggregate(key: K, accumulator: R?, element: T, first: Boolean)
 * Operasi aggregate memungkinkan kita untuk mengelola data di setiap grup. Jika first bernilai true, maka accumulator akan bernilai null. aggregate memberikan kontrol yang lebih besar atas cara data diolah dalam setiap grup, terutama saat kita perlu melakukan operasi spesifik pada data pertama di dalam grup.
 *

 */


data class Item(val category: String, val value: Int)

fun main() {
    val items = listOf(
        Item("A", 10),
        Item("B", 15),
        Item("A", 20),
        Item("B", 12),
        Item("A", 8)
    )

    val group = items.groupBy { it.category }
    val grouping = items.groupingBy { it.category }
    println("group : $group")
    println("grouping : $grouping")

    // Menghitung jumlah item di setiap grup
    val itemCounts = grouping.eachCount()
    println("Jumlah item di setiap grup: $itemCounts")

    // Operasi reduce di setiap grup untuk mendapatkan total nilai
    val totalByCategory = grouping.reduce { key, accumulator, item ->
        val totalValue = accumulator.value
        Item(key, totalValue + item.value)
    }
    println("Total nilai di setiap grup: $totalByCategory")

    // Operasi fold di setiap grup untuk mendapatkan nilai maksimal
    val maxByCategory = grouping.fold(Int.MIN_VALUE) { acc, item ->
        maxOf(acc, item.value)
    }
    println("Nilai maksimal di setiap grup: $maxByCategory")

    // Operasi aggregate di setiap grup
    val aggregateResult = grouping.aggregate { key, accumulator: Int?, item, first ->
        if (first) {
            item.value // Nilai pertama dalam grup
        } else {
            accumulator?.plus(item.value) ?: 0
        }
    }
    println("Hasil aggregate di setiap grup: $aggregateResult")
}

