package _10_Operasi_Collection._33_Aggregate._36_38_Specific_Operations._36_List.experiment

fun main() {
    val angka = listOf(1, 2, 3, 4, 5)

    // getOrElse(index, (index) -> T)
    val nilaiPadaIndeks = angka.getOrElse(3) { -1 }
    println("Nilai pada indeks 3 atau default: $nilaiPadaIndeks")

    // getOrNull(index)
    val nilaiAtauNull = angka.getOrNull(7)
    println("Nilai pada indeks 7 atau null: $nilaiAtauNull")

    // subList(from, to)
    val sublist = angka.subList(1, 4)
    println("Sublist dari indeks 1 hingga 4: $sublist")

    // binarySearch(value)
    val hasilPencarian = angka.binarySearch(3)
    println("Hasil pencarian binary untuk nilai 3: $hasilPencarian")

    // indexOf(value)
    val indeks = angka.indexOf(4)
    println("Indeks dari nilai 4: $indeks")

    // lastIndexOf(value)
    val indeksTerakhir = angka.lastIndexOf(3)
    println("Indeks terakhir dari nilai 3: $indeksTerakhir")

    // indexOfFirst((T) -> Boolean)
    val indeksPertama = angka.indexOfFirst { it % 2 == 0 }
    println("Indeks pertama dari bilangan genap: $indeksPertama")

    // indexOfLast((T) -> Boolean)
    val indeksTerakhirGenap = angka.indexOfLast { it % 2 == 0 }
    println("Indeks terakhir dari bilangan genap: $indeksTerakhirGenap")
}
