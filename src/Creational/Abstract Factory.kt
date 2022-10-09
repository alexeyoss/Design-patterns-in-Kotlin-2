interface Developer {
    fun writeCode()
}

interface Tester {
    fun testCode()
}

interface PM {
    fun pmProject()
}

// У нас есть агрегирующая все интерфейсы сущность, для создания семейства объектов
interface ProjectTeamFactory {
    fun getDeveloper(): Developer
    fun getTester(): Tester
    fun getPm(): PM
}

class DeveloperA : Developer {
    override fun writeCode() {}
}

class TesterA : Tester {
    override fun testCode() {}
}

class PmA : PM {
    override fun pmProject() {}
}

class ProjectATeam() : ProjectTeamFactory {
    override fun getDeveloper(): Developer = DeveloperA()

    override fun getTester(): Tester = TesterA()

    override fun getPm(): PM = PmA()
}
// Итого у нас есть агрегирующая сущность, которая должна воплощать в себе зависимости смежных классов
fun main() {
    val projectTeamFactory = ProjectATeam()
    val dev = projectTeamFactory.getDeveloper()
    val pm = projectTeamFactory.getPm()
    val test = projectTeamFactory.getTester()

    dev.writeCode()
    pm.pmProject()
    test.testCode()
}