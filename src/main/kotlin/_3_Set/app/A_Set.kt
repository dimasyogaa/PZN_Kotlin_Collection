package _3_Set.app

import _3_Set.data.Person

/**
 * Set
 * ● Set, adalah collection yang datanya harus unik dan tidak pasti berurut
 * ● Saat kita memasukkan data duplicate ke Set, maka data hanya akan disimpan satu, data
 * duplicatenya tidak akan ditambahkan ke dalam Set
 * ● Set sangat cocok untuk menyimpan data yang emang unik, tidak boleh sama
 * ● Set menggunakan function hashCode() dan equals() untuk membandingkan apakah sebuah object
 * sama atau tidak, jika hashCode() dan equals() nya sama, maka diangkap data tersebut duplicate,
 * dan tidak akan diterima oleh Set
 * tidak bisa manual menggunakan get index, karena tidak ada index
 *
 * Set : immutable
 * MutableList : mutable
 *
 * Interface -> method :
 * Set -> setOf()
 * MutableSet -> mutableSetOf()
 */

fun main() {

    // set() // immutable

    iniMutableSet() // mutable



}

private fun set() {
    val mySet :Set<Person> = setOf(
        Person("Dimas"),
        Person("Dimas"),
        Person("Pambudi"),
        Person("Yoga"),
        Person("Dimas"),
    )

    println(mySet.size) // 3
    println(mySet.contains(Person("Dimas"))) // true

    for (person in mySet){
        println(person)
    }
}

private fun iniMutableSet() {

    val myMutableSet: MutableSet<Person> = mutableSetOf()

    myMutableSet.add(Person("Yoga"))
    myMutableSet.add(Person("Dimas"))
    myMutableSet.add(Person("Pambudi"))
    myMutableSet.add(Person("Yoga"))
    myMutableSet.add(Person("Dimas"))
    myMutableSet.add(Person("Pratama"))


    for (person in myMutableSet) {
        println(person)
    }

}

