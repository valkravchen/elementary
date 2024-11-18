package vaok.tasks.loop;

public class DigitProductInRangeCalculator {
    public static int calculateDigitProductInRange(int number, int min, int max) {
        number = Math.abs(number);
        int product = 1;
        boolean hasValidDigits = false;

        while (number > 0) {
            int digit = number % 10;
            if (digit >= min && digit <= max) {
                product *= digit;
                hasValidDigits = true;
            }
            number /= 10;
        }

        return hasValidDigits ? product : 0; // Если цифр в диапазоне нет, возвращаем 0
    }

    public static void main(String[] args) {
        System.out.println(calculateDigitProductInRange(123456, 2, 5)); // Ожидаемый результат: 120
        System.out.println(calculateDigitProductInRange(9876, 5, 9));   // Ожидаемый результат: 7 * 8 = 56
    }
}

