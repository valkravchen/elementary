package vaok.tasks.loop;

public class OddDigitThresholdSum {
    public static int calculateOddDigitSumAboveThreshold(int number, int threshold) {
        number = Math.abs(number);
        int sum = 0;

        while (number > 0) {
            int digit = number % 10;
            if (digit % 2 != 0 && digit > threshold) {
                sum += digit;
            }
            number /= 10;
        }

        return sum;
    }

    public static void main(String[] args) {
        System.out.println(calculateOddDigitSumAboveThreshold(12345, 2)); // Ожидаемый результат: 8
        System.out.println(calculateOddDigitSumAboveThreshold(98765, 4)); // Ожидаемый результат: 15
    }
}
