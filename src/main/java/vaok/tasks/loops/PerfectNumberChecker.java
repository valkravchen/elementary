package vaok.tasks.loops;

public class PerfectNumberChecker {
    public static boolean isPerfectNumber(int number) {
        int sum = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum == number;
    }

    public static void main(String[] args) {
        System.out.println(isPerfectNumber(6)); // Ожидаемый результат: true
        System.out.println(isPerfectNumber(10)); // Ожидаемый результат: false
    }
}
