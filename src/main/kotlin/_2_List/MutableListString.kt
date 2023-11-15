package _2_List

import _MyHelper.MyHelper.spaceLine

fun main() {
    // Membuat mutable list
    val mutableList: MutableList<String> = mutableListOf()

    // Operasi Modifikasi
    mutableList.add("Elemen 1")
    mutableList.add("Elemen 2")
    mutableList.add("Elemen 3")

    println("Setelah menambahkan elemen: $mutableList")

    mutableList.remove("Elemen 2")
    println("Setelah menghapus 'Elemen 2': $mutableList")

    spaceLine()

    // Operasi Modifikasi Massal
    val elemenTambah = listOf("Elemen Baru 1", "Elemen Baru 2")
    mutableList.addAll(elemenTambah)
    println("Setelah menambahkan semua elemen: $mutableList")

    mutableList.addAll(2, listOf("Elemen Sisip 1", "Elemen Sisip 2"))
    println("Setelah menyisipkan elemen pada indeks 2: $mutableList")

    mutableList.removeAll(listOf("Elemen 1", "Elemen 3"))
    println("Setelah menghapus elemen yang ditentukan: $mutableList")

    mutableList.retainAll(listOf("Elemen Baru 1", "Elemen Sisip 1"))
    println("Setelah menyimpan elemen yang ditentukan: $mutableList")

    mutableList.clear()
    println("Setelah membersihkan daftar: $mutableList")

    spaceLine()

    // Operasi Akses Posisi
    mutableList.add("Elemen 1")
    mutableList.add("Elemen 2")
    mutableList.add("Elemen 3")

    mutableList[1] = "Elemen Modifikasi 2"
    println("Setelah memodifikasi elemen pada indeks 1: $mutableList")

    mutableList.add(1, "Elemen Baru pada Indeks 1")
    println("Setelah menambahkan elemen pada indeks 1: $mutableList")

    val elemenTerhapus = mutableList.removeAt(0)
    println("Elemen yang dihapus pada indeks 0: $elemenTerhapus, Daftar setelah penghapusan: $mutableList")

    spaceLine()

    // List Iterators
    val iteratorDaftar = mutableList.listIterator()
    while (iteratorDaftar.hasNext()) {
        println("Iterator Daftar Selanjutnya: ${iteratorDaftar.next()}")
    }

    val iteratorDaftarPadaIndeks = mutableList.listIterator(1)
    while (iteratorDaftarPadaIndeks.hasNext()) {
        println("Iterator Daftar pada Indeks 1 Selanjutnya: ${iteratorDaftarPadaIndeks.next()}")
    }

    // Tampilan
    val subList = mutableList.subList(0, 2)
    println("Subdaftar dari indeks 0 hingga 2: $subList")
}