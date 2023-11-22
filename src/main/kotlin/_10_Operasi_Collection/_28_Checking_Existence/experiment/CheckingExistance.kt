package _10_Operasi_Collection._28_Checking_Existence.experiment

import _MyHelper.MyHelper.spaceLine

fun main() {
    val numbers = listOf(1, 2, 3, 4, 5)
    println("numbers : $numbers")

    val containsThree = numbers.contains(3)
    println("Contains 3: $containsThree") // Output: Contains 3: true

    spaceLine()

    val fruits = listOf("Apple", "Banana", "Orange")
    println("fruits : $fruits")

    val containsAllFruits = fruits.containsAll(listOf("Apple", "Orange"))
    println("Contains all listOf(\"Apple\", \"Orange\") fruits : $containsAllFruits") // Output: Contains all fruits: true

    val containsAllFruits2 = fruits.containsAll(listOf("apple", "orange"))
    println("Contains all listOf(\"apple\", \"orange\") fruits : $containsAllFruits2")

    val containsAllFruits3 = fruits.containsAll(listOf("apple", "arange"))
    println("Contains all listOf(\"apple\", \"arange\") fruits : $containsAllFruits3")

    val emptyList = emptyList<String>()
    println("Is empty list empty? ${emptyList.isEmpty()}") // Output: Is empty list empty? true

    val nonEmptyList = listOf("Hello")
    println("Is non-empty list empty? ${nonEmptyList.isEmpty()}") // Output: Is non-empty list empty? false
}
