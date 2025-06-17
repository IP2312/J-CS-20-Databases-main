# Aufgabenstellung

## Aufgabe 1: Haustiere

Erstelle ein Programm, welches einen Haushalt mit Personen und Haustieren modelliert und in einer Datenbank persistent speichert.
Hierfür sollen beliebig viele Haushalte angelegt werden können. Jeder Haushalt besteht aus 1 bis n Personen und jeder Person sind 0 bis m Haustiere zugeordnet.

Es sollen die üblichen CRUD Methoden einer Datenbank nutzbar sein. Verwende hierfür ein Interface!
- `create(Household household)`
- `create(Person person)`
- `create(Pet pet)`
- `get(int householdId)`
- `get(int personId)`
- `get(int petId)`
- `update(Household household)`
- `update(Person person)`
- `update(Pet pet)`
- `delete(int householdId)`
- `delete(int personId)`
- `delete(int petId)`

Zusätzlich noch eine Methode, welche sämtliche Haushalte in der Datenbank ausgibt:
- `List<Household> getAllHouseholds();`

Gegebenenfalls kannst du weitere Methoden in deine Schnittstelle einbauen.

Löse diese Aufgabe mittels einer MySQL Datenbank.

Achte darauf, dass das Object Relation Mapping richtig umgesetzt wird, d.h. die Verbindungen zwischen Haushalt und Person, respektive Person und Haustier sowohl im Java Code als auch in der Datenbank existieren. 

### Abnahmekriterien

Der:die Teilnehmer:in hat:
- Die entsprechenden Klassen erstellt und die nötigen Methode implementiert.
- Frontend, Business Logic und Datenbankzugriffe ordentlich getrennt.
- Die Klassen seiner Objekte spezifisch für seine Business Logic erstellt (nicht 1:1 aus der Datenbank).
- Ein Programm erstellt, das alle oben angeführten Anforderungen erfüllt.
- Ein Programm trennt die Klassen in User Interaction/Business Logic/Persistierung.
- in seinem:ihrem Code Exceptions ordentlich abgefangen.
- entsprechende Unittests erstellt, um die Methoden auf Funktionalität zu prüfen.
- seinen:ihren Code in GitHub eingecheckt.

Zurück zur [Startseite](../README.md)