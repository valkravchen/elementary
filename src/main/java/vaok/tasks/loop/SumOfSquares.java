package vaok.tasks.loop;

public class SumOfSquares {
    public static int calculateSumOfSquares(int number) {
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            sum += i * i;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(calculateSumOfSquares(3));
    }
}
