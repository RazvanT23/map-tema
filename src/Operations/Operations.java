package Operations;

public class Operations {

    public int maxNum(int[] numbers){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length; i++)
            if (numbers[i] > max)
                max = numbers[i];
        return max;
    }
    public int minNum(int[] numbers){
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < numbers.length; i++)
            if (numbers[i] < min)
                min = numbers[i];
        return min;
    }

    public int minSum(int[] numbers){
        int max = maxNum(numbers);
        int sum = 0;
        for(int i = 0; i < numbers.length; i++)
            sum += numbers[i];

        return sum - max;
    }

    public int maxSum(int[] numbers){
        int min = minNum(numbers);
        int sum = 0;
        for(int i = 0; i < numbers.length; i++)
            sum += numbers[i];

        return sum - min;
    }
}