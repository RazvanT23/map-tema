package Universitat;


import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class Teste {
    public Universitat no = new Universitat();
    @Test
    public void testNichtAusreichendeNoten() {
        int[] noten = {45, 30, 55, 65, 25};
        int[] nichtAusreichende = no.nichtAusreichendeNoten(noten);
        assertArrayEquals(new int[]{30, 25}, nichtAusreichende);
    }

    @Test
    public void testNichAusreichendeNotenUnexpextedCase(){
        int[] noten = {};
        int[] nichtAusreichende = no.nichtAusreichendeNoten(noten);
        assertArrayEquals(new int[]{}, nichtAusreichende);
    }

    @Test
    public void testDurchschnittswert() {
        int[] noten = {45, 30, 55, 65, 25};
        double durchschnitt = no.durchschnittswert(noten);
        assertEquals(44.0, durchschnitt, 0.01); // Allowing a small error due to double precision
    }

    @Test
    public void testDurchschnittswertEmptyArray() {
        int[] noten = {};
        double durchschnitt = no.durchschnittswert(noten);
        assertEquals(0.0, durchschnitt);
    }

    @Test
    public void testAbgerundeteNoten() {
        int[] noten = {45, 30, 55, 65, 25};
        int[] abgerundet = no.abgerundeteNoten(noten);
        assertArrayEquals(new int[]{45, 30, 55, 65, 25}, abgerundet);
    }

    @Test
    public void testMaximaleAbgerundeteNoteExpectedCase() {
        int[] noten = {45, 30, 55, 65, 25};
        int maxAbgerundet = no.maximaleAbgerundeteNote(noten);
        assertEquals(65, maxAbgerundet);
    }

    @Test
    public void testMaximaleAbgerundeteNoteUnexpectedCase() {
        int[] noten = {};
        int maxAbgerundet = no.maximaleAbgerundeteNote(noten);
        assertEquals(Integer.MIN_VALUE, maxAbgerundet);
    }
}