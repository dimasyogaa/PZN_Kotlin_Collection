package _10_Operasi_Collection._11_15_Tranformations._11_Mapping.experiment

import _MyHelper.MyHelper.spaceLine

fun main() {
    val words = listOf("apel", "jeruk", "pisang")

    /** 1. map */
    // Mengubah setiap kata menjadi panjang kata menggunakan map()
    val wordLengths = words.map { it.length }
    println("Panjang kata: $wordLengths")

    spaceLine()

    /** 2. mapIndexed */
    // Menggunakan mapIndexed() untuk mendapatkan panjang kata dengan indeks
    val wordLengthsWithIndex = words.mapIndexed { index, word -> "Kata ke-$index: $word panjangnya ${word.length}" }
    println("Panjang kata dengan indeks: $wordLengthsWithIndex")

    spaceLine()

    /** 3. mapNotNull */
    val strings = listOf("1", "2", "3", "four", "5")

    // Konversi string ke integer, tetapi hanya menyertakan yang berhasil dikonversi
    val numbers = strings.mapNotNull { it.toIntOrNull() }
    println("Daftar angka setelah konversi: $numbers")

    spaceLine()

    /** 4. mapIndexedNotNull */
    val names = listOf("Alice", "", "Bob", "", "Carol")

    // Menyaring nama-nama yang tidak kosong sambil mempertahankan indeksnya
    val nonEmptyNames = names.mapIndexedNotNull { index, name ->
        if (name.isNotEmpty()) index to name else null
    }
    println("Nama-nama tidak kosong dengan indeks: $nonEmptyNames")

}

