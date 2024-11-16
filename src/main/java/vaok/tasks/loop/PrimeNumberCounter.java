package vaok.tasks.loop;

public class PrimeNumberCounter {
    public static int countPrimesInRange(int limit) {
        int count = 0;

        for (int i = 2; i <= limit; i++) {
            if (isPrime(i)) {
                count++;
            }
        }

        return count;
    }

    private static boolean isPrime(int number) {
        if (number < 2) return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(countPrimesInRange(10));
        System.out.println(countPrimesInRange(20));
    }
}
