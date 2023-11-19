package _10_Operasi_Collection._10_Pendahuluan.app


import _MyHelper.MyHelper.spaceLine

fun main() {

    // jika menggunakan for
    // for (value in listOf("Yoga", "Dimas", "Pambudi")) println(value)

    // spaceLine()

    // menngunakan extension function forEach
    // listOf("Yoga", "Dimas", "Pambudi").forEach({ println(it) })
    listOf("Yoga", "Dimas", "Pambudi").forEach { println(it) }

    spaceLine()

    mutableListOf("Yoga", "Dimas", "Pambudi").forEachIndexed { index, value ->
        println("$index : $value")
    }

    // forEach bisa digunakan pada semua kelas turunan Iterable
}