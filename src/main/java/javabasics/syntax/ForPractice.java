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
        for (String string : strings) {
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

    public static void printUntilNegative(int[] numbers) {
        int index = 0;
        while (index < numbers.length) {
            if (numbers[index] >= 0) {
                System.out.println(numbers[index]);
                index++;
            } else {
                break;
            }
        }
    }

    public static void printEvenNumbersDoWhile() {
        int number = 2;
        do {
            System.out.println(number);
            number += 2;
        } while (number <= 50);
    }

    public static void calculateSumDoWhile() {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;
        int index = 0;
        do {
            sum += array[index];
            index++;
        } while (index < array.length);
        System.out.println(sum);
    }

    public static void printUntilNegativeDoWhile() {
        int[] array = {1, -1, 3, 4, 5, 6, 7, 8, 9, 10};
        int index = 0;
        do {
            if (array[index] > 0) {
                System.out.println(array[index]);
            } else {
                break;
            }
            index++;
        } while (index < array.length);
    }

    public static void initializeAndPrintArray() {
        int[] array = new int[5];
        array[0] = 3;
        array[1] = 33;
        array[2] = 4;
        array[3] = 5;
        array[4] = 244;

        for (int number : array) {
            System.out.println(number);
        }
    }

    public static void main(String[] args) {
        initializeAndPrintArray();
    }
}

