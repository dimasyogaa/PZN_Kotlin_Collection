package _10_Operasi_Collection._11_15_Tranformations._13_Association.experiment

fun main() {
    val words = listOf("apple", "banana", "orange")

    // Menghasilkan Map dengan panjang kata sebagai nilai dan kata sebagai kunci
    val lengthMap = words.associate { it to it.length }
    println("associate: $lengthMap")

    // Menghasilkan Map dengan panjang kata sebagai nilai dan kata sebagai kunci
    val lengthMap2 = words.associateWith { it.length }
    println("associateWith: $lengthMap2")

    // Menghasilkan Map dengan huruf awal sebagai kunci dan kata sebagai nilai
    val initialMap = words.associateBy { it.first().uppercase() }
    println("associateBy: $initialMap")

}