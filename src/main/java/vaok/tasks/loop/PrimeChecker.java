package vaok.tasks.loop;

public class PrimeChecker {
    public static boolean isPrime(int number) {
        if (number < 2) {
            return false; // Простые числа начинаются с 2
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPrime(17)); // Ожидаемый результат: true
        System.out.println(isPrime(18)); // Ожидаемый результат: false
    }
}
