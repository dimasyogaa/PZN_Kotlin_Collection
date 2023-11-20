package _10_Operasi_Collection._16_18_Filtering._18_Testing.app

/**
 * Filtering : Testing
 * ● Filtering testing adalah operation yang bisa digunakan untuk mengecek isi data dari collection
 * ● Hasil dari filtering testing adalah boolean, dimana true jika sesuai kondisi, dan false jika tidak sesuai kondisi
 *
 * Filtering : Testing Operation
 *
 * any((T) -> Boolean) :
 * Boolean Mengecek apakah minimal ada satu data sesuai dengan kondisi
 *
 * none((T) -> Boolean) :
 * Boolean Mengecek apakah tidak ada satupun data sesuai dengan kondisi
 *
 * all((T) -> Boolean) :
 * Boolean Mengecek apakah semua data sesuai dengan kondisi
 *
 * any()
 * Apakah collection memiliki data
 *
 * none()
 * Apakah collection tidak punya data
 */

fun main() {

    val names = listOf("Yoga", "Dimas","Pambudi")
    println(names.any {it.length > 5 } )
    println(names.none {it.length > 5 } )
    println(names.all {it.length > 5 } )
    println(names.any() )
    println(names.none())

}