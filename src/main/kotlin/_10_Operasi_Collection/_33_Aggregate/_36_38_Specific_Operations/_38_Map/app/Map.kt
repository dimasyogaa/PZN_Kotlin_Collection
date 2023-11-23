package _10_Operasi_Collection._33_Aggregate._36_38_Specific_Operations._38_Map.app

/**
 * Map Specific Operations
 * ● Di kotlin juga terdapat banyak operasi yang khusus untuk Map
 *
 * Map Specific Operator
 *
 * getOrElse(key, (key) -> V)
 * Mengambil value sesuai key, jika tidak ada eksekusi lambda
 *
 * getValue(key)
 * Mengambil value sesuai key, atau throw exception
 *
 * filter((Entry<K,V>) -> Boolean)
 * Filter sesuai kondisi key maupun value
 *
 * filterKeys((K) -> Boolean)
 * Filter dengan hanya kondisi key
 *
 * filterValues((V) -> Boolean)
 * Filter dengan hanya kondisi value
 */

fun main() {


    val namesMap = mapOf(
        "a" to "Yoga",
        "b" to "Dimas",
        "c" to "Pambudi",
        "d" to "Johnson"
    )

    // 1. getValue(key)
    val getValue = namesMap.getValue("a")
    println("getValue : $getValue") // Yoga

    // 2. getOrElse(key, (key) -> V)
    val getOrElse = namesMap.getOrElse("e") { "Up,key d not found"}
    println("getOrElse : $getOrElse") // Up,key d not found

    // 3. filter((Entry<K,V>) -> Boolean)
    val filter = namesMap.filter { (key, value) -> value.length > 5 }
    println("filter : $filter") // {c=Pambudi, d=Johnson}

    // 4. filterKeys((K) -> Boolean)
    val filterKeys = namesMap.filterKeys { key -> key > "b" }
    println("filterKeys : $filterKeys") // {c=Pambudi, d=Johnson}

    // 5. filterKeys((V) -> Boolean)
    val filterValues = namesMap.filterValues { value -> value.length in 5..6 }
    println("filterValues : $filterValues") // {b=Dimas}

}