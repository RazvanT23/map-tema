package Zahlen;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array1 = new int[]{1, 5, 0, 0};
        int[] array2 = new int[]{1, 3, 0, 0};
        Zahlen op = new Zahlen();
        System.out.println("The sum of these two arrays is: " + Arrays.toString(op.add(array1, array2)));
        System.out.println("The difference of these two arrays is: " + Arrays.toString(op.subtract(array1, array2)));
        System.out.println("The multiplication of this array with this number is: " + Arrays.toString(op.multiply(array1,2)));
        System.out.println("The division of this array with this number is: " + Arrays.toString(op.divide(array1,2)));
    }
}