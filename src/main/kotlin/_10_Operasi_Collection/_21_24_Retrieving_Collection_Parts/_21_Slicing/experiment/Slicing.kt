package _10_Operasi_Collection._21_24_Retrieving_Collection_Parts._21_Slicing.experiment

fun main() {
    val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    val slicedNumbers = numbers.slice(2..5) // Mengambil elemen dari indeks 2 hingga 5
    println(slicedNumbers) // Output: [3, 4, 5, 6]
}
