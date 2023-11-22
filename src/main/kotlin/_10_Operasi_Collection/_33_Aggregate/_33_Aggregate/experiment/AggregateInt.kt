package _10_Operasi_Collection._33_Aggregate._33_Aggregate.experiment

fun main() {

    val numbers = (1..3).toList()

    println(numbers.sumOf { it * 2 }) // (1 * 2) + (2 * 2) + (3 * 2) = 12

}