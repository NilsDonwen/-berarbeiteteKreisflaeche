package ueberarbeitetkreistest;

/**
 *
 * @author Schueler
 */
public class Kreis {
    
     // --------- Hier kommen die Attribute der Klasse (Datenelement)

    double radius;      // definieren der Variable
    static int zaehler;     // durch "static" kann nachher gezählt werden, wie oft ein Objekt erzeugt worden ist 
                            // --> statische Varibale, welche überall gilt

   
    // --------- Hier kommen die Konstruktoren ---------
    public Kreis(double r){     // alternativ: new Kreis();
        setRadius(r);       // nur ein Warnhinweis
         // double radius = 0; //ging auch, aber wenn man get/set hat, dann besser diese nutzen!
        zaehler++;      // hochzählen
    }
    
    public Kreis(){        
        this(0);
    }

    // --------- Hier kommen die Methoden (auch get/set) ---------

    double getRadius(){  
        return radius;
    }

    void setRadius(double r){       // setzen des radius
        this.radius = r;
    }

    double getUmfang(){         // "geben lassen" des Umfangs
        return 2 * Math.PI * getRadius();
    }

    double getFlaeche(){            // "geben lassen" der Fläche
        return 2 * Math.PI * Math.pow(radius, 2);       // Wert welcher rauskommt, wird zurückgegeben
    }

    void setUmfang(double u){       // Rechnung
        setRadius( u /(2 * Math.PI) );
    }

    void setFlache(double f){       // Rechnung
        setRadius( Math.sqrt(f / (2*Math.PI) ) );       // Alternativ: Radius = ...
    }


    @Override       // kann auch weggelassen werden
    public String toString() {
        return "Kreis Radius: " + getRadius() +"\t"       // Wert welcher oben berechnet wird (return) wird hier ausgegeben
                +" Umfang: " + getUmfang()+"\t"
                +" Fläche: " + getFlaeche();
    }
}
