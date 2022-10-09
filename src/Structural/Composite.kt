package Structural

interface Taxi {
    fun liftPeople()
}

class Auto1 : Taxi {
    override fun liftPeople() {
        println(javaClass.name + " do taxi")
    }
}

class Auto2 : Taxi {
    override fun liftPeople() {
        println(javaClass.name + " do taxi")
    }
}

class TaxiPark {
    private val taxiList: MutableList<Taxi> = mutableListOf()

    fun addTaxiToPark(taxi: Taxi) {
        taxiList.add(taxi)
    }

    fun removeTaxiToPark(taxi: Taxi) {
        taxiList.remove(taxi)
    }

    fun makeJob() {
        taxiList.forEach { taxi ->
            taxi.liftPeople()
        }
    }
}

fun main() {
    val taxiPark = TaxiPark()

    taxiPark.addTaxiToPark(Auto1())
    taxiPark.addTaxiToPark(Auto2())
    taxiPark.addTaxiToPark(Auto2())

    taxiPark.makeJob()
}