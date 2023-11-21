package _10_Operasi_Collection._21_24_Retrieving_Collection_Parts._23_Chunked.app


/**
 * Chunked Operator
 * ● Chunked adalah operasi untuk memotong collection menjadi beberapa collection
 *
 * Chunked Operator
 *
 * chunked(n) : List<List<T>>
 * Memotong collection menjadi beberapa collection dengan jumlah data n
 *
 * chunked(n, (List<T>) -> R) : List<R>
 * Memotong collection menjadi beberapa collection dengan jumlah data n, lalu
 * melakukan transformasi List<T> menjadi R, sehingga menghasilkan List<R>
 */

fun main() {

    val range = (1..100).toList()

    // chunked(n) : List<List<T>>
    // dibagi menjadi 10 chunk
    val list1 = range.chunked(10)

    // chunked(n, (List<T>) -> R) : List<R>
    // menghitung total tiap chunk
    val list2 = range.chunked(10) { list: List<Int> ->
        var total = 0
        for (number in list) {
            total += number
        }
        total
    }


    // manual menggunakan map
    val list3 = range.chunked(10).map { values ->
        var total = 0
        for (number in values) {
            total += number
        }
        total
    }

    println("list1 : $list1")
    println("list2 : $list2")
    println("list3 : $list3")

}