package _10_Operasi_Collection._29_32_Ordering._30_Custom_Order.experiment

import _MyHelper.MyHelper.spaceLine

data class Fruit(val name: String, val quantity: Int)

fun main() {
    // Data buah-buahan
    val fruits = listOf(
        Fruit("Banana", 8),
        Fruit("Grapes", 20),
        Fruit("Watermelon", 5),
    )

    // 1. Menggunakan sortedBy untuk mengurutkan secara naik berdasarkan jumlah buah
    val ascendingOrder = fruits.sortedBy { it.quantity }
    println("Ascending Order : $ascendingOrder")

    // 2. Menggunakan sortedByDescending untuk mengurutkan secara menurun berdasarkan jumlah buah
    val descendingOrder = fruits.sortedByDescending { it.quantity }
    println("Descending Order : $descendingOrder")

    // Output terpisah untuk memisahkan hasil
    spaceLine()

    // 3. Menggunakan sortedWith dengan compareBy untuk mengurutkan naik berdasarkan jumlah buah
    val sortedWithCompareBy = fruits.sortedWith(compareBy { it.quantity })
    println("Sorted with compareBy: $sortedWithCompareBy")

    // 4. Menggunakan sortedWith dengan compareByDescending untuk mengurutkan menurun berdasarkan jumlah buah
    val sortedWithCompareByDesc = fruits.sortedWith(compareByDescending { it.quantity })
    println("Sorted with compareByDescending: $sortedWithCompareByDesc")

    spaceLine()

    // 5. Menggunakan sortedWith dengan Lambda Comparator untuk mengurutkan naik berdasarkan jumlah buah
    val sortedWithComparator = fruits.sortedWith{ a, b ->
        a.quantity.compareTo(b.quantity)
    }
    println("Sorted with Comparator: $sortedWithComparator")
}


