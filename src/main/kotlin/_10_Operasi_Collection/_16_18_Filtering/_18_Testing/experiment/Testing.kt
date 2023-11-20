package _10_Operasi_Collection._16_18_Filtering._18_Testing.experiment

fun main() {
    val numbers = listOf(1, 2, 3, 4, 5)

    val hasEvenNumber = numbers.any { it % 2 == 0 }
    val allEvenNumbers = numbers.all { it % 2 == 0 }
    val noEvenNumber = numbers.none { it % 2 == 0 }

    val emptyList = emptyList<Int>()
    val hasData = emptyList.any()
    val hasNoData = emptyList.none()

    println("Apakah ada angka genap di dalam koleksi? $hasEvenNumber")
    println("Apakah semua angka dalam koleksi genap? $allEvenNumbers")
    println("Apakah tidak ada angka genap di dalam koleksi? $noEvenNumber")
    println("Apakah ada data di dalam emptyList? $hasData")
    println("Apakah tidak ada data di dalam emptyList? $hasNoData")
}
