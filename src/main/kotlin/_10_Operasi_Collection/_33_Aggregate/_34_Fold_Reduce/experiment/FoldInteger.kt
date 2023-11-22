package _10_Operasi_Collection._33_Aggregate._34_Fold_Reduce.experiment

fun main() {
    val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8)

    // Menggunakan fold untuk mencari nilai maksimal dari bilangan genap tanpa filter
    val maxEven by lazy {

        numbers.fold(null as Int?) { acc, num ->

            print("acc : $acc, num : $num | ")

            // Memeriksa apakah elemen saat ini adalah bilangan genap
            if (num % 2 == 0) {

                // Jika acc null atau elemen saat ini lebih besar dari acc, perbarui acc dengan elemen saat ini
                if (acc == null || num > acc) num else acc

            } else {
                // Jika elemen saat ini bukan bilangan genap, biarkan acc tidak berubah
                acc
            }
        }

    }

    // Menampilkan nilai maksimal dari bilangan genap yang ditemukan dalam list
    println("\nNilai maksimal dari bilangan genap ListOf(10, 7, 15, 23, 9, 14, 28, 6): $maxEven")


    /**
     * bagaimana kode di atas beroperasi:
     *
     * Inisialisasi Variabel:
     *
     * numbers adalah list bilangan yang terdiri dari (10, 7, 15, 23, 9, 14, 28, 6).
     * Penggunaan fold:
     *
     * fold(null as Int?) digunakan untuk iterasi melalui list dengan nilai awal null.
     *
     * Variabel acc akan berperan sebagai akumulator yang akan menyimpan nilai maksimal dari bilangan genap.
     *
     * Iterasi Melalui List:
     *
     * Setiap elemen num dari numbers akan diperiksa.
     * Jika elemen saat ini (num) adalah bilangan genap (num % 2 == 0):
     * Jika acc masih null atau num lebih besar dari nilai saat ini di acc, maka acc akan diubah menjadi num. Ini adalah langkah untuk mencari nilai maksimal dari bilangan genap.
     * Jika elemen saat ini bukan bilangan genap, nilai acc tetap tidak berubah.
     * Penyimpanan Nilai Maksimal:
     *
     * Setiap kali bilangan genap ditemukan, nilai acc akan diperbarui jika bilangan tersebut lebih besar dari nilai acc sebelumnya.
     * Hasil Akhir:
     *
     * Output akan menampilkan nilai maksimal dari bilangan genap yang ditemukan dalam list.
     */
}
