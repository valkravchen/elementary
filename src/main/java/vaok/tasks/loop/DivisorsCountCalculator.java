package vaok.tasks.loop;

public class DivisorsCountCalculator {
    public static int countDivisorsMultipleOf(int number, int divisor) {
        int count = 0;

        for (int i = 1; i <= number; i++) {
            if (number % i == 0 && i % divisor == 0) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(countDivisorsMultipleOf(60, 3)); // Ожидаемый результат: 3
        System.out.println(countDivisorsMultipleOf(30, 2)); // Ожидаемый результат: 4
    }
}

