package _7_Iterable.experiment

import _MyHelper.MyHelper.spaceLine

// Kelas yang mewakili kumpulan elemen yang dapat diiterasi
class KoleksiSaya<T>(private val elemen: List<T>) : Iterable<T> {
    // Fungsi untuk mengembalikan iterator yang digunakan untuk mengiterasi elemen
    override fun iterator(): Iterator<T> {
        return IteratorKoleksi(elemen)
    }
}

// Kelas yang mengimplementasikan Iterator untuk mengiterasi elemen dalam koleksi
class IteratorKoleksi<T>(private val elemen: List<T>) : Iterator<T> {
    private var indeksSaatIni = 0

    // Fungsi untuk mengecek apakah masih ada elemen yang tersisa untuk diiterasi
    override fun hasNext(): Boolean {
        return indeksSaatIni < elemen.size
    }

    // Fungsi untuk mendapatkan elemen selanjutnya dalam iterasi
    override fun next(): T {
        if (!hasNext()) {
            throw NoSuchElementException()
        }
        return elemen[indeksSaatIni++]
    }
}

fun main() {

    // basic()

    // Membuat instance dari kelas KoleksiSaya
    val koleksiSaya = KoleksiSaya(listOf("apel", "pisang", "jeruk"))
    val myIterator = koleksiSaya.iterator()

    // Iterasi dan mencetak setiap elemen dalam koleksi
    println("Mengiterasi elemen menggunakan Iterable dan Iterator:")
    while (myIterator.hasNext()) {
        val elemen = myIterator.next()
        println(elemen)
    }

}

private fun basic() {
    val kata: Iterable<Char> = "Contoh".asIterable()
    println("Iterable untuk String 'Contoh':")
    for (char in kata) {
        println(char)
    }

    spaceLine()

    val numbers: Iterable<Int> = listOf(1, 2, 3, 4, 5)
    println("Iterable untuk List<Int> [1, 2, 3, 4, 5]:")
    for (number in numbers) {
        println(number)
    }
}