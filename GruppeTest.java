

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
    private Spiel spiel1;
    private Spiel spiel2;
    private Spiel spiel3;
    private Spiel spiel4;
    private Spiel spiel5;
    private Spiel spiel6;

    
    
    
    
    

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
        spiel1 = new Spiel(mannscha1, mannscha4);
        spiel2 = new Spiel(mannscha2, mannscha3);
        spiel3 = new Spiel(mannscha4, mannscha3);
        spiel4 = new Spiel(mannscha1, mannscha2);
        spiel5 = new Spiel(mannscha2, mannscha4);
        spiel6 = new Spiel(mannscha3, mannscha1);
        gruppe1.spielHinzufuegen(spiel1);
        gruppe1.spielHinzufuegen(spiel2);
        gruppe1.spielHinzufuegen(spiel3);
        gruppe1.spielHinzufuegen(spiel4);
        gruppe1.spielHinzufuegen(spiel5);
        gruppe1.spielHinzufuegen(spiel6);
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

    @Test
    public void testGesamtPunkte()
    {
        assertEquals(0, gruppe1.gibGesamtPunkte(mannscha1));
        assertEquals(0, gruppe1.gibGesamtPunkte(mannscha2));
        assertEquals(0, gruppe1.gibGesamtPunkte(mannscha3));
        assertEquals(0, gruppe1.gibGesamtPunkte(mannscha4));
        gruppe1.spieleAusgeben();
        gruppe1.tabelleAusgeben();
        spiel1.setzeErgebnis(2, 1);
        spiel2.setzeErgebnis(0, 3);
        assertEquals(3, gruppe1.gibGesamtPunkte(mannscha1));
        assertEquals(0, gruppe1.gibGesamtPunkte(mannscha2));
        assertEquals(3, gruppe1.gibGesamtPunkte(mannscha3));
        assertEquals(0, gruppe1.gibGesamtPunkte(mannscha4));
        gruppe1.tabelleSortieren();
        gruppe1.spieleAusgeben();
        gruppe1.tabelleAusgeben();
        spiel3.setzeErgebnis(1, 1);
        spiel4.setzeErgebnis(2, 3);
        gruppe1.tabelleSortieren();
        gruppe1.spieleAusgeben();
        gruppe1.tabelleAusgeben();
    }
}

