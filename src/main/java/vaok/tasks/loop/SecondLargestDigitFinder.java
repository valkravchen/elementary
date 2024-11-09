package vaok.tasks.loop;

public class SecondLargestDigitFinder {
    public static int findSecondLargestDigit(int number) {
        number = Math.abs(number); // Работаем с положительными цифрами
        int max = -1;
        int secondMax = -1;

        while (number > 0) {
            int digit = number % 10;
            if (digit > max) {
                secondMax = max;
                max = digit;
            } else if (digit > secondMax && digit < max) {
                secondMax = digit;
            }
            number /= 10;
        }

        return secondMax;
    }

    public static void main(String[] args) {
        System.out.println(findSecondLargestDigit(75368)); // Ожидаемый результат: 7
        System.out.println(findSecondLargestDigit(22345)); // Ожидаемый результат: 4
    }
}
