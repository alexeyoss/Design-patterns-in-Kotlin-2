package Structural

interface AutoBuilder {
    fun buildAuto()
}

class KiaAuto : AutoBuilder {
    override fun buildAuto() {
        println("${javaClass.name} make some operations")
    }
}

class LexusAuto : AutoBuilder {
    override fun buildAuto() {
        println("${javaClass.name} make some operations")
    }
}

abstract class TopCenters(val autoBuilder: AutoBuilder) {
    fun massConstruct() {
        autoBuilder.buildAuto()
    }
}

interface AbstractCenter {
    fun makePlan()
}

class TagankaCenter(autoBuilder: AutoBuilder) : TopCenters(autoBuilder), AbstractCenter {
    override fun makePlan() {
        println("Taganke making plan...")
        massConstruct()
    }
}

class MoscowCenter(autoBuilder: AutoBuilder) : TopCenters(autoBuilder), AbstractCenter {
    override fun makePlan() {
        println("Taganke making plan...")
        massConstruct()
    }

}

fun main() {
    val list = mutableListOf(
        TagankaCenter(LexusAuto()),
        MoscowCenter(KiaAuto())
    )

    list.forEach { topCenters ->
        topCenters.makePlan()
    }
}

