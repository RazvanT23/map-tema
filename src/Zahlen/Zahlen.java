package Zahlen;


public class Zahlen {

    public int[] add(int[] list1, int[]  list2) {
        int n = list1.length;
        int[] result = new int[n];
        int carry = 0;

        for (int i = n - 1; i >= 0; i--) {
            int sum = list1[i] + list2[i] + carry;
            result[i] = sum % 10;
            carry = sum / 10;
        }

        if (carry > 0) {
            int[] newResult = new int[n + 1];
            newResult[0] = carry;
            System.arraycopy(result, 0, newResult, 1, n);
            return newResult;
        } else {
            return result;
        }
    }

    public int[] subtract(int[] list1, int[]  list2) {
        if (list1[0]< list2[0]){
            return new int[]{-1};
        }
        int n = list1.length;
        int[] result = new int[n];
        int borrow = 0;

        for (int i = n - 1; i >= 0; i--) {
            int diff = list1[i] - list2[i] - borrow;

            if (diff < 0) {
                diff += 10;
                borrow = 1;
            } else {
                borrow = 0;
            }

            result[i] = diff;
        }

        boolean isNegative = false;
        if (borrow > 0) {
            isNegative = true;
        }

        int firstNonZeroIndex = 0;
        while (firstNonZeroIndex < n && result[firstNonZeroIndex] == 0) {
            firstNonZeroIndex++;
        }

        if (firstNonZeroIndex == n) {
            return new int[]{0};
        }

        int[] finalResult = new int[n - firstNonZeroIndex];
        System.arraycopy(result, firstNonZeroIndex, finalResult, 0, n - firstNonZeroIndex);

        if (isNegative) {
            finalResult = addNegativeSign(finalResult);
        }

        return finalResult;
    }

    private int[] addNegativeSign(int[] result) {
        int[] resultWithSign = new int[result.length + 1];
        resultWithSign[0] = -1;
        System.arraycopy(result, 0, resultWithSign, 1, result.length);
        return resultWithSign;
    }

    public int[] multiply(int[] list, int number) {
        int n = list.length;
        int[] result = new int[n];
        int carry = 0;
        for (int i = n - 1; i >= 0; i--) {
            int product = list[i] * number + carry;
            result[i] = product % 10;
            carry = product / 10;
        }
        if (carry > 0) {
            int[] newResult = new int[n + 1];
            newResult[0] = carry;
            System.arraycopy(result, 0, newResult, 1, n);
            return newResult;
        } else {
            return result;
        }
    }

    public int[] divide(int[] list, int divisor) {
        if (divisor == 0) {
            return new int[]{-1};
        }
        int n = list.length;
        int[] quotient = new int[n];
        int remainder = 0;

        for (int i = 0; i < n; i++) {
            int currentDigit = list[i] + remainder * 10;
            quotient[i] = currentDigit / divisor;
            remainder = currentDigit % divisor;
        }

        int firstNonZeroIndex = 0;
        while (firstNonZeroIndex < n && quotient[firstNonZeroIndex] == 0) {
            firstNonZeroIndex++;
        }

        if (firstNonZeroIndex == n) {
            return new int[]{0};
        }

        int[] finalQuotient = new int[n - firstNonZeroIndex];
        System.arraycopy(quotient, firstNonZeroIndex, finalQuotient, 0, n - firstNonZeroIndex);

        return finalQuotient;
    }
}