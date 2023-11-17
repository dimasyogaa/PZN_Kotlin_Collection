package _8_Iterator.experiment.Iterator

fun main() {
    val mutableList = mutableListOf("Apple", "Orange", "Banana")
    val iterator = mutableList.iterator()

    while (iterator.hasNext()) {
        val element = iterator.next()
        if (element == "Orange") {
            iterator.remove() // Menghapus elemen "Orange" dari koleksi
        }
    }

    println("Setelah menghapus 'Orange': $mutableList")
}
