
public class Spiel
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private Mannschaft heimMannschaft;
    private Mannschaft gastMannschaft;
    private Ergebnis ergebnis;

    /**
     * Konstruktor für Objekte der Klasse Spiel
     */
    public Spiel(Mannschaft heim, Mannschaft gast)
    {
        this.heimMannschaft = heim;
        this.gastMannschaft = gast;
        ergebnis = null;
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
        if(ergebnis == null)
        {
            return -1;
        }
        return ergebnis.gibHeimTore();
    }
    
    public int gibGastTore()
    {
        if(ergebnis == null)
        {
            return -1;
        }
        return ergebnis.gibGastTore();
    }

    public void setzeErgebnis(int heim, int gast)
    {
        ergebnis = new Ergebnis();
        ergebnis.setzeTore(heim, gast);
    }

    public int gibPunkte(Mannschaft mannschaft)
    {
        if(ergebnis == null)
        {
            return 0;
        }
        else
        {
            if(heimMannschaft.equals(mannschaft))
            {
                if(ergebnis.gibHeimTore() > ergebnis.gibGastTore())
                {
                    return 3;
                }
                else if(ergebnis.gibHeimTore() == ergebnis.gibGastTore())
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
                if(ergebnis.gibHeimTore() > ergebnis.gibGastTore())
                {
                    return 0;
                }
                else if(ergebnis.gibHeimTore() == ergebnis.gibGastTore())
                {
                    return 1;
                }
                else
                {
                    return 3;
                }
            }
        }
        return -1;
    }
    
    public String toString()
    {
        String text = heimMannschaft.gibName() + " - " + gastMannschaft.gibName();
        if(ergebnis != null)
        {
            text = text + " (" + ergebnis.gibHeimTore() + ":" + ergebnis.gibGastTore() + ")";
        }
        return text;
    }

}
