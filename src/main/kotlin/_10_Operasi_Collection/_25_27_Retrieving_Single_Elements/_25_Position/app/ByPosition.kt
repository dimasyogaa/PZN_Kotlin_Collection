package _10_Operasi_Collection._25_27_Retrieving_Single_Elements._25_Position.app

/**
 * Retrieve Single Elements by Position
 * ● Di kotlin kita bisa mengambil satu element di collection menggunakan posisi
 *
 * Retrieve Single Element by Position
 *
 * elementAt(index)
 * Mengambil element pada posisi index.
 *
 * first()
 * Mengambil element pertama
 *
 * last()
 * Mengambil element terakhir
 *
 * elementAtOrNull(index)
 * Mengambil element pada posisi index. Null jika tidak ada index
 *
 * elementAtOrElse(index, defaultValue)
 * Mengambil element pada posisi index. Atau default value jika tidak ada index
 *
 * bijak dalam penggunaan collection pada Set, karena operasinya mengiterasi semua data terlebih dahulu
 */

fun main() {

    // bisa digunakan untuk tipe Collection Set meskipun tidak memiliki index
    val names = setOf("Yoga", "Dimas", "Pambudi")

    // first()
    println("first : ${names.first()}")

    // last()
    println("last : ${names.last()}")

    // elementAt(index)
    println("elementAt : ${names.elementAt(1)}")

    // elementAtOrNull(index)
    println("elementAtOrNull : ${names.elementAtOrNull(10)}")

    // elementAtOrElse(index, defaultValue)
    println("elementAtOrElse : ${names.elementAtOrElse(10) { "Tidak Ada" }}")

}
