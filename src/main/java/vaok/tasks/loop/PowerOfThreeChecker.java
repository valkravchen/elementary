package vaok.tasks.loop;

public class PowerOfThreeChecker {
    public static boolean isPowerOfThree(int number) {
        if (number < 1) return false;

        while (number % 3 == 0) {
            number /= 3;
        }

        return number == 1;
    }

    public static void main(String[] args) {
        System.out.println(isPowerOfThree(27)); // Ожидаемый результат: true
        System.out.println(isPowerOfThree(10)); // Ожидаемый результат: false
    }
}

