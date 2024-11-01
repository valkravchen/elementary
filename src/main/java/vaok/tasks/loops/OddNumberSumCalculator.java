package vaok.tasks.loops;

public class OddNumberSumCalculator {
    public static int calculateOddSum(int number) {
        int sum = 0;
        for (int i = 1; i <= number; i += 2) { // проходим только по нечётным числам
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(calculateOddSum(10));
        System.out.println(calculateOddSum(15));
    }
}

