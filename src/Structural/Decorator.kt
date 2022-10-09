package Structural

interface Decorator {
    fun makeSomething()
}

class BaseModel : Decorator {
    override fun makeSomething() {
        println("I do it by BASE realization")
    }
}

open class ModelDecorator(
    val baseModel: BaseModel
) : Decorator {
    override fun makeSomething() {
        baseModel.makeSomething()
    }
}

class ExtendedModel(baseModel: BaseModel) : ModelDecorator(baseModel) {
    private fun makeExtensionMethod() {}

    override fun makeSomething() {
        super.makeSomething()
        makeExtensionMethod()
    }
}

fun main() {
    val extendedModel = ExtendedModel(BaseModel())
    extendedModel.makeSomething() // He will do the extension method with parent logic. It's combined with the Liskov Substitution Principle
}