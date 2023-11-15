package _5_Map.app

import _MyHelper.MyHelper.spaceLine

/**
 * Map
 * ● Map (atau dictionary), adalah collection yang berbentuk key-value, dimana
 * key berperan sebagai index.
 * ● Key harus unik, jika kita menggunakan Key yang sama, maka data sebelumnya akan di replace oleh
 * data yang baru
 * ● Tipe data key bisa menggunakan tipe data apapun sesuai yang kita inginkan
 *
 * Map : immutable
 * MutableMap : mutable
 *
 * Interface -> method :
 * Map -> setOf()
 * MutableMap -> mutableMapOf()
 *
 * method put(key) => akan menambah data jika tidak ada key yang sama dengan argumen yang diinputkan
 * method put(key) => akan mengubah data jika ada key yang sama degan argumen yang diinputkan
 */

fun main() {

    // map() // immutable

    iniMutableMap() // mutable

}

private fun map() {
    val map: Map<String, String> = mapOf(
        Pair("a", "Yoga"),
        "b" to "Dimas",
        "c" to "Khannedy"
    )

    for ((key, value) in map) {
        println("$key to $value")
    }

    spaceLine()

    // sama dengan
    for ((key, value) in map.entries) {
        println("$key to $value")
    }
}


private fun iniMutableMap() {

    val myMutableMap: MutableMap<String, String> = mutableMapOf()

    // tambah dan ubah
    myMutableMap.put("a", "Yoga")
    myMutableMap["b"] = "Dimas"
    myMutableMap["c"] = "Pambudi"
    println(myMutableMap)

    spaceLine()

    // akses
    println(myMutableMap["a"])
    println(myMutableMap.get("b"))
    println(myMutableMap.get("c"))
    println(myMutableMap.getOrDefault("d", "Tidak Ada"))
    println(myMutableMap.get("d"))

    spaceLine()

    // hapus
    myMutableMap.remove("b")
    for ((key, value) in myMutableMap) {
        println("$key to $value")
    }

}