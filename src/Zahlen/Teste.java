package Zahlen;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class Teste {

    @Test
    public void testAdd() {
        Zahlen operations = new Zahlen();

        int[] list1 = {2, 3, 4};
        int[] list2 = {5, 6, 3};
        int[] expected = {7, 9, 7};
        assertArrayEquals(expected, operations.add(list1, list2));

        int[] list3 = {9, 0, 0};
        int[] list4 = {1, 0, 0};
        int[] expected2 = {1, 0, 0, 0};
        assertArrayEquals(expected2, operations.add(list3, list4));

    }

    @Test
    public void testSubtract() {
        Zahlen operations = new Zahlen();

        int[] list1 = {5, 6, 7};
        int[] list2 = {2, 3, 4};
        int[] expected = {3, 3, 3};
        assertArrayEquals(expected, operations.subtract(list1, list2));

        int[] list3 = {2, 3, 4};
        int[] list4 = {5, 6, 7};
        int[] expected2 = {-1};
        assertArrayEquals(expected2, operations.subtract(list3, list4));
    }

    @Test
    public void testMultiply() {
        Zahlen operations = new Zahlen();

        int[] list1 = {2, 3, 4};
        int number = 3;
        int[] expected = {7, 0, 2};
        assertArrayEquals(expected, operations.multiply(list1, number));

        int[] list2 = {2, 0, 0};
        int number2 = 5;
        int[] expected2 = {1, 0, 0, 0};
        assertArrayEquals(expected2, operations.multiply(list2, number2));
    }

    @Test
    public void testDivide() {
        Zahlen operations = new Zahlen();

        int[] list1 = {7, 0, 2};
        int divisor = 3;
        int[] expected = {2, 3, 4};
        assertArrayEquals(expected, operations.divide(list1, divisor));

        int[] list2 = {5, 6, 7};
        int divisor2 = 0;
        int[] expected2 = {-1};
        assertArrayEquals(expected2, operations.divide(list2, divisor2));
    }
}