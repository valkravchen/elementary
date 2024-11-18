package vaok.tasks.loop;

public class UniformDigitCounter {
    public static int countUniformDigitNumbers(int[] numbers) {
        int count = 0;

        for (int number : numbers) {
            if (isUniformDigitNumber(number)) {
                count++;
            }
        }

        return count;
    }

    private static boolean isUniformDigitNumber(int number) {
        number = Math.abs(number);
        int lastDigit = number % 10;

        while (number > 0) {
            if (number % 10 != lastDigit) {
                return false;
            }
            number /= 10;
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(countUniformDigitNumbers(new int[]{111, 22, 5555, 123})); // Ожидаемый результат: 3
        System.out.println(countUniformDigitNumbers(new int[]{10, 11, 22, 33}));     // Ожидаемый результат: 2
    }
}

