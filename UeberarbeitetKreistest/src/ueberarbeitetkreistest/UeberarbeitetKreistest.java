package ueberarbeitetkreistest;
import javax.swing.JOptionPane;

/**
 *
 * @author Schueler
 */
public class UeberarbeitetKreistest {

    
     public static void main (String args[]){

        Kreis kreis1 = new Kreis();         // erzeugen eines neuen Objektes
        kreis1.setRadius(6);                // Radius wird auf 6 gesetzt


        Kreis kreis2 = new Kreis();
        kreis2.setFlache(226.1946);         // setzten der Fläche


        Kreis kreis3 = new Kreis();
        kreis3.setUmfang(37.699);           // setzten des Umfangs

        System.out.println(kreis1);     // durch zuvor erstellte "toString"-Methode ist die Ausgabe hier möglich
        System.out.println(kreis2);
        System.out.println(kreis3);

        makeKreistabelle();     // erzeugt eine Tabelle

        System.out.println( "Es wurden: " + Kreis.zaehler + " Kreis Objekte erzeugt.");

    }


    static void makeKreistabelle(){     

        double radius;          // definieren der Variable 
        int erhoehung;          // um wieviel der Radius erhöht werden soll

        String radiusTxt
                = JOptionPane.showInputDialog( "Kreis Radius bitte: ");     // Aufforderung an Benutzer zur Eingabe

        String erhoehungTxt
                = JOptionPane.showInputDialog( "Radius erhöhung: ");        // Aufforderung an Benutzer zur Eingabe

        radius = Double.parseDouble(radiusTxt);     // Umwandlung
        erhoehung = Integer.parseInt(erhoehungTxt); // Umwandlung

        System.out.println( "\nStarte Kreistabellenberechnung für Radius " +radius+" bei einer erhöhung von "+ erhoehung + "\n");

        for(int i = 1; i <= 30; i++){       // wird insgesamt 30-mal erhöht

            Kreis schleifenKreis = new Kreis();

            schleifenKreis.setRadius( radius * i );

            System.out.println( i + " " +schleifenKreis );


        }
    }
    
}
