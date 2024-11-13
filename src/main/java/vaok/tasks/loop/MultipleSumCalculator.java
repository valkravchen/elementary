package vaok.tasks.loop;

public class MultipleSumCalculator {
    public static int calculateMultipleSum(int limit, int divisor) {
        int sum = 0;

        for (int i = 1; i <= limit; i++) {
            if (i % divisor == 0) {
                sum += i;
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        System.out.println(calculateMultipleSum(20, 3)); // Ожидаемый результат: 63
        System.out.println(calculateMultipleSum(30, 5)); // Ожидаемый результат: 105
    }
}
