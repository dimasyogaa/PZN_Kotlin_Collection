package _10_Operasi_Collection._11_15_Tranformations._14_Flattening.experiment

fun main() {

    val nestedList = listOf(
        listOf(1, 2, 3),
        listOf(4, 5, 6),
        listOf(7, 8, 9)
    )

    // Mengubah nested list menjadi list datar
    val flatList = nestedList.flatten()
    println("flatten: $flatList")

    // Mengubah setiap elemen dalam nested list menjadi koleksi baru dan menyatukannya menjadi satu list datar
    val flatMapList = nestedList.flatMap { it.map { value -> value * 2 } }
    println("flatMap: $flatMapList")

}
