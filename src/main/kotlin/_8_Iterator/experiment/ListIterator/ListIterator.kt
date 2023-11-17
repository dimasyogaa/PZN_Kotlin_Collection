package _8_Iterator.experiment.ListIterator

import _MyHelper.MyHelper.spaceLine

fun main() {
    val myList = listOf("Apple", "Orange", "Banana")
    val listIterator = myList.listIterator()

    while (listIterator.hasNext()) {
        val element = listIterator.next()
        println("Next Element: $element, Next Index: ${listIterator.nextIndex()}")
    }

    spaceLine()

    while (listIterator.hasPrevious()) {
        val element = listIterator.previous()
        println("Previous Element: $element, Previous Index: ${listIterator.previousIndex()}")
    }
}
