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
    
    public int gibGesamtTore(Mannschaft mannschaft)
    {
        int tore = 0;
        for(Spiel spiel: spiele)
        {
            if(spiel.gibPunkte(mannschaft) != -1)
            {
                tore = tore + spiel.gibTore(mannschaft);
            }
        }
        return tore;
    }
    
    public int gibGesamtGegenTore(Mannschaft mannschaft)
    {
        int tore = 0;
        for(Spiel spiel: spiele)
        {
            if(spiel.gibPunkte(mannschaft) != -1)
            {
                tore = tore + spiel.gibGegenTore(mannschaft);
            }
        }
        return tore;
    }
    
    public void spieleAusgeben()
    {
        for(Spiel spiel : spiele)
        {
            System.out.println(spiel);
        }
    }
    
    public void tabelleSortieren()
    {
        boolean sortiert = false;
        while(sortiert == false)
        {
            sortiert = true;
            int index = 0;
            while(index < mannschaften.size() - 1)
            {
                Mannschaft mannschaft1 = mannschaften.get(index);
                Mannschaft mannschaft2 = mannschaften.get(index + 1);
                if(gibGesamtPunkte(mannschaft1) < gibGesamtPunkte(mannschaft2))
                {
                    mannschaften.remove(index);
                    mannschaften.add(index + 1, mannschaft1);
                    sortiert = false;
                }
                index++;
            }
        }
    }
    
    public void tabelleAusgeben()
    {
        for(Mannschaft mannschaft : mannschaften)
        {
            System.out.println(mannschaft.gibName() + " " + gibGesamtPunkte(mannschaft) 
                + " " + gibGesamtTore(mannschaft) + ":" + gibGesamtGegenTore(mannschaft));
        }
    }

}
