package vaok.tasks.loop;

public class OddDivisorCounter {
    public static int countOddDivisors(int number) {
        int count = 0;

        for (int i = 1; i <= number; i++) {
            if (number % i == 0 && i % 2 != 0) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(countOddDivisors(12));
        System.out.println(countOddDivisors(15));
    }
}

