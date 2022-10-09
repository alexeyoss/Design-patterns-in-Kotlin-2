package Behavioural

interface Command {
    fun execute()
}

class Database {
    class Insert() : Command {
        override fun execute() {
            println(javaClass.name)
        }
    }

    class Update() : Command {
        override fun execute() {
            println(javaClass.name)
        }
    }

    class Select() : Command {
        override fun execute() {
            println(javaClass.name)
        }
    }

    class Delete() : Command {
        override fun execute() {
            println(javaClass.name)
        }
    }
}

class User(
    val insert: Command,
    val update: Command,
    val select: Command,
    val delete: Command,
) {
    fun makeInsertion() {
        insert.execute()
    }

    fun makeUpdate() {
        update.execute()
    }

    fun makeSelect() {
        select.execute()
    }

    fun makeDelete() {
        delete.execute()
    }
}

fun main() {
    val database = Database()

    val user = User(
        Database.Insert(),
        Database.Update(),
        Database.Select(),
        Database.Delete(),
    )

    user.makeDelete()
}
