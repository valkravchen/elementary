package vaok.tasks.loop;

public class LargestDivisibleDigitFinder {
    public static int findLargestDivisibleDigit(int number, int divisor) {
        number = Math.abs(number); // Учитываем только положительные цифры
        int largestDigit = -1;

        while (number > 0) {
            int digit = number % 10;
            if (digit % divisor == 0 && digit > largestDigit) {
                largestDigit = digit;
            }
            number /= 10;
        }

        return largestDigit;
    }

    public static void main(String[] args) {
        System.out.println(findLargestDivisibleDigit(73548, 3));
        System.out.println(findLargestDivisibleDigit(12457, 2));
    }
}

