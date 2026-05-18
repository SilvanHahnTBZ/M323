class ReisePlaner(private val route: List<String> = emptyList()) {

    fun destinationHinzufuegen(destination: String): ReisePlaner {
        val neueRoute = route + destination
        return ReisePlaner(neueRoute)
    }

    fun destinationAendern(
        alteDestination: String,
        neueDestination: String
    ): ReisePlaner {

        val neueRoute = route.map { destination ->
            if (destination == alteDestination) {
                neueDestination
            } else {
                destination
            }
        }

        return ReisePlaner(neueRoute)
    }

    fun destinationEinfuegen(
        position: Int,
        destination: String
    ): ReisePlaner {

        val neueRoute =
            route.take(position) +
                    destination +
                    route.drop(position)

        return ReisePlaner(neueRoute)
    }

    fun destinationEntfernen(destination: String): ReisePlaner {

        val neueRoute = route.filter { aktuelleDestination ->
            aktuelleDestination != destination
        }

        return ReisePlaner(neueRoute)
    }

    fun routeAnzeigen(): List<String> {
        return route
    }
}

fun main() {

    var reisePlaner = ReisePlaner()

    println("=== Reise Planer ===")

    while (true) {

        println()
        println("Aktuelle Route: ${reisePlaner.routeAnzeigen()}")
        println()
        println("1 = Destination hinzufügen")
        println("2 = Destination ändern")
        println("3 = Destination einfügen")
        println("4 = Destination entfernen")
        println("5 = Route anzeigen")
        println("0 = Programm beenden")
        print("Auswahl: ")

        when (readln()) {

            "1" -> {
                print("Neue Destination: ")
                val destination = readln()

                reisePlaner =
                    reisePlaner.destinationHinzufuegen(destination)

                println("Destination hinzugefügt.")
            }

            "2" -> {
                print("Alte Destination: ")
                val alteDestination = readln()

                print("Neue Destination: ")
                val neueDestination = readln()

                reisePlaner =
                    reisePlaner.destinationAendern(
                        alteDestination,
                        neueDestination
                    )

                println("Destination geändert.")
            }

            "3" -> {
                print("Position: ")
                val position = readln().toInt()

                print("Destination: ")
                val destination = readln()

                reisePlaner =
                    reisePlaner.destinationEinfuegen(
                        position,
                        destination
                    )

                println("Destination eingefügt.")
            }

            "4" -> {
                print("Destination zum Entfernen: ")
                val destination = readln()

                reisePlaner =
                    reisePlaner.destinationEntfernen(destination)

                println("Destination entfernt.")
            }

            "5" -> {
                println("Route: ${reisePlaner.routeAnzeigen()}")
            }

            "0" -> {
                println("Programm beendet.")
                break
            }

            else -> {
                println("Ungültige Eingabe.")
            }
        }
    }
}