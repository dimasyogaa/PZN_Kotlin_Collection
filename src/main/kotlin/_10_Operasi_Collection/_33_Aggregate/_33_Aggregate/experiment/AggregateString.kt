package _10_Operasi_Collection._33_Aggregate._33_Aggregate.experiment

fun main() {
    val words = listOf("apple", "banana", "orange", "grape", "melon")

    val longestWord = words.maxByOrNull { it.length }
    val shortestWord = words.minByOrNull { it.length }

    val wordCount = words.count()
    val wordLengthSum = words.sumOf { it.length }

    println("Longest word: $longestWord (${longestWord?.length})")
    println("Shortest word: $shortestWord (${shortestWord?.length})")
    println("Word count: $wordCount")
    println(
        "Total word length: $wordLengthSum <= " +
                words
                    .map { it.length }
                    .joinToString(" + ")
    )
}
