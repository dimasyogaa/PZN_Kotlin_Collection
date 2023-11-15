package _2_List

import _MyHelper.MyHelper.spaceLine

/**
 * elements: Collection<E> => ini merupakan elemennya bukan index-nya
 */

fun main() {
    // Membuat MutableList dengan elemen awal
    val myMutableList: MutableList<Int> = mutableListOf(100, 200, 300, 400, 500)

    // Modification Operations
    println("Modification Operations")
    // 1. add(element: E)
    myMutableList.add(6)
    println("1. add(6): $myMutableList")

    // 2. remove(element: E)
    myMutableList.remove(400)
    println("2. remove(400): $myMutableList")

    spaceLine()

    // Bulk Modification Operations
    println("Bulk Modification Operations")
    // 3. addAll(elements: Collection<E>)
    myMutableList.addAll(listOf(70, 88, 99))
    println("3. addAll(listOf(70, 88, 99)): $myMutableList")

    // 4. addAll(index: Int, elements: Collection<E>)
    myMutableList.addAll(2, listOf(10, 11, 12))
    println("4. addAll(2, listOf(10, 11, 12)): $myMutableList")

    // 5. removeAll(elements: Collection<E>)
    myMutableList.removeAll(listOf(88, 99))
    println("5. removeAll(listOf(88, 99)): $myMutableList")

    // 6. retainAll(elements: Collection<E>)
    myMutableList.retainAll(listOf(100, 200, 300))
    println("6. retainAll(listOf(100, 200, 300)): $myMutableList")

    // 7. clear()
    myMutableList.clear()
    println("7. clear(): $myMutableList")

    spaceLine()

    // Positional Access Operations
    println("Positional Access Operations")
    // 8. set(index: Int, element: E)
    myMutableList.addAll(listOf(100, 200, 300, 400, 500))
    myMutableList[2] = 1500
    println("8a. myMutableList[2] = 1500: $myMutableList")
    myMutableList.set(2, 5000)
    println("8b. set(2, 5000): $myMutableList")

    // 9. add(index: Int, element: E)
    myMutableList.add(1, 50)
    println("9. add(1, 50): $myMutableList")

    // 10. removeAt(index: Int)
    myMutableList.removeAt(3)
    println("10. removeAt(3): $myMutableList")

    spaceLine()

    // List Iterators
    println("List Iterators")
    // 11. listIterator()
    val listIterator = myMutableList.listIterator()
    println("listIterator.hasNext() = ${listIterator.hasNext()}")
    while (listIterator.hasNext()) {
        println("ListIterator: ${listIterator.next()}")
    }

    println()

    // 12. listIterator(index: Int)
    val listIteratorAtIndex = myMutableList.listIterator(2)
    println("listIteratorAtIndex.hasNext() = ${listIteratorAtIndex.hasNext()}")
    while (listIteratorAtIndex.hasNext()) {
        println("ListIterator from index 2 to end: ${listIteratorAtIndex.next()}")
    }

    // View
    // 13. subList(fromIndex: Int, toIndex: Int)
    // toIndex = 4 => artinya, index ke- 3 yang akan diambil
    val subList = myMutableList.subList(1, 4)
    println("SubList(1, 4): $subList")
}