package vaok.tasks.loops;

public class SumOfEvenNumbers {
    public static void calculateSumOfEvenNumbers(int number) {
        int sum = 0;
        for (int index = 2; index <= number; index += 2) {
            sum += index;
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        calculateSumOfEvenNumbers(6);
    }
}
