package _10_Operasi_Collection._33_Aggregate._34_Fold_Reduce.experiment

import _MyHelper.MyHelper.spaceLine

/**
 *
 * Operator fold dan reduce memungkinkan iterasi melalui elemen-elemen dalam suatu koleksi dan mengembalikan hasil agregasi. Berikut adalah penjelasan operasi-operasi tersebut:
 *
 * Reduce Operator
 * reduce((R, T) -> R): R
 * Pada iterasi pertama, R adalah elemen pertama, T adalah elemen selanjutnya.
 * Iterasi selanjutnya, R adalah hasil dari iterasi sebelumnya.
 * Operasi ini menghasilkan nilai akhir yang merupakan agregat dari seluruh elemen.
 *
 * Fold Operator
 * fold(R, (R, T) -> R): R
 * fold mirip dengan reduce, namun memiliki nilai awal R yang dapat ditentukan secara manual.
 * Nilai R inisial ini digunakan sebagai nilai akumulator pada iterasi pertama.
 * Hasil akhirnya juga merupakan hasil agregat dari seluruh elemen, tetapi dimulai dari nilai awal yang ditentukan.
 *
 * ReduceRight & FoldRight
 * reduceRight() dan foldRight()
 * Sama dengan reduce() dan fold(), namun iterasinya dimulai dari elemen terakhir menuju elemen pertama.
 *
 * ReduceIndexed & FoldIndexed
 * reduceIndexed() dan foldIndexed()
 * Sama dengan reduce() dan fold(), namun menyertakan indeks sebagai parameter.
 *
 * ReduceRightIndexed & FoldRightIndexed
 * reduceRightIndexed() dan foldRightIndexed()
 * Sama dengan reduceIndexed() dan foldIndexed(), namun iterasinya dimulai dari elemen terakhir menuju elemen pertama.
 */


val numbers = listOf(1, 2, 3, 4, 5)

fun main() {

    println("numbers: $numbers")

    spaceLine()

    println("REDUCE")

    reduce()

    reduceRight()

    reduceIndexed()

    reduceRightIndexed()

    spaceLine()

    println("FOLD")

    fold()

    foldRight()

    foldIndexed()

    foldRightIndexed()


}


private fun reduce() {

    // Menggunakan reduce untuk menjumlahkan seluruh elemen dalam list
    val totalSum = numbers.reduce { acc, num -> acc + num }
    println("Total sum: $totalSum") // Output: Total sum: 15

}

private fun reduceRight() {

    // Menggunakan reduceRight untuk menjumlahkan dari elemen terakhir ke elemen pertama
    val rightTotalSum = numbers.reduceRight { acc, num -> acc + num }
    println("Right total sum: $rightTotalSum") // Output: Right total sum: 15

}

private fun reduceIndexed() {

    // Menggunakan reduceIndexed untuk menjumlahkan nilai dengan menggunakan indeks
    val totalReduceIndexed = numbers.reduceIndexed { index, acc, num ->
        // index pada reducIndexed dimulai dari 1
        print("index $index, acc $acc, num $num | ")
        if (index % 2 == 0) acc + num else acc - num
    }
    println("Total reduceIndexed: $totalReduceIndexed") // Output: Total reduceIndexed: 3

    /**
     * Iterasi pertama: index = 1, acc = 1 (nilai awal), num = 2. Karena index bukan bilangan genap, acc - num = 1 - 2 = -1.
     * Iterasi kedua: index = 2, acc = -1, num = 3. Karena index adalah bilangan genap, acc + num = -1 + 3 = 2.
     * Iterasi ketiga: index = 3, acc = 2, num = 4. Karena index bukan bilangan genap, acc - num = 2 - 4 = -2.
     * Iterasi keempat: index = 4, acc = -2, num = 5. Karena index adalah bilangan genap, acc + num = -2 + 5 = 3.
     * Dengan itu, hasil akhir dari reduksi menggunakan indeks yang dimulai dari 1 adalah 3.
     */

}

private fun reduceRightIndexed() {

    // Menggunakan reduceRightIndexed untuk menjumlahkan dari elemen terakhir ke elemen pertama dengan menggunakan indeks
    val totalReduceRightIndexed = numbers.reduceRightIndexed { index, num, acc ->
        print("index $index, num $num, acc $acc | ")
        if (index % 2 == 0) acc + num else acc - num
    }
    println("Total reduceRightIndexed: $totalReduceRightIndexed") // Output: Total reduceRightIndexed: 3

}



private fun fold() {

    // Menggunakan fold dengan nilai awal 10 untuk menjumlahkan seluruh elemen dalam list
    val totalFoldSum = numbers.fold(10) { acc, num -> acc + num }
    println("Total fold sum: $totalFoldSum") // Output: Total fold sum: 25

}

fun foldRight() {

    // Menggunakan foldRight dengan nilai awal 10 untuk menjumlahkan dari elemen terakhir ke elemen pertama
    val rightTotalFoldSum = numbers.foldRight(10) { acc, num -> acc + num }
    println("Right total fold sum: $rightTotalFoldSum") // Output: Right total fold sum: 25

}

fun foldIndexed() {

    // Menggunakan foldIndexed dengan nilai awal 10 untuk menjumlahkan nilai dengan menggunakan indeks
    val totalFoldIndexed = numbers.foldIndexed(10) { index, acc, num ->
        // index dimulai dari 0
        print("index $index, acc $acc, num $num | ")
        if (index % 2 == 0) acc + num else acc - num
    }
    println("Total foldIndexed: $totalFoldIndexed") // Output: Total foldIndexed: 13

}

fun foldRightIndexed() {


    // Menggunakan foldRightIndexed dengan nilai awal 10 untuk menjumlahkan dari elemen terakhir ke elemen pertama dengan menggunakan indeks
    val totalFoldRightIndexed = numbers.foldRightIndexed(10) { index, num, acc ->
        print("index $index, num $num, acc $acc | ")
        if (index % 2 == 0) acc + num else acc - num
    }
    println("Total foldRightIndexed: $totalFoldRightIndexed") // Output: Total foldRightIndexed: 13

}

