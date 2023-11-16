package _6_Collection.app

fun main() {

    // collection() // immutable

    iniMutableCollection() // mutable

}

private fun collection() {
    fun <T> displayCollection(collection: Collection<T>) {
        for (element in collection){
            println(element)
        }
    }

    displayCollection(listOf("Yoga", "Dimas"))
    displayCollection(mutableListOf("Yoga", "Dimas"))

    displayCollection(setOf("Yoga", "Dimas"))
    displayCollection(mutableSetOf("Yoga", "Dimas"))

    displayCollection(mapOf("y" to "Yoga").entries) // Tidak Error, karena entries me-return value Set, yang mana Set merupakan turunan Collection
    displayCollection(mutableMapOf("y" to "Yoga").entries)

    // displayCollection(mapOf("y" to "Yoga")) // Error, Map bukan turunan Collection
}

fun iniMutableCollection() {
    fun <T> displayMutableCollection(collection: MutableCollection<T>) {
        for (element in collection) println(element)
    }

    // displayMutableCollection(listOf("Yoga", "Dimas")) // error, List bukan turunan dari mutable collection
    displayMutableCollection(mutableListOf("Yoga", "Dimas"))

    // displayMutableCollection(setOf("Yoga", "Dimas")) // error, Set bukan turunan dari mutable collection
    displayMutableCollection(mutableSetOf("Yoga", "Dimas"))

    // displayMutableCollection(mapOf("y" to "Yoga").entries) // error, Map.entries bukan turunan dari mutable collection
    displayMutableCollection(mutableMapOf("y" to "Yoga").entries)

}