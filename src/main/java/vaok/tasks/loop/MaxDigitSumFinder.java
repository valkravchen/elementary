package vaok.tasks.loop;

public class MaxDigitSumFinder {
    public static int findMaxDigitSumNumber(int[] numbers) {
        int maxSum = 0;
        int result = 0;

        for (int number : numbers) {
            int sum = calculateDigitSum(number);
            if (sum > maxSum) {
                maxSum = sum;
                result = number;
            }
        }

        return result;
    }

    private static int calculateDigitSum(int number) {
        number = Math.abs(number);
        int sum = 0;

        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }

        return sum;
    }

    public static void main(String[] args) {
        System.out.println(findMaxDigitSumNumber(new int[]{123, 456, 789}));
        System.out.println(findMaxDigitSumNumber(new int[]{101, 202, 303}));
    }
}

