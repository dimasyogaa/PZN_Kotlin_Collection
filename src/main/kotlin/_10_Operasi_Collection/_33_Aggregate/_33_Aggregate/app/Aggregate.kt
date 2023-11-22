package _10_Operasi_Collection._33_Aggregate._33_Aggregate.app

/**
 * Aggregate
 * ● Kotlin memiliki berbagai operasi untuk melakukan aggregate
 *
 * Aggregate Operator
 *
 * max() dan min()
 * Mengambil nilai maksimal dan minimum
 *
 * average()
 * Mengambil nilai rata-rata
 *
 * sum()
 * Mengambil nilai jumlah seluruh element
 *
 * count()
 * Mengambil berapa banyak element
 *
 * maxBy(selector) dan minBy(selector)
 * Mengambil nilai maksimal dan minimum sesuai selector
 *
 * maxWith(Comparator) dan minWith(Comparator)
 * Mengambil nilai maksimal dan minimum sesuai comparator
 *
 * sumBy(selector)
 * Mengambil nilai jumlah seluruh element sesuai selector
 *
 * sumByDouble(selector)
 * Sama dengan sumBy() namun menghasilkan Double
 */

fun main() {
    val numbers = listOf(10, 5, 7, 20, 3, 15)

    println("numbers : $numbers")

    val maxValue = numbers.max()
    val minValue = numbers.min()
    val averageValue = numbers.average()
    val sumOfValues = numbers.sum()
    val countOfValues = numbers.count()

    val maxValueBy = numbers.maxByOrNull { it } // Mengambil nilai maksimal
    val minValueBy = numbers.minByOrNull { it } // Mengambil nilai minimal

    val sumByResult = numbers.sumBy { it * 2 } // Mengambil jumlah setelah dikali 2
    val sumByDoubleResult = numbers.sumByDouble { it.toDouble() / 2 } // Mengambil jumlah setelah dibagi 2 (menghasilkan nilai Double)

    println("Max value: $maxValue")
    println("Min value: $minValue")
    println("Average value: $averageValue")
    println("Sum of values: $sumOfValues")
    println("Count of values: $countOfValues")
    println("Max value by: $maxValueBy")
    println("Min value by: $minValueBy")
    println("Sum by result: $sumByResult")
    println("Sum by double result: $sumByDoubleResult")
}
