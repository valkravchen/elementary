package vaok.tasks.loop;

public class MinSquareSumFinder {
    public static int findMinSquareSumNumber(int[] numbers) {
        int minSum = Integer.MAX_VALUE;
        int result = 0;

        for (int number : numbers) {
            int squareSum = calculateSquareSum(number);
            if (squareSum < minSum) {
                minSum = squareSum;
                result = number;
            }
        }

        return result;
    }

    private static int calculateSquareSum(int number) {
        number = Math.abs(number);
        int sum = 0;

        while (number > 0) {
            int digit = number % 10;
            sum += digit * digit;
            number /= 10;
        }

        return sum;
    }

    public static void main(String[] args) {
        System.out.println(findMinSquareSumNumber(new int[]{12, 23, 34})); // Ожидаемый результат: 12
        System.out.println(findMinSquareSumNumber(new int[]{10, 20, 30})); // Ожидаемый результат: 10
    }
}

