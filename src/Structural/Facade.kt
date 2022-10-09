package Structural

class Activity {
    var activity: Boolean? = null

    fun onStart() {
        activity = true
    }

    fun onStop() {
        activity = false
    }
}

class Fragment() {
    fun startVisible(activity: Activity) {
        if (activity.activity == true) {
            println("visibility = View.Visible")
        } else {
            println("visibility = View.GONE")
        }
    }
}


class Facade {
    protected val activity = Activity()
    protected val fragment = Fragment()

    fun doProcess() {
        activity.onStart()
        fragment.startVisible(activity)
        activity.onStop()
    }
}

fun main() {
    val facade = Facade()
    facade.doProcess()
}