package _10_Operasi_Collection._21_24_Retrieving_Collection_Parts._24_Windowed.app

import _MyHelper.MyHelper.spaceLine

/**
 * Windowed Operation
 * ● Windowed adalah operasi untuk mendapatkan semua kemungkinan collection sesuai dengan
 * range yang telah ditentukan
 *
 * Windowed Operator
 *
 * windowed(size, step, partialWindow)
 * Mengambil semua kemungkinan collection sebesar size, dilanjut dengan step, dan
 * diakhiri dengan partialWindow
 *
 * windowed(size, step, partialWindow, transform)
 * Sama seperti windowed() sebelumnya, namun hasil collection di transform
 */

fun main() {

    // val range =(1..5).toList()
    val range =(1..10).toList()


    println(range.windowed(3, 1, false))
    // [[1, 2, 3], [2, 3, 4], [3, 4, 5]]

    println(range.windowed(3, 1, false) {it.size})
    // [3, 3, 3]

    spaceLine()

    println(range.windowed(3, 1, true))
    // [[1, 2, 3], [2, 3, 4], [3, 4, 5], [4, 5], [5]]

    println(range.windowed(3, 1, true) {it.size})
    // [3, 3, 3, 2, 1]

    spaceLine()

    println(range.windowed(3, 2, false))
    // [[1, 2, 3], [3, 4, 5]]

    println(range.windowed(3, 2, true))
    // [[1, 2, 3], [3, 4, 5], [5]]

    spaceLine()

    println(range.windowed(3, 3, false))
    // [[1, 2, 3]]

    println(range.windowed(3, 3, true))
    // [[1, 2, 3], [4, 5]]

    spaceLine()

    println(range.windowed(3, 4, true))
    // [[1, 2, 3], [5]]

}
