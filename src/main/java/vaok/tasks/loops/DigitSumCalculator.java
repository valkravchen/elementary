package vaok.tasks.loops;

public class DigitSumCalculator {
    public static int calculateDigitSum(int number) {
        number = Math.abs(number);
        int sum = 0;

        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }

        return sum;
    }

    public static void main(String[] args) {
        System.out.println(calculateDigitSum(11));
        System.out.println(calculateDigitSum(123));
        System.out.println(calculateDigitSum(-456));
    }
}

