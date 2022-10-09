package Creational

class Account(private val config: BuilderModified) {
    private val name: String? = config.name
    private val nickname: String? = config.nickname

    fun info(): String {
        return config.name + " " + config.nickname
    }

    fun isEmail(): Boolean {
        return config.nickname?.contains("@") ?: false
    }

    class BuilderModified {
        var name: String? = null
        var nickname: String? = null

        fun makeName(name: String) = apply { this.name = name }
        fun makeNickname(nickname: String) = apply { this.nickname = nickname }
        fun build(): Account {
            return Account(this)
        }
    }
}

fun main() {
    val acc: Account = Account.BuilderModified()
        .makeName("")
        .makeNickname("")
        .build()


}