package tests;
/*
Kurzes Test Programm -
Einfache Methoden werden auf funktionalität getestet
*/

public class empty {
    public static void main(String[] args) {
        // erzeugen von variablen
        int ergbnis = 5 / 2;
        boolean bool = true;

        // rechnen mit variablen
        int zahl1 = 3;
        double zahl2 = 3.5;
        double ergebnis1 = zahl1 + zahl2;

        // ausgeben von Nachrichten mit print und println
        // println gibt nachricht + zeilenumbruch aus
        System.out.println("line print test");
        System.out.print("Die Variable ergebnis hat den Wert: ");
        System.out.println(ergbnis);
        System.out.println("Die Variable ergebnis hat den Wert: " + ergbnis);

        System.out.println("\n" + ergebnis1);
        System.out.println(zahl1 + (int)zahl2);

        String words[] = {"Hello", "World"};
        System.out.println(words[0] + " " + words[1]);

        // Arrays
        //Folgende Zeilen deklariert ein Array a welches nur Integers beinhalten darf
        int z[];
        z = new int[5];
        z[0] = 10;
        z[1] = 20;
        z[2] = 30;
        z[3] = 40;
        System.out.println("\nDer Wert des ersten Feldes vom Array a Beträgt: " + z[0]);

        //Folgende Zeilen deklarieren ein Array b welches nur Integers beinhalten darf
        int e[] = new int [] {1,2,3,4,5};
        System.out.println(e);

        //Folgende Zeilen deklarieren ein Array c welches nur Integers beinhalten darf
        int y[] = {6,7,8,9,10};
        System.out.println(y);

        // multidimensionale Arrays
        int array[][]= {{2,3}, {1,4}, {9,5}};
        System.out.println("\nZeile 1: " + array[0][0] + "     " + array[0][1]);
        System.out.println("Zeile 2: " + array[1][0] + "     " + array[1][1]);
        System.out.println("Zeile 3: " + array[2][0] + "     " + array[2][1]);

        // if - else abfragen
        if (ergbnis > 0 && !bool){
            System.out.println("\nDas ist kein Test!");
        }
        else {
            System.out.println("\nDas ist ein Test!");
        }

        // dateitypen und wie man sie ändert
        byte b;
        short s;
        int i;
        long l;
        float f;
        double d;
        char c;

        b = 3;
        s = b;
        i = s;
        l = i;
        f = l;
        d = f;
        c = 'd';

        System.out.println("\nDer Wert von d ist: " + d);
        System.out.println(c);
        System.out.println(12);
        System.out.println((float)12);
    }
}
