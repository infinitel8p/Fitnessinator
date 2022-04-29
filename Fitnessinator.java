// import scanner um später text input abzufragen
import java.util.Scanner;
// import des packages MeinTrainingsplan aus packages (ähnlich wie selbst geschriebene Module in python in eine andere Datei zu importieren)
import packages.MeinTrainingsplan;

//erstelle klasse fitnessinator
public class Fitnessinator {
    //erstelle main methode
    public static void main(String[] args) {
        // println das Men
        System.out.println(
                "Men\u00fc:\n1 = Mein Trainingsplan\n2 = Neuer Eintrag\n3 = Eintrag l\u00f6schen\n4 = Beenden\n\nBitte w\u00e4hle eine Zahl");
        // erstelle einen scanner und lasse input fordern
        Scanner scannerVariable = new Scanner(System.in);
        //erstelle strings mit auszugebenden Text
        String result = "Sie haben gew\u00e4hlt: ";
        String scanned_text = scannerVariable.nextLine();
        // if abfragen
        /*
        scanned_text wird mit .equals(x) auf gleichheit mit x verglichen weil ->
        "Strings and Boxed types should be compared using "equals()""
        String vergleiche mit x==y sind enden false, selbst wenn x und y die gleiche value haben
        - unten testbar mit 4
        */
        if (scanned_text.equals("1")) {
            //wenn eingabe 1 war dann wird MeinTrainingsplan.java aufgerufen
            MeinTrainingsplan.main(args);
        } else if (scanned_text.equals("2")) {
            System.out.println(result + scanned_text);
        } else if (scanned_text.equals("3")) {
            System.out.println(result + scanned_text);
        } else if (scanned_text == "4") {
            System.out.println(result + scanned_text);
        } else {
            System.out.println("Eingabe nicht erkannt! -> " + scanned_text);
        }
    }
}