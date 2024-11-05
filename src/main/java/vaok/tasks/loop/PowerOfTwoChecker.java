package vaok.tasks.loop;

public class PowerOfTwoChecker {
    public static boolean isPowerOfTwo(int number) {
        if (number < 1) {
            return false; // Степени двойки всегда положительны
        }

        while (number % 2 == 0) {
            number /= 2;
        }

        return number == 1;
    }

    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(16)); // Ожидаемый результат: true
        System.out.println(isPowerOfTwo(18)); // Ожидаемый результат: false
    }
}
