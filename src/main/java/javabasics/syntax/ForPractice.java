package javabasics.syntax;

public class ForPractice {
    public static void printReverse() {
        for (int number = 50; number >= 1; number--) {
            System.out.println(number);
        }
    }

    public static void printEvenNumbers() {
        for (int number = 30; number <= 50; number += 2) {
            System.out.println(number);
        }
    }

    public static void calculateArraySum(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.println(sum);
    }

    public static void printStrings(String[] strings) {
        for (String string: strings) {
            System.out.println(string);
        }
    }

    public static void main(String[] args) {
        printStrings(new String[]{"Alice", "Bob", "Charlie"});
    }
}
