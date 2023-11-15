package _5_Map.experiment

import _MyHelper.MyHelper.spaceLine

fun main() {

    // Membuat map
    val mapSaya: Map<String, String?> = mapOf(
        "Kunci1" to "Nilai1",
        "Kunci2" to "Nilai2",
        "Kunci3" to null // Contoh nilai null
    )
    println("Membuat map: $mapSaya")
    spaceLine()

    // Operasi Pengecekan
    val ukuran = mapSaya.size
    println("Ukuran Map: $ukuran")

    val kosong = mapSaya.isEmpty()
    println("Map Kosong: $kosong")

    val containsKey = mapSaya.containsKey("Kunci1")
    println("Map Berisi Kunci 'Kunci1': $containsKey")

    val containsValue = mapSaya.containsValue("Nilai2")
    println("Map Berisi Nilai 'Nilai2': $containsValue")

    spaceLine()

    // Akses Nilai
    val nilaiKunci1 = mapSaya["Kunci1"]
    println("Nilai untuk Kunci 'Kunci1': $nilaiKunci1")

    spaceLine()

    // Views
    val kunciSet: Set<String> = mapSaya.keys
    println("Set Kunci: $kunciSet")

    val nilaiCollection: Collection<String?> = mapSaya.values
    println("Koleksi Nilai: $nilaiCollection")

    val entriSet: Set<Map.Entry<String, String?>> = mapSaya.entries
    println("Set Entri: $entriSet")

    spaceLine()

    // Iterasi melalui Entri
    for (entry in mapSaya.entries) {
        println("Kunci: ${entry.key}, Nilai: ${entry.value}")
    }

}