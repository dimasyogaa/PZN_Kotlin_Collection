package _10_Operasi_Collection._33_Aggregate._40_In_Map._40_Properties.experiment

/**
 * delegate properties hanya dapat digunakan pada val atau properties yang tidak dapat diubah.
 * Hal ini karena delegate properties mengharuskan penggunaan getter khusus yang dihasilkan
 * secara otomatis oleh Kotlin saat properti itu diakses.
 */

private class User(properties: Map<String, Any>) {
    val name: String by properties
    val age: Int by properties
    val email: String by properties
}

fun main() {
    val userProperties = mapOf(
        "name" to "John Doe",
        "age" to 30,
        "email" to "john.doe@example.com"
    )

    val user = User(userProperties)

    println("Name: ${user.name}")
    println("Age: ${user.age}")
    println("Email: ${user.email}")
}
