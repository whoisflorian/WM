import java.util.ArrayList;

public class Gruppe
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private ArrayList<Mannschaft> mannschaften;
    private ArrayList<Spiel> spiele;

    /**
     * Konstruktor für Objekte der Klasse Gruppe
     */
    public Gruppe()
    {
        mannschaften = new ArrayList<Mannschaft>();
        spiele = new ArrayList<Spiel>();
    }
    
    public void mannschaftHinzufuegen(Mannschaft mannschaft)
    {
        mannschaften.add(mannschaft);
    }
    
    public void spielHinzufuegen(Spiel spiel)
    {
        spiele.add(spiel);
    }
    
    public int gibGesamtPunkte(Mannschaft mannschaft)
    {
        int punkte = 0;
        
        for(Spiel spiel: spiele)
        {
            if(spiel.gibPunkte(mannschaft) != -1)
            {
                punkte = punkte + spiel.gibPunkte(mannschaft);
            }
        }
        
        return punkte;
    }

}
