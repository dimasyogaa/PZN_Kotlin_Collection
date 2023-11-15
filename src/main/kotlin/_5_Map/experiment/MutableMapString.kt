package _5_Map.experiment

import _MyHelper.MyHelper.spaceLine

fun main() {
    // Membuat map yang dapat diubah
    val mapSaya: MutableMap<String, String> = mutableMapOf()

    // Operasi Modifikasi
    val previousValue1 = mapSaya.put("Kunci1", "Nilai1")
    println("Menambahkan 'Kunci1' dengan 'Nilai1', Nilai Sebelumnya: $previousValue1, Map: $mapSaya")

    val previousValue2 = mapSaya.put("Kunci2", "Nilai2")
    println("Menambahkan 'Kunci2' dengan 'Nilai2', Nilai Sebelumnya: $previousValue2, Map: $mapSaya")

    val removedValue = mapSaya.remove("Kunci1")
    println("Menghapus 'Kunci1', Nilai Sebelumnya: $removedValue, Map: $mapSaya")

    spaceLine()

    // Operasi Modifikasi Massal
    val mapTambah = mapOf("Kunci3" to "Nilai3", "Kunci4" to "Nilai4")
    mapSaya.putAll(mapTambah)
    println("Menambahkan semua elemen dari map tambahan: $mapSaya")

    mapSaya.clear()
    println("Mengosongkan map: $mapSaya")

    spaceLine()

    // Views
    mapSaya.putAll(mapOf("Kunci10" to "Nilai10", "Kunci20" to "Nilai20"))
    val keysSet: MutableSet<String> = mapSaya.keys
    println("Set Kunci: $keysSet")

    val valuesCollection: MutableCollection<String> = mapSaya.values
    println("Koleksi Nilai: $valuesCollection")

    val entriesSet: MutableSet<MutableMap.MutableEntry<String, String>> = mapSaya.entries
    println("Set Entri: $entriesSet")

    spaceLine()

    // MutableEntry - setValue
    val entry: MutableMap.MutableEntry<String, String> = mapSaya.entries.first()
    val previousValue = entry.setValue("NilaiBaru")
    println("Mengubah nilai entri menjadi 'NilaiBaru', Nilai Sebelumnya: $previousValue, Map: $mapSaya")
}