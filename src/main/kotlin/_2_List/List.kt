package _2_List

import _MyHelper.MyHelper.spaceLine

/**
 * List
 * ● List, adalah collection yang datanya seperti Array dan memiliki akses data menggunakan index
 * ● Data di List boleh duplicate, artinya kita boleh memasukkan data yang sama berkali-kali ke dalam
 * sebuah List yang sama
 *
 * bedanya list dengan array yaitu
 * List ada kelas turunannya yaitu mutableList yang mana lebih dinamis untuk jumlah datanya
 *
 * List : immutable
 * MutableList : mutable
 *
 *
 * Inteface => Method :
 * - List => listOf()
 * - MutableList => mutableListOf()
 *
 */

fun main() {

    // list() // immutable

    iniMutableList() // mutable

}

private fun list() {

    // wajib memasukkan data terlebih dahulu, karena datanya tidak bisa berubah ubah
    val myList: List<String> = listOf("Yoga", "Dimas", "Pambudi")

    // HANYA BISA MENGAMBIL DATA
    println("HANYA BISA MENGAMBIL DATA ELEMEN")
    // cara 1
    println("* cara 1 []")
    println(myList[0])
    println(myList[1])
    println(myList[2])

    println()

    // cara 2
    println("* cara 2 get()")
    println(myList.get(0))
    println(myList.get(1))
    println(myList.get(2))

    spaceLine()

    // MENGAMBIL INDEK ELEMEN
    println("indexOf() : MENGAMBIL INDEK ELEMEN")
    println("* ada elemennya : ${myList.indexOf("Pambudi")}")
    println("* tidak ada elemennya : ${myList.indexOf("Tidak ada")}")

    spaceLine()

    // CHECK APAKAH ADA DATA ELEMEN TERTENTU
    println("contains() : CHECK APAKAH ADA DATA ELEMEN TERTENTU")
    println("ada data Dimas = ${myList.contains("Dimas")}")
    println("ada data dimas = ${myList.contains("dimas")}") // case sensitif
    println("ada data yeo = ${myList.contains("yeo")}")

    println()

    // check apakah data myList memiliki data listOf("Yoga", "Dimas")
    println("containsAll() : check apakah data myList memiliki data listOf(\"Yoga\", \"Dimas\")")
    println(myList.containsAll(listOf("Yoga", "Dimas")))

    spaceLine()

    // CHECK APAKAH DATA KOSONG ATAU TIDAK
    println("isEmpty() dan isNotEmpty() : CHECK APAKAH DATA KOSONG ATAU TIDAK")
    println("* isEmpty() - method dari class interface List")
    println("apakah kosong = ${myList.isEmpty()}")

    println()

    println("* isNotEmpty() - extension function")
    println("apakah tidak kosong = ${myList.isNotEmpty()}")
}

private fun iniMutableList() {

    // tidak wajib memasukkan data terlebih dahulu, karena datanya bisa diubah
    val myMutableList: MutableList<String> = mutableListOf()


    // tambah
    println("TAMBAH")
    myMutableList.add("Yoga")
    myMutableList.add("Dimas")
    myMutableList.add("Pambudi")
    println(myMutableList)

    spaceLine()

    // ubah
    println("UBAH")
    myMutableList[2] = "Pratama"
    println(myMutableList)

    myMutableList.set(2, "Pambudi")
    println(myMutableList)

    myMutableList.set(myMutableList.indexOf("Pambudi"), "Pratama")
    println(myMutableList)

    spaceLine()

    // hapus
    println("HAPUS")
    myMutableList.remove("Pratama")
    println(myMutableList)

    spaceLine()

    // akses
    println("AKSES")
    for (value in myMutableList) {
        println(value)
    }




}



