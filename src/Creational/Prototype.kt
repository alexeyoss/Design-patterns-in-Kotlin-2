package Creational

interface Cloneable {
    fun copy(): Cloneable
}

class Bike(name: String, surname: String) : Cloneable {


    override fun copy(): Cloneable = Bike()
}


fun main() {
    val obj = Bike("1", "2")
    val objCopy = obj.copy("1", "2")
}
