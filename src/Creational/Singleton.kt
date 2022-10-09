package Creational

object Example {
    fun funMethod(){
        print("I do fun!")
    }
}

fun main() {
    val a = Example
    val b = Example
    println("${a.hashCode()}")
    println("${b.hashCode()}")
}