package _10_Operasi_Collection._11_15_Tranformations._11_Mapping.app

import _MyHelper.MyHelper.spaceLine

/**
 * Transformations : Mapping
 * ● Transformasi mapping digunakan untuk mengubah data ke data lain.
 * ● Mapping akan membutuhkan lambda function sebagai parameter, dan akan mengembalikan
 * collection hasil result lambda nya
 * ● Urutan collection baru hasil dari mapping adalah sama dengan urutan collection aslinya.
 *
 * listOf<String> diubah menjadi listOf<Int> dinamakan prses transformasi
 *
 * Transformations : Mapping Operations
 *
 * map(transform: (T) -> R)
 * Mengubah collection menjadi collection baru sesuai lambda transform
 *
 * mapIndexed(transform: (index, T) -> R)
 * Mengubah collection menjadi collection baru, dengan tambahan parameter index
 *
 * mapNotNull(transform : (T) -> R) Sama seperti map(), namun menghiraukan hasil null
 *
 * mapIndexedNotNull( transform : (index, T) -> R) Sama seperti mapIndexed(), namun menghiraukan nilai null
 */

fun main() {


    manual()

    spaceLine()

    withMapping()

}




private fun manual() {

    val list: List<String> = listOf("Yoga", "Dimas", "Pambudi")

    val temp = mutableListOf<String>()

    for (value in list) {
        temp.add(value.uppercase())
    }

    val list2 = temp.toList()

    println(list2)


}

private fun withMapping() {

    val iniList: List<String> = listOf("Yoga", "Dimas", "Pambudi")

    val list2 = iniList.map { value -> value.uppercase() }
    println("list2 : $list2")

    println()

    val list3 = iniList.map { it.uppercase() }
    println("list3 : $list3")

    println()

    val set1 = setOf("Yoga", "Dimas", "Pambudi")
    val set2 = set1.map { it.lowercase() }
    println("set2 : $set2")

    spaceLine()

    val names = listOf("Yoga", "Afrizal", "Harka", "Dwi", "Bambang", "John")
    val OddIndexNames = names.mapIndexedNotNull{ index, name ->
        if (index % 2 == 0) null
        else name
    }
    println(OddIndexNames) // [Afrizal, Dwi, John]

    spaceLine()

    val numbers = (1..100).toList()
    val OddNumbers = numbers.mapNotNull {
        if (it % 2 == 0) null
        else it
    }
    println(OddNumbers)



}

