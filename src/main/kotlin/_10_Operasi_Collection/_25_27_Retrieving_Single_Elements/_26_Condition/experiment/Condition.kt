package _10_Operasi_Collection._25_27_Retrieving_Single_Elements._26_Condition.experiment

import _MyHelper.MyHelper.spaceLine

fun main() {
    val numbers = listOf(1, 2, 3, 4, 5)

    // Mengambil elemen pertama yang memenuhi kondisi
    val firstEven = numbers.first { it % 2 == 0 }
    println("First even number: $firstEven")

    // Mengambil elemen terakhir yang memenuhi kondisi
    val lastOdd = numbers.last { it % 2 != 0 }
    println("Last odd number: $lastOdd")

    // Mengambil elemen pertama yang memenuhi kondisi, atau null jika tidak ada
    val firstGreaterThanTen = numbers.firstOrNull { it > 10 }
    println("First number greater than 10 or null if not found: $firstGreaterThanTen")

    // Mengambil elemen terakhir yang memenuhi kondisi, atau null jika tidak ada
    val lastLessThanThree = numbers.lastOrNull { it < 3 }
    println("Last number less than 3 or null if not found: $lastLessThanThree")

    spaceLine()

    // find() & findLast()
    data class Person(val name: String, val age: Int)

    val people = listOf(
        Person("Alice", 25),
        Person("Bob", 30),
        Person("Charlie", 35),
        Person("Diana", 28)
    )

    // Mencari orang pertama yang usianya di atas 30
    val firstPersonAbove30 = people.find { it.age > 30 }
    println("First person above 30: $firstPersonAbove30")

    // Mencari orang terakhir yang usianya di bawah 30
    val lastPersonBelow30 = people.findLast { it.age < 30 }
    println("Last person below 30: $lastPersonBelow30")
}



