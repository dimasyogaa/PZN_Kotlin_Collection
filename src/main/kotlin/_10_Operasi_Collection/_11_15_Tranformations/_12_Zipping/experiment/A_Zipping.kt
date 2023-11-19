package _10_Operasi_Collection._11_15_Tranformations._12_Zipping.experiment

fun main() {

    val list1 = listOf("A", "B", "C")
    val list2 = listOf(1, 2, 3)

    // Operasi zipping tanpa transformasi
    val zipped = list1.zip(list2)
    println("Hasil zipping tanpa transformasi: $zipped")

    // Operasi zipping dengan transformasi, menggabungkan string dengan integer
    val zippedWithTransform = list1.zip(list2) { str, int -> "$str$int" }
    println("Hasil zipping dengan transformasi: $zippedWithTransform")


}