package _10_Operasi_Collection._16_18_Filtering._17_Partitioning.experiment

/**
Partitioning adalah operasi yang membagi sebuah collection menjadi dua berdasarkan kondisi filter yang diberikan. Ini memisahkan collection menjadi dua bagian: satu bagian yang memenuhi kondisi filter dan satu bagian lagi yang tidak.

Operasi Partitioning:

partition((T) -> Boolean): Pair<List<T>, List<T>>
Mempartisi collection dengan filter yang diberikan, menghasilkan pasangan nilai (Pair) yang terdiri dari dua collection:

Collection yang memenuhi kondisi filter.
Collection yang tidak memenuhi kondisi filter.

*/


fun main() {
    val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val (evenNumbers, oddNumbers) = numbers.partition { it % 2 == 0 }

    println("Bilangan genap: $evenNumbers")
    println("Bilangan ganjil: $oddNumbers")
}