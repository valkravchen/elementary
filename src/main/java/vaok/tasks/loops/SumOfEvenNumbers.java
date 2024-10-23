package vaok.tasks.loops;

public class SumOfEvenNumbers {
    public static int sumEvenNumbers(int number) {
        int sum = 0;
        for (int i = 2; i <= number; i += 2) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumEvenNumbers(6));
    }
}
