class Aufgabe3Test {

    fun runAllTests() {
        noPeopleGets0Percent()
        oneToFivePeopleGets10Percent()
        moreThanFivePeopleGets20Percent()
        addPersonReturnsNewList()
    }

    fun noPeopleGets0Percent() {

        val calculator = TipCalculator()

        val names = emptyList<String>()

        println(
            "Test 1: " +
                    (calculator.getTipPercentage(names) == 0)
        )
    }

    fun oneToFivePeopleGets10Percent() {

        val calculator = TipCalculator()

        var names = emptyList<String>()

        names = calculator.addPerson(names, "Fritz")
        names = calculator.addPerson(names, "Franz")
        names = calculator.addPerson(names, "Hugo")

        println(
            "Test 2: " +
                    (calculator.getTipPercentage(names) == 10)
        )
    }

    fun moreThanFivePeopleGets20Percent() {

        val calculator = TipCalculator()

        var names = emptyList<String>()

        names = calculator.addPerson(names, "Fritz")
        names = calculator.addPerson(names, "Franz")
        names = calculator.addPerson(names, "Hugo")
        names = calculator.addPerson(names, "Erwin")
        names = calculator.addPerson(names, "Markus")
        names = calculator.addPerson(names, "Martin")

        println(
            "Test 3: " +
                    (calculator.getTipPercentage(names) == 20)
        )
    }

    fun addPersonReturnsNewList() {

        val calculator = TipCalculator()

        val oldNames = listOf("Fritz", "Franz")

        val newNames = calculator.addPerson(oldNames, "Hugo")

        println(
            "Test 4a: " +
                    (oldNames == listOf("Fritz", "Franz"))
        )

        println(
            "Test 4b: " +
                    (newNames == listOf("Fritz", "Franz", "Hugo"))
        )
    }
}

fun main() {

    val test = Aufgabe3Test()

    test.runAllTests()
}