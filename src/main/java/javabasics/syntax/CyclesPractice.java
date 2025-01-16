package javabasics.syntax;

public class CyclesPractice {
    public static void printNumbers() {
        for (int number = 1; number <= 10; number++) {
            System.out.println(number);
        }
    }

    public static void sumNumbers() {
        int sum = 0;
        int number = 1;
        while (number <= 20) {
            sum += number;
            number++;
        }
        System.out.println(sum);
    }

    public static void findMinValue(int[] numbers) {
       int minElement = numbers[0];
       for (int index = 1; index < numbers.length; index++) {
           if (minElement > numbers[index]) {
               minElement = numbers[index];
           }
       }
        System.out.println(minElement);
    }

    public static void main(String[] args) {
        printNumbers();
        sumNumbers();
        findMinValue(new int[]{2, 6, 4, 5});
    }
}
