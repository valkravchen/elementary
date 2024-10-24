package vaok.tasks.loops;

public class ProductOfNumbers {
    public static long calculateProduct(int number) {
        int multiplicationOfNumbers = 1;
        for (int i = 1; i <= number; i++) {
            multiplicationOfNumbers *= i;
        }
        return multiplicationOfNumbers;
    }

    public static void main(String[] args) {
        System.out.println(calculateProduct(10));
    }
}

