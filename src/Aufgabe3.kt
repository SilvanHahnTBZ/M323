class TipCalculator {

    fun addPerson(names: List<String>, name: String): List<String> {
        return names + name
    }

    fun getTipPercentage(names: List<String>): Int {

        return when {
            names.isEmpty() -> 0
            names.size <= 5 -> 10
            else -> 20
        }
    }
}