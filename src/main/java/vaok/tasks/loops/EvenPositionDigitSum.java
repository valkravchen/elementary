package vaok.tasks.loops;

public class EvenPositionDigitSum {
    public static int sumEvenPositionDigits(int number) {
        number = Math.abs(number); // Учитываем только положительные цифры
        int sum = 0;
        int position = 1;

        while (number > 0) {
            int digit = number % 10;
            if (position % 2 == 0) {
                sum += digit;
            }
            number /= 10;
            position++;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumEvenPositionDigits(123456)); // Ожидаемый результат: 12
    }
}
