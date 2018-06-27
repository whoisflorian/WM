
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

}
