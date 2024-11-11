package vaok.tasks.loop;

public class PrimeDivisorSumCalculator {
    public static int calculatePrimeDivisorSum(int number) {
        int sum = 0;

        for (int i = 2; i <= number; i++) {
            if (number % i == 0 && isPrime(i)) {
                sum += i;
            }
        }

        return sum;
    }

    private static boolean isPrime(int number) {
        if (number < 2) return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(calculatePrimeDivisorSum(60));
        System.out.println(calculatePrimeDivisorSum(45));
    }
}

