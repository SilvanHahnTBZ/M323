# Aufgabe 1 – pure vs impure

## Beurteilung der Funktionen

| Aufgabe | Nur ein Rückgabewert                                        | Resultat nur abhängig von übergebenen Parametern | Verändert keine existierenden Werte     | pure oder impure | Begründung |
|---|-------------------------------------------------------------|--------------------------------------------------|-----------------------------------------|------------------|---|
| 1.1 | ja                                                          | nein Abhängig von externem cartItems             | nein  Mutiert globales Array mit push() | impure           |  |
| 1.2 | ja                                                          | ja                                               | ja                                      | pure             |  |
| 1.3 | ja                                                          | ja                                               | ja                                      | pure             |  |
| 1.4 | ja                                                          | nein  Nutzt Math.random()                        | ja                                      | impure           |  |
| 1.5 | ja                                                          | ja                                               | ja                                      | pure             |  |
| 1.6 | nein sie returnt den wert und schreibt etwas in die console | ja                                               | ja                                      | impure           |  |

## Regeln für pure Funktionen

- Die Funktion hat nur einen Rückgabewert.
- Das Resultat hängt nur von den übergebenen Parametern ab.
- Die Funktion verändert keine bestehenden Werte oder globalen Variablen.
- Die Funktion erzeugt keine Seiteneffekte (z. B. Konsole, Datei, Datenbank).