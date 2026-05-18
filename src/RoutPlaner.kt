fun destinationHinzufuegen(route: List<String>, destination: String): List<String> {
    return route + destination
}

fun destinationAendern(route: List<String>, alteDestination: String, neueDestination: String): List<String> {
    return route.map { destination ->
        if (destination == alteDestination) neueDestination else destination
    }
}

fun destinationEinfuegen(route: List<String>, position: Int, destination: String): List<String> {
    return route.take(position) + destination + route.drop(position)
}

fun destinationEntfernen(route: List<String>, destination: String): List<String> {
    return route.filter { aktuelleDestination ->
        aktuelleDestination != destination
    }
}

fun routeAnzeigen(route: List<String>): List<String> {
    return route
}

fun reisePlanerSchleife(route: List<String>) {
    println()
    println("Aktuelle Route: ${routeAnzeigen(route)}")
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
            val neueRoute = destinationHinzufuegen(route, destination)
            println("Destination hinzugefügt.")
            reisePlanerSchleife(neueRoute)
        }
        "2" -> {
            print("Alte Destination: ")
            val alteDestination = readln()
            print("Neue Destination: ")
            val neueDestination = readln()
            val neueRoute = destinationAendern(route, alteDestination, neueDestination)
            println("Destination geändert.")
            reisePlanerSchleife(neueRoute)
        }
        "3" -> {
            print("Position: ")
            val position = readln().toInt()
            print("Destination: ")
            val destination = readln()
            val neueRoute = destinationEinfuegen(route, position, destination)
            println("Destination eingefügt.")
            reisePlanerSchleife(neueRoute)
        }
        "4" -> {
            print("Destination zum Entfernen: ")
            val destination = readln()
            val neueRoute = destinationEntfernen(route, destination)
            println("Destination entfernt.")
            reisePlanerSchleife(neueRoute)
        }
        "5" -> {
            println("Route: ${routeAnzeigen(route)}")
            reisePlanerSchleife(route)
        }
        "0" -> {
            println("Programm beendet.")
        }
        else -> {
            println("Ungültige Eingabe.")
            reisePlanerSchleife(route)
        }
    }
}

fun main() {
    println("=== Reise Planer ===")
    reisePlanerSchleife(emptyList())
}