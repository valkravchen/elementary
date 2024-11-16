package vaok.tasks.loop;

public class EvenDigitSquareSumCalculator {
    public static int calculateEvenDigitSquareSum(int number) {
        number = Math.abs(number);
        int sum = 0;

        while (number > 0) {
            int digit = number % 10;
            if (digit % 2 == 0) {
                sum += digit * digit;
            }
            number /= 10;
        }

        return sum;
    }

    public static void main(String[] args) {
        System.out.println(calculateEvenDigitSquareSum(2468));
        System.out.println(calculateEvenDigitSquareSum(1234));
    }
}
