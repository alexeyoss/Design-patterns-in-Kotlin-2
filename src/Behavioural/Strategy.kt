package Behavioural

interface Activity {
    fun doSomething()
}

class Sleeping : Activity {
    override fun doSomething() {
        println("I'm sleeping")
    }
}

class Eating : Activity {
    override fun doSomething() {
        println("I'm eating")
    }
}

class Training : Activity {
    override fun doSomething() {
        println("I'm training")
    }
}

class Person {
    var activity: Activity? = null

    fun executeActivity() {
        activity?.doSomething()
    }
}

fun main() {
    val person = Person()

    person.activity = Training()
    person.executeActivity()

}