

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Die Test-Klasse GruppeTest.
 *
 * @author  (Ihr Name)
 * @version (eine Versionsnummer oder ein Datum)
 */
public class GruppeTest
{
    private Mannschaft mannscha1;
    private Mannschaft mannscha2;
    private Mannschaft mannscha3;
    private Mannschaft mannscha4;
    private Gruppe gruppe1;

    /**
     * Konstruktor fuer die Test-Klasse GruppeTest
     */
    public GruppeTest()
    {
    }

    /**
     *  Setzt das Testgerüst fuer den Test.
     *
     * Wird vor jeder Testfall-Methode aufgerufen.
     */
    @Before
    public void setUp()
    {
        mannscha1 = new Mannschaft("Mexico");
        mannscha2 = new Mannschaft("Schweden");
        mannscha3 = new Mannschaft("Deutschland");
        mannscha4 = new Mannschaft("Suedkorea");
        gruppe1 = new Gruppe();
        gruppe1.mannschaftHinzufuegen(mannscha1);
        gruppe1.mannschaftHinzufuegen(mannscha2);
        gruppe1.mannschaftHinzufuegen(mannscha3);
        gruppe1.mannschaftHinzufuegen(mannscha4);
    }

    /**
     * Gibt das Testgerüst wieder frei.
     *
     * Wird nach jeder Testfall-Methode aufgerufen.
     */
    @After
    public void tearDown()
    {
    }
}
