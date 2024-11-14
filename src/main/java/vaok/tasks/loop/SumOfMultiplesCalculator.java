package vaok.tasks.loop;

public class SumOfMultiplesCalculator {
    public static int calculateSumOfMultiples(int limit) {
        int sum = 0;

        for (int i = 1; i <= limit; i++) {
            if (i % 4 == 0 || i % 5 == 0) {
                sum += i;
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        System.out.println(calculateSumOfMultiples(20)); // Ожидаемый результат: 98
        System.out.println(calculateSumOfMultiples(30)); // Ожидаемый результат: 238
    }
}