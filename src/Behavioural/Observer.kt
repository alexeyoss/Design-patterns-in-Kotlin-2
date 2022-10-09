package Behavioural

interface Observer {
    fun handleEvent(listOfDetails: List<String>)
}

interface Observable {
    fun addObserver(observer: Observer)
    fun removeObserver(observer: Observer)
    fun notifyObserver()
}

class Client(
    var name: String
) : Observer {

    override fun handleEvent(listOfDetails: List<String>) {
        listOfDetails.forEach { item ->
            println(item)
        }
    }
}

class Mall : Observable {
    var mutableList = mutableListOf("Kate", "Alexey", "Igor")
    var subscribers = mutableListOf<Observer>() // or it will do the third part (Event Manager) class


    private fun addNewName(something: String) {
        mutableList.add(something)
        notifyObserver()
    }

    private fun removeNewName(something: String) {
        mutableList.remove(something)
        notifyObserver()
    }

    override fun addObserver(observer: Observer) {
        this.subscribers.add(observer)
    }


    override fun removeObserver(observer: Observer) {
        this.subscribers.remove(observer)
    }

    override fun notifyObserver() {
        subscribers.forEach { observer ->
            observer.handleEvent(mutableList)
        }
    }
}

fun main() {

}