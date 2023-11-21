package _10_Operasi_Collection._21_24_Retrieving_Collection_Parts._24_Windowed.experiment

/**
 * Windowed operation memungkinkan Anda untuk membagi koleksi data menjadi jendela-jendela berukuran tertentu. Ini seperti melihat potongan data yang bergeser-geser dalam koleksi Anda.
 *
 * Misalnya, jika Anda memiliki daftar nilai [10, 20, 30, 40, 50] dan Anda menggunakan windowed operation dengan ukuran jendela 3 dan langkah 1, Anda akan mendapatkan jendela-jendela berurutan seperti [10, 20, 30], [20, 30, 40], [30, 40, 50]. Ini memungkinkan Anda untuk melihat bagaimana nilai-nilai tersebut berubah dari satu potongan ke potongan lainnya dalam rentang tertentu. Anda bisa menggunakan ini untuk melakukan analisis data berurutan atau menghitung statistik dalam potongan data tertentu.
 *
 * Partial window dalam konteks fungsi windowed mengacu pada pengaturan yang menentukan apakah jendela yang dihasilkan dapat memiliki panjang kurang dari yang ditentukan jika mencapai akhir koleksi.
 *
 * Misalnya, jika Anda memiliki daftar [1, 2, 3, 4, 5] dan menggunakan fungsi windowed(3, 2, true), ini akan menghasilkan jendela berukuran 3 dengan langkah 2 seperti [1, 2, 3], [3, 4, 5]. Dalam pengaturan partial window yang diaktifkan (true), jendela terakhir akan memiliki panjang kurang dari 3 karena telah mencapai akhir koleksi.
 *
 * Jika partial window tidak diizinkan (false), jendela terakhir harus memiliki panjang yang sama dengan ukuran yang ditentukan (dalam kasus ini, 3), dan jika tidak memungkinkan untuk membuat jendela sepanjang itu, maka jendela terakhir tidak akan dibuat.
 */

fun main() {
    val numbers = (1..10).toList() // Contoh list angka dari 1 sampai 10

    // Mengambil kemungkinan sub-list dengan ukuran 3, dengan langkah 2, dan partialWindow true
    val windowedNumbers = numbers.windowed(3, 2, true)
    println("Windowed by 3 with step 2 and partial window: $windowedNumbers")
    // Output: Windowed by 3 with step 2 and partial window: [[1, 2, 3], [3, 4, 5], [5, 6, 7], [7, 8, 9], [9, 10]]

    // Mengambil kemungkinan sub-list dengan ukuran 3, dengan langkah 2, partialWindow true, dan menggabungkan elemen
    val transformedWindowedNumbers = numbers.windowed(3, 2, true) { it.joinToString(", ") }
    println("Transformed windowed by 3 with step 2 and partial window: $transformedWindowedNumbers")
    // Output: Transformed windowed by 3 with step 2 and partial window: [1, 2, 3, 3, 4, 5, 5, 6, 7, 7, 8, 9, 9, 10]
}
