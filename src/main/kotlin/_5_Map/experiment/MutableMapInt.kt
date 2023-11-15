package _5_Map.experiment

import _MyHelper.MyHelper.spaceLine

fun main() {
    // Membuat map yang dapat diubah
    val mapSaya: MutableMap<Int, Int> = mutableMapOf()

    // Operasi Modifikasi
    val previousValue1 = mapSaya.put(1, 10)
    println("Menambahkan kunci 1 dengan nilai 10, Nilai Sebelumnya: $previousValue1, Map: $mapSaya")

    val previousValue2 = mapSaya.put(2, 20)
    println("Menambahkan kunci 2 dengan nilai 20, Nilai Sebelumnya: $previousValue2, Map: $mapSaya")

    val removedValue = mapSaya.remove(1)
    println("Menghapus kunci 1, Nilai Sebelumnya: $removedValue, Map: $mapSaya")

    spaceLine()

    // Operasi Modifikasi Massal
    val mapTambah = mapOf(3 to 30, 4 to 40)
    mapSaya.putAll(mapTambah)
    println("Menambahkan semua elemen dari map tambahan: $mapSaya")

    mapSaya.clear()
    println("Mengosongkan map: $mapSaya")

    spaceLine()

    // Views
    mapSaya.putAll(mapOf(30 to 300, 40 to 400))
    val keysSet: MutableSet<Int> = mapSaya.keys
    println("Set Kunci: $keysSet")

    val valuesCollection: MutableCollection<Int> = mapSaya.values
    println("Koleksi Nilai: $valuesCollection")

    spaceLine()

    // MutableEntry - setValue
    val entry: MutableMap.MutableEntry<Int, Int> = mapSaya.entries.first()
    val previousValue = entry.setValue(50)
    println("Mengubah nilai entri menjadi 50, Nilai Sebelumnya: $previousValue, Map: $mapSaya")

}