package _10_Operasi_Collection._33_Aggregate._34_Fold_Reduce.experiment

// fold(R, (R, T) -> R) : R
// R bertipe sama dengan R lainnya

fun main() {
    val words = listOf("Hello", "from", "the", "other", "side")

    val concatenated = words.fold("-") { acc, word ->
        "$acc $word"
    }

    val concatenated2 by lazy { words.fold(0) { acc, word ->
        print("acc : $acc, word : ${word.length} | ")
        acc + word.length
    } }

    println("Concatenated string: $concatenated")
    println("Concatenated2 : $concatenated2")
}