package Behavioural

abstract class Template_method {
    fun doSomething() {
        println("1")
        doIntTheMiddle()
        println("3")
    }

    abstract fun doIntTheMiddle()
}

class mExample1 : Template_method() {
    override fun doIntTheMiddle() {
        println("2")
    }
}

class mExample2 : Template_method() {
    override fun doIntTheMiddle() {
        println("4")
    }
}

fun main() {
    val obj = mExample2()
    obj.doSomething()
}
