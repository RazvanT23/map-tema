package Universitat;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Universitat no = new Universitat();

        int[] noten = new int[]{10, 20, 30, 43, 50, 60};

        System.out.println(Arrays.toString(no.nichtAusreichendeNoten(noten)));
        System.out.println(no.durchschnittswert(noten));
        System.out.println(no.maximaleAbgerundeteNote(noten));
        System.out.println(Arrays.toString(no.abgerundeteNoten(noten)));
    }
}