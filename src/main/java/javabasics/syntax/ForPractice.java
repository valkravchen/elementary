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

    public static void printStrings(String[] strings) {
        for (String string: strings) {
            System.out.println(string);
        }
    }

    public static void sumNumbers(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.println(sum);
    }

    public static void printGreaterThanTen(double[] numbers) {
        boolean hasNumbers = false;
        for (double number : numbers) {
            if (number > 10) {
                System.out.println(number);
                hasNumbers = true;
            }
        }
        if (!hasNumbers) {
            System.out.println("Нет чисел больше 10.");
        }
    }

    public static void main(String[] args) {
        printGreaterThanTen(new double[]{5.5, 5.7, 33.33});

    }
}
