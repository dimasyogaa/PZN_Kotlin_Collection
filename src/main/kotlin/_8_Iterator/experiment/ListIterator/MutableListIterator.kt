package _8_Iterator.experiment.ListIterator

fun main() {
    val myMutableList = mutableListOf("Apple", "Orange", "Banana")
    val listIterator = myMutableList.listIterator()

    while (listIterator.hasNext()) {
        val element = listIterator.next()
        if (element == "Orange") {
            listIterator.set("Mango")
            listIterator.add("Peach")
        }
    }

    println("Modified List: $myMutableList")
}
