package Behavioural

interface Iterator {
    fun hasNext(): Boolean
    fun <T> next(): T
}

class Iterable(val data: List<String>) : Iterator {
    private var position = 0

    override fun hasNext(): Boolean {
        return data.size > position
    }

    override fun <T> next(): T {
        return data[position++] as T
    }

}

fun main() {
    val iterable = Iterable(mutableListOf("1", "4", "8", "8"))
    while (iterable.hasNext()) {
        var elem = iterable.next() as String
        println(elem)
    }
}