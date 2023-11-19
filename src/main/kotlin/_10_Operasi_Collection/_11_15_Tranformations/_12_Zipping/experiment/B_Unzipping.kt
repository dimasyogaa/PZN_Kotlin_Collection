package _10_Operasi_Collection._11_15_Tranformations._12_Zipping.experiment

fun main() {

    val pairs = listOf("A" to 1, "B" to 2, "C" to 3)

    // Melakukan unzip pada pairs
    val (listA, listB) = pairs.unzip()

    println("listA: $listA")
    println("listB: $listB")


}