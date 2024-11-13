package vaok.tasks.loop;

public class EvenDigitChecker {
    public static boolean areAllDigitsEven(int number) {
        number = Math.abs(number);

        while (number > 0) {
            int digit = number % 10;
            if (digit % 2 != 0) {
                return false;
            }
            number /= 10;
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(areAllDigitsEven(246));
        System.out.println(areAllDigitsEven(1234));
    }
}

