package vaok.tasks.loop;

public class EvenDigitChecker {
    public static boolean areAllDigitsEven(int number) {
        number = Math.abs(number); // Учитываем только положительные цифры

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
        System.out.println(areAllDigitsEven(246));  // Ожидаемый результат: true
        System.out.println(areAllDigitsEven(1234)); // Ожидаемый результат: false
    }
}

