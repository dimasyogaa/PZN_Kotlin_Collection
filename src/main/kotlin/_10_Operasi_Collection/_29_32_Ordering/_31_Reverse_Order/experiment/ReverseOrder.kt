package _10_Operasi_Collection._29_32_Ordering._31_Reverse_Order.experiment

fun main() {
    val words = listOf("apple", "banana", "orange", "grape", "melon")

    val reversed = words.reversed()
    println("Reversed order: $reversed") // Output: Reversed order: [melon, grape, orange, banana, apple]

    val original = mutableListOf("pineapple", "pear", "peach")
    val reversedView = original.asReversed()
    original.add("plum")

    println("View order after original change: $reversedView") // Output: View order after original change: [plum, peach, pear, pineapple]
}

