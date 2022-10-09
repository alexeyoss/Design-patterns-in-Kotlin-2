package Behavioural

abstract class ChainOfResponsibility {
    var nextResposible: ChainOfResponsibility? = null

    fun notifyNext(data: String) {
        println(javaClass.name + " notified from")
        nextResposible?.notifyNext(data)
    }
}

class Example1 : ChainOfResponsibility()
class Example2 : ChainOfResponsibility()

fun main() {
    val example1 = Example1()
    val example2 = Example2()

    example1.nextResposible = example2
    example1.notifyNext("String")

}