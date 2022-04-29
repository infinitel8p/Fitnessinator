package packages;

public class NeuerEintrag {
    public static void main(String[] args) {
        System.out.println("Weiterleitung erfolgreich");
        System.out.print("Neuer Eintrag");
    }
}

/**
 * Packages sollen/müssen ja für imports/weiterleitungen auf andere Files erstellt werden
 * MeinTrainingsplan.java habe ich kompiliert (in die konsole "javac MeinTrainingsplan.java -> MeinTrainingsplan.class wird erstellt") und manuell als package einfach deklariert
 * indem ich oben "package packages;" geschrieben habe
 * Bei dem hier habe ich auch oben das ganze als package deklariert aber die class datei mit dem Befehlt "javac -d . NeuerEintrag.java" erstellt
 * Das erstellt automatisch die .class Datei in einen packages Ordner, deswegen ist der eine packages Ordner in dem anderen
 * Keine Ahnung wo da der unterschied ist etc, jedenfalls funktionieren beiden Weiterleitungen aus Fitnessinator.java in die jeweiligen Module
 */