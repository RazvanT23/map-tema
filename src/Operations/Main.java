package Operations;

public class Main {
    public static void main(String[] args) {
        Operations op = new Operations();
        int[] numbers = new int[]{4, 8, 3, 10, 17};
        System.out.println("The biggest value of the array is: " + op.maxNum(numbers));
        System.out.println("The smallest value of the array is: " + op.minNum(numbers));
        System.out.println("The biggest sum of the array using n-1 elements is: " + op.maxSum(numbers));
        System.out.println("The smallest sum of the array using n-1 elements is: " + op.minSum(numbers));
    }
}