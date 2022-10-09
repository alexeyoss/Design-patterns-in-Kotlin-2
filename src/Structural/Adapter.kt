package Structural

interface DataBase {
    fun insert()
    fun update()
    fun select()
    fun remove()
}

open class Application {
    fun saveObject() {}
    fun updateObject() {}
    fun loadObject() {}
    fun deleteObject() {}
}

class Adapter : Application(), DataBase {
    override fun insert() {
        saveObject()
    }

    override fun update() {
        updateObject()
    }

    override fun select() {
        loadObject()
    }

    override fun remove() {
        deleteObject()
    }


}

fun main() {
    val db: DataBase = Adapter()
    val app: Application = Adapter()
    app.deleteObject()
    db.remove()
}