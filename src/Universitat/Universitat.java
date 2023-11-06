package Universitat;


public class Universitat {

    public int[] nichtAusreichendeNoten(int[] noten) {
        int[] nichtAusreichende = new int[noten.length];
        int index = 0;

        for (int note : noten) {
            if (note < 40) {
                nichtAusreichende[index] = note;
                index++;
            }
        }

        int[] result = new int[index];
        System.arraycopy(nichtAusreichende, 0, result, 0, index);

        return result;
    }

    public double durchschnittswert(int[] noten) {
        if (noten.length == 0) {
            return 0.0;
        }

        int sum = 0;
        for (int note : noten) {
            sum += note;
        }

        return (double) sum / noten.length;
    }

    public int[] abgerundeteNoten(int[] noten) {
        int[] abgerundet = new int[noten.length];

        for (int i = 0; i < noten.length; i++) {
            abgerundet[i] = abgerundeteNote(noten[i]);
        }

        return abgerundet;
    }

    public int maximaleAbgerundeteNote(int[] noten) {
        int maxAbgerundet = Integer.MIN_VALUE;

        for (int note : noten) {
            int abgerundet = abgerundeteNote(note);
            if (abgerundet > maxAbgerundet) {
                maxAbgerundet = abgerundet;
            }
        }

        return maxAbgerundet;
    }

    public int abgerundeteNote(int note) {
        if (note < 38 || note % 5 < 3) {
            return note;
        } else {
            return ((note / 5) + 1) * 5;
        }
    }
}