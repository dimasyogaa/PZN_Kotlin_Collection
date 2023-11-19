package _10_Operasi_Collection._11_15_Tranformations._14_Flattening.app

import _MyHelper.MyHelper.spaceLine

/**
Transformations : Flattening
● Flattening adalah operasi transformasi untuk menjadikan nested collection menjadi flat

Transformations : Flattening Operation

flatten
Mengubah nested collection menjadi flat collection

flatMap((T) -> Iterable<R>)
Mengubah collection T menjadi flat collection R
 */

class Member(val name: String, val hobies: List<String>)

fun main() {

    val list1: List<List<String>> = listOf(
        listOf("Yoga", "Dimas", "Pambudi"),
        listOf("Programmer", "Zaman", "Now")
    )

    // Flatten()
    val list2: List<String> = list1.flatten()
    println(list2)

    spaceLine()

    // FlatMap
    val members: List<Member> = listOf(
        Member("Yoga", listOf("Reading", "Coding")),
        Member("Dimas", listOf("Gaming", "Traveling")),
    )

    // map
    // val hobies = members.map {  it.hobies } .flatten()

    // flatMap() lebih singkat
    val hobies = members.flatMap { it.hobies }

    println(hobies)

}

