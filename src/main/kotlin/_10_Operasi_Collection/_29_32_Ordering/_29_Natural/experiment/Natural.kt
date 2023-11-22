package _10_Operasi_Collection._29_32_Ordering._29_Natural.experiment


fun main() {
    val fruits = listOf("apple", "orange", "banana", "grape", "melon")

    val ascending = fruits.sorted()
    val ascendingString = ascending.joinToString(separator = ", ")
    println("Ascending order: $ascendingString")
    // Output: Ascending order: apple, banana, grape, melon, orange

    val descending = fruits.sortedDescending()
    val descendingString = descending.joinToString(separator = ", ")
    println("Descending order: $descendingString")
    // Output: Descending order: orange, melon, grape, banana, apple
}


