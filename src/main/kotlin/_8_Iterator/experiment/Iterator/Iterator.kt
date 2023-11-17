package _8_Iterator.experiment.Iterator

// Mengimplementasikan antarmuka Iterator untuk koleksi string
class StringIterator(private val string: String) : Iterator<Char> {
    private var currentIndex = 0

    override fun hasNext(): Boolean {
        return currentIndex < string.length
    }

    override fun next(): Char {
        if (!hasNext()) {
            throw NoSuchElementException()
        }
        return string[currentIndex++]
    }
}

fun main() {
    val kata = "Halo"
    val iterator = StringIterator(kata)

    while (iterator.hasNext()) {
        print("${iterator.next()} ") // Output: H a l o
    }
}