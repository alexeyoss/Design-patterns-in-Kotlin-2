// Model hierarchy
open class Auto

class Ford : Auto()
class Kia : Auto()

// Common interface, return common Model (Auto)
interface Factory {
    fun createAuto(): Auto
}

// Implements interface method, return certain Auto brand
class FordFactory : Factory {
    override fun createAuto(): Auto {
        return Ford()
    }
}

// Implements interface method, return certain Auto brand
class KiaFactory : Factory {
    override fun createAuto(): Auto {
        return Kia()
    }
}

// Build Single Point of entry, determinate the parameters on which our model will be based
class AutoFactory() {
    fun createAuto(typeMachine: String): Auto =
        when (typeMachine) {
            "F" -> FordFactory().createAuto()
            "K" -> KiaFactory().createAuto()
            else -> {
                throw IllegalArgumentException()
            }
        }
}


fun main() {
    val autoFactory = AutoFactory()

    val someObj: Auto = autoFactory.createAuto("K")
    print(someObj.javaClass.name)
}
