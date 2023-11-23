package _10_Operasi_Collection._33_Aggregate._36_38_Specific_Operations._37_Set.experiment

fun main() {
    // Union
    val set1 = setOf(1, 2, 3)
    val set2 = setOf(3, 4, 5)

    val unionSet = set1.union(set2)
    println("Union set: $unionSet") // Output: Union set: [1, 2, 3, 4, 5]

    // Intersect
    val intersectSet = set1.intersect(set2)
    println("Intersect set: $intersectSet") // Output: Intersect set: [3]

    // Subtract
    val subtractSet = set1.subtract(set2)
    println("Subtract set: $subtractSet") // Output: Subtract set: [1, 2]
}














