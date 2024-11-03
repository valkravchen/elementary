package vaok.tasks.loop;

public class SumMultiplesOfThreeOrFive {
    public static void calculateSum(int number) {
        int sum = 0;
        for (int index = 1; index <= number; index++) {
            if (index % 3 == 0 || index % 5 == 0) {
                sum += index;
            }
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        calculateSum(45);
    }
}

