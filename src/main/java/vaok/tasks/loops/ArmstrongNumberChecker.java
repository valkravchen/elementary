package vaok.tasks.loops;

public class ArmstrongNumberChecker {
    public static boolean isArmstrongNumber(int number) {
        if (number < 100 || number > 999) {
            return false; // Число не является трёхзначным
        }

        int original = number;
        int sumOfCubes = 0;

        while (number > 0) {
            int digit = number % 10;
            sumOfCubes += Math.pow(digit, 3);
            number /= 10;
        }

        return sumOfCubes == original;
    }

    public static void main(String[] args) {
        System.out.println(isArmstrongNumber(153)); // Ожидаемый результат: true
        System.out.println(isArmstrongNumber(123)); // Ожидаемый результат: false
    }
}