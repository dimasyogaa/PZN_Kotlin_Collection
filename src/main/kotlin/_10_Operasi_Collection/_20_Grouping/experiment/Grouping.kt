package _10_Operasi_Collection._20_Grouping.experiment

import _MyHelper.MyHelper.spaceLine

data class Person(val name: String, val age: Int)

private val people = listOf(
    Person("Alice", 20),
    Person("Bob", 25),
    Person("Charlie", 20),
    Person("David", 25)
)

fun main() {


    groupBy()

    spaceLine()

    groupingBy()



}

private fun groupBy() {

    val groupedByAge = people.groupBy { it.age }
    println(groupedByAge)

    /* output :
    {
    20=[Person(name=Alice, age=20), Person(name=Charlie, age=20)],
    25=[Person(name=Bob, age=25), Person(name=David, age=25)]
    }
     */
}

private fun groupingBy() {
    val groupedByAge = people.groupingBy { it.age }.eachCount()
    println(groupedByAge)

    /* output :
     {20=2, 25=2}

    groupingBy mengembalikan objek Grouping yang memungkinkan operasi lanjutan pada hasil pengelompokkan, seperti penggunaan fungsi agregat atau pemrosesan lanjutan lainnya.

     Dalam contoh ini, groupingBy digunakan untuk mengelompokkan orang-orang berdasarkan usia mereka, dan hasilnya adalah objek Grouping. Kemudian, menggunakan eachCount() pada objek Grouping untuk menghitung jumlah orang dalam setiap kelompok usia. Outputnya akan menampilkan jumlah orang dalam setiap kelompok usia dalam bentuk Map.
     */
}

