package _6_Collection.Experiment

import _MyHelper.MyHelper.spaceLine

fun main() {

    stringType()

    // intType()

}

private fun stringType() {

    // Membuat koleksi
    val koleksiSaya: Collection<String> = listOf("apel", "jeruk", "pisang", "semangka", "melon")
    println("Membuat Collection dengan List : $koleksiSaya")
    spaceLine()

    // Operasi Pengecekan
    val ukuran = koleksiSaya.size
    println("Ukuran Koleksi: $ukuran")

    val kosong = koleksiSaya.isEmpty()
    println("Koleksi Kosong: $kosong")

    val containsElement = koleksiSaya.contains("pisang")
    println("Koleksi Berisi Elemen 'pisang': $containsElement")
    spaceLine()

    // Operasi Iterasi
    println("Iterasi melalui Koleksi:")
    for (element in koleksiSaya) {
        println(element)
    }
    spaceLine()

    // Operasi Pengecekan Kelompok
    val containsAllElements = koleksiSaya.containsAll(listOf("jeruk", "semangka"))
    println("Koleksi Berisi Semua Elemen ['jeruk', 'semangka']: $containsAllElements")
    spaceLine()

}

private fun intType() {    // Membuat koleksi
    val koleksiSaya: Collection<Int> = listOf(1000, 2000, 3000, 4000, 5000)
    println("Membuat Collection dengan List : $koleksiSaya")
    spaceLine()

    // Operasi Pengecekan
    val ukuran = koleksiSaya.size
    println("Ukuran Koleksi: $ukuran")

    val kosong = koleksiSaya.isEmpty()
    println("Koleksi Kosong: $kosong")

    val containsElement = koleksiSaya.contains(3000)
    println("Koleksi Berisi Elemen '3000': $containsElement")
    spaceLine()

    // Operasi Iterasi
    println("Iterasi melalui Koleksi:")
    for (element in koleksiSaya) {
        println(element)
    }
    spaceLine()

    // Operasi Pengecekan Kelompok
    val containsAllElements = koleksiSaya.containsAll(listOf(2000, 4000))
    println("Koleksi Berisi Semua Elemen [2, 4]: $containsAllElements")
    spaceLine()
}

