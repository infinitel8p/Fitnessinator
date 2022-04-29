// import scanner um später text input abzufragen
import java.util.Scanner;

//erstelle klasse fitnessinator
public class Fitnessinator {
    //erstelle main methode
    public static void main(String[] args) {
        System.out.println(
                "Menü:\n1 = Mein Trainingsplan\n2 = Neuer Eintrag\n3 = Eintrag löschen\n4 = Beenden\n\nBitte wähle eine Zahl");
        try (Scanner scannerVariable = new Scanner(System.in)) {
            System.out.println("Sie haben gewählt: " + scannerVariable.nextLine());
        }

    }
}
