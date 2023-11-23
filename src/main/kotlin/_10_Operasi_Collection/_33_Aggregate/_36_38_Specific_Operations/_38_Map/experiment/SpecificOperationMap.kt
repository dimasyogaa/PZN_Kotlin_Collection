package _10_Operasi_Collection._33_Aggregate._36_38_Specific_Operations._38_Map.experiment

fun main() {
    val map = mapOf(
        1 to "One",
        2 to "Two",
        3 to "Three",
        4 to "Four"
    )

    // getOrElse
    val value = map.getOrElse(5) { "Not Found" }
    println("Value for key 5: $value") // Output: Value for key 5: Not Found

    // getValue
    val value2 = map.getValue(3)
    println("Value for key 3: $value2") // Output: Value for key 3: Three

    // filter
    val filteredEntries = map.filter { it.value.length > 3 }
    println("Filtered entries: $filteredEntries") // Output: Filtered entries: {3=Three, 4=Four}

    // filterKeys
    val filteredKeys = map.filterKeys { it % 2 == 0 }
    println("Filtered keys: $filteredKeys") // Output: Filtered keys: {2=Two, 4=Four}

    // filterValues
    val filteredValues = map.filterValues { it.contains("o") }
    println("Filtered values: $filteredValues") // Output: Filtered values: {2=Two, 4=Four}
}


