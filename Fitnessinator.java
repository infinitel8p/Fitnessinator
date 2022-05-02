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
                "Men\u00fc:\n1 = Mein Trainingsplan\n2 = Neuer Eintrag\n3 = Eintrag l\u00f6schen\n4 = Beenden\n5 & 6 = test\n\nBitte w\u00e4hle eine Zahl");
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
                //wenn eingabe 2 war dann wird NeuerEintrag.java aufgerufen
                NeuerEintrag.main(args);
            } else if (scannedText.equals("3")) {
                //wenn eingabe 3 war dann wird die Variable result + die eingabe ausgegeben
                System.out.println(result + scannedText);
            } else if (scannedText == "4") {
                //wenn eingabe 4 war dann sollte die Variable result + die eingabe ausgegeben werden, da jedoch der vergleich wie weiter oben beschrieben nicht mit equals() durchgeführt wurde landet man bei der else bedingung
                System.out.println(result + scannedText);
            } else if (scannedText.equals("5")) {
                //wenn eingabe 5 war dann landet man unten bei test
                test(args);
            } else if (scannedText.equals("6")) {
                //wenn eingabe 6 war dann landet man ebenfalls unten bei test (test um zu gucken ob "test(args);" oder "Fitnessinator.test(args);" besser ist da beide anscheinend klappen und uns weiterleiten)
                Fitnessinator.test(args);
            } else {
                // Sollte die Eingabe nicht 1,2 oder 3 sein (4 wird nicht gehen, da nicht mit equals() verglichen wird) dann wird der Fitnessinator.java erneut aufgerufen
                System.out.println("Eingabe nicht erkannt! -> " + scannedText);
                Fitnessinator.main(args);
            }
        }
    }

    // test einer weiteren funktion in einer klasse
    public static void test(String[] args)
    {
        System.out.println("test");
    }
}