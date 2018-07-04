
public class Ergebnis
{
    private int heimTore;
    private int gastTore;

    public Ergebnis()
    {
        heimTore = 0;
        gastTore = 0;
    }
    
    public void setzeTore(int heim, int gast)
    {
        heimTore = heim;
        gastTore = gast;
    }

    public int gibHeimTore()
    {
        return heimTore;
    }
    
    public int gibGastTore()
    {
        return gastTore;
    }
}
