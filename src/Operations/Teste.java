package Operations;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class OperationsTest {

    @Test
    public void testMaxNum() {
        Operations operations = new Operations();
        int[] numbers = {5, 10, 1, 20, 3};
        assertEquals(20, operations.maxNum(numbers));
    }

    @Test
    public void testMinNum() {
        Operations operations = new Operations();
        int[] numbers = {5, 10, 1, 20, 3};
        assertEquals(1, operations.minNum(numbers));
    }

    @Test
    public void testMinSum() {
        Operations operations = new Operations();
        int[] numbers = {5, 10, 1, 20, 3};
        assertEquals(19, operations.minSum(numbers));
    }

    @Test
    public void testMaxSum() {
        Operations operations = new Operations();
        int[] numbers = {5, 10, 1, 20, 3};
        assertEquals(38, operations.maxSum(numbers));
    }

    @Test
    public void testMaxNumEmptyArray() {
        Operations operations = new Operations();
        int[] numbers = {};
        assertEquals(Integer.MIN_VALUE, operations.maxNum(numbers));
    }

    @Test
    public void testMinNumEmptyArray() {
        Operations operations = new Operations();
        int[] numbers = {};
        assertEquals(Integer.MAX_VALUE, operations.minNum(numbers));
    }

    @Test
    public void testMinSumEmptyArray() {
        Operations operations = new Operations();
        int[] numbers = {};
        assertEquals(-operations.maxNum(numbers), operations.minSum(numbers));
    }

    @Test
    public void testMaxSumEmptyArray() {
        Operations operations = new Operations();
        int[] numbers = {};
        assertEquals(-operations.minNum(numbers), operations.maxSum(numbers));
    }
}