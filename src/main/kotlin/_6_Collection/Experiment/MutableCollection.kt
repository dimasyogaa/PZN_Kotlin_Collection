package _6_Collection.Experiment

import _MyHelper.MyHelper.spaceLine

fun main() {

    // typeString()

    typeInt()

}


private fun typeString() {

    // Membuat koleksi mutable
    val koleksiMutable: MutableCollection<String> = mutableListOf("apel", "jeruk", "pisang", "semangka", "melon")
    println("Membuat MutableCollection dengan mutableListOf : $koleksiMutable")
    spaceLine()

    // Operasi Pengecekan
    val ukuran = koleksiMutable.size
    println("Ukuran Koleksi: $ukuran")

    val tambah = koleksiMutable.add("anggur")
    println("Menambahkan 'anggur' ke Koleksi: $tambah, Koleksi Setelah: $koleksiMutable")

    val hapus = koleksiMutable.remove("pisang")
    println("Menghapus 'pisang' dari Koleksi: $hapus, Koleksi Setelah: $koleksiMutable")
    spaceLine()

    // Bulk Modification Operations
    val koleksiTambahan = listOf("apel", "durian", "semangka")
    val tambahSemua = koleksiMutable.addAll(koleksiTambahan)
    println("Menambahkan semua elemen addAll(\"apel\", \"durian\", \"semangka\"): $tambahSemua, Koleksi Setelah: $koleksiMutable")

    val koleksiHapus = listOf("jeruk", "anggur", "melon")
    val hapusSemua = koleksiMutable.removeAll(koleksiHapus)
    println("Menghapus semua elemen removeAll(\"jeruk\", \"anggur\", \"melon\"): $hapusSemua, Koleksi Setelah: $koleksiMutable")

    val koleksiRetain = listOf("apel", "semangka")
    val retainSemua = koleksiMutable.retainAll(koleksiRetain)
    println("Menghapus elemen selain [apel, semangka]: $retainSemua, Koleksi Setelah: $koleksiMutable")

    koleksiMutable.clear()
    println("Mengosongkan Koleksi: $koleksiMutable")


}

private fun typeInt() {


        // Membuat koleksi mutable dengan tipe Int
        val koleksiMutable: MutableCollection<Int> = mutableListOf(100, 200, 300, 400, 500)
        println("Membuat MutableCollection dengan mutableListOf : $koleksiMutable")
        spaceLine()

        // Operasi Pengecekan
        val ukuran = koleksiMutable.size
        println("Ukuran Koleksi: $ukuran")

        val tambah = koleksiMutable.add(600)
        println("Menambahkan '600' ke Koleksi: $tambah, Koleksi Setelah: $koleksiMutable")

        val hapus = koleksiMutable.remove(300)
        println("Menghapus '300' dari Koleksi: $hapus, Koleksi Setelah: $koleksiMutable")
        spaceLine()

        // Bulk Modification Operations
        val koleksiTambahan = listOf(100, 700, 800)
        val tambahSemua = koleksiMutable.addAll(koleksiTambahan)
        println("Menambahkan semua elemen addAll(100, 700, 800): $tambahSemua, Koleksi Setelah: $koleksiMutable")

        val koleksiHapus = listOf(200, 600, 500)
        val hapusSemua = koleksiMutable.removeAll(koleksiHapus)
        println("Menghapus semua elemen removeAll(200, 600, 500): $hapusSemua, Koleksi Setelah: $koleksiMutable")

        val koleksiRetain = listOf(100, 400)
        val retainSemua = koleksiMutable.retainAll(koleksiRetain)
        println("Menghapus elemen selain [100, 400]: $retainSemua, Koleksi Setelah: $koleksiMutable")

        koleksiMutable.clear()
        println("Mengosongkan Koleksi: $koleksiMutable")



}