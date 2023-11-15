package _3_Set.app

import _MyHelper.MyHelper.spaceLine

fun main() {
    // Membuat himpunan yang dapat diubah
    val himpunanSaya: MutableSet<String> = mutableSetOf()

    // Operasi Pengecekan
    val iterator = himpunanSaya.iterator()
    println("Iterator: $iterator")

    spaceLine()

    // Operasi Penambahan
    val ditambahkan1 = himpunanSaya.add("Elemen 1")
    println("Ditambahkan 'Elemen 1': $ditambahkan1, Himpunan: $himpunanSaya")

    val ditambahkan2 = himpunanSaya.add("Elemen 2")
    println("Ditambahkan 'Elemen 2': $ditambahkan2, Himpunan: $himpunanSaya")

    val dihapus = himpunanSaya.remove("Elemen 1")
    println("Dihapus 'Elemen 1': $dihapus, Himpunan: $himpunanSaya")

    spaceLine()

    // Operasi Penambahan Massal
    val elemenDitambahkan = listOf("Elemen Baru 1", "Elemen Baru 2")
    val ditambahkanSemua = himpunanSaya.addAll(elemenDitambahkan)
    println("Ditambahkan semua elemen: $ditambahkanSemua, Himpunan: $himpunanSaya")

    val dihapusSemua = himpunanSaya.removeAll(listOf("Elemen 2", "Elemen Tidak Ada"))
    println("Dihapus semua elemen removeAll(listOf(\"Elemen 2\", \"Elemen Tidak Ada\")): $dihapusSemua, Himpunan: $himpunanSaya")

    val disimpanSemua = himpunanSaya.retainAll(listOf("Elemen Baru 1"))
    println("Disimpan semua elemen retainAll(listOf(\"Elemen Baru 1\")): $disimpanSemua, Himpunan: $himpunanSaya")

    himpunanSaya.clear()
    println("Mengosongkan himpunan: $himpunanSaya")
}