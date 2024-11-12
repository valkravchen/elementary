package vaok.tasks.loop;

public class SmallestPrimeDivisorFinder {
    public static int findSmallestPrimeDivisor(int number) {
        for (int i = 2; i <= number; i++) {
            if (number % i == 0 && isPrime(i)) {
                return i;
            }
        }
        return -1; // Если простых делителей нет (например, если number < 2)
    }

    private static boolean isPrime(int number) {
        if (number < 2) return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(findSmallestPrimeDivisor(15)); // Ожидаемый результат: 3
        System.out.println(findSmallestPrimeDivisor(24)); // Ожидаемый результат: 2
    }
}

