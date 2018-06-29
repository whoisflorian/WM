
public class Spiel
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private Mannschaft heimMannschaft;
    private Mannschaft gastMannschaft;
    private int heimTore;
    private int gastTore;
    
    /**
     * Konstruktor für Objekte der Klasse Spiel
     */
    public Spiel(Mannschaft heim, Mannschaft gast)
    {
        this.heimMannschaft = heim;
        this.gastMannschaft = gast;
        heimTore = 0;
        gastTore = 0;
    }
    
    public Mannschaft gibHeimMannschaft()
    {
        return heimMannschaft;
    }
    
    public Mannschaft gibGastMannschaft()
    {
        return gastMannschaft;
    }
    
    public int gibHeimTore()
    {
        return heimTore;
    }
    
    public void setzeErgebnis(int heim, int gast)
    {
        this.heimTore = heim;
        this.gastTore = gast;
    }
    
    public int gibPunkte(Mannschaft mannschaft)
    {
        if(heimMannschaft.equals(mannschaft))
        {
            if(heimTore > gastTore)
            {
                return 3;
            }
            else if(heimTore == gastTore)
            {
                return 1;
            }
            else
            {
                return 0;
            }
        }
        else if(gastMannschaft.equals(mannschaft))
        {
            if(heimTore > gastTore)
            {
                return 0;
            }
            else if(heimTore == gastTore)
            {
                return 1;
            }
            else
            {
                return 3;
            }
        }
        return -1;
    }

}
