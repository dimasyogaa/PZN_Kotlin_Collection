package _MyHelper

object MyHelper {
    fun spaceLine() {
        val end = 80
        for (i in 1..end) {
            print("=")
            if (i == end) println()
        }
        println()
    }
}