package _10_Operasi_Collection._25_27_Retrieving_Single_Elements._25_Position.experiment

fun main() {
    val numbers = listOf(1, 2, 3, 4, 5)

    // Mengambil elemen pada posisi tertentu
    val elementAtIndex = numbers.elementAt(2)
    println("Element at index 2: $elementAtIndex")

    // Mengambil elemen pertama dan terakhir
    val firstElement = numbers.first()
    val lastElement = numbers.last()
    println("First element: $firstElement, Last element: $lastElement")

    // Mengambil elemen pada posisi tertentu, atau null jika tidak ada
    val elementOrNull = numbers.elementAtOrNull(5)
    println("Element at index 5 or null if not found: $elementOrNull")

    // Mengambil elemen pada posisi tertentu atau nilai default jika tidak ada
    val elementOrElse = numbers.elementAtOrElse(10) { 0 }
    println("Element at index 10 or default value if not found: $elementOrElse")
}
