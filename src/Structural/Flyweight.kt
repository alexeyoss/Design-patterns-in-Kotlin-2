package Structural

interface Engineer {
    fun doEngineering()
}

class Engineer1 : Engineer {
    override fun doEngineering() {
        println(javaClass.name + "do job")
    }
}

class Engineer2 : Engineer {
    override fun doEngineering() {
        println(javaClass.name + "do job")
    }
}

class EngineerFabric() {
    private var engineerMap = HashMap<Int, Engineer>()

    fun getEngineerById(id: Int): Engineer {
        var engineer = engineerMap.get(id)
        if (engineer == null) {
            when (id) {
                1 -> {
                    engineer = Engineer1()
                    println("Hire new one 1")
                }
                2 -> {
                    engineer = Engineer2()
                    println("Hire new one 2")
                }
                else -> throw Exception()
            }
            engineerMap.put(id, engineer)
        }
        return engineer
    }
}

fun main() {
    val fabric = EngineerFabric()

    val list = mutableListOf<Engineer>()

    list.add(fabric.getEngineerById(1))
    list.add(fabric.getEngineerById(1))
    list.add(fabric.getEngineerById(1))
    list.add(fabric.getEngineerById(1))
    list.add(fabric.getEngineerById(2))
    list.add(fabric.getEngineerById(2))
    list.add(fabric.getEngineerById(2))
    list.add(fabric.getEngineerById(2))
    list.add(fabric.getEngineerById(2))

    list.forEach{
        it.doEngineering()
    }
}