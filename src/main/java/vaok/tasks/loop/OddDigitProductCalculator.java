package vaok.tasks.loop;

public class OddDigitProductCalculator {
    public static int calculateOddDigitProduct(int number) {
        number = Math.abs(number); // Учитываем только положительные цифры
        int product = 1;
        boolean hasOddDigits = false;

        while (number > 0) {
            int digit = number % 10;
            if (digit % 2 != 0) {
                product *= digit;
                hasOddDigits = true;
            }
            number /= 10;
        }

        return hasOddDigits ? product : 0; // Если нечётных цифр нет, возвращаем 0
    }

    public static void main(String[] args) {
        System.out.println(calculateOddDigitProduct(12345)); // Ожидаемый результат: 15
        System.out.println(calculateOddDigitProduct(2468));  // Ожидаемый результат: 0
    }
}

