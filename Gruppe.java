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
    
    public boolean spielplanErstellen()
    {
        if(mannschaften.size() != 4)
        {
            return false;
        }
        
        //Runde 1
        spiele.add(new Spiel(mannschaften.get(0), mannschaften.get(3)));
        spiele.add(new Spiel(mannschaften.get(1), mannschaften.get(2)));
        
        //Runde 2
        spiele.add(new Spiel(mannschaften.get(2), mannschaften.get(0)));
        spiele.add(new Spiel(mannschaften.get(3), mannschaften.get(1)));
        
        //Runde 3
        spiele.add(new Spiel(mannschaften.get(0), mannschaften.get(1)));
        spiele.add(new Spiel(mannschaften.get(2), mannschaften.get(3)));
        
        return true;
    }

}
