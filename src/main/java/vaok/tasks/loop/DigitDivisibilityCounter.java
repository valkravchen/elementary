package vaok.tasks.loop;

public class DigitDivisibilityCounter {
    public static int countDivisibleDigits(int number, int divisor) {
        number = Math.abs(number);
        int count = 0;

        while (number > 0) {
            int digit = number % 10;
            if (digit % divisor == 0) {
                count++;
            }
            number /= 10;
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(countDivisibleDigits(123456, 2));
        System.out.println(countDivisibleDigits(7890, 3));
    }
}

