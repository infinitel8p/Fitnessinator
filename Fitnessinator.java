// import scanner um später text input abzufragen
import java.util.Scanner;
// import des packages MeinTrainingsplan aus packages (ähnlich wie selbst geschriebene Module in python in eine andere Datei zu importieren)
import packages.MeinTrainingsplan;
import packages.NeuerEintrag;

//erstelle klasse fitnessinator
public class Fitnessinator {
    //erstelle main methode
    public static void main(String[] args) {
        // println das Men
        System.out.println(
                "Men\u00fc:\n1 = Mein Trainingsplan\n2 = Neuer Eintrag\n3 = Eintrag l\u00f6schen\n4 = Beenden\n\nBitte w\u00e4hle eine Zahl");
        /* 
        im folgenden wollen wir eine eingabe vom user bekommen
        dafür nutzen wir den importierten scanner
        wenn man einen scanner verwendet soll man ihn wieder schließen (nicht schließen gibt folgende fm in manchen lintern: Resource leak: 'scanner Variable' is never closed)
        man muss ihn nicht schließen, das programm funktioniert auch so aber anscheinend best practice es einfach zu machen
        wenn man das scannen und verarbeiten in einen try block schreibt wird der scanner anschließend automatisch geschlossen, deswegen hier das try
        */
        try (
            // erstelle einen scanner und lasse input fordern
            Scanner scannerVariable = new Scanner(System.in)) {
            //erstelle strings mit auszugebenden Text
            String result = "Sie haben gew\u00e4hlt: ";
            String scannedText = scannerVariable.nextLine();
            /*
            scannedText wird mit .equals(x) auf gleichheit mit x verglichen ("Strings and Boxed types should be compared using "equals()"")
            String vergleiche mit x==y sind enden false, selbst wenn x und y die gleiche value haben,
            deswegen x.equals(y)
            - unten testbar wenn man bei der abfrage 4 eintippt (1-3 tun was sie sollen, 4 sollte auch den text ausgeben, stattdessen kommt die else ausgabe)
            */
            if (scannedText.equals("1")) {
                //wenn eingabe 1 war dann wird MeinTrainingsplan.java aufgerufen
                MeinTrainingsplan.main(args);
            } else if (scannedText.equals("2")) {
                NeuerEintrag.main(args);
            } else if (scannedText.equals("3")) {
                System.out.println(result + scannedText);
            } else if (scannedText == "4") {
                System.out.println(result + scannedText);
            } else {
                System.out.println("Eingabe nicht erkannt! -> " + scannedText);
            }
        }
    }
}