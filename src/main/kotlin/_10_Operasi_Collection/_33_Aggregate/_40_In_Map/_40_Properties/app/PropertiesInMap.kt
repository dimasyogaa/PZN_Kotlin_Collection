package _10_Operasi_Collection._33_Aggregate._40_In_Map._40_Properties.app

/**
 * Properties di Map
 * ● Salah satu hal yang biasa dilakukan dalam membuat program adalah, menyimpan value properties
 * di Map
 * ● Kadang ini dilakukan ketika parsing data JSON atau hal-hal dinamis lainnya.
 * ● Dalam keadaan seperti ini, kita bisa melakukan delegate properties di Map
 *
 * nama properties harus sama dengan key yang akan diinputkan
 */

private class Application(iniMap: Map<String, Any>) {
    val name: String by iniMap
    val version: Int by iniMap
}

fun main() {

    val application = Application(mapOf(
        "nama" to "Kotlin App",
        "version" to 1.0
    ))

    println(application.name)
    println(application.version)


}

