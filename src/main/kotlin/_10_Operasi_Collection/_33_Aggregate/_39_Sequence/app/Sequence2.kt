package _10_Operasi_Collection._33_Aggregate._39_Sequence.app

import _MyHelper.MyHelper.spaceLine

fun main() {

    bukanSequence()

    spaceLine()

    sequence()

}

private fun bukanSequence() {

    val words = "The quick brown fox jumps over the lazy dog".split(" ")


    val result = words
        .filter {
            println("filter : $it")
            it.length > 3
        }
        .map {
            println("map : $it")
            it.uppercase()
        }
        .take(4)

    println(result)


}

private fun sequence() {

    val words = "The quick brown fox jumps over the lazy dog".split(" ")
    val wordsSequence = words.asSequence()


    val result = wordsSequence
        .filter {
            println("filter : $it")
            it.length > 3
        }
        .map {
            println("map : $it")
            it.uppercase()
        }
        .take(4)

    println(result.toList())


}