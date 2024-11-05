package vaok.tasks.loop;

public class PrimeSumCalculator {
    public static int calculatePrimeSum(int limit) {
        int sum = 0;

        for (int i = 2; i <= limit; i++) {
            if (isPrime(i)) {
                sum += i;
            }
        }
        return sum;
    }

    private static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(calculatePrimeSum(10));
        System.out.println(calculatePrimeSum(20));
    }
}

