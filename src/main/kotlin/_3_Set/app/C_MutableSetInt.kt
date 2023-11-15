package _3_Set.app

import _MyHelper.MyHelper.spaceLine

fun main() {
    // Membuat himpunan yang dapat diubah
    val himpunanSaya: MutableSet<Int> = mutableSetOf()

    // Operasi Pengecekan
    val iterator = himpunanSaya.iterator()
    println("Iterator: $iterator")

    spaceLine()

    // Operasi Penambahan
    val ditambahkan1 = himpunanSaya.add(1)
    println("Ditambahkan '1': $ditambahkan1, Himpunan: $himpunanSaya")

    val ditambahkan2 = himpunanSaya.add(2)
    println("Ditambahkan '2': $ditambahkan2, Himpunan: $himpunanSaya")

    val dihapus = himpunanSaya.remove(1)
    println("Dihapus '1': $dihapus, Himpunan: $himpunanSaya")

    spaceLine()

    // Operasi Penambahan Massal
    val elemenDitambahkan = listOf(3, 4, 5)
    val ditambahkanSemua = himpunanSaya.addAll(elemenDitambahkan)
    println("Ditambahkan semua elemen: $ditambahkanSemua, Himpunan: $himpunanSaya")

    val dihapusSemua = himpunanSaya.removeAll(listOf(2, 6))
    println("Dihapus semua elemen removeAll(listOf(2, 6)): $dihapusSemua, Himpunan: $himpunanSaya")

    val disimpanSemua = himpunanSaya.retainAll(listOf(3, 4))
    println("Disimpan semua elemen retainAll(listOf(3, 4)): $disimpanSemua, Himpunan: $himpunanSaya")

    himpunanSaya.clear()
    println("Mengosongkan himpunan: $himpunanSaya")
}