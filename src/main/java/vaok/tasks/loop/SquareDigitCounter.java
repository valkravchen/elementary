package vaok.tasks.loop;

public class SquareDigitCounter {
    public static int countSquareDigits(int number) {
        number = Math.abs(number);
        int count = 0;

        while (number > 0) {
            int digit = number % 10;
            if (digit == 0 || digit == 1 || digit == 4 || digit == 9) {
                count++;
            }
            number /= 10;
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(countSquareDigits(14916));
        System.out.println(countSquareDigits(12345));
    }
}

