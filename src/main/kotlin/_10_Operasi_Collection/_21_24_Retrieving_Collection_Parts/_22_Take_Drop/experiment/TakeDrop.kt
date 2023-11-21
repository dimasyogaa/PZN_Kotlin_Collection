package _10_Operasi_Collection._21_24_Retrieving_Collection_Parts._22_Take_Drop.experiment

import _MyHelper.MyHelper.spaceLine

fun main() {
    val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    println("numbers: $numbers")

    val taken = numbers.take(3) // Mengambil 3 elemen di awal
    println("Take: $taken") // Output: Take: [1, 2, 3]

    val takeLast = numbers.takeLast(3) // Mengambil 3 elemen di akhir
    println("TakeLast: $takeLast") // Output: TakeLast: [8, 9, 10]

    val takeWhile = numbers.takeWhile { it < 5 } // Mengambil elemen dari awal selama elemen kurang dari 5
    println("TakeWhile: $takeWhile") // Output: TakeWhile: [1, 2, 3, 4]

    val takeLastWhile = numbers.takeLastWhile { it > 5 } // Mengambil elemen dari akhir selama elemen lebih dari 5
    println("TakeLastWhile: $takeLastWhile") // Output: TakeLastWhile: [10]

    spaceLine()

    println("numbers: $numbers")

    val dropped = numbers.drop(5) // Menghapus 5 elemen di awal
    println("Drop: $dropped") // Output: Drop: [6, 7, 8, 9, 10]

    val dropLast = numbers.dropLast(5) // Menghapus 5 elemen di akhir
    println("DropLast: $dropLast") // Output: DropLast: [1, 2, 3, 4, 5]

    val dropWhile = numbers.dropWhile { it < 5 } // Menghapus elemen dari awal selama elemen kurang dari 5
    println("DropWhile: $dropWhile") // Output: DropWhile: [5, 6, 7, 8, 9, 10]

    val dropLastWhile = numbers.dropLastWhile { it > 5 } // Menghapus elemen dari akhir selama elemen lebih dari 5
    println("DropLastWhile: $dropLastWhile") // Output: DropLastWhile: [1, 2, 3, 4, 5, 6]
}