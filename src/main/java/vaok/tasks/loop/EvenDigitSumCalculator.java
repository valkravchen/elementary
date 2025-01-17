package vaok.tasks.loop;

public class EvenDigitSumCalculator {
    public static int calculateEvenDigitSum(int number) {
        int sum = 0;
        number = Math.abs(number);

        while (number > 0) {
            int digit = number % 10;
            if (digit % 2 == 0) {
                sum += digit;
            }
            number /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(calculateEvenDigitSum(123456));
        System.out.println(calculateEvenDigitSum(-2468));
    }
}
