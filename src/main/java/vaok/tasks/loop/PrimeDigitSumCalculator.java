package vaok.tasks.loop;

public class PrimeDigitSumCalculator {
    public static int calculatePrimeDigitSum(int number) {
        int sum = 0;
        number = Math.abs(number); // Учитываем только положительные цифры

        while (number > 0) {
            int digit = number % 10;
            if (isPrime(digit)) {
                sum += digit;
            }
            number /= 10;
        }

        return sum;
    }

    private static boolean isPrime(int digit) {
        if (digit < 2) return false;
        for (int i = 2; i <= Math.sqrt(digit); i++) {
            if (digit % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(calculatePrimeDigitSum(235));
        System.out.println(calculatePrimeDigitSum(467));
    }
}
