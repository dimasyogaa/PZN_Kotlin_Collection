package _10_Operasi_Collection._33_Aggregate._34_Fold_Reduce.app

/**
 * Fold & Reduce
 * ● Jika kita ingin membuat aggregate secara manual, kita bisa menggunakan operator fold dan reduce
 * ● Fold dan reduce merupakan operasi yang dilakukan pada element-element yang ada di collection
 * secara iterasi sequential dan mengembalikan hasil.
 * ● Hasil dari fold dan reduce akan digunakan untuk iterasi selanjutnya.
 *
 * Fold & Reduce Operator (1)
 *
 * reduce((R, T) -> R) : R
 * Pada iterasi pertama, R adalah element pertama, T adalah element selanjutnya.
 * Iterasi selanjutnya, R adalah hasil dari iterasi sebelumnya
 *
 *
 *
 * fold(R, (R, T) -> R) : R
 * fold sama dengan reduce, yang membedakan adalah,
 * fold memiliki inisial value R yang bisa kita masukkan secara manual
 *
 * reduceRight() & foldRight()
 * Sama seperti reduce() dan fold() namun dimulai dari element akhir
 *
 * reduceIndexed() & foldIndexed()
 * Sama seperti reduce() dan fold() namun terdapat parameter index
 *
 * reduceRightIndexed() & foldRightIndexed()
 * Sama seperti reduceIndexed() dan foldIndexed() namun dimulai dari element akhir
 *
 * Gunakan reduce ketika Anda yakin bahwa koleksi tidak kosong dan Anda tidak perlu menyediakan nilai awal untuk accumulator.
 * Gunakan fold ketika koleksi mungkin kosong atau ketika Anda ingin menyediakan nilai awal untuk accumulator.
 */

fun main() {

    val numbers = (1..100).toList().shuffled()

    /**
     * ika first lebih kecil dari second, maka nilai second yang akan menjadi elemen yang disimpan sementara. Jika tidak, nilai first akan tetap.
     */
    val max = numbers.reduce { first, second ->
        if (first < second) second
        else first
    }

    val min = numbers.reduce { first, second ->
        if (first < second) first
        else second
    }

    val sum = numbers.fold(0) { first, second ->
        first + second
    }


    println("max : $max")
    println("min : $min")
    println("sum : $sum")
    println("sum : ${numbers.sum()}")

    val names = listOf("Yoga", "Dimas", "Pambudi")
    val count = names.fold(0) { first, _ ->
        first + 1
    }
    val totalLength = names.fold(0) { total, name ->
        total + name.length
    }

    println("count : $count")
    println("count : ${names.count()}")
    println("total length names : $totalLength")

}