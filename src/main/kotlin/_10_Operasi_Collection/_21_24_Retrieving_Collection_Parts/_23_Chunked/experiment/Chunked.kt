package _10_Operasi_Collection._21_24_Retrieving_Collection_Parts._23_Chunked.experiment

fun main() {
    val numbers = (1..10).toList() // Contoh list angka dari 1 sampai 10

    // Memotong list 'numbers' menjadi sub-list dengan panjang 3
    val chunkedNumbers = numbers.chunked(3)
    println("Chunked by 3: $chunkedNumbers")
    // Output: Chunked by 3: [[1, 2, 3], [4, 5, 6], [7, 8, 9], [10]]

    // Memotong list 'numbers' menjadi sub-list dengan panjang 3, lalu menjumlahkan elemen-elemennya
    val chunkedMappedNumbers = numbers.chunked(3) { it.sum() }
    println("Chunked and Mapped by 3: $chunkedMappedNumbers")
    // Output: Chunked and Mapped by 3: [6, 15, 24, 10]
}
