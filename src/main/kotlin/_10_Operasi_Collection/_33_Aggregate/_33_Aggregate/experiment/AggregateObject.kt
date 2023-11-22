package _10_Operasi_Collection._33_Aggregate._33_Aggregate.experiment

import _MyHelper.MyHelper.spaceLine

data class Product(val name: String, val price: Double)

fun main() {
    val products = listOf(
        Product("Laptop", 1200.0),
        Product("Smartphone", 800.0),
        Product("Tablet", 500.0),
        Product("Headphones", 150.0)
    )

    // Mengambil produk termahal
    val mostExpensiveProduct = products.maxByOrNull { it.price }

    // Mengambil produk termurah
    val cheapestProduct = products.minByOrNull { it.price }

    // Menghitung rata-rata harga produk
    val averagePrice = products.map { it.price }.average()

    // Menghitung total harga semua produk
    val totalPrice = products.sumOf { it.price }

    println("Most expensive product: $mostExpensiveProduct")
    println("Cheapest product: $cheapestProduct")
    println("Average price: $averagePrice")
    println("Total price: $totalPrice")

    spaceLine()

    data class Person(val name: String, val age: Int)


    val people = listOf(
        Person("Alice", 25),
        Person("Bob", 30),
        Person("A1", 35),
        Person("A2", 30),
        Person("Charlie1", 20),
        Person("Charlie2", 29),
        Person("David", 25)
    )

    val shortestNameYoungestPerson = people.minWith(compareBy<Person> { it.name.length }.thenBy { it.age })
    println("Orang dengan nama terpendek dan umur termuda adalah: $shortestNameYoungestPerson")

    val longestNameOldestPerson = people.maxWith(compareBy<Person> { it.name.length }.thenBy { it.age })
    println("Orang dengan nama terpanjang dan umur tertua adalah: $longestNameOldestPerson")

    spaceLine()

    val shortestNameYoungestPerson2 = people.minWith(compareBy({ it.name.length }, { it.age }))
    println("Orang dengan nama terpendek dan umur termuda adalah: $shortestNameYoungestPerson2")

    val longestNameOldestPerson2 = people.maxWith(compareBy({ it.name.length }, { it.age }))
    println("Orang dengan nama terpanjang dan umur tertua adalah: $longestNameOldestPerson2")

    spaceLine()

    val shortestNameOldestPerson3 = people.minWith(compareBy({ it.name.length }, { -it.age }))
    println("Orang dengan nama terpendek dan umur tertua adalah: $shortestNameOldestPerson3")

    val longestNameYoungestPerson3 = people.maxWith(compareBy({ it.name.length }, { -it.age }))
    println("Orang dengan nama terpanjang dan umur termuda adalah: $longestNameYoungestPerson3")

}
