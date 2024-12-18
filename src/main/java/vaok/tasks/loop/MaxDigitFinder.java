package vaok.tasks.loop;

public class MaxDigitFinder {
    public static int findMaxDigit(int number) {
        number = Math.abs(number);
        int maxDigit = 0;
        while (number > 0) {
            int digit = number % 10;
            if (digit > maxDigit) {
                maxDigit = digit;
            }
            number /= 10;
        }
        return maxDigit;
    }

    public static void main(String[] args) {
        System.out.println(findMaxDigit(2736));
    }
}