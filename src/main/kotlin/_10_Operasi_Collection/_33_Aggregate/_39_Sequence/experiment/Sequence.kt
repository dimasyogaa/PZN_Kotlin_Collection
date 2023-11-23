package _10_Operasi_Collection._33_Aggregate._39_Sequence.experiment

import _MyHelper.MyHelper.spaceLine

data class Person(val name: String, val age: Int)

fun main() {
    val list = listOf(1, 2, 3, 4, 5)

    val resultWithoutSequence = list
        .map { println("map $it"); it * 2 } // Operasi map
        .filter { println("filter $it"); it % 3 == 0 } // Operasi filter

    println("Hasil tanpa Sequence: $resultWithoutSequence")

    spaceLine()

    val resultWithSequence = list.asSequence()
        .map { println("map $it"); it * 2 } // Operasi map (lazy)
        .filter { println("filter $it"); it % 3 == 0 } // Operasi filter (lazy)
        .toList() // Mengubah kembali ke List setelah semua operasi dijalankan

    println("Hasil dengan Sequence: $resultWithSequence")

    spaceLine()

    // Contoh Sequence pada objek Person
    val people = listOf(
        Person("Alice", 25),
        Person("Bob", 30),
        Person("A1", 35),
        Person("A2", 30),
        Person("Charlie", 20),
        Person("David", 25)
    )

    val sequenceResult = people.asSequence()
        .map { println("map $it"); it.name }
        .filter { println("filter $it"); it.startsWith("A") }
        .toList()

    println("Hasil Sequence pada objek Person: $sequenceResult")
}