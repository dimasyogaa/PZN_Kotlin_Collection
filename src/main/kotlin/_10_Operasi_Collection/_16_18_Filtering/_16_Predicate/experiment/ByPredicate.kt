package _10_Operasi_Collection._16_18_Filtering._16_Predicate.experiment

fun main() {
    val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    // 1. filter
    val filteredNumbers = numbers.filter { it % 2 == 0 }
    println("Filtered Numbers: $filteredNumbers")

    // 2. filterIndexed
    val filteredIndexedNumbers = numbers.filterIndexed { index, _ -> index % 2 == 0 }
    println("Filtered Numbers at Even Indexes: $filteredIndexedNumbers")

    // 3. filterIndexedTo
    val filteredIndexedToNumbers = mutableListOf<Int>()
    numbers.filterIndexedTo(filteredIndexedToNumbers) { index, _ -> index % 3 == 0}
    println("Filtered Numbers at Indexes Divisible by 3: $filteredIndexedToNumbers")

    // 4. filterIsInstance
    val mixedList: List<Any> = listOf(1, "two", 3.0, "four", 5, "six")
    val integersOnly = mixedList.filterIsInstance<Int>()
    println("Integers Only: $integersOnly")

    // 5. filterIsInstanceTo
    val intsDestination = mutableListOf<Int>()
    mixedList.filterIsInstanceTo(intsDestination)
    println("Filtered Integers: $intsDestination")

    // 6. filterNot
    val oddNumbers = numbers.filterNot { it % 2 == 0 }
    println("Odd Numbers: $oddNumbers")

    // 7. filterNotNull
    val nullableNumbers: List<Int?> = listOf(1, null, 3, null, 5, null)
    val nonNullNumbers = nullableNumbers.filterNotNull()
    println("Non-null Numbers: $nonNullNumbers")

    // 8. filterNotNullTo
    val nonNullToDestination = mutableListOf<Int>()
    nullableNumbers.filterNotNullTo(nonNullToDestination)
    println("Filtered Non-null Numbers: $nonNullToDestination")

    // 9. filterNotTo
    val notToDestination = mutableListOf<Int>()
    numbers.filterNotTo(notToDestination) { it % 3 == 0 }
    println("Filtered Numbers Not Divisible by 3: $notToDestination")

    // 10. filterTo
    val toDestination = mutableListOf<Int>()
    numbers.filterTo(toDestination) { it % 2 == 0 }
    println("Filtered Even Numbers: $toDestination")
}
