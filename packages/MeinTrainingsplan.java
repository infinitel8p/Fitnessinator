// Mein Trainingsplan zu einem package im Ordner packages machen (kp wieso, wurde mir vorgeschlagen, mann kann auch ohne package deklarierung den mist hier machen aber best practice ist als package)
package packages;

public class MeinTrainingsplan {
    public static void main(String[] args) {
        // "\033[H\033[2J" löscht die Konsole in java (so cls in windows oder clear in linux)
        // System.out.flush() wird speziell dafür benutzt, die verbleibenden Bytes bei Verwendung von System.out.print() zu löschen, so dass nichts auf dem Konsolenbildschirm ausgelassen wird.
        System.out.print("\033[H\033[2J");
        System.out.flush();
        // Kurze Ausgabe, dass wir erfolgreich aus Fitnessinator.java in MeinTrainingsplan.java geleitet wurden
        System.out.println("Weiterleitung war erfolgreich!");
        System.out.println("\"MeinTrainingsplan.java\" wurde aufgerufen");
    }
}