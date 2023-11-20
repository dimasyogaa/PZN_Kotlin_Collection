package _10_Operasi_Collection._21_24_Retrieving_Collection_Parts._21_Slicing.app

import _MyHelper.MyHelper.spaceLine

/**
 * Slice Operator
 * ● Slice adalah operator yang digunakan untuk mengambil sebagian element yang ada di collection
 * yang sesuai dengan parameter range
 *
 * Slice Operators
 * slice(range) Mengambil sebagian element yang ada di collection sesuai dengan index range
 */

fun main() {

    // membuat list angka dari 10 hingga 100
    val numbers = (10..100).toList()

    // (0..50) : index 0 sampai index 50
    val list1 = numbers.slice(0..50)
    println(list1)

    spaceLine()

    val list2 = numbers.slice(0..50 step 2)
    println(list2)

    spaceLine()

    val list3 = numbers.slice(50 downTo 0 step 2)
    println(list3)


}