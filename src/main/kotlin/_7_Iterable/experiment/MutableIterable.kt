package _7_Iterable.experiment

// Kelas yang mewakili kumpulan elemen yang dapat diiterasi dan mendukung penghapusan elemen selama iterasi
class KoleksiMutableSaya<T>(private val elemen: MutableList<T>) : MutableIterable<T> {
    // Fungsi untuk mengembalikan iterator yang mendukung penghapusan elemen selama iterasi
    override fun iterator(): MutableIterator<T> {
        return IteratorMutableKoleksi(elemen)
    }
}

// Kelas yang mengimplementasikan MutableIterator untuk mengiterasi elemen dalam koleksi dan mendukung penghapusan elemen
class IteratorMutableKoleksi<T>(private val elemen: MutableList<T>) : MutableIterator<T> {
    private var indeksSaatIni = 0
    private var lastRetrievedIndex = -1
    private var removeAllowed = false

    // Fungsi untuk mengecek apakah masih ada elemen yang tersisa untuk diiterasi
    override fun hasNext(): Boolean {
        return indeksSaatIni < elemen.size
    }

    // Fungsi untuk mendapatkan elemen selanjutnya dalam iterasi
    override fun next(): T {
        if (!hasNext()) {
            throw NoSuchElementException()
        }
        lastRetrievedIndex = indeksSaatIni
        removeAllowed = true
        return elemen[indeksSaatIni++]
    }

    // Fungsi untuk menghapus elemen yang telah diambil terakhir kali oleh iterator
    override fun remove() {
        if (lastRetrievedIndex == -1 || !removeAllowed) {
            throw IllegalStateException("Invalid state for removal")
        }
        elemen.removeAt(lastRetrievedIndex)
        indeksSaatIni--
        lastRetrievedIndex = -1
        removeAllowed = false
    }
}

fun main() {
    // Membuat instance dari kelas KoleksiMutableSaya
    val koleksiMutableSaya = KoleksiMutableSaya(mutableListOf("apel", "pisang", "jeruk"))
    val iterator = koleksiMutableSaya.iterator()

    // Iterasi dan mencetak setiap elemen dalam koleksi, dan menghapus 'pisang' jika ditemukan
    println("Mengiterasi elemen menggunakan MutableIterable dan MutableIterator:")
    while (iterator.hasNext()) {
        val elemen = iterator.next()
        println(elemen)
        if (elemen == "pisang") {
            iterator.remove()
        }
    }
    println("Koleksi setelah menghapus 'pisang': ${koleksiMutableSaya.toList()}")
}