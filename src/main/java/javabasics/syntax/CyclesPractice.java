package javabasics.syntax;

public class CyclesPractice {
    public static void printNumbers() {
        for (int number = 1; number < 11; number++) {
            System.out.println(number);
        }
    }

    public static void sumNumbers() {
        int sum = 0;
        int number = 1;
        while (number < 21) {
            sum += number;
            number++;
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        printNumbers();
        sumNumbers();
    }
}
